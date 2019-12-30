package integration;

import beans.Payment;
import com.risk.engine.RiskEngineApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;
import services.DBService;
import services.RiskEngineService;

import java.util.Random;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RiskEngineApplication.class)
public class DataBaseTests {

    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    RiskEngineService riskEngineService;

    @Autowired
    DBService dbService;

    @Before
    public void setUp() {
        webAppContextSetup(wac);

    }

    @Test
    public void testAddRowsToDB() throws Exception {
        Assert.assertTrue(dbService.getAllTableRows().size() == 0);
        dbService.createProcessedPaymentsTable();
        dbService.getJdbcTemplate().batchUpdate("INSERT INTO processed_payments(amount, currency, userId, payeeId, paymentMethodId, riskScore, approved) " +
                "VALUES ('1000','USD','MorBasson','Talitz','1234123412341234','10','false')");
        Assert.assertTrue(dbService.getAllTableRows().size() == 1);
        dbService.getJdbcTemplate().batchUpdate("INSERT INTO processed_payments(amount, currency, userId, payeeId, paymentMethodId, riskScore, approved) " +
                "VALUES ('1000','USD','MorBasson','Talitz','1234123412341234','10','false')");
        Assert.assertTrue(dbService.getAllTableRows().size() == 2);
    }

}

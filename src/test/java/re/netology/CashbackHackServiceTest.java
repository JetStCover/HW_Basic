package re.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remainService() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(100), 900);
    }

    @Test
    public void remainZeroPercentService() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void remainAllPercentService() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }
}
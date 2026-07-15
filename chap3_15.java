import java.time.ZonedDateTime;
import java.time.ZoneId;
public class chap3_15 {
  public static void main(String[] args) {
    ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    String nowTime = now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
    System.out.println(nowTime);
  }
}

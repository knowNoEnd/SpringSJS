package test.java.sia.knights;

import java.io.PrintStream;

import main.java.sia.knights.BraveKnight;
import main.java.sia.knights.Knight;
import main.java.sia.knights.Quest;
import main.java.sia.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }

  @Bean
  public Quest quest() {
    return new SlayDragonQuest(stream());
  }

  @Bean
  public PrintStream stream() {
    return new FakePrintStream();
  }

}

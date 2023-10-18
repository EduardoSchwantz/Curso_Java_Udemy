package Secao11;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class PraticandoFormatDate {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d01 = " + d01.format(fmt2));
        System.out.println("d02 = " + d02.format(fmt3));
        System.out.println("d03 = " + fmt4.format(d03));
        System.out.println("d02 = " + d02.format(fmt5));
        System.out.println("\nFim da aula 111\nInício aula 112\n");
        //fim da aula 111
        //início aula 112

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mês = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 minuto= " + d02.getMinute());

        System.out.println("\nFim da aula 112\nInício aula 113\n");
        //fim da aula 112
        //início aula 113

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusYears(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.minus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        System.out.println("T1 dias = " + t1.toDays());
    }
}

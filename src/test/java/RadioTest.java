import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class RadioTest {

        @Test
        public void shouldSetCurrentStation() {
            Radio radio = new Radio();

            radio.setCurrentStation(6);

            int expected = 6;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldShowNextStation() {
            Radio radio = new Radio();

            radio.setCurrentStation(9);

            radio.next();

            int expected = 0;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldShowPrevStation() {
            Radio radio = new Radio();

            radio.setCurrentStation(0);

            radio.prev();

            int expected = 9;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        public void shouldIncreaseVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolume(10);

            radio.increase();

            int expected = 10;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

        }

        @Test

        public void shouldDecreaseVolume() {
            Radio radio = new Radio();

            radio.setCurrentVolume(0);

            radio.increase();

            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }

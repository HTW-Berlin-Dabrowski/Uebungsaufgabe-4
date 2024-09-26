import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MIDITrackTest {
    @Test
    void getTrack() {
        MIDITrack track = new MIDITrack(new String[]{"E'4", "A'4", "C'8", "D'8", "E'4", "A'4", "C'8", "D'8"}, (byte)120, (byte)60, (byte)41);
        assertArrayEquals(new byte[] {0X4D, 0X54, 0X72, 0X6B, 0X0, 0X0, 0X0, 0X52, 0X0, (byte)0XFF, 0X58, 0X4, 0X4, 0X2, 0X18, 0X8, 0X0, (byte)0XFF, 0X51, 0X3, 0X7, (byte)0XA1, 0X20, 0X0, (byte)0XC0, 0X29, 0X0, (byte)0X90, 0X34, 0X3C, 0X1E, (byte)0X80, 0X34, 0X3C, 0X0, (byte)0X90, 0X39, 0X3C, 0X1E, (byte)0X80, 0X39, 0X3C, 0X0, (byte)0X90, 0X30, 0X3C, 0XF, (byte)0X80, 0X30, 0X3C, 0X0, (byte)0X90, 0X32, 0X3C, 0XF, (byte)0X80, 0X32, 0X3C, 0X0, (byte)0X90, 0X34, 0X3C, 0X1E, (byte)0X80, 0X34, 0X3C, 0X0, (byte)0X90, 0X39, 0X3C, 0X1E, (byte)0X80, 0X39, 0X3C, 0X0, (byte)0X90, 0X30, 0X3C, 0XF, (byte)0X80, 0X30, 0X3C, 0X0, (byte)0X90, 0X32, 0X3C, 0XF, (byte)0X80, 0X32, 0X3C, (byte)0XFF, 0X2F, 0X0},
                track.getTrack()
        );
    }
}
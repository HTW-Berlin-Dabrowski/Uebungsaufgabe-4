import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    @Test
    void getNoteEvents() {
        Note n1 = new Note("C''8", (byte)120, (byte)60);
        Note n2 = new Note("F,#4", (byte)(104), (byte)(68));
        assertArrayEquals(new byte[] {0X0, (byte)0X90, 0X3C, 0X3C, 0XF, (byte)0X80, 0X3C, 0X3C}, n1.getNoteEvents());
        assertArrayEquals(new byte[] {0X0, (byte)0X90, 0X1E, 0X44, 0X1A, (byte)0X80, 0X1E, 0X44}, n2.getNoteEvents());
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MIDIToolsTest {
    @Test
    void joinByteArrays() {
        byte[] arr1 = new byte[] {1, 7, 12, 9, 11};
        byte[] arr2 = new byte[] {77, 6};
        byte[] arr3 = MIDITools.joinByteArrays(arr1, arr2);
        assertArrayEquals(new byte[] {1, 7, 12, 9, 11}, arr1, "Vorsicht: Die Inhalte der übergebenen Arrays sollen nicht verändert werden!");
        assertArrayEquals(new byte[] {77, 6}, arr2, "Vorsicht: Die Inhalte der übergebenen Arrays sollen nicht verändert werden!");
        assertArrayEquals(new byte[] {1, 7, 12, 9, 11, 77, 6}, arr3);
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void writeData(byte[] data, String filename) {
        try (FileOutputStream stream = new FileOutputStream(new File(filename))) {
            stream.write(data);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot write to file " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file " + filename);
        }
    }

    public static void main(String[] args) {
        String[] notes = new String[] {
                "C'4", "C'4", "C'4", "A2", "E'8", "C'4", "A2", "E'8", "C'4",
                "E'4", "E'4", "E'4", "F'2", "E'8", "C'4", "A2", "E'8", "C'2"};
        byte fullNoteDuration = (byte)120;
        byte defaultVelocity = (byte)60;
        byte instrument = (byte)41;
        MIDITrack track = new MIDITrack(notes, fullNoteDuration, defaultVelocity, instrument);
        MIDIFile midiFile = new MIDIFile(track, (byte)0x30);
        writeData(midiFile.getBytes(), "test.midi");
    }
}

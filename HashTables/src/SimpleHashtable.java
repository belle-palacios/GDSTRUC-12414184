import java.util.Random;

public class SimpleHashtable {
    private SavedPlayer[] hashtable;

    public SimpleHashtable() {
        hashtable = new SavedPlayer[8];
    }

    public int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public boolean isOccupied(int hashedKey) {
        return hashtable[hashedKey] != null;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (hashedKey != stoppingIndex && hashtable[hashedKey] != null) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("Cannot put player " + key + ". Hashtable is full.");
        } else {
            hashtable[hashedKey] = new SavedPlayer(key, value);
        }
    }

    public int findKey(String key) {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey) && hashtable[hashedKey].getKey().equals(key)) {
            return hashedKey;
        }

        int stoppingIndex = hashedKey;

        hashedKey = (hashedKey + 1) % hashtable.length;

        while (hashedKey != stoppingIndex &&
                isOccupied(hashedKey) &&
                !hashtable[hashedKey].getKey().equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (isOccupied(hashedKey) && hashtable[hashedKey].getKey().equals(key)) {
            return hashedKey;
        }

        return -1;
    }

    public Player get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].getValue();
    }
//remove function
    public void remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            System.out.println("No player found with name: " + key);
        } else {
            System.out.println("Removing player: " + hashtable[hashedKey].getValue().getUserName());
            hashtable[hashedKey] = null;
        }
    }

    public void removeRandom() {
        Random random = new Random();
        int index;
        do {
            index = random.nextInt(hashtable.length);
        } while (hashtable[index] == null);

        System.out.println("Randomly removed player: " + hashtable[index].getValue().getUserName());
        hashtable[index] = null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            Player player = null;

            if (hashtable[i] != null)
                player = hashtable[i].getValue();

            System.out.println("Element " + i + " = " + player);
        }
    }
}

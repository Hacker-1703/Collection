import java.util.*;

class Homework {
    public Integer[] removingDuplicates(Integer[] array) {
        Arrays.sort(array);
        Integer lastElem = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                lastElem = array[i];
                continue;
            }
            if (lastElem == array[i]) {
                array[i] = null;
                continue;
            }
            lastElem = array[i];
        }
        int col = 0;
        for (Integer i : array) {
            if (i != null) {
                col++;
            }
        }
        int j = 0;
        Integer[] newArray = new Integer[col];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (i == 0) {
                newArray[0] = array[i];
                j = 1;
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    public ArrayList<Integer> addingToTheMiddle(ArrayList<Integer> oldArray, Integer a) {
        ArrayList<Integer> newArray = oldArray;
        if (oldArray.size() % 2 == 0) {
            newArray.add(oldArray.size() / 2, a);
        } else {
            newArray.set(oldArray.size() / 2, a);
        }

        return newArray;
    }

    public LinkedList<Integer> joiningLists(LinkedList<Integer> firstSheet, LinkedList<Integer> secondSheet) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (Integer i : firstSheet) {
            newList.add(i);
        }
        for (Integer i : secondSheet) {
            newList.add(i);
        }
        return newList;
    }

    public boolean palindromeCheck(String string) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.add(Character.toString(string.charAt(i)));
        }
        if (stack.size() % 2 == 1) {
            while (stack.size() != 1) {
                if (stack.getFirst().equals(stack.getLast())) {
                    stack.removeFirst();
                    stack.removeLast();
                } else {
                    return false;
                }
            }
            return true;
        } else {
            while (stack.size() != 0) {
                if (stack.getFirst().equals(stack.getLast())) {
                    stack.removeFirst();
                    stack.removeLast();
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public Deque<Integer> deleteByValue(Deque<Integer> deque, Integer value) {
        for (Integer i : deque) {
            if (i == value) {
                deque.remove(i);
            }
        }
        return deque;
    }

    public Queue<String> addBuyer(Queue<String> buyerList, String newBuyer) {
        buyerList.add(newBuyer);
        return buyerList;
    }

    public Set<Integer> unionOfSets(Set<Integer> a, Set<Integer> b) {
        for (Integer i : a) {
            b.add(i);
        }
        return b;
    }

    //public Map<String, Integer> countingOccurrences(String text) {
    //    text.toLowerCase();
    //    text.replaceAll(",", " ");
    //    text.replaceAll(".", " ");
    //    text.replaceAll("!", " ");
    //    text.replaceAll("?", " ");
    //    List<String> splitText = List.of(text.split(" "));
    //    Map mapOfWords = new TreeMap<>();
    //    for (String i : splitText) {
    //        if (mapOfWords.isEmpty()) {
    //            mapOfWords.put(i, 1);
    //            continue;
    //        }
    //        for (Map.Entry<Integer, String> entry : mapOfWords.entrySet()) {
    //            System.out.println(entry.getKey());
    //        }
    //    }
    //    return mapOfWords;
    //}

    public int countingOccurrences(String text) {
        text = text.toLowerCase();
        text = text.replaceAll(",", " ");
        text = text.replaceAll(".", " ");
        text = text.replaceAll("!", " ");
        text = text.replaceAll("?", " ");

        List<String> words = List.of(text.split(" "));

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (word == entry.getKey()) {
                    wordCount.put(entry.getKey(), entry.getValue() + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        int count = 0;
        System.out.println("Слова и их количество в тексте:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count += entry.getValue();
        }
        return count;
    }

    public int cashRegister(Queue<String> buyers) throws InterruptedException {
        Random random = new Random();
        int profit = 0;
        System.out.println("Начало работы кассы в супермаркете:");
        while (!buyers.isEmpty()) {
            String client = buyers.poll();
            System.out.println("Начало обслуживания клиента: " + client);
            int delay = random.nextInt(11) + 5;
            int sum = random.nextInt(9985) + 15;
            Thread.sleep(delay * 1000);
            System.out.println("Заплачено " + sum + " рублей. Оплата прошла успешно!");
            System.out.println("Клиент " + client + " обслужен за " + delay + " секунд");
            profit += sum;
        }
        System.out.println("Очередь обработана, работа кассы завершена.");
        return profit;
    }
}
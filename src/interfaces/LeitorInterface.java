package interfaces;

import entities.Item;

import java.util.Set;

public interface LeitorInterface {
    Set<Item> lerArchiveEmp(String path);
    Set<Item> lerArchiveMlg(String path);
}

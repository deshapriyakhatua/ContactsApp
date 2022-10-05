package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ContactsList> dataList = new ArrayList<>();

        dataList.add(new ContactsList("https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80","Deshapriya Khatua","India","9091494739"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1579503841516-e0bd7fca5faa?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=880&q=80","Adarsha Khatua","India","9735624148"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1525786210598-d527194d3e9a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80","Swapnadwip Khatua","India","9735649451"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1621784564114-6eea05b89863?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80","Ramchandra Khatua","India","6290131696"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1552699611-e2c208d5d9cf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=808&q=80","Sunil Kumar","India","8695122696"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1553514029-1318c9127859?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=764&q=80","Priyadarsini Meheta","India","9091494739"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1509868918748-a554ad25f858?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80","Samar Roy","India","9091494739"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1603503345686-bfafb8cfea02?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=688&q=80","Partha Sarathi","India","9091494739"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1534008757030-27299c4371b6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80","Pandu Rang","India","9091494739"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1502323703385-c3ea9ace787d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80","Deshapriya9","India","9091494739"));
        dataList.add(new ContactsList("https://images.unsplash.com/photo-1574701147838-eb4e86cce813?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=686&q=80","Deshapriya10","India","9091494739"));

        ListView listView = (ListView) findViewById(R.id.contactList);

        //creating new adapter
        ContactsListAdapter adapter = new ContactsListAdapter(this, R.layout.list_item, dataList);
        listView.setAdapter(adapter);
        //hi
    }
}
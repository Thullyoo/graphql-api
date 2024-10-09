package com.thullyoo.graphl_api.service;

import com.thullyoo.graphl_api.data.Writer;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class WriterService {

    private Map<String, Writer> writes = new HashMap<>();

    public Collection<Writer> registerWriter(String name, Integer age){
        Writer newWriter = new Writer(UUID.randomUUID().toString(), name, age);
        writes.put(newWriter.getId(), newWriter);
        return writes.values();
    }

    public Writer writerById(String id){
        return writes.get(id);
    }
}

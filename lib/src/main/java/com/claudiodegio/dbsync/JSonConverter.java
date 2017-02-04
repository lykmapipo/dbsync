package com.claudiodegio.dbsync;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

import java.io.IOException;

public interface JSonConverter {

    ColumnValue jsonToColumnValue(JsonParser parser, ColumnMetadata metadata) throws IOException;

    void columnValueToJson(JsonGenerator gen, ColumnValue value) throws IOException;
}

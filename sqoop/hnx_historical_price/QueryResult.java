// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Mar 20 14:09:56 GMT 2024
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("STOCK_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.STOCK_ID = (String)value;
      }
    });
    setters.put("CLOSE_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.CLOSE_PRICE = (String)value;
      }
    });
    setters.put("PRICE_CHANGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.PRICE_CHANGE = (String)value;
      }
    });
    setters.put("BASE_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BASE_PRICE = (String)value;
      }
    });
    setters.put("OPEN_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OPEN_PRICE = (String)value;
      }
    });
    setters.put("HIGHEST_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.HIGHEST_PRICE = (String)value;
      }
    });
    setters.put("LOWEST_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.LOWEST_PRICE = (String)value;
      }
    });
    setters.put("MATCHED_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MATCHED_VOLUME = (String)value;
      }
    });
    setters.put("MATCHED_AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MATCHED_AMOUNT = (String)value;
      }
    });
    setters.put("SELF_DEALED_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELF_DEALED_VOLUME = (String)value;
      }
    });
    setters.put("SELF_DEALED_AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELF_DEALED_AMOUNT = (String)value;
      }
    });
    setters.put("RECORDED_DATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.RECORDED_DATE = (java.sql.Timestamp)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private String STOCK_ID;
  public String get_STOCK_ID() {
    return STOCK_ID;
  }
  public void set_STOCK_ID(String STOCK_ID) {
    this.STOCK_ID = STOCK_ID;
  }
  public QueryResult with_STOCK_ID(String STOCK_ID) {
    this.STOCK_ID = STOCK_ID;
    return this;
  }
  private String CLOSE_PRICE;
  public String get_CLOSE_PRICE() {
    return CLOSE_PRICE;
  }
  public void set_CLOSE_PRICE(String CLOSE_PRICE) {
    this.CLOSE_PRICE = CLOSE_PRICE;
  }
  public QueryResult with_CLOSE_PRICE(String CLOSE_PRICE) {
    this.CLOSE_PRICE = CLOSE_PRICE;
    return this;
  }
  private String PRICE_CHANGE;
  public String get_PRICE_CHANGE() {
    return PRICE_CHANGE;
  }
  public void set_PRICE_CHANGE(String PRICE_CHANGE) {
    this.PRICE_CHANGE = PRICE_CHANGE;
  }
  public QueryResult with_PRICE_CHANGE(String PRICE_CHANGE) {
    this.PRICE_CHANGE = PRICE_CHANGE;
    return this;
  }
  private String BASE_PRICE;
  public String get_BASE_PRICE() {
    return BASE_PRICE;
  }
  public void set_BASE_PRICE(String BASE_PRICE) {
    this.BASE_PRICE = BASE_PRICE;
  }
  public QueryResult with_BASE_PRICE(String BASE_PRICE) {
    this.BASE_PRICE = BASE_PRICE;
    return this;
  }
  private String OPEN_PRICE;
  public String get_OPEN_PRICE() {
    return OPEN_PRICE;
  }
  public void set_OPEN_PRICE(String OPEN_PRICE) {
    this.OPEN_PRICE = OPEN_PRICE;
  }
  public QueryResult with_OPEN_PRICE(String OPEN_PRICE) {
    this.OPEN_PRICE = OPEN_PRICE;
    return this;
  }
  private String HIGHEST_PRICE;
  public String get_HIGHEST_PRICE() {
    return HIGHEST_PRICE;
  }
  public void set_HIGHEST_PRICE(String HIGHEST_PRICE) {
    this.HIGHEST_PRICE = HIGHEST_PRICE;
  }
  public QueryResult with_HIGHEST_PRICE(String HIGHEST_PRICE) {
    this.HIGHEST_PRICE = HIGHEST_PRICE;
    return this;
  }
  private String LOWEST_PRICE;
  public String get_LOWEST_PRICE() {
    return LOWEST_PRICE;
  }
  public void set_LOWEST_PRICE(String LOWEST_PRICE) {
    this.LOWEST_PRICE = LOWEST_PRICE;
  }
  public QueryResult with_LOWEST_PRICE(String LOWEST_PRICE) {
    this.LOWEST_PRICE = LOWEST_PRICE;
    return this;
  }
  private String MATCHED_VOLUME;
  public String get_MATCHED_VOLUME() {
    return MATCHED_VOLUME;
  }
  public void set_MATCHED_VOLUME(String MATCHED_VOLUME) {
    this.MATCHED_VOLUME = MATCHED_VOLUME;
  }
  public QueryResult with_MATCHED_VOLUME(String MATCHED_VOLUME) {
    this.MATCHED_VOLUME = MATCHED_VOLUME;
    return this;
  }
  private String MATCHED_AMOUNT;
  public String get_MATCHED_AMOUNT() {
    return MATCHED_AMOUNT;
  }
  public void set_MATCHED_AMOUNT(String MATCHED_AMOUNT) {
    this.MATCHED_AMOUNT = MATCHED_AMOUNT;
  }
  public QueryResult with_MATCHED_AMOUNT(String MATCHED_AMOUNT) {
    this.MATCHED_AMOUNT = MATCHED_AMOUNT;
    return this;
  }
  private String SELF_DEALED_VOLUME;
  public String get_SELF_DEALED_VOLUME() {
    return SELF_DEALED_VOLUME;
  }
  public void set_SELF_DEALED_VOLUME(String SELF_DEALED_VOLUME) {
    this.SELF_DEALED_VOLUME = SELF_DEALED_VOLUME;
  }
  public QueryResult with_SELF_DEALED_VOLUME(String SELF_DEALED_VOLUME) {
    this.SELF_DEALED_VOLUME = SELF_DEALED_VOLUME;
    return this;
  }
  private String SELF_DEALED_AMOUNT;
  public String get_SELF_DEALED_AMOUNT() {
    return SELF_DEALED_AMOUNT;
  }
  public void set_SELF_DEALED_AMOUNT(String SELF_DEALED_AMOUNT) {
    this.SELF_DEALED_AMOUNT = SELF_DEALED_AMOUNT;
  }
  public QueryResult with_SELF_DEALED_AMOUNT(String SELF_DEALED_AMOUNT) {
    this.SELF_DEALED_AMOUNT = SELF_DEALED_AMOUNT;
    return this;
  }
  private java.sql.Timestamp RECORDED_DATE;
  public java.sql.Timestamp get_RECORDED_DATE() {
    return RECORDED_DATE;
  }
  public void set_RECORDED_DATE(java.sql.Timestamp RECORDED_DATE) {
    this.RECORDED_DATE = RECORDED_DATE;
  }
  public QueryResult with_RECORDED_DATE(java.sql.Timestamp RECORDED_DATE) {
    this.RECORDED_DATE = RECORDED_DATE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.STOCK_ID == null ? that.STOCK_ID == null : this.STOCK_ID.equals(that.STOCK_ID));
    equal = equal && (this.CLOSE_PRICE == null ? that.CLOSE_PRICE == null : this.CLOSE_PRICE.equals(that.CLOSE_PRICE));
    equal = equal && (this.PRICE_CHANGE == null ? that.PRICE_CHANGE == null : this.PRICE_CHANGE.equals(that.PRICE_CHANGE));
    equal = equal && (this.BASE_PRICE == null ? that.BASE_PRICE == null : this.BASE_PRICE.equals(that.BASE_PRICE));
    equal = equal && (this.OPEN_PRICE == null ? that.OPEN_PRICE == null : this.OPEN_PRICE.equals(that.OPEN_PRICE));
    equal = equal && (this.HIGHEST_PRICE == null ? that.HIGHEST_PRICE == null : this.HIGHEST_PRICE.equals(that.HIGHEST_PRICE));
    equal = equal && (this.LOWEST_PRICE == null ? that.LOWEST_PRICE == null : this.LOWEST_PRICE.equals(that.LOWEST_PRICE));
    equal = equal && (this.MATCHED_VOLUME == null ? that.MATCHED_VOLUME == null : this.MATCHED_VOLUME.equals(that.MATCHED_VOLUME));
    equal = equal && (this.MATCHED_AMOUNT == null ? that.MATCHED_AMOUNT == null : this.MATCHED_AMOUNT.equals(that.MATCHED_AMOUNT));
    equal = equal && (this.SELF_DEALED_VOLUME == null ? that.SELF_DEALED_VOLUME == null : this.SELF_DEALED_VOLUME.equals(that.SELF_DEALED_VOLUME));
    equal = equal && (this.SELF_DEALED_AMOUNT == null ? that.SELF_DEALED_AMOUNT == null : this.SELF_DEALED_AMOUNT.equals(that.SELF_DEALED_AMOUNT));
    equal = equal && (this.RECORDED_DATE == null ? that.RECORDED_DATE == null : this.RECORDED_DATE.equals(that.RECORDED_DATE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.STOCK_ID == null ? that.STOCK_ID == null : this.STOCK_ID.equals(that.STOCK_ID));
    equal = equal && (this.CLOSE_PRICE == null ? that.CLOSE_PRICE == null : this.CLOSE_PRICE.equals(that.CLOSE_PRICE));
    equal = equal && (this.PRICE_CHANGE == null ? that.PRICE_CHANGE == null : this.PRICE_CHANGE.equals(that.PRICE_CHANGE));
    equal = equal && (this.BASE_PRICE == null ? that.BASE_PRICE == null : this.BASE_PRICE.equals(that.BASE_PRICE));
    equal = equal && (this.OPEN_PRICE == null ? that.OPEN_PRICE == null : this.OPEN_PRICE.equals(that.OPEN_PRICE));
    equal = equal && (this.HIGHEST_PRICE == null ? that.HIGHEST_PRICE == null : this.HIGHEST_PRICE.equals(that.HIGHEST_PRICE));
    equal = equal && (this.LOWEST_PRICE == null ? that.LOWEST_PRICE == null : this.LOWEST_PRICE.equals(that.LOWEST_PRICE));
    equal = equal && (this.MATCHED_VOLUME == null ? that.MATCHED_VOLUME == null : this.MATCHED_VOLUME.equals(that.MATCHED_VOLUME));
    equal = equal && (this.MATCHED_AMOUNT == null ? that.MATCHED_AMOUNT == null : this.MATCHED_AMOUNT.equals(that.MATCHED_AMOUNT));
    equal = equal && (this.SELF_DEALED_VOLUME == null ? that.SELF_DEALED_VOLUME == null : this.SELF_DEALED_VOLUME.equals(that.SELF_DEALED_VOLUME));
    equal = equal && (this.SELF_DEALED_AMOUNT == null ? that.SELF_DEALED_AMOUNT == null : this.SELF_DEALED_AMOUNT.equals(that.SELF_DEALED_AMOUNT));
    equal = equal && (this.RECORDED_DATE == null ? that.RECORDED_DATE == null : this.RECORDED_DATE.equals(that.RECORDED_DATE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STOCK_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.CLOSE_PRICE = JdbcWritableBridge.readString(2, __dbResults);
    this.PRICE_CHANGE = JdbcWritableBridge.readString(3, __dbResults);
    this.BASE_PRICE = JdbcWritableBridge.readString(4, __dbResults);
    this.OPEN_PRICE = JdbcWritableBridge.readString(5, __dbResults);
    this.HIGHEST_PRICE = JdbcWritableBridge.readString(6, __dbResults);
    this.LOWEST_PRICE = JdbcWritableBridge.readString(7, __dbResults);
    this.MATCHED_VOLUME = JdbcWritableBridge.readString(8, __dbResults);
    this.MATCHED_AMOUNT = JdbcWritableBridge.readString(9, __dbResults);
    this.SELF_DEALED_VOLUME = JdbcWritableBridge.readString(10, __dbResults);
    this.SELF_DEALED_AMOUNT = JdbcWritableBridge.readString(11, __dbResults);
    this.RECORDED_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STOCK_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.CLOSE_PRICE = JdbcWritableBridge.readString(2, __dbResults);
    this.PRICE_CHANGE = JdbcWritableBridge.readString(3, __dbResults);
    this.BASE_PRICE = JdbcWritableBridge.readString(4, __dbResults);
    this.OPEN_PRICE = JdbcWritableBridge.readString(5, __dbResults);
    this.HIGHEST_PRICE = JdbcWritableBridge.readString(6, __dbResults);
    this.LOWEST_PRICE = JdbcWritableBridge.readString(7, __dbResults);
    this.MATCHED_VOLUME = JdbcWritableBridge.readString(8, __dbResults);
    this.MATCHED_AMOUNT = JdbcWritableBridge.readString(9, __dbResults);
    this.SELF_DEALED_VOLUME = JdbcWritableBridge.readString(10, __dbResults);
    this.SELF_DEALED_AMOUNT = JdbcWritableBridge.readString(11, __dbResults);
    this.RECORDED_DATE = JdbcWritableBridge.readTimestamp(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STOCK_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLOSE_PRICE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRICE_CHANGE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BASE_PRICE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OPEN_PRICE, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HIGHEST_PRICE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOWEST_PRICE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MATCHED_VOLUME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MATCHED_AMOUNT, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SELF_DEALED_VOLUME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SELF_DEALED_AMOUNT, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RECORDED_DATE, 12 + __off, 93, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STOCK_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CLOSE_PRICE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PRICE_CHANGE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BASE_PRICE, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(OPEN_PRICE, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HIGHEST_PRICE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOWEST_PRICE, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MATCHED_VOLUME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MATCHED_AMOUNT, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SELF_DEALED_VOLUME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SELF_DEALED_AMOUNT, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RECORDED_DATE, 12 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.STOCK_ID = null;
    } else {
    this.STOCK_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CLOSE_PRICE = null;
    } else {
    this.CLOSE_PRICE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRICE_CHANGE = null;
    } else {
    this.PRICE_CHANGE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BASE_PRICE = null;
    } else {
    this.BASE_PRICE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.OPEN_PRICE = null;
    } else {
    this.OPEN_PRICE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HIGHEST_PRICE = null;
    } else {
    this.HIGHEST_PRICE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOWEST_PRICE = null;
    } else {
    this.LOWEST_PRICE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MATCHED_VOLUME = null;
    } else {
    this.MATCHED_VOLUME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MATCHED_AMOUNT = null;
    } else {
    this.MATCHED_AMOUNT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELF_DEALED_VOLUME = null;
    } else {
    this.SELF_DEALED_VOLUME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELF_DEALED_AMOUNT = null;
    } else {
    this.SELF_DEALED_AMOUNT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RECORDED_DATE = null;
    } else {
    this.RECORDED_DATE = new Timestamp(__dataIn.readLong());
    this.RECORDED_DATE.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.STOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_ID);
    }
    if (null == this.CLOSE_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLOSE_PRICE);
    }
    if (null == this.PRICE_CHANGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRICE_CHANGE);
    }
    if (null == this.BASE_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASE_PRICE);
    }
    if (null == this.OPEN_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OPEN_PRICE);
    }
    if (null == this.HIGHEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIGHEST_PRICE);
    }
    if (null == this.LOWEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOWEST_PRICE);
    }
    if (null == this.MATCHED_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MATCHED_VOLUME);
    }
    if (null == this.MATCHED_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MATCHED_AMOUNT);
    }
    if (null == this.SELF_DEALED_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SELF_DEALED_VOLUME);
    }
    if (null == this.SELF_DEALED_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SELF_DEALED_AMOUNT);
    }
    if (null == this.RECORDED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.RECORDED_DATE.getTime());
    __dataOut.writeInt(this.RECORDED_DATE.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.STOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_ID);
    }
    if (null == this.CLOSE_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CLOSE_PRICE);
    }
    if (null == this.PRICE_CHANGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRICE_CHANGE);
    }
    if (null == this.BASE_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASE_PRICE);
    }
    if (null == this.OPEN_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, OPEN_PRICE);
    }
    if (null == this.HIGHEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIGHEST_PRICE);
    }
    if (null == this.LOWEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOWEST_PRICE);
    }
    if (null == this.MATCHED_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MATCHED_VOLUME);
    }
    if (null == this.MATCHED_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MATCHED_AMOUNT);
    }
    if (null == this.SELF_DEALED_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SELF_DEALED_VOLUME);
    }
    if (null == this.SELF_DEALED_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SELF_DEALED_AMOUNT);
    }
    if (null == this.RECORDED_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.RECORDED_DATE.getTime());
    __dataOut.writeInt(this.RECORDED_DATE.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_ID==null?"null":STOCK_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSE_PRICE==null?"null":CLOSE_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE_CHANGE==null?"null":PRICE_CHANGE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASE_PRICE==null?"null":BASE_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_PRICE==null?"null":OPEN_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGHEST_PRICE==null?"null":HIGHEST_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOWEST_PRICE==null?"null":LOWEST_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_VOLUME==null?"null":MATCHED_VOLUME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_AMOUNT==null?"null":MATCHED_AMOUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELF_DEALED_VOLUME==null?"null":SELF_DEALED_VOLUME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELF_DEALED_AMOUNT==null?"null":SELF_DEALED_AMOUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDED_DATE==null?"null":"" + RECORDED_DATE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_ID==null?"null":STOCK_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CLOSE_PRICE==null?"null":CLOSE_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE_CHANGE==null?"null":PRICE_CHANGE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASE_PRICE==null?"null":BASE_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_PRICE==null?"null":OPEN_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGHEST_PRICE==null?"null":HIGHEST_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOWEST_PRICE==null?"null":LOWEST_PRICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_VOLUME==null?"null":MATCHED_VOLUME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_AMOUNT==null?"null":MATCHED_AMOUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELF_DEALED_VOLUME==null?"null":SELF_DEALED_VOLUME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELF_DEALED_AMOUNT==null?"null":SELF_DEALED_AMOUNT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDED_DATE==null?"null":"" + RECORDED_DATE, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.STOCK_ID = null; } else {
      this.STOCK_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CLOSE_PRICE = null; } else {
      this.CLOSE_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PRICE_CHANGE = null; } else {
      this.PRICE_CHANGE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.BASE_PRICE = null; } else {
      this.BASE_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OPEN_PRICE = null; } else {
      this.OPEN_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.HIGHEST_PRICE = null; } else {
      this.HIGHEST_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LOWEST_PRICE = null; } else {
      this.LOWEST_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MATCHED_VOLUME = null; } else {
      this.MATCHED_VOLUME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MATCHED_AMOUNT = null; } else {
      this.MATCHED_AMOUNT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SELF_DEALED_VOLUME = null; } else {
      this.SELF_DEALED_VOLUME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SELF_DEALED_AMOUNT = null; } else {
      this.SELF_DEALED_AMOUNT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDED_DATE = null; } else {
      this.RECORDED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.STOCK_ID = null; } else {
      this.STOCK_ID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CLOSE_PRICE = null; } else {
      this.CLOSE_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.PRICE_CHANGE = null; } else {
      this.PRICE_CHANGE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.BASE_PRICE = null; } else {
      this.BASE_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.OPEN_PRICE = null; } else {
      this.OPEN_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.HIGHEST_PRICE = null; } else {
      this.HIGHEST_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.LOWEST_PRICE = null; } else {
      this.LOWEST_PRICE = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MATCHED_VOLUME = null; } else {
      this.MATCHED_VOLUME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.MATCHED_AMOUNT = null; } else {
      this.MATCHED_AMOUNT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SELF_DEALED_VOLUME = null; } else {
      this.SELF_DEALED_VOLUME = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SELF_DEALED_AMOUNT = null; } else {
      this.SELF_DEALED_AMOUNT = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDED_DATE = null; } else {
      this.RECORDED_DATE = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.RECORDED_DATE = (o.RECORDED_DATE != null) ? (java.sql.Timestamp) o.RECORDED_DATE.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.RECORDED_DATE = (o.RECORDED_DATE != null) ? (java.sql.Timestamp) o.RECORDED_DATE.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("STOCK_ID", this.STOCK_ID);
    __sqoop$field_map.put("CLOSE_PRICE", this.CLOSE_PRICE);
    __sqoop$field_map.put("PRICE_CHANGE", this.PRICE_CHANGE);
    __sqoop$field_map.put("BASE_PRICE", this.BASE_PRICE);
    __sqoop$field_map.put("OPEN_PRICE", this.OPEN_PRICE);
    __sqoop$field_map.put("HIGHEST_PRICE", this.HIGHEST_PRICE);
    __sqoop$field_map.put("LOWEST_PRICE", this.LOWEST_PRICE);
    __sqoop$field_map.put("MATCHED_VOLUME", this.MATCHED_VOLUME);
    __sqoop$field_map.put("MATCHED_AMOUNT", this.MATCHED_AMOUNT);
    __sqoop$field_map.put("SELF_DEALED_VOLUME", this.SELF_DEALED_VOLUME);
    __sqoop$field_map.put("SELF_DEALED_AMOUNT", this.SELF_DEALED_AMOUNT);
    __sqoop$field_map.put("RECORDED_DATE", this.RECORDED_DATE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STOCK_ID", this.STOCK_ID);
    __sqoop$field_map.put("CLOSE_PRICE", this.CLOSE_PRICE);
    __sqoop$field_map.put("PRICE_CHANGE", this.PRICE_CHANGE);
    __sqoop$field_map.put("BASE_PRICE", this.BASE_PRICE);
    __sqoop$field_map.put("OPEN_PRICE", this.OPEN_PRICE);
    __sqoop$field_map.put("HIGHEST_PRICE", this.HIGHEST_PRICE);
    __sqoop$field_map.put("LOWEST_PRICE", this.LOWEST_PRICE);
    __sqoop$field_map.put("MATCHED_VOLUME", this.MATCHED_VOLUME);
    __sqoop$field_map.put("MATCHED_AMOUNT", this.MATCHED_AMOUNT);
    __sqoop$field_map.put("SELF_DEALED_VOLUME", this.SELF_DEALED_VOLUME);
    __sqoop$field_map.put("SELF_DEALED_AMOUNT", this.SELF_DEALED_AMOUNT);
    __sqoop$field_map.put("RECORDED_DATE", this.RECORDED_DATE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}

// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Mar 07 20:36:10 GMT 2024
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
    setters.put("PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("PRICE_CHANGE_VALUE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.PRICE_CHANGE_VALUE = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_ORDER_QUANTITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_ORDER_QUANTITY = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_ORDER_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_ORDER_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("VOLUME_PER_BUY_ORDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VOLUME_PER_BUY_ORDER = (java.math.BigDecimal)value;
      }
    });
    setters.put("UNMATCHED_BUY_ORDER_QUANTITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.UNMATCHED_BUY_ORDER_QUANTITY = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_ORDER_QUANTITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_ORDER_QUANTITY = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_ORDER_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_ORDER_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("VOLUME_PER_SELL_ORDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.VOLUME_PER_SELL_ORDER = (java.math.BigDecimal)value;
      }
    });
    setters.put("UNMATCHED_SELL_ORDER_QUANTITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.UNMATCHED_SELL_ORDER_QUANTITY = (java.math.BigDecimal)value;
      }
    });
    setters.put("NET_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.NET_VOLUME = (java.math.BigDecimal)value;
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
  private java.math.BigDecimal PRICE;
  public java.math.BigDecimal get_PRICE() {
    return PRICE;
  }
  public void set_PRICE(java.math.BigDecimal PRICE) {
    this.PRICE = PRICE;
  }
  public QueryResult with_PRICE(java.math.BigDecimal PRICE) {
    this.PRICE = PRICE;
    return this;
  }
  private java.math.BigDecimal PRICE_CHANGE_VALUE;
  public java.math.BigDecimal get_PRICE_CHANGE_VALUE() {
    return PRICE_CHANGE_VALUE;
  }
  public void set_PRICE_CHANGE_VALUE(java.math.BigDecimal PRICE_CHANGE_VALUE) {
    this.PRICE_CHANGE_VALUE = PRICE_CHANGE_VALUE;
  }
  public QueryResult with_PRICE_CHANGE_VALUE(java.math.BigDecimal PRICE_CHANGE_VALUE) {
    this.PRICE_CHANGE_VALUE = PRICE_CHANGE_VALUE;
    return this;
  }
  private java.math.BigDecimal BUY_ORDER_QUANTITY;
  public java.math.BigDecimal get_BUY_ORDER_QUANTITY() {
    return BUY_ORDER_QUANTITY;
  }
  public void set_BUY_ORDER_QUANTITY(java.math.BigDecimal BUY_ORDER_QUANTITY) {
    this.BUY_ORDER_QUANTITY = BUY_ORDER_QUANTITY;
  }
  public QueryResult with_BUY_ORDER_QUANTITY(java.math.BigDecimal BUY_ORDER_QUANTITY) {
    this.BUY_ORDER_QUANTITY = BUY_ORDER_QUANTITY;
    return this;
  }
  private java.math.BigDecimal BUY_ORDER_VOLUME;
  public java.math.BigDecimal get_BUY_ORDER_VOLUME() {
    return BUY_ORDER_VOLUME;
  }
  public void set_BUY_ORDER_VOLUME(java.math.BigDecimal BUY_ORDER_VOLUME) {
    this.BUY_ORDER_VOLUME = BUY_ORDER_VOLUME;
  }
  public QueryResult with_BUY_ORDER_VOLUME(java.math.BigDecimal BUY_ORDER_VOLUME) {
    this.BUY_ORDER_VOLUME = BUY_ORDER_VOLUME;
    return this;
  }
  private java.math.BigDecimal VOLUME_PER_BUY_ORDER;
  public java.math.BigDecimal get_VOLUME_PER_BUY_ORDER() {
    return VOLUME_PER_BUY_ORDER;
  }
  public void set_VOLUME_PER_BUY_ORDER(java.math.BigDecimal VOLUME_PER_BUY_ORDER) {
    this.VOLUME_PER_BUY_ORDER = VOLUME_PER_BUY_ORDER;
  }
  public QueryResult with_VOLUME_PER_BUY_ORDER(java.math.BigDecimal VOLUME_PER_BUY_ORDER) {
    this.VOLUME_PER_BUY_ORDER = VOLUME_PER_BUY_ORDER;
    return this;
  }
  private java.math.BigDecimal UNMATCHED_BUY_ORDER_QUANTITY;
  public java.math.BigDecimal get_UNMATCHED_BUY_ORDER_QUANTITY() {
    return UNMATCHED_BUY_ORDER_QUANTITY;
  }
  public void set_UNMATCHED_BUY_ORDER_QUANTITY(java.math.BigDecimal UNMATCHED_BUY_ORDER_QUANTITY) {
    this.UNMATCHED_BUY_ORDER_QUANTITY = UNMATCHED_BUY_ORDER_QUANTITY;
  }
  public QueryResult with_UNMATCHED_BUY_ORDER_QUANTITY(java.math.BigDecimal UNMATCHED_BUY_ORDER_QUANTITY) {
    this.UNMATCHED_BUY_ORDER_QUANTITY = UNMATCHED_BUY_ORDER_QUANTITY;
    return this;
  }
  private java.math.BigDecimal SELL_ORDER_QUANTITY;
  public java.math.BigDecimal get_SELL_ORDER_QUANTITY() {
    return SELL_ORDER_QUANTITY;
  }
  public void set_SELL_ORDER_QUANTITY(java.math.BigDecimal SELL_ORDER_QUANTITY) {
    this.SELL_ORDER_QUANTITY = SELL_ORDER_QUANTITY;
  }
  public QueryResult with_SELL_ORDER_QUANTITY(java.math.BigDecimal SELL_ORDER_QUANTITY) {
    this.SELL_ORDER_QUANTITY = SELL_ORDER_QUANTITY;
    return this;
  }
  private java.math.BigDecimal SELL_ORDER_VOLUME;
  public java.math.BigDecimal get_SELL_ORDER_VOLUME() {
    return SELL_ORDER_VOLUME;
  }
  public void set_SELL_ORDER_VOLUME(java.math.BigDecimal SELL_ORDER_VOLUME) {
    this.SELL_ORDER_VOLUME = SELL_ORDER_VOLUME;
  }
  public QueryResult with_SELL_ORDER_VOLUME(java.math.BigDecimal SELL_ORDER_VOLUME) {
    this.SELL_ORDER_VOLUME = SELL_ORDER_VOLUME;
    return this;
  }
  private java.math.BigDecimal VOLUME_PER_SELL_ORDER;
  public java.math.BigDecimal get_VOLUME_PER_SELL_ORDER() {
    return VOLUME_PER_SELL_ORDER;
  }
  public void set_VOLUME_PER_SELL_ORDER(java.math.BigDecimal VOLUME_PER_SELL_ORDER) {
    this.VOLUME_PER_SELL_ORDER = VOLUME_PER_SELL_ORDER;
  }
  public QueryResult with_VOLUME_PER_SELL_ORDER(java.math.BigDecimal VOLUME_PER_SELL_ORDER) {
    this.VOLUME_PER_SELL_ORDER = VOLUME_PER_SELL_ORDER;
    return this;
  }
  private java.math.BigDecimal UNMATCHED_SELL_ORDER_QUANTITY;
  public java.math.BigDecimal get_UNMATCHED_SELL_ORDER_QUANTITY() {
    return UNMATCHED_SELL_ORDER_QUANTITY;
  }
  public void set_UNMATCHED_SELL_ORDER_QUANTITY(java.math.BigDecimal UNMATCHED_SELL_ORDER_QUANTITY) {
    this.UNMATCHED_SELL_ORDER_QUANTITY = UNMATCHED_SELL_ORDER_QUANTITY;
  }
  public QueryResult with_UNMATCHED_SELL_ORDER_QUANTITY(java.math.BigDecimal UNMATCHED_SELL_ORDER_QUANTITY) {
    this.UNMATCHED_SELL_ORDER_QUANTITY = UNMATCHED_SELL_ORDER_QUANTITY;
    return this;
  }
  private java.math.BigDecimal NET_VOLUME;
  public java.math.BigDecimal get_NET_VOLUME() {
    return NET_VOLUME;
  }
  public void set_NET_VOLUME(java.math.BigDecimal NET_VOLUME) {
    this.NET_VOLUME = NET_VOLUME;
  }
  public QueryResult with_NET_VOLUME(java.math.BigDecimal NET_VOLUME) {
    this.NET_VOLUME = NET_VOLUME;
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
    equal = equal && (this.PRICE == null ? that.PRICE == null : this.PRICE.equals(that.PRICE));
    equal = equal && (this.PRICE_CHANGE_VALUE == null ? that.PRICE_CHANGE_VALUE == null : this.PRICE_CHANGE_VALUE.equals(that.PRICE_CHANGE_VALUE));
    equal = equal && (this.BUY_ORDER_QUANTITY == null ? that.BUY_ORDER_QUANTITY == null : this.BUY_ORDER_QUANTITY.equals(that.BUY_ORDER_QUANTITY));
    equal = equal && (this.BUY_ORDER_VOLUME == null ? that.BUY_ORDER_VOLUME == null : this.BUY_ORDER_VOLUME.equals(that.BUY_ORDER_VOLUME));
    equal = equal && (this.VOLUME_PER_BUY_ORDER == null ? that.VOLUME_PER_BUY_ORDER == null : this.VOLUME_PER_BUY_ORDER.equals(that.VOLUME_PER_BUY_ORDER));
    equal = equal && (this.UNMATCHED_BUY_ORDER_QUANTITY == null ? that.UNMATCHED_BUY_ORDER_QUANTITY == null : this.UNMATCHED_BUY_ORDER_QUANTITY.equals(that.UNMATCHED_BUY_ORDER_QUANTITY));
    equal = equal && (this.SELL_ORDER_QUANTITY == null ? that.SELL_ORDER_QUANTITY == null : this.SELL_ORDER_QUANTITY.equals(that.SELL_ORDER_QUANTITY));
    equal = equal && (this.SELL_ORDER_VOLUME == null ? that.SELL_ORDER_VOLUME == null : this.SELL_ORDER_VOLUME.equals(that.SELL_ORDER_VOLUME));
    equal = equal && (this.VOLUME_PER_SELL_ORDER == null ? that.VOLUME_PER_SELL_ORDER == null : this.VOLUME_PER_SELL_ORDER.equals(that.VOLUME_PER_SELL_ORDER));
    equal = equal && (this.UNMATCHED_SELL_ORDER_QUANTITY == null ? that.UNMATCHED_SELL_ORDER_QUANTITY == null : this.UNMATCHED_SELL_ORDER_QUANTITY.equals(that.UNMATCHED_SELL_ORDER_QUANTITY));
    equal = equal && (this.NET_VOLUME == null ? that.NET_VOLUME == null : this.NET_VOLUME.equals(that.NET_VOLUME));
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
    equal = equal && (this.PRICE == null ? that.PRICE == null : this.PRICE.equals(that.PRICE));
    equal = equal && (this.PRICE_CHANGE_VALUE == null ? that.PRICE_CHANGE_VALUE == null : this.PRICE_CHANGE_VALUE.equals(that.PRICE_CHANGE_VALUE));
    equal = equal && (this.BUY_ORDER_QUANTITY == null ? that.BUY_ORDER_QUANTITY == null : this.BUY_ORDER_QUANTITY.equals(that.BUY_ORDER_QUANTITY));
    equal = equal && (this.BUY_ORDER_VOLUME == null ? that.BUY_ORDER_VOLUME == null : this.BUY_ORDER_VOLUME.equals(that.BUY_ORDER_VOLUME));
    equal = equal && (this.VOLUME_PER_BUY_ORDER == null ? that.VOLUME_PER_BUY_ORDER == null : this.VOLUME_PER_BUY_ORDER.equals(that.VOLUME_PER_BUY_ORDER));
    equal = equal && (this.UNMATCHED_BUY_ORDER_QUANTITY == null ? that.UNMATCHED_BUY_ORDER_QUANTITY == null : this.UNMATCHED_BUY_ORDER_QUANTITY.equals(that.UNMATCHED_BUY_ORDER_QUANTITY));
    equal = equal && (this.SELL_ORDER_QUANTITY == null ? that.SELL_ORDER_QUANTITY == null : this.SELL_ORDER_QUANTITY.equals(that.SELL_ORDER_QUANTITY));
    equal = equal && (this.SELL_ORDER_VOLUME == null ? that.SELL_ORDER_VOLUME == null : this.SELL_ORDER_VOLUME.equals(that.SELL_ORDER_VOLUME));
    equal = equal && (this.VOLUME_PER_SELL_ORDER == null ? that.VOLUME_PER_SELL_ORDER == null : this.VOLUME_PER_SELL_ORDER.equals(that.VOLUME_PER_SELL_ORDER));
    equal = equal && (this.UNMATCHED_SELL_ORDER_QUANTITY == null ? that.UNMATCHED_SELL_ORDER_QUANTITY == null : this.UNMATCHED_SELL_ORDER_QUANTITY.equals(that.UNMATCHED_SELL_ORDER_QUANTITY));
    equal = equal && (this.NET_VOLUME == null ? that.NET_VOLUME == null : this.NET_VOLUME.equals(that.NET_VOLUME));
    equal = equal && (this.RECORDED_DATE == null ? that.RECORDED_DATE == null : this.RECORDED_DATE.equals(that.RECORDED_DATE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STOCK_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.PRICE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.PRICE_CHANGE_VALUE = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.BUY_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.BUY_ORDER_VOLUME = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.VOLUME_PER_BUY_ORDER = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.UNMATCHED_BUY_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.SELL_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.SELL_ORDER_VOLUME = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.VOLUME_PER_SELL_ORDER = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.UNMATCHED_SELL_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.NET_VOLUME = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.RECORDED_DATE = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STOCK_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.PRICE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.PRICE_CHANGE_VALUE = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.BUY_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.BUY_ORDER_VOLUME = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.VOLUME_PER_BUY_ORDER = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.UNMATCHED_BUY_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.SELL_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.SELL_ORDER_VOLUME = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.VOLUME_PER_SELL_ORDER = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.UNMATCHED_SELL_ORDER_QUANTITY = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.NET_VOLUME = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.RECORDED_DATE = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(PRICE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRICE_CHANGE_VALUE, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_ORDER_QUANTITY, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_ORDER_VOLUME, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOLUME_PER_BUY_ORDER, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNMATCHED_BUY_ORDER_QUANTITY, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_ORDER_QUANTITY, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_ORDER_VOLUME, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOLUME_PER_SELL_ORDER, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNMATCHED_SELL_ORDER_QUANTITY, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_VOLUME, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RECORDED_DATE, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STOCK_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRICE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PRICE_CHANGE_VALUE, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_ORDER_QUANTITY, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_ORDER_VOLUME, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOLUME_PER_BUY_ORDER, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNMATCHED_BUY_ORDER_QUANTITY, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_ORDER_QUANTITY, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_ORDER_VOLUME, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOLUME_PER_SELL_ORDER, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNMATCHED_SELL_ORDER_QUANTITY, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NET_VOLUME, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RECORDED_DATE, 13 + __off, 93, __dbStmt);
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
        this.PRICE = null;
    } else {
    this.PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRICE_CHANGE_VALUE = null;
    } else {
    this.PRICE_CHANGE_VALUE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_ORDER_QUANTITY = null;
    } else {
    this.BUY_ORDER_QUANTITY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_ORDER_VOLUME = null;
    } else {
    this.BUY_ORDER_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOLUME_PER_BUY_ORDER = null;
    } else {
    this.VOLUME_PER_BUY_ORDER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UNMATCHED_BUY_ORDER_QUANTITY = null;
    } else {
    this.UNMATCHED_BUY_ORDER_QUANTITY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_ORDER_QUANTITY = null;
    } else {
    this.SELL_ORDER_QUANTITY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_ORDER_VOLUME = null;
    } else {
    this.SELL_ORDER_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOLUME_PER_SELL_ORDER = null;
    } else {
    this.VOLUME_PER_SELL_ORDER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UNMATCHED_SELL_ORDER_QUANTITY = null;
    } else {
    this.UNMATCHED_SELL_ORDER_QUANTITY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NET_VOLUME = null;
    } else {
    this.NET_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE, __dataOut);
    }
    if (null == this.PRICE_CHANGE_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE_CHANGE_VALUE, __dataOut);
    }
    if (null == this.BUY_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.BUY_ORDER_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_ORDER_VOLUME, __dataOut);
    }
    if (null == this.VOLUME_PER_BUY_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOLUME_PER_BUY_ORDER, __dataOut);
    }
    if (null == this.UNMATCHED_BUY_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNMATCHED_BUY_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.SELL_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.SELL_ORDER_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_ORDER_VOLUME, __dataOut);
    }
    if (null == this.VOLUME_PER_SELL_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOLUME_PER_SELL_ORDER, __dataOut);
    }
    if (null == this.UNMATCHED_SELL_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNMATCHED_SELL_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.NET_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_VOLUME, __dataOut);
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
    if (null == this.PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE, __dataOut);
    }
    if (null == this.PRICE_CHANGE_VALUE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PRICE_CHANGE_VALUE, __dataOut);
    }
    if (null == this.BUY_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.BUY_ORDER_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_ORDER_VOLUME, __dataOut);
    }
    if (null == this.VOLUME_PER_BUY_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOLUME_PER_BUY_ORDER, __dataOut);
    }
    if (null == this.UNMATCHED_BUY_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNMATCHED_BUY_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.SELL_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.SELL_ORDER_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_ORDER_VOLUME, __dataOut);
    }
    if (null == this.VOLUME_PER_SELL_ORDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOLUME_PER_SELL_ORDER, __dataOut);
    }
    if (null == this.UNMATCHED_SELL_ORDER_QUANTITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNMATCHED_SELL_ORDER_QUANTITY, __dataOut);
    }
    if (null == this.NET_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NET_VOLUME, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE==null?"null":PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE_CHANGE_VALUE==null?"null":PRICE_CHANGE_VALUE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_ORDER_QUANTITY==null?"null":BUY_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_ORDER_VOLUME==null?"null":BUY_ORDER_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOLUME_PER_BUY_ORDER==null?"null":VOLUME_PER_BUY_ORDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNMATCHED_BUY_ORDER_QUANTITY==null?"null":UNMATCHED_BUY_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_ORDER_QUANTITY==null?"null":SELL_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_ORDER_VOLUME==null?"null":SELL_ORDER_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOLUME_PER_SELL_ORDER==null?"null":VOLUME_PER_SELL_ORDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNMATCHED_SELL_ORDER_QUANTITY==null?"null":UNMATCHED_SELL_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_VOLUME==null?"null":NET_VOLUME.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE==null?"null":PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRICE_CHANGE_VALUE==null?"null":PRICE_CHANGE_VALUE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_ORDER_QUANTITY==null?"null":BUY_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_ORDER_VOLUME==null?"null":BUY_ORDER_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOLUME_PER_BUY_ORDER==null?"null":VOLUME_PER_BUY_ORDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNMATCHED_BUY_ORDER_QUANTITY==null?"null":UNMATCHED_BUY_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_ORDER_QUANTITY==null?"null":SELL_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_ORDER_VOLUME==null?"null":SELL_ORDER_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOLUME_PER_SELL_ORDER==null?"null":VOLUME_PER_SELL_ORDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNMATCHED_SELL_ORDER_QUANTITY==null?"null":UNMATCHED_SELL_ORDER_QUANTITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NET_VOLUME==null?"null":NET_VOLUME.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRICE = null; } else {
      this.PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRICE_CHANGE_VALUE = null; } else {
      this.PRICE_CHANGE_VALUE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_ORDER_QUANTITY = null; } else {
      this.BUY_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_ORDER_VOLUME = null; } else {
      this.BUY_ORDER_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOLUME_PER_BUY_ORDER = null; } else {
      this.VOLUME_PER_BUY_ORDER = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNMATCHED_BUY_ORDER_QUANTITY = null; } else {
      this.UNMATCHED_BUY_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_ORDER_QUANTITY = null; } else {
      this.SELL_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_ORDER_VOLUME = null; } else {
      this.SELL_ORDER_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOLUME_PER_SELL_ORDER = null; } else {
      this.VOLUME_PER_SELL_ORDER = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNMATCHED_SELL_ORDER_QUANTITY = null; } else {
      this.UNMATCHED_SELL_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NET_VOLUME = null; } else {
      this.NET_VOLUME = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRICE = null; } else {
      this.PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PRICE_CHANGE_VALUE = null; } else {
      this.PRICE_CHANGE_VALUE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_ORDER_QUANTITY = null; } else {
      this.BUY_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_ORDER_VOLUME = null; } else {
      this.BUY_ORDER_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOLUME_PER_BUY_ORDER = null; } else {
      this.VOLUME_PER_BUY_ORDER = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNMATCHED_BUY_ORDER_QUANTITY = null; } else {
      this.UNMATCHED_BUY_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_ORDER_QUANTITY = null; } else {
      this.SELL_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_ORDER_VOLUME = null; } else {
      this.SELL_ORDER_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOLUME_PER_SELL_ORDER = null; } else {
      this.VOLUME_PER_SELL_ORDER = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNMATCHED_SELL_ORDER_QUANTITY = null; } else {
      this.UNMATCHED_SELL_ORDER_QUANTITY = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NET_VOLUME = null; } else {
      this.NET_VOLUME = new java.math.BigDecimal(__cur_str);
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
    __sqoop$field_map.put("PRICE", this.PRICE);
    __sqoop$field_map.put("PRICE_CHANGE_VALUE", this.PRICE_CHANGE_VALUE);
    __sqoop$field_map.put("BUY_ORDER_QUANTITY", this.BUY_ORDER_QUANTITY);
    __sqoop$field_map.put("BUY_ORDER_VOLUME", this.BUY_ORDER_VOLUME);
    __sqoop$field_map.put("VOLUME_PER_BUY_ORDER", this.VOLUME_PER_BUY_ORDER);
    __sqoop$field_map.put("UNMATCHED_BUY_ORDER_QUANTITY", this.UNMATCHED_BUY_ORDER_QUANTITY);
    __sqoop$field_map.put("SELL_ORDER_QUANTITY", this.SELL_ORDER_QUANTITY);
    __sqoop$field_map.put("SELL_ORDER_VOLUME", this.SELL_ORDER_VOLUME);
    __sqoop$field_map.put("VOLUME_PER_SELL_ORDER", this.VOLUME_PER_SELL_ORDER);
    __sqoop$field_map.put("UNMATCHED_SELL_ORDER_QUANTITY", this.UNMATCHED_SELL_ORDER_QUANTITY);
    __sqoop$field_map.put("NET_VOLUME", this.NET_VOLUME);
    __sqoop$field_map.put("RECORDED_DATE", this.RECORDED_DATE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STOCK_ID", this.STOCK_ID);
    __sqoop$field_map.put("PRICE", this.PRICE);
    __sqoop$field_map.put("PRICE_CHANGE_VALUE", this.PRICE_CHANGE_VALUE);
    __sqoop$field_map.put("BUY_ORDER_QUANTITY", this.BUY_ORDER_QUANTITY);
    __sqoop$field_map.put("BUY_ORDER_VOLUME", this.BUY_ORDER_VOLUME);
    __sqoop$field_map.put("VOLUME_PER_BUY_ORDER", this.VOLUME_PER_BUY_ORDER);
    __sqoop$field_map.put("UNMATCHED_BUY_ORDER_QUANTITY", this.UNMATCHED_BUY_ORDER_QUANTITY);
    __sqoop$field_map.put("SELL_ORDER_QUANTITY", this.SELL_ORDER_QUANTITY);
    __sqoop$field_map.put("SELL_ORDER_VOLUME", this.SELL_ORDER_VOLUME);
    __sqoop$field_map.put("VOLUME_PER_SELL_ORDER", this.VOLUME_PER_SELL_ORDER);
    __sqoop$field_map.put("UNMATCHED_SELL_ORDER_QUANTITY", this.UNMATCHED_SELL_ORDER_QUANTITY);
    __sqoop$field_map.put("NET_VOLUME", this.NET_VOLUME);
    __sqoop$field_map.put("RECORDED_DATE", this.RECORDED_DATE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}

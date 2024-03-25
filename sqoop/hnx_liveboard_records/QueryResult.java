// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Mar 07 21:22:49 GMT 2024
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
    setters.put("OPEN_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.OPEN_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("HIGHEST_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.HIGHEST_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("LOWEST_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.LOWEST_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("TOTAL_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.TOTAL_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("TOTAL_AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.TOTAL_AMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_THIRD_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_THIRD_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_THIRD_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_THIRD_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_SECOND_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_SECOND_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_SECOND_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_SECOND_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_FIRST_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_FIRST_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUY_FIRST_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.BUY_FIRST_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("MATCHED_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MATCHED_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("MATCHED_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.MATCHED_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("ABS_PRICE_CHANGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.ABS_PRICE_CHANGE = (java.math.BigDecimal)value;
      }
    });
    setters.put("PERCENT_PRICE_CHANGE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.PERCENT_PRICE_CHANGE = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_FIRST_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_FIRST_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_FIRST_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_FIRST_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_SECOND_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_SECOND_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_SECOND_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_SECOND_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_THIRD_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_THIRD_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("SELL_THIRD_VOLUME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.SELL_THIRD_VOLUME = (java.math.BigDecimal)value;
      }
    });
    setters.put("HIGH_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.HIGH_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("AVERAGE_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.AVERAGE_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("LOW_PRICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.LOW_PRICE = (java.math.BigDecimal)value;
      }
    });
    setters.put("REMAINING_AMOUNT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.REMAINING_AMOUNT = (java.math.BigDecimal)value;
      }
    });
    setters.put("RECORDED_TIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.RECORDED_TIME = (java.sql.Timestamp)value;
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
  private java.math.BigDecimal OPEN_PRICE;
  public java.math.BigDecimal get_OPEN_PRICE() {
    return OPEN_PRICE;
  }
  public void set_OPEN_PRICE(java.math.BigDecimal OPEN_PRICE) {
    this.OPEN_PRICE = OPEN_PRICE;
  }
  public QueryResult with_OPEN_PRICE(java.math.BigDecimal OPEN_PRICE) {
    this.OPEN_PRICE = OPEN_PRICE;
    return this;
  }
  private java.math.BigDecimal HIGHEST_PRICE;
  public java.math.BigDecimal get_HIGHEST_PRICE() {
    return HIGHEST_PRICE;
  }
  public void set_HIGHEST_PRICE(java.math.BigDecimal HIGHEST_PRICE) {
    this.HIGHEST_PRICE = HIGHEST_PRICE;
  }
  public QueryResult with_HIGHEST_PRICE(java.math.BigDecimal HIGHEST_PRICE) {
    this.HIGHEST_PRICE = HIGHEST_PRICE;
    return this;
  }
  private java.math.BigDecimal LOWEST_PRICE;
  public java.math.BigDecimal get_LOWEST_PRICE() {
    return LOWEST_PRICE;
  }
  public void set_LOWEST_PRICE(java.math.BigDecimal LOWEST_PRICE) {
    this.LOWEST_PRICE = LOWEST_PRICE;
  }
  public QueryResult with_LOWEST_PRICE(java.math.BigDecimal LOWEST_PRICE) {
    this.LOWEST_PRICE = LOWEST_PRICE;
    return this;
  }
  private java.math.BigDecimal TOTAL_VOLUME;
  public java.math.BigDecimal get_TOTAL_VOLUME() {
    return TOTAL_VOLUME;
  }
  public void set_TOTAL_VOLUME(java.math.BigDecimal TOTAL_VOLUME) {
    this.TOTAL_VOLUME = TOTAL_VOLUME;
  }
  public QueryResult with_TOTAL_VOLUME(java.math.BigDecimal TOTAL_VOLUME) {
    this.TOTAL_VOLUME = TOTAL_VOLUME;
    return this;
  }
  private java.math.BigDecimal TOTAL_AMOUNT;
  public java.math.BigDecimal get_TOTAL_AMOUNT() {
    return TOTAL_AMOUNT;
  }
  public void set_TOTAL_AMOUNT(java.math.BigDecimal TOTAL_AMOUNT) {
    this.TOTAL_AMOUNT = TOTAL_AMOUNT;
  }
  public QueryResult with_TOTAL_AMOUNT(java.math.BigDecimal TOTAL_AMOUNT) {
    this.TOTAL_AMOUNT = TOTAL_AMOUNT;
    return this;
  }
  private java.math.BigDecimal BUY_THIRD_PRICE;
  public java.math.BigDecimal get_BUY_THIRD_PRICE() {
    return BUY_THIRD_PRICE;
  }
  public void set_BUY_THIRD_PRICE(java.math.BigDecimal BUY_THIRD_PRICE) {
    this.BUY_THIRD_PRICE = BUY_THIRD_PRICE;
  }
  public QueryResult with_BUY_THIRD_PRICE(java.math.BigDecimal BUY_THIRD_PRICE) {
    this.BUY_THIRD_PRICE = BUY_THIRD_PRICE;
    return this;
  }
  private java.math.BigDecimal BUY_THIRD_VOLUME;
  public java.math.BigDecimal get_BUY_THIRD_VOLUME() {
    return BUY_THIRD_VOLUME;
  }
  public void set_BUY_THIRD_VOLUME(java.math.BigDecimal BUY_THIRD_VOLUME) {
    this.BUY_THIRD_VOLUME = BUY_THIRD_VOLUME;
  }
  public QueryResult with_BUY_THIRD_VOLUME(java.math.BigDecimal BUY_THIRD_VOLUME) {
    this.BUY_THIRD_VOLUME = BUY_THIRD_VOLUME;
    return this;
  }
  private java.math.BigDecimal BUY_SECOND_PRICE;
  public java.math.BigDecimal get_BUY_SECOND_PRICE() {
    return BUY_SECOND_PRICE;
  }
  public void set_BUY_SECOND_PRICE(java.math.BigDecimal BUY_SECOND_PRICE) {
    this.BUY_SECOND_PRICE = BUY_SECOND_PRICE;
  }
  public QueryResult with_BUY_SECOND_PRICE(java.math.BigDecimal BUY_SECOND_PRICE) {
    this.BUY_SECOND_PRICE = BUY_SECOND_PRICE;
    return this;
  }
  private java.math.BigDecimal BUY_SECOND_VOLUME;
  public java.math.BigDecimal get_BUY_SECOND_VOLUME() {
    return BUY_SECOND_VOLUME;
  }
  public void set_BUY_SECOND_VOLUME(java.math.BigDecimal BUY_SECOND_VOLUME) {
    this.BUY_SECOND_VOLUME = BUY_SECOND_VOLUME;
  }
  public QueryResult with_BUY_SECOND_VOLUME(java.math.BigDecimal BUY_SECOND_VOLUME) {
    this.BUY_SECOND_VOLUME = BUY_SECOND_VOLUME;
    return this;
  }
  private java.math.BigDecimal BUY_FIRST_PRICE;
  public java.math.BigDecimal get_BUY_FIRST_PRICE() {
    return BUY_FIRST_PRICE;
  }
  public void set_BUY_FIRST_PRICE(java.math.BigDecimal BUY_FIRST_PRICE) {
    this.BUY_FIRST_PRICE = BUY_FIRST_PRICE;
  }
  public QueryResult with_BUY_FIRST_PRICE(java.math.BigDecimal BUY_FIRST_PRICE) {
    this.BUY_FIRST_PRICE = BUY_FIRST_PRICE;
    return this;
  }
  private java.math.BigDecimal BUY_FIRST_VOLUME;
  public java.math.BigDecimal get_BUY_FIRST_VOLUME() {
    return BUY_FIRST_VOLUME;
  }
  public void set_BUY_FIRST_VOLUME(java.math.BigDecimal BUY_FIRST_VOLUME) {
    this.BUY_FIRST_VOLUME = BUY_FIRST_VOLUME;
  }
  public QueryResult with_BUY_FIRST_VOLUME(java.math.BigDecimal BUY_FIRST_VOLUME) {
    this.BUY_FIRST_VOLUME = BUY_FIRST_VOLUME;
    return this;
  }
  private java.math.BigDecimal MATCHED_PRICE;
  public java.math.BigDecimal get_MATCHED_PRICE() {
    return MATCHED_PRICE;
  }
  public void set_MATCHED_PRICE(java.math.BigDecimal MATCHED_PRICE) {
    this.MATCHED_PRICE = MATCHED_PRICE;
  }
  public QueryResult with_MATCHED_PRICE(java.math.BigDecimal MATCHED_PRICE) {
    this.MATCHED_PRICE = MATCHED_PRICE;
    return this;
  }
  private java.math.BigDecimal MATCHED_VOLUME;
  public java.math.BigDecimal get_MATCHED_VOLUME() {
    return MATCHED_VOLUME;
  }
  public void set_MATCHED_VOLUME(java.math.BigDecimal MATCHED_VOLUME) {
    this.MATCHED_VOLUME = MATCHED_VOLUME;
  }
  public QueryResult with_MATCHED_VOLUME(java.math.BigDecimal MATCHED_VOLUME) {
    this.MATCHED_VOLUME = MATCHED_VOLUME;
    return this;
  }
  private java.math.BigDecimal ABS_PRICE_CHANGE;
  public java.math.BigDecimal get_ABS_PRICE_CHANGE() {
    return ABS_PRICE_CHANGE;
  }
  public void set_ABS_PRICE_CHANGE(java.math.BigDecimal ABS_PRICE_CHANGE) {
    this.ABS_PRICE_CHANGE = ABS_PRICE_CHANGE;
  }
  public QueryResult with_ABS_PRICE_CHANGE(java.math.BigDecimal ABS_PRICE_CHANGE) {
    this.ABS_PRICE_CHANGE = ABS_PRICE_CHANGE;
    return this;
  }
  private java.math.BigDecimal PERCENT_PRICE_CHANGE;
  public java.math.BigDecimal get_PERCENT_PRICE_CHANGE() {
    return PERCENT_PRICE_CHANGE;
  }
  public void set_PERCENT_PRICE_CHANGE(java.math.BigDecimal PERCENT_PRICE_CHANGE) {
    this.PERCENT_PRICE_CHANGE = PERCENT_PRICE_CHANGE;
  }
  public QueryResult with_PERCENT_PRICE_CHANGE(java.math.BigDecimal PERCENT_PRICE_CHANGE) {
    this.PERCENT_PRICE_CHANGE = PERCENT_PRICE_CHANGE;
    return this;
  }
  private java.math.BigDecimal SELL_FIRST_PRICE;
  public java.math.BigDecimal get_SELL_FIRST_PRICE() {
    return SELL_FIRST_PRICE;
  }
  public void set_SELL_FIRST_PRICE(java.math.BigDecimal SELL_FIRST_PRICE) {
    this.SELL_FIRST_PRICE = SELL_FIRST_PRICE;
  }
  public QueryResult with_SELL_FIRST_PRICE(java.math.BigDecimal SELL_FIRST_PRICE) {
    this.SELL_FIRST_PRICE = SELL_FIRST_PRICE;
    return this;
  }
  private java.math.BigDecimal SELL_FIRST_VOLUME;
  public java.math.BigDecimal get_SELL_FIRST_VOLUME() {
    return SELL_FIRST_VOLUME;
  }
  public void set_SELL_FIRST_VOLUME(java.math.BigDecimal SELL_FIRST_VOLUME) {
    this.SELL_FIRST_VOLUME = SELL_FIRST_VOLUME;
  }
  public QueryResult with_SELL_FIRST_VOLUME(java.math.BigDecimal SELL_FIRST_VOLUME) {
    this.SELL_FIRST_VOLUME = SELL_FIRST_VOLUME;
    return this;
  }
  private java.math.BigDecimal SELL_SECOND_PRICE;
  public java.math.BigDecimal get_SELL_SECOND_PRICE() {
    return SELL_SECOND_PRICE;
  }
  public void set_SELL_SECOND_PRICE(java.math.BigDecimal SELL_SECOND_PRICE) {
    this.SELL_SECOND_PRICE = SELL_SECOND_PRICE;
  }
  public QueryResult with_SELL_SECOND_PRICE(java.math.BigDecimal SELL_SECOND_PRICE) {
    this.SELL_SECOND_PRICE = SELL_SECOND_PRICE;
    return this;
  }
  private java.math.BigDecimal SELL_SECOND_VOLUME;
  public java.math.BigDecimal get_SELL_SECOND_VOLUME() {
    return SELL_SECOND_VOLUME;
  }
  public void set_SELL_SECOND_VOLUME(java.math.BigDecimal SELL_SECOND_VOLUME) {
    this.SELL_SECOND_VOLUME = SELL_SECOND_VOLUME;
  }
  public QueryResult with_SELL_SECOND_VOLUME(java.math.BigDecimal SELL_SECOND_VOLUME) {
    this.SELL_SECOND_VOLUME = SELL_SECOND_VOLUME;
    return this;
  }
  private java.math.BigDecimal SELL_THIRD_PRICE;
  public java.math.BigDecimal get_SELL_THIRD_PRICE() {
    return SELL_THIRD_PRICE;
  }
  public void set_SELL_THIRD_PRICE(java.math.BigDecimal SELL_THIRD_PRICE) {
    this.SELL_THIRD_PRICE = SELL_THIRD_PRICE;
  }
  public QueryResult with_SELL_THIRD_PRICE(java.math.BigDecimal SELL_THIRD_PRICE) {
    this.SELL_THIRD_PRICE = SELL_THIRD_PRICE;
    return this;
  }
  private java.math.BigDecimal SELL_THIRD_VOLUME;
  public java.math.BigDecimal get_SELL_THIRD_VOLUME() {
    return SELL_THIRD_VOLUME;
  }
  public void set_SELL_THIRD_VOLUME(java.math.BigDecimal SELL_THIRD_VOLUME) {
    this.SELL_THIRD_VOLUME = SELL_THIRD_VOLUME;
  }
  public QueryResult with_SELL_THIRD_VOLUME(java.math.BigDecimal SELL_THIRD_VOLUME) {
    this.SELL_THIRD_VOLUME = SELL_THIRD_VOLUME;
    return this;
  }
  private java.math.BigDecimal HIGH_PRICE;
  public java.math.BigDecimal get_HIGH_PRICE() {
    return HIGH_PRICE;
  }
  public void set_HIGH_PRICE(java.math.BigDecimal HIGH_PRICE) {
    this.HIGH_PRICE = HIGH_PRICE;
  }
  public QueryResult with_HIGH_PRICE(java.math.BigDecimal HIGH_PRICE) {
    this.HIGH_PRICE = HIGH_PRICE;
    return this;
  }
  private java.math.BigDecimal AVERAGE_PRICE;
  public java.math.BigDecimal get_AVERAGE_PRICE() {
    return AVERAGE_PRICE;
  }
  public void set_AVERAGE_PRICE(java.math.BigDecimal AVERAGE_PRICE) {
    this.AVERAGE_PRICE = AVERAGE_PRICE;
  }
  public QueryResult with_AVERAGE_PRICE(java.math.BigDecimal AVERAGE_PRICE) {
    this.AVERAGE_PRICE = AVERAGE_PRICE;
    return this;
  }
  private java.math.BigDecimal LOW_PRICE;
  public java.math.BigDecimal get_LOW_PRICE() {
    return LOW_PRICE;
  }
  public void set_LOW_PRICE(java.math.BigDecimal LOW_PRICE) {
    this.LOW_PRICE = LOW_PRICE;
  }
  public QueryResult with_LOW_PRICE(java.math.BigDecimal LOW_PRICE) {
    this.LOW_PRICE = LOW_PRICE;
    return this;
  }
  private java.math.BigDecimal REMAINING_AMOUNT;
  public java.math.BigDecimal get_REMAINING_AMOUNT() {
    return REMAINING_AMOUNT;
  }
  public void set_REMAINING_AMOUNT(java.math.BigDecimal REMAINING_AMOUNT) {
    this.REMAINING_AMOUNT = REMAINING_AMOUNT;
  }
  public QueryResult with_REMAINING_AMOUNT(java.math.BigDecimal REMAINING_AMOUNT) {
    this.REMAINING_AMOUNT = REMAINING_AMOUNT;
    return this;
  }
  private java.sql.Timestamp RECORDED_TIME;
  public java.sql.Timestamp get_RECORDED_TIME() {
    return RECORDED_TIME;
  }
  public void set_RECORDED_TIME(java.sql.Timestamp RECORDED_TIME) {
    this.RECORDED_TIME = RECORDED_TIME;
  }
  public QueryResult with_RECORDED_TIME(java.sql.Timestamp RECORDED_TIME) {
    this.RECORDED_TIME = RECORDED_TIME;
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
    equal = equal && (this.OPEN_PRICE == null ? that.OPEN_PRICE == null : this.OPEN_PRICE.equals(that.OPEN_PRICE));
    equal = equal && (this.HIGHEST_PRICE == null ? that.HIGHEST_PRICE == null : this.HIGHEST_PRICE.equals(that.HIGHEST_PRICE));
    equal = equal && (this.LOWEST_PRICE == null ? that.LOWEST_PRICE == null : this.LOWEST_PRICE.equals(that.LOWEST_PRICE));
    equal = equal && (this.TOTAL_VOLUME == null ? that.TOTAL_VOLUME == null : this.TOTAL_VOLUME.equals(that.TOTAL_VOLUME));
    equal = equal && (this.TOTAL_AMOUNT == null ? that.TOTAL_AMOUNT == null : this.TOTAL_AMOUNT.equals(that.TOTAL_AMOUNT));
    equal = equal && (this.BUY_THIRD_PRICE == null ? that.BUY_THIRD_PRICE == null : this.BUY_THIRD_PRICE.equals(that.BUY_THIRD_PRICE));
    equal = equal && (this.BUY_THIRD_VOLUME == null ? that.BUY_THIRD_VOLUME == null : this.BUY_THIRD_VOLUME.equals(that.BUY_THIRD_VOLUME));
    equal = equal && (this.BUY_SECOND_PRICE == null ? that.BUY_SECOND_PRICE == null : this.BUY_SECOND_PRICE.equals(that.BUY_SECOND_PRICE));
    equal = equal && (this.BUY_SECOND_VOLUME == null ? that.BUY_SECOND_VOLUME == null : this.BUY_SECOND_VOLUME.equals(that.BUY_SECOND_VOLUME));
    equal = equal && (this.BUY_FIRST_PRICE == null ? that.BUY_FIRST_PRICE == null : this.BUY_FIRST_PRICE.equals(that.BUY_FIRST_PRICE));
    equal = equal && (this.BUY_FIRST_VOLUME == null ? that.BUY_FIRST_VOLUME == null : this.BUY_FIRST_VOLUME.equals(that.BUY_FIRST_VOLUME));
    equal = equal && (this.MATCHED_PRICE == null ? that.MATCHED_PRICE == null : this.MATCHED_PRICE.equals(that.MATCHED_PRICE));
    equal = equal && (this.MATCHED_VOLUME == null ? that.MATCHED_VOLUME == null : this.MATCHED_VOLUME.equals(that.MATCHED_VOLUME));
    equal = equal && (this.ABS_PRICE_CHANGE == null ? that.ABS_PRICE_CHANGE == null : this.ABS_PRICE_CHANGE.equals(that.ABS_PRICE_CHANGE));
    equal = equal && (this.PERCENT_PRICE_CHANGE == null ? that.PERCENT_PRICE_CHANGE == null : this.PERCENT_PRICE_CHANGE.equals(that.PERCENT_PRICE_CHANGE));
    equal = equal && (this.SELL_FIRST_PRICE == null ? that.SELL_FIRST_PRICE == null : this.SELL_FIRST_PRICE.equals(that.SELL_FIRST_PRICE));
    equal = equal && (this.SELL_FIRST_VOLUME == null ? that.SELL_FIRST_VOLUME == null : this.SELL_FIRST_VOLUME.equals(that.SELL_FIRST_VOLUME));
    equal = equal && (this.SELL_SECOND_PRICE == null ? that.SELL_SECOND_PRICE == null : this.SELL_SECOND_PRICE.equals(that.SELL_SECOND_PRICE));
    equal = equal && (this.SELL_SECOND_VOLUME == null ? that.SELL_SECOND_VOLUME == null : this.SELL_SECOND_VOLUME.equals(that.SELL_SECOND_VOLUME));
    equal = equal && (this.SELL_THIRD_PRICE == null ? that.SELL_THIRD_PRICE == null : this.SELL_THIRD_PRICE.equals(that.SELL_THIRD_PRICE));
    equal = equal && (this.SELL_THIRD_VOLUME == null ? that.SELL_THIRD_VOLUME == null : this.SELL_THIRD_VOLUME.equals(that.SELL_THIRD_VOLUME));
    equal = equal && (this.HIGH_PRICE == null ? that.HIGH_PRICE == null : this.HIGH_PRICE.equals(that.HIGH_PRICE));
    equal = equal && (this.AVERAGE_PRICE == null ? that.AVERAGE_PRICE == null : this.AVERAGE_PRICE.equals(that.AVERAGE_PRICE));
    equal = equal && (this.LOW_PRICE == null ? that.LOW_PRICE == null : this.LOW_PRICE.equals(that.LOW_PRICE));
    equal = equal && (this.REMAINING_AMOUNT == null ? that.REMAINING_AMOUNT == null : this.REMAINING_AMOUNT.equals(that.REMAINING_AMOUNT));
    equal = equal && (this.RECORDED_TIME == null ? that.RECORDED_TIME == null : this.RECORDED_TIME.equals(that.RECORDED_TIME));
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
    equal = equal && (this.OPEN_PRICE == null ? that.OPEN_PRICE == null : this.OPEN_PRICE.equals(that.OPEN_PRICE));
    equal = equal && (this.HIGHEST_PRICE == null ? that.HIGHEST_PRICE == null : this.HIGHEST_PRICE.equals(that.HIGHEST_PRICE));
    equal = equal && (this.LOWEST_PRICE == null ? that.LOWEST_PRICE == null : this.LOWEST_PRICE.equals(that.LOWEST_PRICE));
    equal = equal && (this.TOTAL_VOLUME == null ? that.TOTAL_VOLUME == null : this.TOTAL_VOLUME.equals(that.TOTAL_VOLUME));
    equal = equal && (this.TOTAL_AMOUNT == null ? that.TOTAL_AMOUNT == null : this.TOTAL_AMOUNT.equals(that.TOTAL_AMOUNT));
    equal = equal && (this.BUY_THIRD_PRICE == null ? that.BUY_THIRD_PRICE == null : this.BUY_THIRD_PRICE.equals(that.BUY_THIRD_PRICE));
    equal = equal && (this.BUY_THIRD_VOLUME == null ? that.BUY_THIRD_VOLUME == null : this.BUY_THIRD_VOLUME.equals(that.BUY_THIRD_VOLUME));
    equal = equal && (this.BUY_SECOND_PRICE == null ? that.BUY_SECOND_PRICE == null : this.BUY_SECOND_PRICE.equals(that.BUY_SECOND_PRICE));
    equal = equal && (this.BUY_SECOND_VOLUME == null ? that.BUY_SECOND_VOLUME == null : this.BUY_SECOND_VOLUME.equals(that.BUY_SECOND_VOLUME));
    equal = equal && (this.BUY_FIRST_PRICE == null ? that.BUY_FIRST_PRICE == null : this.BUY_FIRST_PRICE.equals(that.BUY_FIRST_PRICE));
    equal = equal && (this.BUY_FIRST_VOLUME == null ? that.BUY_FIRST_VOLUME == null : this.BUY_FIRST_VOLUME.equals(that.BUY_FIRST_VOLUME));
    equal = equal && (this.MATCHED_PRICE == null ? that.MATCHED_PRICE == null : this.MATCHED_PRICE.equals(that.MATCHED_PRICE));
    equal = equal && (this.MATCHED_VOLUME == null ? that.MATCHED_VOLUME == null : this.MATCHED_VOLUME.equals(that.MATCHED_VOLUME));
    equal = equal && (this.ABS_PRICE_CHANGE == null ? that.ABS_PRICE_CHANGE == null : this.ABS_PRICE_CHANGE.equals(that.ABS_PRICE_CHANGE));
    equal = equal && (this.PERCENT_PRICE_CHANGE == null ? that.PERCENT_PRICE_CHANGE == null : this.PERCENT_PRICE_CHANGE.equals(that.PERCENT_PRICE_CHANGE));
    equal = equal && (this.SELL_FIRST_PRICE == null ? that.SELL_FIRST_PRICE == null : this.SELL_FIRST_PRICE.equals(that.SELL_FIRST_PRICE));
    equal = equal && (this.SELL_FIRST_VOLUME == null ? that.SELL_FIRST_VOLUME == null : this.SELL_FIRST_VOLUME.equals(that.SELL_FIRST_VOLUME));
    equal = equal && (this.SELL_SECOND_PRICE == null ? that.SELL_SECOND_PRICE == null : this.SELL_SECOND_PRICE.equals(that.SELL_SECOND_PRICE));
    equal = equal && (this.SELL_SECOND_VOLUME == null ? that.SELL_SECOND_VOLUME == null : this.SELL_SECOND_VOLUME.equals(that.SELL_SECOND_VOLUME));
    equal = equal && (this.SELL_THIRD_PRICE == null ? that.SELL_THIRD_PRICE == null : this.SELL_THIRD_PRICE.equals(that.SELL_THIRD_PRICE));
    equal = equal && (this.SELL_THIRD_VOLUME == null ? that.SELL_THIRD_VOLUME == null : this.SELL_THIRD_VOLUME.equals(that.SELL_THIRD_VOLUME));
    equal = equal && (this.HIGH_PRICE == null ? that.HIGH_PRICE == null : this.HIGH_PRICE.equals(that.HIGH_PRICE));
    equal = equal && (this.AVERAGE_PRICE == null ? that.AVERAGE_PRICE == null : this.AVERAGE_PRICE.equals(that.AVERAGE_PRICE));
    equal = equal && (this.LOW_PRICE == null ? that.LOW_PRICE == null : this.LOW_PRICE.equals(that.LOW_PRICE));
    equal = equal && (this.REMAINING_AMOUNT == null ? that.REMAINING_AMOUNT == null : this.REMAINING_AMOUNT.equals(that.REMAINING_AMOUNT));
    equal = equal && (this.RECORDED_TIME == null ? that.RECORDED_TIME == null : this.RECORDED_TIME.equals(that.RECORDED_TIME));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STOCK_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OPEN_PRICE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.HIGHEST_PRICE = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.LOWEST_PRICE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.TOTAL_VOLUME = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.TOTAL_AMOUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.BUY_THIRD_PRICE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.BUY_THIRD_VOLUME = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.BUY_SECOND_PRICE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.BUY_SECOND_VOLUME = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.BUY_FIRST_PRICE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.BUY_FIRST_VOLUME = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.MATCHED_PRICE = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.MATCHED_VOLUME = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.ABS_PRICE_CHANGE = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.PERCENT_PRICE_CHANGE = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.SELL_FIRST_PRICE = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.SELL_FIRST_VOLUME = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.SELL_SECOND_PRICE = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.SELL_SECOND_VOLUME = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.SELL_THIRD_PRICE = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.SELL_THIRD_VOLUME = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.HIGH_PRICE = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.AVERAGE_PRICE = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.LOW_PRICE = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.REMAINING_AMOUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.RECORDED_TIME = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STOCK_ID = JdbcWritableBridge.readString(1, __dbResults);
    this.OPEN_PRICE = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.HIGHEST_PRICE = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.LOWEST_PRICE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.TOTAL_VOLUME = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.TOTAL_AMOUNT = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.BUY_THIRD_PRICE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.BUY_THIRD_VOLUME = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.BUY_SECOND_PRICE = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.BUY_SECOND_VOLUME = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.BUY_FIRST_PRICE = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.BUY_FIRST_VOLUME = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.MATCHED_PRICE = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.MATCHED_VOLUME = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.ABS_PRICE_CHANGE = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.PERCENT_PRICE_CHANGE = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.SELL_FIRST_PRICE = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.SELL_FIRST_VOLUME = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.SELL_SECOND_PRICE = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.SELL_SECOND_VOLUME = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.SELL_THIRD_PRICE = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.SELL_THIRD_VOLUME = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.HIGH_PRICE = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.AVERAGE_PRICE = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.LOW_PRICE = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.REMAINING_AMOUNT = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.RECORDED_TIME = JdbcWritableBridge.readTimestamp(27, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(OPEN_PRICE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HIGHEST_PRICE, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOWEST_PRICE, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_VOLUME, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_AMOUNT, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_THIRD_PRICE, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_THIRD_VOLUME, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_SECOND_PRICE, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_SECOND_VOLUME, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_FIRST_PRICE, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_FIRST_VOLUME, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MATCHED_PRICE, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MATCHED_VOLUME, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ABS_PRICE_CHANGE, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERCENT_PRICE_CHANGE, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_FIRST_PRICE, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_FIRST_VOLUME, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_SECOND_PRICE, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_SECOND_VOLUME, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_THIRD_PRICE, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_THIRD_VOLUME, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HIGH_PRICE, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVERAGE_PRICE, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOW_PRICE, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REMAINING_AMOUNT, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RECORDED_TIME, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(STOCK_ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(OPEN_PRICE, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HIGHEST_PRICE, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOWEST_PRICE, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_VOLUME, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TOTAL_AMOUNT, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_THIRD_PRICE, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_THIRD_VOLUME, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_SECOND_PRICE, 9 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_SECOND_VOLUME, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_FIRST_PRICE, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUY_FIRST_VOLUME, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MATCHED_PRICE, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MATCHED_VOLUME, 14 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ABS_PRICE_CHANGE, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PERCENT_PRICE_CHANGE, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_FIRST_PRICE, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_FIRST_VOLUME, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_SECOND_PRICE, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_SECOND_VOLUME, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_THIRD_PRICE, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SELL_THIRD_VOLUME, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HIGH_PRICE, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AVERAGE_PRICE, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LOW_PRICE, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REMAINING_AMOUNT, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(RECORDED_TIME, 27 + __off, 93, __dbStmt);
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
        this.OPEN_PRICE = null;
    } else {
    this.OPEN_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HIGHEST_PRICE = null;
    } else {
    this.HIGHEST_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOWEST_PRICE = null;
    } else {
    this.LOWEST_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOTAL_VOLUME = null;
    } else {
    this.TOTAL_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TOTAL_AMOUNT = null;
    } else {
    this.TOTAL_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_THIRD_PRICE = null;
    } else {
    this.BUY_THIRD_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_THIRD_VOLUME = null;
    } else {
    this.BUY_THIRD_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_SECOND_PRICE = null;
    } else {
    this.BUY_SECOND_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_SECOND_VOLUME = null;
    } else {
    this.BUY_SECOND_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_FIRST_PRICE = null;
    } else {
    this.BUY_FIRST_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUY_FIRST_VOLUME = null;
    } else {
    this.BUY_FIRST_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MATCHED_PRICE = null;
    } else {
    this.MATCHED_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MATCHED_VOLUME = null;
    } else {
    this.MATCHED_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ABS_PRICE_CHANGE = null;
    } else {
    this.ABS_PRICE_CHANGE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PERCENT_PRICE_CHANGE = null;
    } else {
    this.PERCENT_PRICE_CHANGE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_FIRST_PRICE = null;
    } else {
    this.SELL_FIRST_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_FIRST_VOLUME = null;
    } else {
    this.SELL_FIRST_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_SECOND_PRICE = null;
    } else {
    this.SELL_SECOND_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_SECOND_VOLUME = null;
    } else {
    this.SELL_SECOND_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_THIRD_PRICE = null;
    } else {
    this.SELL_THIRD_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SELL_THIRD_VOLUME = null;
    } else {
    this.SELL_THIRD_VOLUME = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HIGH_PRICE = null;
    } else {
    this.HIGH_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AVERAGE_PRICE = null;
    } else {
    this.AVERAGE_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOW_PRICE = null;
    } else {
    this.LOW_PRICE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REMAINING_AMOUNT = null;
    } else {
    this.REMAINING_AMOUNT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RECORDED_TIME = null;
    } else {
    this.RECORDED_TIME = new Timestamp(__dataIn.readLong());
    this.RECORDED_TIME.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.STOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_ID);
    }
    if (null == this.OPEN_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_PRICE, __dataOut);
    }
    if (null == this.HIGHEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HIGHEST_PRICE, __dataOut);
    }
    if (null == this.LOWEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOWEST_PRICE, __dataOut);
    }
    if (null == this.TOTAL_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_VOLUME, __dataOut);
    }
    if (null == this.TOTAL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_AMOUNT, __dataOut);
    }
    if (null == this.BUY_THIRD_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_THIRD_PRICE, __dataOut);
    }
    if (null == this.BUY_THIRD_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_THIRD_VOLUME, __dataOut);
    }
    if (null == this.BUY_SECOND_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_SECOND_PRICE, __dataOut);
    }
    if (null == this.BUY_SECOND_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_SECOND_VOLUME, __dataOut);
    }
    if (null == this.BUY_FIRST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_FIRST_PRICE, __dataOut);
    }
    if (null == this.BUY_FIRST_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_FIRST_VOLUME, __dataOut);
    }
    if (null == this.MATCHED_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MATCHED_PRICE, __dataOut);
    }
    if (null == this.MATCHED_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MATCHED_VOLUME, __dataOut);
    }
    if (null == this.ABS_PRICE_CHANGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ABS_PRICE_CHANGE, __dataOut);
    }
    if (null == this.PERCENT_PRICE_CHANGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERCENT_PRICE_CHANGE, __dataOut);
    }
    if (null == this.SELL_FIRST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_FIRST_PRICE, __dataOut);
    }
    if (null == this.SELL_FIRST_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_FIRST_VOLUME, __dataOut);
    }
    if (null == this.SELL_SECOND_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_SECOND_PRICE, __dataOut);
    }
    if (null == this.SELL_SECOND_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_SECOND_VOLUME, __dataOut);
    }
    if (null == this.SELL_THIRD_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_THIRD_PRICE, __dataOut);
    }
    if (null == this.SELL_THIRD_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_THIRD_VOLUME, __dataOut);
    }
    if (null == this.HIGH_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HIGH_PRICE, __dataOut);
    }
    if (null == this.AVERAGE_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVERAGE_PRICE, __dataOut);
    }
    if (null == this.LOW_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOW_PRICE, __dataOut);
    }
    if (null == this.REMAINING_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REMAINING_AMOUNT, __dataOut);
    }
    if (null == this.RECORDED_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.RECORDED_TIME.getTime());
    __dataOut.writeInt(this.RECORDED_TIME.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.STOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_ID);
    }
    if (null == this.OPEN_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.OPEN_PRICE, __dataOut);
    }
    if (null == this.HIGHEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HIGHEST_PRICE, __dataOut);
    }
    if (null == this.LOWEST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOWEST_PRICE, __dataOut);
    }
    if (null == this.TOTAL_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_VOLUME, __dataOut);
    }
    if (null == this.TOTAL_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TOTAL_AMOUNT, __dataOut);
    }
    if (null == this.BUY_THIRD_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_THIRD_PRICE, __dataOut);
    }
    if (null == this.BUY_THIRD_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_THIRD_VOLUME, __dataOut);
    }
    if (null == this.BUY_SECOND_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_SECOND_PRICE, __dataOut);
    }
    if (null == this.BUY_SECOND_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_SECOND_VOLUME, __dataOut);
    }
    if (null == this.BUY_FIRST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_FIRST_PRICE, __dataOut);
    }
    if (null == this.BUY_FIRST_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUY_FIRST_VOLUME, __dataOut);
    }
    if (null == this.MATCHED_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MATCHED_PRICE, __dataOut);
    }
    if (null == this.MATCHED_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MATCHED_VOLUME, __dataOut);
    }
    if (null == this.ABS_PRICE_CHANGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ABS_PRICE_CHANGE, __dataOut);
    }
    if (null == this.PERCENT_PRICE_CHANGE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PERCENT_PRICE_CHANGE, __dataOut);
    }
    if (null == this.SELL_FIRST_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_FIRST_PRICE, __dataOut);
    }
    if (null == this.SELL_FIRST_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_FIRST_VOLUME, __dataOut);
    }
    if (null == this.SELL_SECOND_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_SECOND_PRICE, __dataOut);
    }
    if (null == this.SELL_SECOND_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_SECOND_VOLUME, __dataOut);
    }
    if (null == this.SELL_THIRD_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_THIRD_PRICE, __dataOut);
    }
    if (null == this.SELL_THIRD_VOLUME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SELL_THIRD_VOLUME, __dataOut);
    }
    if (null == this.HIGH_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HIGH_PRICE, __dataOut);
    }
    if (null == this.AVERAGE_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AVERAGE_PRICE, __dataOut);
    }
    if (null == this.LOW_PRICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LOW_PRICE, __dataOut);
    }
    if (null == this.REMAINING_AMOUNT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REMAINING_AMOUNT, __dataOut);
    }
    if (null == this.RECORDED_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.RECORDED_TIME.getTime());
    __dataOut.writeInt(this.RECORDED_TIME.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_PRICE==null?"null":OPEN_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGHEST_PRICE==null?"null":HIGHEST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOWEST_PRICE==null?"null":LOWEST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_VOLUME==null?"null":TOTAL_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_AMOUNT==null?"null":TOTAL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_THIRD_PRICE==null?"null":BUY_THIRD_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_THIRD_VOLUME==null?"null":BUY_THIRD_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_SECOND_PRICE==null?"null":BUY_SECOND_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_SECOND_VOLUME==null?"null":BUY_SECOND_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_FIRST_PRICE==null?"null":BUY_FIRST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_FIRST_VOLUME==null?"null":BUY_FIRST_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_PRICE==null?"null":MATCHED_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_VOLUME==null?"null":MATCHED_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ABS_PRICE_CHANGE==null?"null":ABS_PRICE_CHANGE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERCENT_PRICE_CHANGE==null?"null":PERCENT_PRICE_CHANGE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_FIRST_PRICE==null?"null":SELL_FIRST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_FIRST_VOLUME==null?"null":SELL_FIRST_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_SECOND_PRICE==null?"null":SELL_SECOND_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_SECOND_VOLUME==null?"null":SELL_SECOND_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_THIRD_PRICE==null?"null":SELL_THIRD_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_THIRD_VOLUME==null?"null":SELL_THIRD_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_PRICE==null?"null":HIGH_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVERAGE_PRICE==null?"null":AVERAGE_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOW_PRICE==null?"null":LOW_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REMAINING_AMOUNT==null?"null":REMAINING_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDED_TIME==null?"null":"" + RECORDED_TIME, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_ID==null?"null":STOCK_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OPEN_PRICE==null?"null":OPEN_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGHEST_PRICE==null?"null":HIGHEST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOWEST_PRICE==null?"null":LOWEST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_VOLUME==null?"null":TOTAL_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TOTAL_AMOUNT==null?"null":TOTAL_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_THIRD_PRICE==null?"null":BUY_THIRD_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_THIRD_VOLUME==null?"null":BUY_THIRD_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_SECOND_PRICE==null?"null":BUY_SECOND_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_SECOND_VOLUME==null?"null":BUY_SECOND_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_FIRST_PRICE==null?"null":BUY_FIRST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUY_FIRST_VOLUME==null?"null":BUY_FIRST_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_PRICE==null?"null":MATCHED_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MATCHED_VOLUME==null?"null":MATCHED_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ABS_PRICE_CHANGE==null?"null":ABS_PRICE_CHANGE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PERCENT_PRICE_CHANGE==null?"null":PERCENT_PRICE_CHANGE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_FIRST_PRICE==null?"null":SELL_FIRST_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_FIRST_VOLUME==null?"null":SELL_FIRST_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_SECOND_PRICE==null?"null":SELL_SECOND_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_SECOND_VOLUME==null?"null":SELL_SECOND_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_THIRD_PRICE==null?"null":SELL_THIRD_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SELL_THIRD_VOLUME==null?"null":SELL_THIRD_VOLUME.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIGH_PRICE==null?"null":HIGH_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AVERAGE_PRICE==null?"null":AVERAGE_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOW_PRICE==null?"null":LOW_PRICE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REMAINING_AMOUNT==null?"null":REMAINING_AMOUNT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RECORDED_TIME==null?"null":"" + RECORDED_TIME, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_PRICE = null; } else {
      this.OPEN_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGHEST_PRICE = null; } else {
      this.HIGHEST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOWEST_PRICE = null; } else {
      this.LOWEST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TOTAL_VOLUME = null; } else {
      this.TOTAL_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TOTAL_AMOUNT = null; } else {
      this.TOTAL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_THIRD_PRICE = null; } else {
      this.BUY_THIRD_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_THIRD_VOLUME = null; } else {
      this.BUY_THIRD_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_SECOND_PRICE = null; } else {
      this.BUY_SECOND_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_SECOND_VOLUME = null; } else {
      this.BUY_SECOND_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_FIRST_PRICE = null; } else {
      this.BUY_FIRST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_FIRST_VOLUME = null; } else {
      this.BUY_FIRST_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MATCHED_PRICE = null; } else {
      this.MATCHED_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MATCHED_VOLUME = null; } else {
      this.MATCHED_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ABS_PRICE_CHANGE = null; } else {
      this.ABS_PRICE_CHANGE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERCENT_PRICE_CHANGE = null; } else {
      this.PERCENT_PRICE_CHANGE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_FIRST_PRICE = null; } else {
      this.SELL_FIRST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_FIRST_VOLUME = null; } else {
      this.SELL_FIRST_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_SECOND_PRICE = null; } else {
      this.SELL_SECOND_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_SECOND_VOLUME = null; } else {
      this.SELL_SECOND_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_THIRD_PRICE = null; } else {
      this.SELL_THIRD_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_THIRD_VOLUME = null; } else {
      this.SELL_THIRD_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGH_PRICE = null; } else {
      this.HIGH_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AVERAGE_PRICE = null; } else {
      this.AVERAGE_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOW_PRICE = null; } else {
      this.LOW_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.REMAINING_AMOUNT = null; } else {
      this.REMAINING_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDED_TIME = null; } else {
      this.RECORDED_TIME = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OPEN_PRICE = null; } else {
      this.OPEN_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGHEST_PRICE = null; } else {
      this.HIGHEST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOWEST_PRICE = null; } else {
      this.LOWEST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TOTAL_VOLUME = null; } else {
      this.TOTAL_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TOTAL_AMOUNT = null; } else {
      this.TOTAL_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_THIRD_PRICE = null; } else {
      this.BUY_THIRD_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_THIRD_VOLUME = null; } else {
      this.BUY_THIRD_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_SECOND_PRICE = null; } else {
      this.BUY_SECOND_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_SECOND_VOLUME = null; } else {
      this.BUY_SECOND_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_FIRST_PRICE = null; } else {
      this.BUY_FIRST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUY_FIRST_VOLUME = null; } else {
      this.BUY_FIRST_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MATCHED_PRICE = null; } else {
      this.MATCHED_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MATCHED_VOLUME = null; } else {
      this.MATCHED_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ABS_PRICE_CHANGE = null; } else {
      this.ABS_PRICE_CHANGE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PERCENT_PRICE_CHANGE = null; } else {
      this.PERCENT_PRICE_CHANGE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_FIRST_PRICE = null; } else {
      this.SELL_FIRST_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_FIRST_VOLUME = null; } else {
      this.SELL_FIRST_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_SECOND_PRICE = null; } else {
      this.SELL_SECOND_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_SECOND_VOLUME = null; } else {
      this.SELL_SECOND_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_THIRD_PRICE = null; } else {
      this.SELL_THIRD_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SELL_THIRD_VOLUME = null; } else {
      this.SELL_THIRD_VOLUME = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HIGH_PRICE = null; } else {
      this.HIGH_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AVERAGE_PRICE = null; } else {
      this.AVERAGE_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOW_PRICE = null; } else {
      this.LOW_PRICE = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.REMAINING_AMOUNT = null; } else {
      this.REMAINING_AMOUNT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RECORDED_TIME = null; } else {
      this.RECORDED_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.RECORDED_TIME = (o.RECORDED_TIME != null) ? (java.sql.Timestamp) o.RECORDED_TIME.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.RECORDED_TIME = (o.RECORDED_TIME != null) ? (java.sql.Timestamp) o.RECORDED_TIME.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("STOCK_ID", this.STOCK_ID);
    __sqoop$field_map.put("OPEN_PRICE", this.OPEN_PRICE);
    __sqoop$field_map.put("HIGHEST_PRICE", this.HIGHEST_PRICE);
    __sqoop$field_map.put("LOWEST_PRICE", this.LOWEST_PRICE);
    __sqoop$field_map.put("TOTAL_VOLUME", this.TOTAL_VOLUME);
    __sqoop$field_map.put("TOTAL_AMOUNT", this.TOTAL_AMOUNT);
    __sqoop$field_map.put("BUY_THIRD_PRICE", this.BUY_THIRD_PRICE);
    __sqoop$field_map.put("BUY_THIRD_VOLUME", this.BUY_THIRD_VOLUME);
    __sqoop$field_map.put("BUY_SECOND_PRICE", this.BUY_SECOND_PRICE);
    __sqoop$field_map.put("BUY_SECOND_VOLUME", this.BUY_SECOND_VOLUME);
    __sqoop$field_map.put("BUY_FIRST_PRICE", this.BUY_FIRST_PRICE);
    __sqoop$field_map.put("BUY_FIRST_VOLUME", this.BUY_FIRST_VOLUME);
    __sqoop$field_map.put("MATCHED_PRICE", this.MATCHED_PRICE);
    __sqoop$field_map.put("MATCHED_VOLUME", this.MATCHED_VOLUME);
    __sqoop$field_map.put("ABS_PRICE_CHANGE", this.ABS_PRICE_CHANGE);
    __sqoop$field_map.put("PERCENT_PRICE_CHANGE", this.PERCENT_PRICE_CHANGE);
    __sqoop$field_map.put("SELL_FIRST_PRICE", this.SELL_FIRST_PRICE);
    __sqoop$field_map.put("SELL_FIRST_VOLUME", this.SELL_FIRST_VOLUME);
    __sqoop$field_map.put("SELL_SECOND_PRICE", this.SELL_SECOND_PRICE);
    __sqoop$field_map.put("SELL_SECOND_VOLUME", this.SELL_SECOND_VOLUME);
    __sqoop$field_map.put("SELL_THIRD_PRICE", this.SELL_THIRD_PRICE);
    __sqoop$field_map.put("SELL_THIRD_VOLUME", this.SELL_THIRD_VOLUME);
    __sqoop$field_map.put("HIGH_PRICE", this.HIGH_PRICE);
    __sqoop$field_map.put("AVERAGE_PRICE", this.AVERAGE_PRICE);
    __sqoop$field_map.put("LOW_PRICE", this.LOW_PRICE);
    __sqoop$field_map.put("REMAINING_AMOUNT", this.REMAINING_AMOUNT);
    __sqoop$field_map.put("RECORDED_TIME", this.RECORDED_TIME);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STOCK_ID", this.STOCK_ID);
    __sqoop$field_map.put("OPEN_PRICE", this.OPEN_PRICE);
    __sqoop$field_map.put("HIGHEST_PRICE", this.HIGHEST_PRICE);
    __sqoop$field_map.put("LOWEST_PRICE", this.LOWEST_PRICE);
    __sqoop$field_map.put("TOTAL_VOLUME", this.TOTAL_VOLUME);
    __sqoop$field_map.put("TOTAL_AMOUNT", this.TOTAL_AMOUNT);
    __sqoop$field_map.put("BUY_THIRD_PRICE", this.BUY_THIRD_PRICE);
    __sqoop$field_map.put("BUY_THIRD_VOLUME", this.BUY_THIRD_VOLUME);
    __sqoop$field_map.put("BUY_SECOND_PRICE", this.BUY_SECOND_PRICE);
    __sqoop$field_map.put("BUY_SECOND_VOLUME", this.BUY_SECOND_VOLUME);
    __sqoop$field_map.put("BUY_FIRST_PRICE", this.BUY_FIRST_PRICE);
    __sqoop$field_map.put("BUY_FIRST_VOLUME", this.BUY_FIRST_VOLUME);
    __sqoop$field_map.put("MATCHED_PRICE", this.MATCHED_PRICE);
    __sqoop$field_map.put("MATCHED_VOLUME", this.MATCHED_VOLUME);
    __sqoop$field_map.put("ABS_PRICE_CHANGE", this.ABS_PRICE_CHANGE);
    __sqoop$field_map.put("PERCENT_PRICE_CHANGE", this.PERCENT_PRICE_CHANGE);
    __sqoop$field_map.put("SELL_FIRST_PRICE", this.SELL_FIRST_PRICE);
    __sqoop$field_map.put("SELL_FIRST_VOLUME", this.SELL_FIRST_VOLUME);
    __sqoop$field_map.put("SELL_SECOND_PRICE", this.SELL_SECOND_PRICE);
    __sqoop$field_map.put("SELL_SECOND_VOLUME", this.SELL_SECOND_VOLUME);
    __sqoop$field_map.put("SELL_THIRD_PRICE", this.SELL_THIRD_PRICE);
    __sqoop$field_map.put("SELL_THIRD_VOLUME", this.SELL_THIRD_VOLUME);
    __sqoop$field_map.put("HIGH_PRICE", this.HIGH_PRICE);
    __sqoop$field_map.put("AVERAGE_PRICE", this.AVERAGE_PRICE);
    __sqoop$field_map.put("LOW_PRICE", this.LOW_PRICE);
    __sqoop$field_map.put("REMAINING_AMOUNT", this.REMAINING_AMOUNT);
    __sqoop$field_map.put("RECORDED_TIME", this.RECORDED_TIME);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}

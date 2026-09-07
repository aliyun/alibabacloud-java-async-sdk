// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FieldSchemaModel} extends {@link TeaModel}
 *
 * <p>FieldSchemaModel</p>
 */
public class FieldSchemaModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoIncrement")
    private Boolean autoIncrement;

    @com.aliyun.core.annotation.NameInMap("ColumnRawName")
    private String columnRawName;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CompressFloatUseShort")
    private Boolean compressFloatUseShort;

    @com.aliyun.core.annotation.NameInMap("Compression")
    private String compression;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("Delimiter")
    private String delimiter;

    @com.aliyun.core.annotation.NameInMap("Encode")
    private String encode;

    @com.aliyun.core.annotation.NameInMap("IsPartitionKey")
    private Boolean isPartitionKey;

    @com.aliyun.core.annotation.NameInMap("MappedName")
    private String mappedName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.NameInMap("OnUpdate")
    private String onUpdate;

    @com.aliyun.core.annotation.NameInMap("OrdinalPosition")
    private Long ordinalPosition;

    @com.aliyun.core.annotation.NameInMap("PhysicalColumnName")
    private String physicalColumnName;

    @com.aliyun.core.annotation.NameInMap("PkPosition")
    private Long pkPosition;

    @com.aliyun.core.annotation.NameInMap("Precision")
    private Long precision;

    @com.aliyun.core.annotation.NameInMap("Primarykey")
    private Boolean primarykey;

    @com.aliyun.core.annotation.NameInMap("Scale")
    private Long scale;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("Tokenizer")
    private String tokenizer;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("ValueType")
    private String valueType;

    private FieldSchemaModel(Builder builder) {
        this.autoIncrement = builder.autoIncrement;
        this.columnRawName = builder.columnRawName;
        this.comment = builder.comment;
        this.compressFloatUseShort = builder.compressFloatUseShort;
        this.compression = builder.compression;
        this.createTime = builder.createTime;
        this.dataType = builder.dataType;
        this.databaseName = builder.databaseName;
        this.defaultValue = builder.defaultValue;
        this.delimiter = builder.delimiter;
        this.encode = builder.encode;
        this.isPartitionKey = builder.isPartitionKey;
        this.mappedName = builder.mappedName;
        this.name = builder.name;
        this.nullable = builder.nullable;
        this.onUpdate = builder.onUpdate;
        this.ordinalPosition = builder.ordinalPosition;
        this.physicalColumnName = builder.physicalColumnName;
        this.pkPosition = builder.pkPosition;
        this.precision = builder.precision;
        this.primarykey = builder.primarykey;
        this.scale = builder.scale;
        this.tableName = builder.tableName;
        this.tokenizer = builder.tokenizer;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FieldSchemaModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoIncrement
     */
    public Boolean getAutoIncrement() {
        return this.autoIncrement;
    }

    /**
     * @return columnRawName
     */
    public String getColumnRawName() {
        return this.columnRawName;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return compressFloatUseShort
     */
    public Boolean getCompressFloatUseShort() {
        return this.compressFloatUseShort;
    }

    /**
     * @return compression
     */
    public String getCompression() {
        return this.compression;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return delimiter
     */
    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * @return encode
     */
    public String getEncode() {
        return this.encode;
    }

    /**
     * @return isPartitionKey
     */
    public Boolean getIsPartitionKey() {
        return this.isPartitionKey;
    }

    /**
     * @return mappedName
     */
    public String getMappedName() {
        return this.mappedName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * @return onUpdate
     */
    public String getOnUpdate() {
        return this.onUpdate;
    }

    /**
     * @return ordinalPosition
     */
    public Long getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * @return physicalColumnName
     */
    public String getPhysicalColumnName() {
        return this.physicalColumnName;
    }

    /**
     * @return pkPosition
     */
    public Long getPkPosition() {
        return this.pkPosition;
    }

    /**
     * @return precision
     */
    public Long getPrecision() {
        return this.precision;
    }

    /**
     * @return primarykey
     */
    public Boolean getPrimarykey() {
        return this.primarykey;
    }

    /**
     * @return scale
     */
    public Long getScale() {
        return this.scale;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tokenizer
     */
    public String getTokenizer() {
        return this.tokenizer;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    public static final class Builder {
        private Boolean autoIncrement; 
        private String columnRawName; 
        private String comment; 
        private Boolean compressFloatUseShort; 
        private String compression; 
        private String createTime; 
        private String dataType; 
        private String databaseName; 
        private String defaultValue; 
        private String delimiter; 
        private String encode; 
        private Boolean isPartitionKey; 
        private String mappedName; 
        private String name; 
        private Boolean nullable; 
        private String onUpdate; 
        private Long ordinalPosition; 
        private String physicalColumnName; 
        private Long pkPosition; 
        private Long precision; 
        private Boolean primarykey; 
        private Long scale; 
        private String tableName; 
        private String tokenizer; 
        private String type; 
        private String updateTime; 
        private String valueType; 

        private Builder() {
        } 

        private Builder(FieldSchemaModel model) {
            this.autoIncrement = model.autoIncrement;
            this.columnRawName = model.columnRawName;
            this.comment = model.comment;
            this.compressFloatUseShort = model.compressFloatUseShort;
            this.compression = model.compression;
            this.createTime = model.createTime;
            this.dataType = model.dataType;
            this.databaseName = model.databaseName;
            this.defaultValue = model.defaultValue;
            this.delimiter = model.delimiter;
            this.encode = model.encode;
            this.isPartitionKey = model.isPartitionKey;
            this.mappedName = model.mappedName;
            this.name = model.name;
            this.nullable = model.nullable;
            this.onUpdate = model.onUpdate;
            this.ordinalPosition = model.ordinalPosition;
            this.physicalColumnName = model.physicalColumnName;
            this.pkPosition = model.pkPosition;
            this.precision = model.precision;
            this.primarykey = model.primarykey;
            this.scale = model.scale;
            this.tableName = model.tableName;
            this.tokenizer = model.tokenizer;
            this.type = model.type;
            this.updateTime = model.updateTime;
            this.valueType = model.valueType;
        } 

        /**
         * <p>Indicates whether the column is auto-incremented.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }

        /**
         * <p>The original name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>ColumnRawName</p>
         */
        public Builder columnRawName(String columnRawName) {
            this.columnRawName = columnRawName;
            return this;
        }

        /**
         * <p>The description of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>Indicates whether FLOAT data is compressed to SHORT data.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder compressFloatUseShort(Boolean compressFloatUseShort) {
            this.compressFloatUseShort = compressFloatUseShort;
            return this;
        }

        /**
         * <p>The compression method of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>compression</p>
         */
        public Builder compression(String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * <p>The time when the column was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05 13:17:55</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>long</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The logical name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>databaseName</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The default value of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * <p>The delimiter of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>delimiter</p>
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * <p>The encryption method of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>encode</p>
         */
        public Builder encode(String encode) {
            this.encode = encode;
            return this;
        }

        /**
         * <p>Indicates whether the column is the partition key.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isPartitionKey(Boolean isPartitionKey) {
            this.isPartitionKey = isPartitionKey;
            return this;
        }

        /**
         * <p>The mapping name.</p>
         * 
         * <strong>example:</strong>
         * <p>mappedName</p>
         */
        public Builder mappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether the column can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * <p>The update condition of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>onUpdate</p>
         */
        public Builder onUpdate(String onUpdate) {
            this.onUpdate = onUpdate;
            return this;
        }

        /**
         * <p>The location of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder ordinalPosition(Long ordinalPosition) {
            this.ordinalPosition = ordinalPosition;
            return this;
        }

        /**
         * <p>The physical name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>PhysicalColumnName</p>
         */
        public Builder physicalColumnName(String physicalColumnName) {
            this.physicalColumnName = physicalColumnName;
            return this;
        }

        /**
         * <p>The location of the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder pkPosition(Long pkPosition) {
            this.pkPosition = pkPosition;
            return this;
        }

        /**
         * <p>The precision of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder precision(Long precision) {
            this.precision = precision;
            return this;
        }

        /**
         * <p>Indicates whether the column is the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder primarykey(Boolean primarykey) {
            this.primarykey = primarykey;
            return this;
        }

        /**
         * <p>The scale of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scale(Long scale) {
            this.scale = scale;
            return this;
        }

        /**
         * <p>The logical name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>tableName</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The token of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>tokenizer</p>
         */
        public Builder tokenizer(String tokenizer) {
            this.tokenizer = tokenizer;
            return this;
        }

        /**
         * <p>The type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>long</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The time when the index was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05 13:17:55</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The value type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>valueType</p>
         */
        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public FieldSchemaModel build() {
            return new FieldSchemaModel(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * AutoIncrement.
         */
        public Builder autoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }

        /**
         * ColumnRawName.
         */
        public Builder columnRawName(String columnRawName) {
            this.columnRawName = columnRawName;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CompressFloatUseShort.
         */
        public Builder compressFloatUseShort(Boolean compressFloatUseShort) {
            this.compressFloatUseShort = compressFloatUseShort;
            return this;
        }

        /**
         * Compression.
         */
        public Builder compression(String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * DefaultValue.
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Delimiter.
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * Encode.
         */
        public Builder encode(String encode) {
            this.encode = encode;
            return this;
        }

        /**
         * IsPartitionKey.
         */
        public Builder isPartitionKey(Boolean isPartitionKey) {
            this.isPartitionKey = isPartitionKey;
            return this;
        }

        /**
         * MappedName.
         */
        public Builder mappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * OnUpdate.
         */
        public Builder onUpdate(String onUpdate) {
            this.onUpdate = onUpdate;
            return this;
        }

        /**
         * OrdinalPosition.
         */
        public Builder ordinalPosition(Long ordinalPosition) {
            this.ordinalPosition = ordinalPosition;
            return this;
        }

        /**
         * PhysicalColumnName.
         */
        public Builder physicalColumnName(String physicalColumnName) {
            this.physicalColumnName = physicalColumnName;
            return this;
        }

        /**
         * PkPosition.
         */
        public Builder pkPosition(Long pkPosition) {
            this.pkPosition = pkPosition;
            return this;
        }

        /**
         * Precision.
         */
        public Builder precision(Long precision) {
            this.precision = precision;
            return this;
        }

        /**
         * Primarykey.
         */
        public Builder primarykey(Boolean primarykey) {
            this.primarykey = primarykey;
            return this;
        }

        /**
         * Scale.
         */
        public Builder scale(Long scale) {
            this.scale = scale;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Tokenizer.
         */
        public Builder tokenizer(String tokenizer) {
            this.tokenizer = tokenizer;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * ValueType.
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

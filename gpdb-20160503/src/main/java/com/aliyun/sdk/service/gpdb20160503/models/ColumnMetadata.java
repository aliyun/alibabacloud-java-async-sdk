// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ColumnMetadata} extends {@link TeaModel}
 *
 * <p>ColumnMetadata</p>
 */
public class ColumnMetadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnDefault")
    private String columnDefault;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("IsCaseSensitive")
    private Boolean isCaseSensitive;

    @com.aliyun.core.annotation.NameInMap("IsCurrency")
    private Boolean isCurrency;

    @com.aliyun.core.annotation.NameInMap("IsPrimaryKey")
    private Boolean isPrimaryKey;

    @com.aliyun.core.annotation.NameInMap("IsSigned")
    private Boolean isSigned;

    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Integer maxLength;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.NameInMap("Precision")
    private Integer precision;

    @com.aliyun.core.annotation.NameInMap("Scale")
    private Integer scale;

    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("UdtName")
    private String udtName;

    private ColumnMetadata(Builder builder) {
        this.columnDefault = builder.columnDefault;
        this.comment = builder.comment;
        this.dataType = builder.dataType;
        this.isCaseSensitive = builder.isCaseSensitive;
        this.isCurrency = builder.isCurrency;
        this.isPrimaryKey = builder.isPrimaryKey;
        this.isSigned = builder.isSigned;
        this.maxLength = builder.maxLength;
        this.name = builder.name;
        this.nullable = builder.nullable;
        this.precision = builder.precision;
        this.scale = builder.scale;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.udtName = builder.udtName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnMetadata create() {
        return builder().build();
    }

    /**
     * @return columnDefault
     */
    public String getColumnDefault() {
        return this.columnDefault;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return isCaseSensitive
     */
    public Boolean getIsCaseSensitive() {
        return this.isCaseSensitive;
    }

    /**
     * @return isCurrency
     */
    public Boolean getIsCurrency() {
        return this.isCurrency;
    }

    /**
     * @return isPrimaryKey
     */
    public Boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    /**
     * @return isSigned
     */
    public Boolean getIsSigned() {
        return this.isSigned;
    }

    /**
     * @return maxLength
     */
    public Integer getMaxLength() {
        return this.maxLength;
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
     * @return precision
     */
    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * @return scale
     */
    public Integer getScale() {
        return this.scale;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return udtName
     */
    public String getUdtName() {
        return this.udtName;
    }

    public static final class Builder {
        private String columnDefault; 
        private String comment; 
        private String dataType; 
        private Boolean isCaseSensitive; 
        private Boolean isCurrency; 
        private Boolean isPrimaryKey; 
        private Boolean isSigned; 
        private Integer maxLength; 
        private String name; 
        private Boolean nullable; 
        private Integer precision; 
        private Integer scale; 
        private String schemaName; 
        private String tableName; 
        private String udtName; 

        /**
         * ColumnDefault.
         */
        public Builder columnDefault(String columnDefault) {
            this.columnDefault = columnDefault;
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
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * IsCaseSensitive.
         */
        public Builder isCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }

        /**
         * IsCurrency.
         */
        public Builder isCurrency(Boolean isCurrency) {
            this.isCurrency = isCurrency;
            return this;
        }

        /**
         * IsPrimaryKey.
         */
        public Builder isPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }

        /**
         * IsSigned.
         */
        public Builder isSigned(Boolean isSigned) {
            this.isSigned = isSigned;
            return this;
        }

        /**
         * MaxLength.
         */
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
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
         * Precision.
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            return this;
        }

        /**
         * Scale.
         */
        public Builder scale(Integer scale) {
            this.scale = scale;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
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
         * UdtName.
         */
        public Builder udtName(String udtName) {
            this.udtName = udtName;
            return this;
        }

        public ColumnMetadata build() {
            return new ColumnMetadata(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ColumnMetadata model) {
            this.columnDefault = model.columnDefault;
            this.comment = model.comment;
            this.dataType = model.dataType;
            this.isCaseSensitive = model.isCaseSensitive;
            this.isCurrency = model.isCurrency;
            this.isPrimaryKey = model.isPrimaryKey;
            this.isSigned = model.isSigned;
            this.maxLength = model.maxLength;
            this.name = model.name;
            this.nullable = model.nullable;
            this.precision = model.precision;
            this.scale = model.scale;
            this.schemaName = model.schemaName;
            this.tableName = model.tableName;
            this.udtName = model.udtName;
        } 

        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;example&quot;::text</p>
         */
        public Builder columnDefault(String columnDefault) {
            this.columnDefault = columnDefault;
            return this;
        }

        /**
         * <p>The column description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample column comment</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Indicates whether the column is case-sensitive.</p>
         */
        public Builder isCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            return this;
        }

        /**
         * <p>Indicates whether the column stores currency values.</p>
         */
        public Builder isCurrency(Boolean isCurrency) {
            this.isCurrency = isCurrency;
            return this;
        }

        /**
         * <p>Indicates whether the column is a primary key.</p>
         */
        public Builder isPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }

        /**
         * <p>Indicates whether the column is signed.</p>
         */
        public Builder isSigned(Boolean isSigned) {
            this.isSigned = isSigned;
            return this;
        }

        /**
         * <p>The maximum character length.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether NULL values are allowed.</p>
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * <p>The column precision, which indicates the total number of digits in the integer and fractional parts of a decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            return this;
        }

        /**
         * <p>The column scale, which indicates the number of digits in the fractional part of a decimal number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scale(Integer scale) {
            this.scale = scale;
            return this;
        }

        /**
         * <p>The schema name.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>dc1</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The name of the base data type used by the column.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
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

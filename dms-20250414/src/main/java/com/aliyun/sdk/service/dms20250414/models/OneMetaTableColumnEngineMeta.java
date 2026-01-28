// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OneMetaTableColumnEngineMeta} extends {@link TeaModel}
 *
 * <p>OneMetaTableColumnEngineMeta</p>
 */
public class OneMetaTableColumnEngineMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoIncrement")
    private Boolean autoIncrement;

    @com.aliyun.core.annotation.NameInMap("DataLength")
    private Long dataLength;

    @com.aliyun.core.annotation.NameInMap("DataPrecision")
    private Integer dataPrecision;

    @com.aliyun.core.annotation.NameInMap("DataScale")
    private Integer dataScale;

    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("Encoding")
    private String encoding;

    @com.aliyun.core.annotation.NameInMap("Extra")
    private String extra;

    @com.aliyun.core.annotation.NameInMap("GenerationColumn")
    private Boolean generationColumn;

    @com.aliyun.core.annotation.NameInMap("GenerationExpression")
    private String generationExpression;

    @com.aliyun.core.annotation.NameInMap("Nullable")
    private Boolean nullable;

    private OneMetaTableColumnEngineMeta(Builder builder) {
        this.autoIncrement = builder.autoIncrement;
        this.dataLength = builder.dataLength;
        this.dataPrecision = builder.dataPrecision;
        this.dataScale = builder.dataScale;
        this.defaultValue = builder.defaultValue;
        this.encoding = builder.encoding;
        this.extra = builder.extra;
        this.generationColumn = builder.generationColumn;
        this.generationExpression = builder.generationExpression;
        this.nullable = builder.nullable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaTableColumnEngineMeta create() {
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
     * @return dataLength
     */
    public Long getDataLength() {
        return this.dataLength;
    }

    /**
     * @return dataPrecision
     */
    public Integer getDataPrecision() {
        return this.dataPrecision;
    }

    /**
     * @return dataScale
     */
    public Integer getDataScale() {
        return this.dataScale;
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return generationColumn
     */
    public Boolean getGenerationColumn() {
        return this.generationColumn;
    }

    /**
     * @return generationExpression
     */
    public String getGenerationExpression() {
        return this.generationExpression;
    }

    /**
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    public static final class Builder {
        private Boolean autoIncrement; 
        private Long dataLength; 
        private Integer dataPrecision; 
        private Integer dataScale; 
        private String defaultValue; 
        private String encoding; 
        private String extra; 
        private Boolean generationColumn; 
        private String generationExpression; 
        private Boolean nullable; 

        private Builder() {
        } 

        private Builder(OneMetaTableColumnEngineMeta model) {
            this.autoIncrement = model.autoIncrement;
            this.dataLength = model.dataLength;
            this.dataPrecision = model.dataPrecision;
            this.dataScale = model.dataScale;
            this.defaultValue = model.defaultValue;
            this.encoding = model.encoding;
            this.extra = model.extra;
            this.generationColumn = model.generationColumn;
            this.generationExpression = model.generationExpression;
            this.nullable = model.nullable;
        } 

        /**
         * AutoIncrement.
         */
        public Builder autoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }

        /**
         * DataLength.
         */
        public Builder dataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }

        /**
         * DataPrecision.
         */
        public Builder dataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }

        /**
         * DataScale.
         */
        public Builder dataScale(Integer dataScale) {
            this.dataScale = dataScale;
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
         * Encoding.
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        /**
         * GenerationColumn.
         */
        public Builder generationColumn(Boolean generationColumn) {
            this.generationColumn = generationColumn;
            return this;
        }

        /**
         * GenerationExpression.
         */
        public Builder generationExpression(String generationExpression) {
            this.generationExpression = generationExpression;
            return this;
        }

        /**
         * Nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        public OneMetaTableColumnEngineMeta build() {
            return new OneMetaTableColumnEngineMeta(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link TableColumn} extends {@link TeaModel}
 *
 * <p>TableColumn</p>
 */
public class TableColumn extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("logicalType")
    private String logicalType;

    @com.aliyun.core.annotation.NameInMap("metadataInfo")
    private MetadataInfo metadataInfo;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private TableColumn(Builder builder) {
        this.expression = builder.expression;
        this.logicalType = builder.logicalType;
        this.metadataInfo = builder.metadataInfo;
        this.name = builder.name;
        this.nullable = builder.nullable;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableColumn create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return logicalType
     */
    public String getLogicalType() {
        return this.logicalType;
    }

    /**
     * @return metadataInfo
     */
    public MetadataInfo getMetadataInfo() {
        return this.metadataInfo;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String expression; 
        private String logicalType; 
        private MetadataInfo metadataInfo; 
        private String name; 
        private Boolean nullable; 
        private String type; 

        private Builder() {
        } 

        private Builder(TableColumn model) {
            this.expression = model.expression;
            this.logicalType = model.logicalType;
            this.metadataInfo = model.metadataInfo;
            this.name = model.name;
            this.nullable = model.nullable;
            this.type = model.type;
        } 

        /**
         * expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * logicalType.
         */
        public Builder logicalType(String logicalType) {
            this.logicalType = logicalType;
            return this;
        }

        /**
         * metadataInfo.
         */
        public Builder metadataInfo(MetadataInfo metadataInfo) {
            this.metadataInfo = metadataInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TableColumn build() {
            return new TableColumn(this);
        } 

    } 

}

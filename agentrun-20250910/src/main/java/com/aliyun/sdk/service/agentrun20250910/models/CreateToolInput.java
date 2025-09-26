// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateToolInput} extends {@link TeaModel}
 *
 * <p>CreateToolInput</p>
 */
public class CreateToolInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CAPConfig")
    private CAPConfig CAPConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("schema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schema;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("toolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toolType;

    private CreateToolInput(Builder builder) {
        this.CAPConfig = builder.CAPConfig;
        this.description = builder.description;
        this.name = builder.name;
        this.schema = builder.schema;
        this.sourceType = builder.sourceType;
        this.toolType = builder.toolType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateToolInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CAPConfig
     */
    public CAPConfig getCAPConfig() {
        return this.CAPConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return toolType
     */
    public String getToolType() {
        return this.toolType;
    }

    public static final class Builder {
        private CAPConfig CAPConfig; 
        private String description; 
        private String name; 
        private String schema; 
        private String sourceType; 
        private String toolType; 

        private Builder() {
        } 

        private Builder(CreateToolInput model) {
            this.CAPConfig = model.CAPConfig;
            this.description = model.description;
            this.name = model.name;
            this.schema = model.schema;
            this.sourceType = model.sourceType;
            this.toolType = model.toolType;
        } 

        /**
         * CAPConfig.
         */
        public Builder CAPConfig(CAPConfig CAPConfig) {
            this.CAPConfig = CAPConfig;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * <p>This parameter is required.</p>
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder toolType(String toolType) {
            this.toolType = toolType;
            return this;
        }

        public CreateToolInput build() {
            return new CreateToolInput(this);
        } 

    } 

}

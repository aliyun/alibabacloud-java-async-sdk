// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link MCPToolMeta} extends {@link TeaModel}
 *
 * <p>MCPToolMeta</p>
 */
public class MCPToolMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("inputSchema")
    private java.util.Map<String, ?> inputSchema;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private MCPToolMeta(Builder builder) {
        this.description = builder.description;
        this.inputSchema = builder.inputSchema;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPToolMeta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputSchema
     */
    public java.util.Map<String, ?> getInputSchema() {
        return this.inputSchema;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String description; 
        private java.util.Map<String, ?> inputSchema; 
        private String name; 

        private Builder() {
        } 

        private Builder(MCPToolMeta model) {
            this.description = model.description;
            this.inputSchema = model.inputSchema;
            this.name = model.name;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * inputSchema.
         */
        public Builder inputSchema(java.util.Map<String, ?> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public MCPToolMeta build() {
            return new MCPToolMeta(this);
        } 

    } 

}

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
 * {@link ToolListItem} extends {@link TeaModel}
 *
 * <p>ToolListItem</p>
 */
public class ToolListItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CAPConfig")
    private CAPConfig CAPConfig;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("toolType")
    private String toolType;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private ToolListItem(Builder builder) {
        this.CAPConfig = builder.CAPConfig;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.schema = builder.schema;
        this.sourceType = builder.sourceType;
        this.toolType = builder.toolType;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToolListItem create() {
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
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private CAPConfig CAPConfig; 
        private String createdAt; 
        private String description; 
        private String id; 
        private String name; 
        private String schema; 
        private String sourceType; 
        private String toolType; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(ToolListItem model) {
            this.CAPConfig = model.CAPConfig;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.id = model.id;
            this.name = model.name;
            this.schema = model.schema;
            this.sourceType = model.sourceType;
            this.toolType = model.toolType;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * CAPConfig.
         */
        public Builder CAPConfig(CAPConfig CAPConfig) {
            this.CAPConfig = CAPConfig;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * toolType.
         */
        public Builder toolType(String toolType) {
            this.toolType = toolType;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ToolListItem build() {
            return new ToolListItem(this);
        } 

    } 

}

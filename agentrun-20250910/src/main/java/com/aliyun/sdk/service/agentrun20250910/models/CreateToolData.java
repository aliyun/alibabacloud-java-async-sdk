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
 * {@link CreateToolData} extends {@link TeaModel}
 *
 * <p>CreateToolData</p>
 */
public class CreateToolData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("toolType")
    private String toolType;

    private CreateToolData(Builder builder) {
        this.createdAt = builder.createdAt;
        this.id = builder.id;
        this.name = builder.name;
        this.sourceType = builder.sourceType;
        this.toolType = builder.toolType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateToolData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
        private String createdAt; 
        private String id; 
        private String name; 
        private String sourceType; 
        private String toolType; 

        private Builder() {
        } 

        private Builder(CreateToolData model) {
            this.createdAt = model.createdAt;
            this.id = model.id;
            this.name = model.name;
            this.sourceType = model.sourceType;
            this.toolType = model.toolType;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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

        public CreateToolData build() {
            return new CreateToolData(this);
        } 

    } 

}

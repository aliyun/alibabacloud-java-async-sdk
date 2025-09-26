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
 * {@link UpdateToolData} extends {@link TeaModel}
 *
 * <p>UpdateToolData</p>
 */
public class UpdateToolData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("toolType")
    private String toolType;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private UpdateToolData(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.sourceType = builder.sourceType;
        this.toolType = builder.toolType;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateToolData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String id; 
        private String name; 
        private String sourceType; 
        private String toolType; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(UpdateToolData model) {
            this.id = model.id;
            this.name = model.name;
            this.sourceType = model.sourceType;
            this.toolType = model.toolType;
            this.updatedAt = model.updatedAt;
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

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UpdateToolData build() {
            return new UpdateToolData(this);
        } 

    } 

}

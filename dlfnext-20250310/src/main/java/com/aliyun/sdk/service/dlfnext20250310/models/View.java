// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link View} extends {@link TeaModel}
 *
 * <p>View</p>
 */
public class View extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("schema")
    private ViewSchema schema;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    private View(Builder builder) {
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.id = builder.id;
        this.name = builder.name;
        this.owner = builder.owner;
        this.schema = builder.schema;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static View create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return schema
     */
    public ViewSchema getSchema() {
        return this.schema;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public static final class Builder {
        private Long createdAt; 
        private String createdBy; 
        private String id; 
        private String name; 
        private String owner; 
        private ViewSchema schema; 
        private Long updatedAt; 
        private String updatedBy; 

        private Builder() {
        } 

        private Builder(View model) {
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.id = model.id;
            this.name = model.name;
            this.owner = model.owner;
            this.schema = model.schema;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
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
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(ViewSchema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * updatedBy.
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public View build() {
            return new View(this);
        } 

    } 

}

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
 * {@link CredentialListItem} extends {@link TeaModel}
 *
 * <p>CredentialListItem</p>
 */
public class CredentialListItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("relatedWorloads")
    private java.util.List<RelatedWorkload> relatedWorloads;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private CredentialListItem(Builder builder) {
        this.createdAt = builder.createdAt;
        this.id = builder.id;
        this.name = builder.name;
        this.relatedWorloads = builder.relatedWorloads;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialListItem create() {
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
     * @return relatedWorloads
     */
    public java.util.List<RelatedWorkload> getRelatedWorloads() {
        return this.relatedWorloads;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String createdAt; 
        private String id; 
        private String name; 
        private java.util.List<RelatedWorkload> relatedWorloads; 
        private String type; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(CredentialListItem model) {
            this.createdAt = model.createdAt;
            this.id = model.id;
            this.name = model.name;
            this.relatedWorloads = model.relatedWorloads;
            this.type = model.type;
            this.updatedAt = model.updatedAt;
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
         * relatedWorloads.
         */
        public Builder relatedWorloads(java.util.List<RelatedWorkload> relatedWorloads) {
            this.relatedWorloads = relatedWorloads;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CredentialListItem build() {
            return new CredentialListItem(this);
        } 

    } 

}

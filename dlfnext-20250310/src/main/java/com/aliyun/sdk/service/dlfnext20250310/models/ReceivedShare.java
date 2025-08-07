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
 * {@link ReceivedShare} extends {@link TeaModel}
 *
 * <p>ReceivedShare</p>
 */
public class ReceivedShare extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("providerTenantId")
    private Long providerTenantId;

    @com.aliyun.core.annotation.NameInMap("shareId")
    private String shareId;

    @com.aliyun.core.annotation.NameInMap("shareName")
    private String shareName;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    private ReceivedShare(Builder builder) {
        this.catalogName = builder.catalogName;
        this.comment = builder.comment;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.owner = builder.owner;
        this.providerTenantId = builder.providerTenantId;
        this.shareId = builder.shareId;
        this.shareName = builder.shareName;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReceivedShare create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return providerTenantId
     */
    public Long getProviderTenantId() {
        return this.providerTenantId;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return shareName
     */
    public String getShareName() {
        return this.shareName;
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
        private String catalogName; 
        private String comment; 
        private Long createdAt; 
        private String createdBy; 
        private String owner; 
        private Long providerTenantId; 
        private String shareId; 
        private String shareName; 
        private Long updatedAt; 
        private String updatedBy; 

        private Builder() {
        } 

        private Builder(ReceivedShare model) {
            this.catalogName = model.catalogName;
            this.comment = model.comment;
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.owner = model.owner;
            this.providerTenantId = model.providerTenantId;
            this.shareId = model.shareId;
            this.shareName = model.shareName;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * catalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
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
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * providerTenantId.
         */
        public Builder providerTenantId(Long providerTenantId) {
            this.providerTenantId = providerTenantId;
            return this;
        }

        /**
         * shareId.
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * shareName.
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
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

        public ReceivedShare build() {
            return new ReceivedShare(this);
        } 

    } 

}

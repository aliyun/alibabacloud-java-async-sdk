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

    @com.aliyun.core.annotation.NameInMap("enableWrite")
    private Boolean enableWrite;

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
        this.enableWrite = builder.enableWrite;
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
     * @return enableWrite
     */
    public Boolean getEnableWrite() {
        return this.enableWrite;
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
        private Boolean enableWrite; 
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
            this.enableWrite = model.enableWrite;
            this.owner = model.owner;
            this.providerTenantId = model.providerTenantId;
            this.shareId = model.shareId;
            this.shareName = model.shareName;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * <p>The catalog name.</p>
         * 
         * <strong>example:</strong>
         * <p>catalog_name</p>
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The comment of the share.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The creator of the share.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * enableWrite.
         */
        public Builder enableWrite(Boolean enableWrite) {
            this.enableWrite = enableWrite;
            return this;
        }

        /**
         * <p>The share owner.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The provider\&quot;s account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder providerTenantId(Long providerTenantId) {
            this.providerTenantId = providerTenantId;
            return this;
        }

        /**
         * <p>The share ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder shareId(String shareId) {
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The share name.</p>
         * 
         * <strong>example:</strong>
         * <p>share_name</p>
         */
        public Builder shareName(String shareName) {
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The user who last updated the share.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::[accountId]:root</p>
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

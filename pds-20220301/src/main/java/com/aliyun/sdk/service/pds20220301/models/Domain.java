// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link Domain} extends {@link TeaModel}
 *
 * <p>Domain</p>
 */
public class Domain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("data_hash_name")
    private String dataHashName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("domain_name")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("init_drive_enable")
    private Boolean initDriveEnable;

    @com.aliyun.core.annotation.NameInMap("init_drive_size")
    private Long initDriveSize;

    @com.aliyun.core.annotation.NameInMap("parent_domain_id")
    private String parentDomainId;

    @com.aliyun.core.annotation.NameInMap("published_app_access_strategy")
    private AppAccessStrategy publishedAppAccessStrategy;

    @com.aliyun.core.annotation.NameInMap("sharable")
    private Boolean sharable;

    @com.aliyun.core.annotation.NameInMap("size_quota")
    private Long sizeQuota;

    @com.aliyun.core.annotation.NameInMap("size_quota_used")
    private Long sizeQuotaUsed;

    @com.aliyun.core.annotation.NameInMap("status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("store_redundancy_type")
    private String storeRedundancyType;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("used_size")
    private Long usedSize;

    @com.aliyun.core.annotation.NameInMap("user_count_quota")
    private Long userCountQuota;

    private Domain(Builder builder) {
        this.createdAt = builder.createdAt;
        this.dataHashName = builder.dataHashName;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.domainName = builder.domainName;
        this.initDriveEnable = builder.initDriveEnable;
        this.initDriveSize = builder.initDriveSize;
        this.parentDomainId = builder.parentDomainId;
        this.publishedAppAccessStrategy = builder.publishedAppAccessStrategy;
        this.sharable = builder.sharable;
        this.sizeQuota = builder.sizeQuota;
        this.sizeQuotaUsed = builder.sizeQuotaUsed;
        this.status = builder.status;
        this.storeRedundancyType = builder.storeRedundancyType;
        this.updatedAt = builder.updatedAt;
        this.usedSize = builder.usedSize;
        this.userCountQuota = builder.userCountQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Domain create() {
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
     * @return dataHashName
     */
    public String getDataHashName() {
        return this.dataHashName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return initDriveEnable
     */
    public Boolean getInitDriveEnable() {
        return this.initDriveEnable;
    }

    /**
     * @return initDriveSize
     */
    public Long getInitDriveSize() {
        return this.initDriveSize;
    }

    /**
     * @return parentDomainId
     */
    public String getParentDomainId() {
        return this.parentDomainId;
    }

    /**
     * @return publishedAppAccessStrategy
     */
    public AppAccessStrategy getPublishedAppAccessStrategy() {
        return this.publishedAppAccessStrategy;
    }

    /**
     * @return sharable
     */
    public Boolean getSharable() {
        return this.sharable;
    }

    /**
     * @return sizeQuota
     */
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    /**
     * @return sizeQuotaUsed
     */
    public Long getSizeQuotaUsed() {
        return this.sizeQuotaUsed;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return storeRedundancyType
     */
    public String getStoreRedundancyType() {
        return this.storeRedundancyType;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return usedSize
     */
    public Long getUsedSize() {
        return this.usedSize;
    }

    /**
     * @return userCountQuota
     */
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

    public static final class Builder {
        private String createdAt; 
        private String dataHashName; 
        private String description; 
        private String domainId; 
        private String domainName; 
        private Boolean initDriveEnable; 
        private Long initDriveSize; 
        private String parentDomainId; 
        private AppAccessStrategy publishedAppAccessStrategy; 
        private Boolean sharable; 
        private Long sizeQuota; 
        private Long sizeQuotaUsed; 
        private Long status; 
        private String storeRedundancyType; 
        private String updatedAt; 
        private Long usedSize; 
        private Long userCountQuota; 

        private Builder() {
        } 

        private Builder(Domain model) {
            this.createdAt = model.createdAt;
            this.dataHashName = model.dataHashName;
            this.description = model.description;
            this.domainId = model.domainId;
            this.domainName = model.domainName;
            this.initDriveEnable = model.initDriveEnable;
            this.initDriveSize = model.initDriveSize;
            this.parentDomainId = model.parentDomainId;
            this.publishedAppAccessStrategy = model.publishedAppAccessStrategy;
            this.sharable = model.sharable;
            this.sizeQuota = model.sizeQuota;
            this.sizeQuotaUsed = model.sizeQuotaUsed;
            this.status = model.status;
            this.storeRedundancyType = model.storeRedundancyType;
            this.updatedAt = model.updatedAt;
            this.usedSize = model.usedSize;
            this.userCountQuota = model.userCountQuota;
        } 

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * data_hash_name.
         */
        public Builder dataHashName(String dataHashName) {
            this.dataHashName = dataHashName;
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
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * domain_name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * init_drive_enable.
         */
        public Builder initDriveEnable(Boolean initDriveEnable) {
            this.initDriveEnable = initDriveEnable;
            return this;
        }

        /**
         * init_drive_size.
         */
        public Builder initDriveSize(Long initDriveSize) {
            this.initDriveSize = initDriveSize;
            return this;
        }

        /**
         * parent_domain_id.
         */
        public Builder parentDomainId(String parentDomainId) {
            this.parentDomainId = parentDomainId;
            return this;
        }

        /**
         * published_app_access_strategy.
         */
        public Builder publishedAppAccessStrategy(AppAccessStrategy publishedAppAccessStrategy) {
            this.publishedAppAccessStrategy = publishedAppAccessStrategy;
            return this;
        }

        /**
         * sharable.
         */
        public Builder sharable(Boolean sharable) {
            this.sharable = sharable;
            return this;
        }

        /**
         * size_quota.
         */
        public Builder sizeQuota(Long sizeQuota) {
            this.sizeQuota = sizeQuota;
            return this;
        }

        /**
         * size_quota_used.
         */
        public Builder sizeQuotaUsed(Long sizeQuotaUsed) {
            this.sizeQuotaUsed = sizeQuotaUsed;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * store_redundancy_type.
         */
        public Builder storeRedundancyType(String storeRedundancyType) {
            this.storeRedundancyType = storeRedundancyType;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * used_size.
         */
        public Builder usedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }

        /**
         * user_count_quota.
         */
        public Builder userCountQuota(Long userCountQuota) {
            this.userCountQuota = userCountQuota;
            return this;
        }

        public Domain build() {
            return new Domain(this);
        } 

    } 

}

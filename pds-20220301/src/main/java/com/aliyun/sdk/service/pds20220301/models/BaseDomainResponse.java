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
 * {@link BaseDomainResponse} extends {@link TeaModel}
 *
 * <p>BaseDomainResponse</p>
 */
public class BaseDomainResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

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

    @com.aliyun.core.annotation.NameInMap("share_link_enabled")
    private Boolean shareLinkEnabled;

    @com.aliyun.core.annotation.NameInMap("size_quota")
    private Long sizeQuota;

    @com.aliyun.core.annotation.NameInMap("size_quota_used")
    private Long sizeQuotaUsed;

    @com.aliyun.core.annotation.NameInMap("status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("used_size")
    private Long usedSize;

    private BaseDomainResponse(BuilderImpl builder) {
        super(builder);
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.domainName = builder.domainName;
        this.initDriveEnable = builder.initDriveEnable;
        this.initDriveSize = builder.initDriveSize;
        this.parentDomainId = builder.parentDomainId;
        this.publishedAppAccessStrategy = builder.publishedAppAccessStrategy;
        this.shareLinkEnabled = builder.shareLinkEnabled;
        this.sizeQuota = builder.sizeQuota;
        this.sizeQuotaUsed = builder.sizeQuotaUsed;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.usedSize = builder.usedSize;
    }

    public static BaseDomainResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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
     * @return shareLinkEnabled
     */
    public Boolean getShareLinkEnabled() {
        return this.shareLinkEnabled;
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

    public interface Builder extends Response.Builder<BaseDomainResponse, Builder> {

        Builder createdAt(String createdAt);

        Builder description(String description);

        Builder domainId(String domainId);

        Builder domainName(String domainName);

        Builder initDriveEnable(Boolean initDriveEnable);

        Builder initDriveSize(Long initDriveSize);

        Builder parentDomainId(String parentDomainId);

        Builder publishedAppAccessStrategy(AppAccessStrategy publishedAppAccessStrategy);

        Builder shareLinkEnabled(Boolean shareLinkEnabled);

        Builder sizeQuota(Long sizeQuota);

        Builder sizeQuotaUsed(Long sizeQuotaUsed);

        Builder status(Long status);

        Builder updatedAt(String updatedAt);

        Builder usedSize(Long usedSize);

        @Override
        BaseDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseDomainResponse, Builder>
            implements Builder {
        private String createdAt; 
        private String description; 
        private String domainId; 
        private String domainName; 
        private Boolean initDriveEnable; 
        private Long initDriveSize; 
        private String parentDomainId; 
        private AppAccessStrategy publishedAppAccessStrategy; 
        private Boolean shareLinkEnabled; 
        private Long sizeQuota; 
        private Long sizeQuotaUsed; 
        private Long status; 
        private String updatedAt; 
        private Long usedSize; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseDomainResponse response) {
            super(response);
            this.createdAt = response.createdAt;
            this.description = response.description;
            this.domainId = response.domainId;
            this.domainName = response.domainName;
            this.initDriveEnable = response.initDriveEnable;
            this.initDriveSize = response.initDriveSize;
            this.parentDomainId = response.parentDomainId;
            this.publishedAppAccessStrategy = response.publishedAppAccessStrategy;
            this.shareLinkEnabled = response.shareLinkEnabled;
            this.sizeQuota = response.sizeQuota;
            this.sizeQuotaUsed = response.sizeQuotaUsed;
            this.status = response.status;
            this.updatedAt = response.updatedAt;
            this.usedSize = response.usedSize;
        } 

        /**
         * created_at.
         */
        @Override
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * description.
         */
        @Override
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * domain_name.
         */
        @Override
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * init_drive_enable.
         */
        @Override
        public Builder initDriveEnable(Boolean initDriveEnable) {
            this.initDriveEnable = initDriveEnable;
            return this;
        }

        /**
         * init_drive_size.
         */
        @Override
        public Builder initDriveSize(Long initDriveSize) {
            this.initDriveSize = initDriveSize;
            return this;
        }

        /**
         * parent_domain_id.
         */
        @Override
        public Builder parentDomainId(String parentDomainId) {
            this.parentDomainId = parentDomainId;
            return this;
        }

        /**
         * published_app_access_strategy.
         */
        @Override
        public Builder publishedAppAccessStrategy(AppAccessStrategy publishedAppAccessStrategy) {
            this.publishedAppAccessStrategy = publishedAppAccessStrategy;
            return this;
        }

        /**
         * share_link_enabled.
         */
        @Override
        public Builder shareLinkEnabled(Boolean shareLinkEnabled) {
            this.shareLinkEnabled = shareLinkEnabled;
            return this;
        }

        /**
         * size_quota.
         */
        @Override
        public Builder sizeQuota(Long sizeQuota) {
            this.sizeQuota = sizeQuota;
            return this;
        }

        /**
         * size_quota_used.
         */
        @Override
        public Builder sizeQuotaUsed(Long sizeQuotaUsed) {
            this.sizeQuotaUsed = sizeQuotaUsed;
            return this;
        }

        /**
         * status.
         */
        @Override
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * updated_at.
         */
        @Override
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * used_size.
         */
        @Override
        public Builder usedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }

        @Override
        public BaseDomainResponse build() {
            return new BaseDomainResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppInstanceAggregate} extends {@link TeaModel}
 *
 * <p>AppInstanceAggregate</p>
 */
public class AppInstanceAggregate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiStaffList")
    private java.util.List<AppAiStaff> aiStaffList;

    @com.aliyun.core.annotation.NameInMap("AppOperationAddress")
    private AppOperationAddress appOperationAddress;

    @com.aliyun.core.annotation.NameInMap("AppServiceList")
    private java.util.List<AppServiceAggregate> appServiceList;

    @com.aliyun.core.annotation.NameInMap("AppSubType")
    private String appSubType;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("BuildType")
    private String buildType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Integer deleted;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DesignSpecBizId")
    private String designSpecBizId;

    @com.aliyun.core.annotation.NameInMap("DesignSpecId")
    private String designSpecId;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EspBizId")
    private String espBizId;

    @com.aliyun.core.annotation.NameInMap("GmtDelete")
    private String gmtDelete;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("GmtPublish")
    private String gmtPublish;

    @com.aliyun.core.annotation.NameInMap("IconUrl")
    private String iconUrl;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Profile")
    private AppInstanceProfile profile;

    @com.aliyun.core.annotation.NameInMap("SiteHost")
    private String siteHost;

    @com.aliyun.core.annotation.NameInMap("Slug")
    private String slug;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusText")
    private String statusText;

    @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
    private String thumbnailUrl;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private AppInstanceAggregate(Builder builder) {
        this.aiStaffList = builder.aiStaffList;
        this.appOperationAddress = builder.appOperationAddress;
        this.appServiceList = builder.appServiceList;
        this.appSubType = builder.appSubType;
        this.appType = builder.appType;
        this.bizId = builder.bizId;
        this.buildType = builder.buildType;
        this.createTime = builder.createTime;
        this.deleted = builder.deleted;
        this.description = builder.description;
        this.designSpecBizId = builder.designSpecBizId;
        this.designSpecId = builder.designSpecId;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.espBizId = builder.espBizId;
        this.gmtDelete = builder.gmtDelete;
        this.gmtModified = builder.gmtModified;
        this.gmtPublish = builder.gmtPublish;
        this.iconUrl = builder.iconUrl;
        this.name = builder.name;
        this.profile = builder.profile;
        this.siteHost = builder.siteHost;
        this.slug = builder.slug;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.statusText = builder.statusText;
        this.thumbnailUrl = builder.thumbnailUrl;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppInstanceAggregate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiStaffList
     */
    public java.util.List<AppAiStaff> getAiStaffList() {
        return this.aiStaffList;
    }

    /**
     * @return appOperationAddress
     */
    public AppOperationAddress getAppOperationAddress() {
        return this.appOperationAddress;
    }

    /**
     * @return appServiceList
     */
    public java.util.List<AppServiceAggregate> getAppServiceList() {
        return this.appServiceList;
    }

    /**
     * @return appSubType
     */
    public String getAppSubType() {
        return this.appSubType;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return buildType
     */
    public String getBuildType() {
        return this.buildType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deleted
     */
    public Integer getDeleted() {
        return this.deleted;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return designSpecBizId
     */
    public String getDesignSpecBizId() {
        return this.designSpecBizId;
    }

    /**
     * @return designSpecId
     */
    public String getDesignSpecId() {
        return this.designSpecId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return espBizId
     */
    public String getEspBizId() {
        return this.espBizId;
    }

    /**
     * @return gmtDelete
     */
    public String getGmtDelete() {
        return this.gmtDelete;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return gmtPublish
     */
    public String getGmtPublish() {
        return this.gmtPublish;
    }

    /**
     * @return iconUrl
     */
    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return profile
     */
    public AppInstanceProfile getProfile() {
        return this.profile;
    }

    /**
     * @return siteHost
     */
    public String getSiteHost() {
        return this.siteHost;
    }

    /**
     * @return slug
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusText
     */
    public String getStatusText() {
        return this.statusText;
    }

    /**
     * @return thumbnailUrl
     */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private java.util.List<AppAiStaff> aiStaffList; 
        private AppOperationAddress appOperationAddress; 
        private java.util.List<AppServiceAggregate> appServiceList; 
        private String appSubType; 
        private String appType; 
        private String bizId; 
        private String buildType; 
        private String createTime; 
        private Integer deleted; 
        private String description; 
        private String designSpecBizId; 
        private String designSpecId; 
        private String domain; 
        private String endTime; 
        private String espBizId; 
        private String gmtDelete; 
        private String gmtModified; 
        private String gmtPublish; 
        private String iconUrl; 
        private String name; 
        private AppInstanceProfile profile; 
        private String siteHost; 
        private String slug; 
        private String sourceType; 
        private String startTime; 
        private String status; 
        private String statusText; 
        private String thumbnailUrl; 
        private String userId; 

        private Builder() {
        } 

        private Builder(AppInstanceAggregate model) {
            this.aiStaffList = model.aiStaffList;
            this.appOperationAddress = model.appOperationAddress;
            this.appServiceList = model.appServiceList;
            this.appSubType = model.appSubType;
            this.appType = model.appType;
            this.bizId = model.bizId;
            this.buildType = model.buildType;
            this.createTime = model.createTime;
            this.deleted = model.deleted;
            this.description = model.description;
            this.designSpecBizId = model.designSpecBizId;
            this.designSpecId = model.designSpecId;
            this.domain = model.domain;
            this.endTime = model.endTime;
            this.espBizId = model.espBizId;
            this.gmtDelete = model.gmtDelete;
            this.gmtModified = model.gmtModified;
            this.gmtPublish = model.gmtPublish;
            this.iconUrl = model.iconUrl;
            this.name = model.name;
            this.profile = model.profile;
            this.siteHost = model.siteHost;
            this.slug = model.slug;
            this.sourceType = model.sourceType;
            this.startTime = model.startTime;
            this.status = model.status;
            this.statusText = model.statusText;
            this.thumbnailUrl = model.thumbnailUrl;
            this.userId = model.userId;
        } 

        /**
         * AiStaffList.
         */
        public Builder aiStaffList(java.util.List<AppAiStaff> aiStaffList) {
            this.aiStaffList = aiStaffList;
            return this;
        }

        /**
         * AppOperationAddress.
         */
        public Builder appOperationAddress(AppOperationAddress appOperationAddress) {
            this.appOperationAddress = appOperationAddress;
            return this;
        }

        /**
         * AppServiceList.
         */
        public Builder appServiceList(java.util.List<AppServiceAggregate> appServiceList) {
            this.appServiceList = appServiceList;
            return this;
        }

        /**
         * AppSubType.
         */
        public Builder appSubType(String appSubType) {
            this.appSubType = appSubType;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * BuildType.
         */
        public Builder buildType(String buildType) {
            this.buildType = buildType;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Deleted.
         */
        public Builder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DesignSpecBizId.
         */
        public Builder designSpecBizId(String designSpecBizId) {
            this.designSpecBizId = designSpecBizId;
            return this;
        }

        /**
         * DesignSpecId.
         */
        public Builder designSpecId(String designSpecId) {
            this.designSpecId = designSpecId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * EspBizId.
         */
        public Builder espBizId(String espBizId) {
            this.espBizId = espBizId;
            return this;
        }

        /**
         * GmtDelete.
         */
        public Builder gmtDelete(String gmtDelete) {
            this.gmtDelete = gmtDelete;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * GmtPublish.
         */
        public Builder gmtPublish(String gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }

        /**
         * IconUrl.
         */
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Profile.
         */
        public Builder profile(AppInstanceProfile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * SiteHost.
         */
        public Builder siteHost(String siteHost) {
            this.siteHost = siteHost;
            return this;
        }

        /**
         * Slug.
         */
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>trial,draft,live,refunded,expired,released</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusText.
         */
        public Builder statusText(String statusText) {
            this.statusText = statusText;
            return this;
        }

        /**
         * ThumbnailUrl.
         */
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AppInstanceAggregate build() {
            return new AppInstanceAggregate(this);
        } 

    } 

}

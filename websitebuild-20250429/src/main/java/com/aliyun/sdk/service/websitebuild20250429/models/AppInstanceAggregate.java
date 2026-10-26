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

    @com.aliyun.core.annotation.NameInMap("ConversationInfo")
    private ConversationInfo conversationInfo;

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

    @com.aliyun.core.annotation.NameInMap("PartnerDetail")
    private PartnerDetail partnerDetail;

    @com.aliyun.core.annotation.NameInMap("Profile")
    private AppInstanceProfile profile;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

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

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TemplateRecord")
    private TemplateRecord templateRecord;

    @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
    private String thumbnailUrl;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private AppInstanceAggregate(Builder builder) {
        this.aiStaffList = builder.aiStaffList;
        this.appOperationAddress = builder.appOperationAddress;
        this.appServiceList = builder.appServiceList;
        this.appSubType = builder.appSubType;
        this.appType = builder.appType;
        this.bizId = builder.bizId;
        this.buildType = builder.buildType;
        this.conversationInfo = builder.conversationInfo;
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
        this.partnerDetail = builder.partnerDetail;
        this.profile = builder.profile;
        this.resourceGroupId = builder.resourceGroupId;
        this.siteHost = builder.siteHost;
        this.slug = builder.slug;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.statusText = builder.statusText;
        this.tags = builder.tags;
        this.templateRecord = builder.templateRecord;
        this.thumbnailUrl = builder.thumbnailUrl;
        this.userId = builder.userId;
        this.version = builder.version;
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
     * @return conversationInfo
     */
    public ConversationInfo getConversationInfo() {
        return this.conversationInfo;
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
     * @return partnerDetail
     */
    public PartnerDetail getPartnerDetail() {
        return this.partnerDetail;
    }

    /**
     * @return profile
     */
    public AppInstanceProfile getProfile() {
        return this.profile;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateRecord
     */
    public TemplateRecord getTemplateRecord() {
        return this.templateRecord;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<AppAiStaff> aiStaffList; 
        private AppOperationAddress appOperationAddress; 
        private java.util.List<AppServiceAggregate> appServiceList; 
        private String appSubType; 
        private String appType; 
        private String bizId; 
        private String buildType; 
        private ConversationInfo conversationInfo; 
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
        private PartnerDetail partnerDetail; 
        private AppInstanceProfile profile; 
        private String resourceGroupId; 
        private String siteHost; 
        private String slug; 
        private String sourceType; 
        private String startTime; 
        private String status; 
        private String statusText; 
        private java.util.List<Tags> tags; 
        private TemplateRecord templateRecord; 
        private String thumbnailUrl; 
        private String userId; 
        private String version; 

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
            this.conversationInfo = model.conversationInfo;
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
            this.partnerDetail = model.partnerDetail;
            this.profile = model.profile;
            this.resourceGroupId = model.resourceGroupId;
            this.siteHost = model.siteHost;
            this.slug = model.slug;
            this.sourceType = model.sourceType;
            this.startTime = model.startTime;
            this.status = model.status;
            this.statusText = model.statusText;
            this.tags = model.tags;
            this.templateRecord = model.templateRecord;
            this.thumbnailUrl = model.thumbnailUrl;
            this.userId = model.userId;
            this.version = model.version;
        } 

        /**
         * <p>The list of AI agents associated with the application.</p>
         */
        public Builder aiStaffList(java.util.List<AppAiStaff> aiStaffList) {
            this.aiStaffList = aiStaffList;
            return this;
        }

        /**
         * <p>The operation address of the application.</p>
         */
        public Builder appOperationAddress(AppOperationAddress appOperationAddress) {
            this.appOperationAddress = appOperationAddress;
            return this;
        }

        /**
         * <p>The list of service instances associated with the application.</p>
         */
        public Builder appServiceList(java.util.List<AppServiceAggregate> appServiceList) {
            this.appServiceList = appServiceList;
            return this;
        }

        /**
         * <p>The application subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>SEO_CONTENT</p>
         */
        public Builder appSubType(String appSubType) {
            this.appSubType = appSubType;
            return this;
        }

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSITE</p>
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * <p>The business ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250915163734000001</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The build type.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DREAM_SAAS</p>
         */
        public Builder buildType(String buildType) {
            this.buildType = buildType;
            return this;
        }

        /**
         * <p>没有关联会话时为 null。</p>
         */
        public Builder conversationInfo(ConversationInfo conversationInfo) {
            this.conversationInfo = conversationInfo;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the instance is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>base</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The business ID of the design specification.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801151731000007</p>
         */
        public Builder designSpecBizId(String designSpecBizId) {
            this.designSpecBizId = designSpecBizId;
            return this;
        }

        /**
         * <p>The design specification ID.</p>
         */
        public Builder designSpecId(String designSpecId) {
            this.designSpecId = designSpecId;
            return this;
        }

        /**
         * <p>The primary domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>stxycw.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-05T15:59:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the associated delivery order.</p>
         * 
         * <strong>example:</strong>
         * <p>p20202933455</p>
         */
        public Builder espBizId(String espBizId) {
            this.espBizId = espBizId;
            return this;
        }

        /**
         * <p>The deletion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        public Builder gmtDelete(String gmtDelete) {
            this.gmtDelete = gmtDelete;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The publication time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        public Builder gmtPublish(String gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }

        /**
         * <p>The URL of the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p>icon/WS20250626112715000001/thumbnail.jpg</p>
         */
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>docs</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The partner details.</p>
         */
        public Builder partnerDetail(PartnerDetail partnerDetail) {
            this.partnerDetail = partnerDetail;
            return this;
        }

        /**
         * <p>The configuration and runtime information of the application instance.</p>
         */
        public Builder profile(AppInstanceProfile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>The ID of the enterprise resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2smovqqpvuly</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The website domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd.scd.wanwang.xin</p>
         */
        public Builder siteHost(String siteHost) {
            this.siteHost = siteHost;
            return this;
        }

        /**
         * <p>The application identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>31104757</p>
         */
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>MARKET_CLOUD_DREAM</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-24T10:10Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>trial,draft,live,refunded,expired,released</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The status text.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        public Builder statusText(String statusText) {
            this.statusText = statusText;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The application template record information.</p>
         */
        public Builder templateRecord(TemplateRecord templateRecord) {
            this.templateRecord = templateRecord;
            return this;
        }

        /**
         * <p>The URL of the application thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>thumbnails/WS20250626112715000001/thumbnail.jpg</p>
         */
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123241414</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-02</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public AppInstanceAggregate build() {
            return new AppInstanceAggregate(this);
        } 

    } 

    /**
     * 
     * {@link AppInstanceAggregate} extends {@link TeaModel}
     *
     * <p>AppInstanceAggregate</p>
     */
    public static class ConversationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatNum")
        private Long chatNum;

        private ConversationInfo(Builder builder) {
            this.chatNum = builder.chatNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversationInfo create() {
            return builder().build();
        }

        /**
         * @return chatNum
         */
        public Long getChatNum() {
            return this.chatNum;
        }

        public static final class Builder {
            private Long chatNum; 

            private Builder() {
            } 

            private Builder(ConversationInfo model) {
                this.chatNum = model.chatNum;
            } 

            /**
             * <p>0 表示存在空会话。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chatNum(Long chatNum) {
                this.chatNum = chatNum;
                return this;
            }

            public ConversationInfo build() {
                return new ConversationInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppInstanceAggregate} extends {@link TeaModel}
     *
     * <p>AppInstanceAggregate</p>
     */
    public static class BindData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("ParentPk")
        private String parentPk;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private BindData(Builder builder) {
            this.bizId = builder.bizId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mobile = builder.mobile;
            this.parentPk = builder.parentPk;
            this.partnerId = builder.partnerId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindData create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return parentPk
         */
        public String getParentPk() {
            return this.parentPk;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bizId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String mobile; 
            private String parentPk; 
            private String partnerId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(BindData model) {
                this.bizId = model.bizId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mobile = model.mobile;
                this.parentPk = model.parentPk;
                this.partnerId = model.partnerId;
                this.userId = model.userId;
            } 

            /**
             * <p>The external business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>WS20250801153127000002</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1672123722000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>Wed Nov 26 10:15:28 CST 2025</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The record ID.</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The primary key of the parent record.</p>
             * 
             * <strong>example:</strong>
             * <p>1123213</p>
             */
            public Builder parentPk(String parentPk) {
                this.parentPk = parentPk;
                return this;
            }

            /**
             * <p>The partner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the bound user.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public BindData build() {
                return new BindData(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppInstanceAggregate} extends {@link TeaModel}
     *
     * <p>AppInstanceAggregate</p>
     */
    public static class PartnerDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindData")
        private BindData bindData;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PartnerDetail(Builder builder) {
            this.bindData = builder.bindData;
            this.partnerId = builder.partnerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartnerDetail create() {
            return builder().build();
        }

        /**
         * @return bindData
         */
        public BindData getBindData() {
            return this.bindData;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private BindData bindData; 
            private String partnerId; 
            private String status; 

            private Builder() {
            } 

            private Builder(PartnerDetail model) {
                this.bindData = model.bindData;
                this.partnerId = model.partnerId;
                this.status = model.status;
            } 

            /**
             * <p>data</p>
             */
            public Builder bindData(BindData bindData) {
                this.bindData = bindData;
                return this;
            }

            /**
             * <p>The partner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * <p>The partner binding status. Valid values: BOUND (bound) and UNBOUND (unbound).</p>
             * 
             * <strong>example:</strong>
             * <p>BOUND</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PartnerDetail build() {
                return new PartnerDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppInstanceAggregate} extends {@link TeaModel}
     *
     * <p>AppInstanceAggregate</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. If you specify this parameter, it cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Group</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. If you specify this parameter, it can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ufo</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}

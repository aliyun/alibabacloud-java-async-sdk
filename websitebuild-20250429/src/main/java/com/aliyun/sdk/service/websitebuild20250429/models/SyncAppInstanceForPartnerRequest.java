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
 * {@link SyncAppInstanceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>SyncAppInstanceForPartnerRequest</p>
 */
public class SyncAppInstanceForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstance")
    private AppInstance appInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceBizId")
    private String sourceBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private SyncAppInstanceForPartnerRequest(Builder builder) {
        super(builder);
        this.appInstance = builder.appInstance;
        this.eventType = builder.eventType;
        this.operator = builder.operator;
        this.sourceBizId = builder.sourceBizId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncAppInstanceForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstance
     */
    public AppInstance getAppInstance() {
        return this.appInstance;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return sourceBizId
     */
    public String getSourceBizId() {
        return this.sourceBizId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<SyncAppInstanceForPartnerRequest, Builder> {
        private AppInstance appInstance; 
        private String eventType; 
        private String operator; 
        private String sourceBizId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(SyncAppInstanceForPartnerRequest request) {
            super(request);
            this.appInstance = request.appInstance;
            this.eventType = request.eventType;
            this.operator = request.operator;
            this.sourceBizId = request.sourceBizId;
            this.sourceType = request.sourceType;
        } 

        /**
         * AppInstance.
         */
        public Builder appInstance(AppInstance appInstance) {
            String appInstanceShrink = shrink(appInstance, "AppInstance", "json");
            this.putQueryParameter("AppInstance", appInstanceShrink);
            this.appInstance = appInstance;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * SourceBizId.
         */
        public Builder sourceBizId(String sourceBizId) {
            this.putQueryParameter("SourceBizId", sourceBizId);
            this.sourceBizId = sourceBizId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public SyncAppInstanceForPartnerRequest build() {
            return new SyncAppInstanceForPartnerRequest(this);
        } 

    } 

    /**
     * 
     * {@link SyncAppInstanceForPartnerRequest} extends {@link TeaModel}
     *
     * <p>SyncAppInstanceForPartnerRequest</p>
     */
    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployArea")
        private String deployArea;

        @com.aliyun.core.annotation.NameInMap("LxInstanceId")
        private String lxInstanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private String siteVersion;

        @com.aliyun.core.annotation.NameInMap("TemplateEtag")
        private String templateEtag;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Profile(Builder builder) {
            this.deployArea = builder.deployArea;
            this.lxInstanceId = builder.lxInstanceId;
            this.orderId = builder.orderId;
            this.siteVersion = builder.siteVersion;
            this.templateEtag = builder.templateEtag;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profile create() {
            return builder().build();
        }

        /**
         * @return deployArea
         */
        public String getDeployArea() {
            return this.deployArea;
        }

        /**
         * @return lxInstanceId
         */
        public String getLxInstanceId() {
            return this.lxInstanceId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return siteVersion
         */
        public String getSiteVersion() {
            return this.siteVersion;
        }

        /**
         * @return templateEtag
         */
        public String getTemplateEtag() {
            return this.templateEtag;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String deployArea; 
            private String lxInstanceId; 
            private String orderId; 
            private String siteVersion; 
            private String templateEtag; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Profile model) {
                this.deployArea = model.deployArea;
                this.lxInstanceId = model.lxInstanceId;
                this.orderId = model.orderId;
                this.siteVersion = model.siteVersion;
                this.templateEtag = model.templateEtag;
                this.templateId = model.templateId;
            } 

            /**
             * DeployArea.
             */
            public Builder deployArea(String deployArea) {
                this.deployArea = deployArea;
                return this;
            }

            /**
             * LxInstanceId.
             */
            public Builder lxInstanceId(String lxInstanceId) {
                this.lxInstanceId = lxInstanceId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * SiteVersion.
             */
            public Builder siteVersion(String siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            /**
             * TemplateEtag.
             */
            public Builder templateEtag(String templateEtag) {
                this.templateEtag = templateEtag;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Profile build() {
                return new Profile(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncAppInstanceForPartnerRequest} extends {@link TeaModel}
     *
     * <p>SyncAppInstanceForPartnerRequest</p>
     */
    public static class AppInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private String deleted;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GmtDelete")
        private String gmtDelete;

        @com.aliyun.core.annotation.NameInMap("GmtPublish")
        private String gmtPublish;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private Profile profile;

        @com.aliyun.core.annotation.NameInMap("SiteHost")
        private String siteHost;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
        private String thumbnailUrl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AppInstance(Builder builder) {
            this.appType = builder.appType;
            this.bizId = builder.bizId;
            this.deleted = builder.deleted;
            this.domain = builder.domain;
            this.endTime = builder.endTime;
            this.gmtDelete = builder.gmtDelete;
            this.gmtPublish = builder.gmtPublish;
            this.iconUrl = builder.iconUrl;
            this.name = builder.name;
            this.profile = builder.profile;
            this.siteHost = builder.siteHost;
            this.slug = builder.slug;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.thumbnailUrl = builder.thumbnailUrl;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstance create() {
            return builder().build();
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
         * @return deleted
         */
        public String getDeleted() {
            return this.deleted;
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
         * @return gmtDelete
         */
        public String getGmtDelete() {
            return this.gmtDelete;
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
        public Profile getProfile() {
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
            private String appType; 
            private String bizId; 
            private String deleted; 
            private String domain; 
            private String endTime; 
            private String gmtDelete; 
            private String gmtPublish; 
            private String iconUrl; 
            private String name; 
            private Profile profile; 
            private String siteHost; 
            private String slug; 
            private String startTime; 
            private String status; 
            private String thumbnailUrl; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AppInstance model) {
                this.appType = model.appType;
                this.bizId = model.bizId;
                this.deleted = model.deleted;
                this.domain = model.domain;
                this.endTime = model.endTime;
                this.gmtDelete = model.gmtDelete;
                this.gmtPublish = model.gmtPublish;
                this.iconUrl = model.iconUrl;
                this.name = model.name;
                this.profile = model.profile;
                this.siteHost = model.siteHost;
                this.slug = model.slug;
                this.startTime = model.startTime;
                this.status = model.status;
                this.thumbnailUrl = model.thumbnailUrl;
                this.userId = model.userId;
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
             * Deleted.
             */
            public Builder deleted(String deleted) {
                this.deleted = deleted;
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
             * GmtDelete.
             */
            public Builder gmtDelete(String gmtDelete) {
                this.gmtDelete = gmtDelete;
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
            public Builder profile(Profile profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>siteId</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx.scd.wezhan.cn</p>
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * <p>123123123131232</p>
             * 
             * <strong>example:</strong>
             * <p>12313213131</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AppInstance build() {
                return new AppInstance(this);
            } 

        } 

    }
}

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
 * {@link AppService} extends {@link TeaModel}
 *
 * <p>AppService</p>
 */
public class AppService extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Integer deleted;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EspBizId")
    private String espBizId;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("InstanceBizId")
    private String instanceBizId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Profile")
    private AppServiceProfile profile;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("ServiceTypeText")
    private String serviceTypeText;

    @com.aliyun.core.annotation.NameInMap("Slug")
    private String slug;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private AppService(Builder builder) {
        this.bizId = builder.bizId;
        this.createTime = builder.createTime;
        this.deleted = builder.deleted;
        this.endTime = builder.endTime;
        this.espBizId = builder.espBizId;
        this.gmtModified = builder.gmtModified;
        this.instanceBizId = builder.instanceBizId;
        this.name = builder.name;
        this.profile = builder.profile;
        this.serviceType = builder.serviceType;
        this.serviceTypeText = builder.serviceTypeText;
        this.slug = builder.slug;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppService create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
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
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return instanceBizId
     */
    public String getInstanceBizId() {
        return this.instanceBizId;
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
    public AppServiceProfile getProfile() {
        return this.profile;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return serviceTypeText
     */
    public String getServiceTypeText() {
        return this.serviceTypeText;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String bizId; 
        private String createTime; 
        private Integer deleted; 
        private String endTime; 
        private String espBizId; 
        private String gmtModified; 
        private String instanceBizId; 
        private String name; 
        private AppServiceProfile profile; 
        private String serviceType; 
        private String serviceTypeText; 
        private String slug; 
        private String startTime; 
        private String status; 
        private String userId; 

        private Builder() {
        } 

        private Builder(AppService model) {
            this.bizId = model.bizId;
            this.createTime = model.createTime;
            this.deleted = model.deleted;
            this.endTime = model.endTime;
            this.espBizId = model.espBizId;
            this.gmtModified = model.gmtModified;
            this.instanceBizId = model.instanceBizId;
            this.name = model.name;
            this.profile = model.profile;
            this.serviceType = model.serviceType;
            this.serviceTypeText = model.serviceTypeText;
            this.slug = model.slug;
            this.startTime = model.startTime;
            this.status = model.status;
            this.userId = model.userId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
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
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * InstanceBizId.
         */
        public Builder instanceBizId(String instanceBizId) {
            this.instanceBizId = instanceBizId;
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
        public Builder profile(AppServiceProfile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * ServiceTypeText.
         */
        public Builder serviceTypeText(String serviceTypeText) {
            this.serviceTypeText = serviceTypeText;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AppService build() {
            return new AppService(this);
        } 

    } 

}

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
 * {@link AppServiceAggregate} extends {@link TeaModel}
 *
 * <p>AppServiceAggregate</p>
 */
public class AppServiceAggregate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Integer deleted;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EspBizId")
    private String espBizId;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("InstanceBizId")
    private String instanceBizId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OperationAddress")
    private AppOperationAddress operationAddress;

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

    private AppServiceAggregate(Builder builder) {
        this.bizId = builder.bizId;
        this.deleted = builder.deleted;
        this.endTime = builder.endTime;
        this.espBizId = builder.espBizId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.instanceBizId = builder.instanceBizId;
        this.name = builder.name;
        this.operationAddress = builder.operationAddress;
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

    public static AppServiceAggregate create() {
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
     * @return operationAddress
     */
    public AppOperationAddress getOperationAddress() {
        return this.operationAddress;
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
        private Integer deleted; 
        private String endTime; 
        private String espBizId; 
        private String gmtCreate; 
        private String gmtModified; 
        private String instanceBizId; 
        private String name; 
        private AppOperationAddress operationAddress; 
        private AppServiceProfile profile; 
        private String serviceType; 
        private String serviceTypeText; 
        private String slug; 
        private String startTime; 
        private String status; 
        private String userId; 

        private Builder() {
        } 

        private Builder(AppServiceAggregate model) {
            this.bizId = model.bizId;
            this.deleted = model.deleted;
            this.endTime = model.endTime;
            this.espBizId = model.espBizId;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.instanceBizId = model.instanceBizId;
            this.name = model.name;
            this.operationAddress = model.operationAddress;
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
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
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
         * OperationAddress.
         */
        public Builder operationAddress(AppOperationAddress operationAddress) {
            this.operationAddress = operationAddress;
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

        public AppServiceAggregate build() {
            return new AppServiceAggregate(this);
        } 

    } 

}

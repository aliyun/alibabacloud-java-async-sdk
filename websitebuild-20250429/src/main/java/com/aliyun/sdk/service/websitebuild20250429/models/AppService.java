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

    @com.aliyun.core.annotation.NameInMap("NodeList")
    private java.util.List<TreeNode> nodeList;

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
        this.nodeList = builder.nodeList;
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
     * @return nodeList
     */
    public java.util.List<TreeNode> getNodeList() {
        return this.nodeList;
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
        private java.util.List<TreeNode> nodeList; 
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
            this.nodeList = model.nodeList;
            this.profile = model.profile;
            this.serviceType = model.serviceType;
            this.serviceTypeText = model.serviceTypeText;
            this.slug = model.slug;
            this.startTime = model.startTime;
            this.status = model.status;
            this.userId = model.userId;
        } 

        /**
         * <p>The business ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20251211153330000001</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The creation time in ISO 8601 format in the UTC time zone (Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-30T02:08:40Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The deletion flag.</p>
         */
        public Builder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>The end time in ISO 8601 format in the UTC time zone (Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-18T02:23:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>esp bizId</p>
         */
        public Builder espBizId(String espBizId) {
            this.espBizId = espBizId;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>Tue Sep 09 10:27:49 CST 2025</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The associated business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250915163734000001</p>
         */
        public Builder instanceBizId(String instanceBizId) {
            this.instanceBizId = instanceBizId;
            return this;
        }

        /**
         * <p>The service name.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The list of flow nodes.</p>
         */
        public Builder nodeList(java.util.List<TreeNode> nodeList) {
            this.nodeList = nodeList;
            return this;
        }

        /**
         * <p>The application service configuration information.</p>
         */
        public Builder profile(AppServiceProfile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>The service type.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSITE_DESIGN</p>
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The service type description.</p>
         */
        public Builder serviceTypeText(String serviceTypeText) {
            this.serviceTypeText = serviceTypeText;
            return this;
        }

        /**
         * <p>The application identifier.</p>
         */
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>The start time as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1754447102000</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The user ID.</p>
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

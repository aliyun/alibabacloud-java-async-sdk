// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link RecoverSiteResponseBody} extends {@link TeaModel}
 *
 * <p>RecoverSiteResponseBody</p>
 */
public class RecoverSiteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.NameInMap("CnameZone")
    private String cnameZone;

    @com.aliyun.core.annotation.NameInMap("Coverage")
    private String coverage;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("NameServerList")
    private String nameServerList;

    @com.aliyun.core.annotation.NameInMap("OfflineReason")
    private String offlineReason;

    @com.aliyun.core.annotation.NameInMap("PlanName")
    private String planName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    private RecoverSiteResponseBody(Builder builder) {
        this.accessType = builder.accessType;
        this.cnameZone = builder.cnameZone;
        this.coverage = builder.coverage;
        this.createTime = builder.createTime;
        this.instanceId = builder.instanceId;
        this.nameServerList = builder.nameServerList;
        this.offlineReason = builder.offlineReason;
        this.planName = builder.planName;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverSiteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return cnameZone
     */
    public String getCnameZone() {
        return this.cnameZone;
    }

    /**
     * @return coverage
     */
    public String getCoverage() {
        return this.coverage;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nameServerList
     */
    public String getNameServerList() {
        return this.nameServerList;
    }

    /**
     * @return offlineReason
     */
    public String getOfflineReason() {
        return this.offlineReason;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder {
        private String accessType; 
        private String cnameZone; 
        private String coverage; 
        private String createTime; 
        private String instanceId; 
        private String nameServerList; 
        private String offlineReason; 
        private String planName; 
        private String requestId; 
        private String resourceGroupId; 
        private Long siteId; 
        private String siteName; 
        private String status; 
        private String updateTime; 
        private String verifyCode; 

        private Builder() {
        } 

        private Builder(RecoverSiteResponseBody model) {
            this.accessType = model.accessType;
            this.cnameZone = model.cnameZone;
            this.coverage = model.coverage;
            this.createTime = model.createTime;
            this.instanceId = model.instanceId;
            this.nameServerList = model.nameServerList;
            this.offlineReason = model.offlineReason;
            this.planName = model.planName;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.siteId = model.siteId;
            this.siteName = model.siteName;
            this.status = model.status;
            this.updateTime = model.updateTime;
            this.verifyCode = model.verifyCode;
        } 

        /**
         * AccessType.
         */
        public Builder accessType(String accessType) {
            this.accessType = accessType;
            return this;
        }

        /**
         * CnameZone.
         */
        public Builder cnameZone(String cnameZone) {
            this.cnameZone = cnameZone;
            return this;
        }

        /**
         * Coverage.
         */
        public Builder coverage(String coverage) {
            this.coverage = coverage;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NameServerList.
         */
        public Builder nameServerList(String nameServerList) {
            this.nameServerList = nameServerList;
            return this;
        }

        /**
         * OfflineReason.
         */
        public Builder offlineReason(String offlineReason) {
            this.offlineReason = offlineReason;
            return this;
        }

        /**
         * PlanName.
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteName.
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
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
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * VerifyCode.
         */
        public Builder verifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }

        public RecoverSiteResponseBody build() {
            return new RecoverSiteResponseBody(this);
        } 

    } 

}

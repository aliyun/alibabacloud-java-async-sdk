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
         * <p>The access type. Valid values:</p>
         * <ul>
         * <li><p><strong>NS</strong>: access through NS hosting.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: access through CNAME.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NS</p>
         */
        public Builder accessType(String accessType) {
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>The CNAME suffix of the site. For sites that are accessed through CNAME, this field indicates the CNAME suffix that needs to be configured for records.</p>
         * 
         * <strong>example:</strong>
         * <p>gf-test.hkrt.cn</p>
         */
        public Builder cnameZone(String cnameZone) {
            this.cnameZone = cnameZone;
            return this;
        }

        /**
         * <p>The acceleration region of the site. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: the Chinese mainland only.</li>
         * <li><strong>global</strong>: global.</li>
         * <li><strong>overseas</strong>: global (excluding the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder coverage(String coverage) {
            this.coverage = coverage;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-11T01:23:21Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The plan instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-9vjienwn****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of name servers assigned to the site, separated by commas (,). When the site uses NS access, this field contains values. You need to change the DNS servers of the site to these name servers. Then you can verify the site ownership and activate the site.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1.example.com,ns2.example.com</p>
         */
        public Builder nameServerList(String nameServerList) {
            this.nameServerList = nameServerList;
            return this;
        }

        /**
         * <p>The reason why the site was deactivated. Valid values:</p>
         * <ul>
         * <li><strong>expiration_arrears</strong>: The subscription plan expired or the account has an overdue payment.</li>
         * <li><strong>internally_disabled</strong>: The site was disabled by the system.</li>
         * <li><strong>missing_icp</strong>: The domain name does not have an ICP filing.</li>
         * <li><strong>content_violation</strong>: Content violation.</li>
         * <li><strong>proactively_disabled</strong>: You proactively disabled the site or the site was disabled because the usage cap you configured was reached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>expiration_ arrears</p>
         */
        public Builder offlineReason(String offlineReason) {
            this.offlineReason = offlineReason;
            return this;
        }

        /**
         * <p>The plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-axxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        /**
         * <p>The site status. Valid values:</p>
         * <ul>
         * <li><strong>pending</strong>: The site is pending configuration.</li>
         * <li><strong>active</strong>: The site is activated.</li>
         * <li><strong>offline</strong>: The site is offline.</li>
         * <li><strong>moved</strong>: The site has been replaced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-13T02:13:28Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The site ownership verification code. When the site is accessed through CNAME, this is the TXT verification code that needs to be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
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

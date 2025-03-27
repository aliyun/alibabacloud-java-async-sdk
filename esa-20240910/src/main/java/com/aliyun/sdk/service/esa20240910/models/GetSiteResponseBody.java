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
 * {@link GetSiteResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteResponseBody</p>
 */
public class GetSiteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteModel")
    private SiteModel siteModel;

    private GetSiteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.siteModel = builder.siteModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteModel
     */
    public SiteModel getSiteModel() {
        return this.siteModel;
    }

    public static final class Builder {
        private String requestId; 
        private SiteModel siteModel; 

        private Builder() {
        } 

        private Builder(GetSiteResponseBody model) {
            this.requestId = model.requestId;
            this.siteModel = model.siteModel;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried website information.</p>
         */
        public Builder siteModel(SiteModel siteModel) {
            this.siteModel = siteModel;
            return this;
        }

        public GetSiteResponseBody build() {
            return new GetSiteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSiteResponseBody} extends {@link TeaModel}
     *
     * <p>GetSiteResponseBody</p>
     */
    public static class SiteModel extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("PlanSpecName")
        private String planSpecName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VanityNSList")
        private java.util.Map<String, String> vanityNSList;

        @com.aliyun.core.annotation.NameInMap("VerifyCode")
        private String verifyCode;

        @com.aliyun.core.annotation.NameInMap("VersionManagement")
        private Boolean versionManagement;

        private SiteModel(Builder builder) {
            this.accessType = builder.accessType;
            this.cnameZone = builder.cnameZone;
            this.coverage = builder.coverage;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.nameServerList = builder.nameServerList;
            this.offlineReason = builder.offlineReason;
            this.planName = builder.planName;
            this.planSpecName = builder.planSpecName;
            this.resourceGroupId = builder.resourceGroupId;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
            this.vanityNSList = builder.vanityNSList;
            this.verifyCode = builder.verifyCode;
            this.versionManagement = builder.versionManagement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteModel create() {
            return builder().build();
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
         * @return planSpecName
         */
        public String getPlanSpecName() {
            return this.planSpecName;
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
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vanityNSList
         */
        public java.util.Map<String, String> getVanityNSList() {
            return this.vanityNSList;
        }

        /**
         * @return verifyCode
         */
        public String getVerifyCode() {
            return this.verifyCode;
        }

        /**
         * @return versionManagement
         */
        public Boolean getVersionManagement() {
            return this.versionManagement;
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
            private String planSpecName; 
            private String resourceGroupId; 
            private Long siteId; 
            private String siteName; 
            private String status; 
            private java.util.Map<String, ?> tags; 
            private String updateTime; 
            private java.util.Map<String, String> vanityNSList; 
            private String verifyCode; 
            private Boolean versionManagement; 

            private Builder() {
            } 

            private Builder(SiteModel model) {
                this.accessType = model.accessType;
                this.cnameZone = model.cnameZone;
                this.coverage = model.coverage;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.nameServerList = model.nameServerList;
                this.offlineReason = model.offlineReason;
                this.planName = model.planName;
                this.planSpecName = model.planSpecName;
                this.resourceGroupId = model.resourceGroupId;
                this.siteId = model.siteId;
                this.siteName = model.siteName;
                this.status = model.status;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
                this.vanityNSList = model.vanityNSList;
                this.verifyCode = model.verifyCode;
                this.versionManagement = model.versionManagement;
            } 

            /**
             * <p>The DNS setup option for the website. Valid values:</p>
             * <ul>
             * <li><strong>NS</strong></li>
             * <li><strong>CNAME</strong></li>
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
             * <p>The CNAME of the website domain. If you use CNAME setup when you add your website to ESA, the value is the CNAME that you configured then.</p>
             * 
             * <strong>example:</strong>
             * <p>example.cname.com</p>
             */
            public Builder cnameZone(String cnameZone) {
                this.cnameZone = cnameZone;
                return this;
            }

            /**
             * <p>The service location. Valid values:</p>
             * <ul>
             * <li><strong>domestic</strong>: the Chinese mainland.</li>
             * <li><strong>global</strong>: global.</li>
             * <li><strong>overseas</strong>: outside the Chinese mainland.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The time when the WEBsite was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cas-merge-q6h0bv</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The nameservers assigned to the website domain. They are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>male1-1.ialicdn.com,female1-1.ialicdn.com</p>
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
             * <p>The plan name.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-168777532****</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The specification of the plan associated with the website.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder planSpecName(String planSpecName) {
                this.planSpecName = planSpecName;
                return this;
            }

            /**
             * <p>The ID of your Alibaba Cloud resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek26g6i6se****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>The website status. Valid values:</p>
             * <ul>
             * <li><strong>pending</strong>: The website is to be configured.</li>
             * <li><strong>active</strong>: The website is active.</li>
             * <li><strong>offline</strong>: The website is suspended.</li>
             * <li><strong>moved</strong>: The website has been added and verified by another Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the website.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;tag1&quot;:&quot;value1&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the WEBsite was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The information about custom nameservers of the website domain. The key is a custom nameserver name, and the value is the IP address of the custom nameserver. Multiple IP addresses are separated by commas (,).</p>
             */
            public Builder vanityNSList(java.util.Map<String, String> vanityNSList) {
                this.vanityNSList = vanityNSList;
                return this;
            }

            /**
             * <p>The code that is used to verify the website domain ownership. As part of the verification TXT record, this parameter is returned for websites that use CNAME setup.</p>
             * 
             * <strong>example:</strong>
             * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            /**
             * <p>The status of version management. If true is returned, version management is enabled for the website.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder versionManagement(Boolean versionManagement) {
                this.versionManagement = versionManagement;
                return this;
            }

            public SiteModel build() {
                return new SiteModel(this);
            } 

        } 

    }
}

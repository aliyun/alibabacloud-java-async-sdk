// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteModel.
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
        private java.util.Map < String, ? > tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VanityNSList")
        private java.util.Map < String, String > vanityNSList;

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
        public java.util.Map < String, ? > getTags() {
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
        public java.util.Map < String, String > getVanityNSList() {
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
            private String planName; 
            private String planSpecName; 
            private String resourceGroupId; 
            private Long siteId; 
            private String siteName; 
            private String status; 
            private java.util.Map < String, ? > tags; 
            private String updateTime; 
            private java.util.Map < String, String > vanityNSList; 
            private String verifyCode; 
            private Boolean versionManagement; 

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
             * PlanName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * PlanSpecName.
             */
            public Builder planSpecName(String planSpecName) {
                this.planSpecName = planSpecName;
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
             * Tags.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
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
             * VanityNSList.
             */
            public Builder vanityNSList(java.util.Map < String, String > vanityNSList) {
                this.vanityNSList = vanityNSList;
                return this;
            }

            /**
             * VerifyCode.
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            /**
             * VersionManagement.
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

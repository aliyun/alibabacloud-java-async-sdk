// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckResultResponseBody</p>
 */
public class ListCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Checks")
    private java.util.List < Checks> checks;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCheckResultResponseBody(Builder builder) {
        this.checks = builder.checks;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return checks
     */
    public java.util.List < Checks> getChecks() {
        return this.checks;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Checks> checks; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The information about the check items.
         */
        public Builder checks(java.util.List < Checks> checks) {
            this.checks = checks;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckResultResponseBody build() {
            return new ListCheckResultResponseBody(this);
        } 

    } 

    public static class CheckPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequirementId")
        private Long requirementId;

        @com.aliyun.core.annotation.NameInMap("RequirementShowName")
        private String requirementShowName;

        @com.aliyun.core.annotation.NameInMap("SectionId")
        private Long sectionId;

        @com.aliyun.core.annotation.NameInMap("SectionShowName")
        private String sectionShowName;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("StandardShowName")
        private String standardShowName;

        private CheckPolicies(Builder builder) {
            this.requirementId = builder.requirementId;
            this.requirementShowName = builder.requirementShowName;
            this.sectionId = builder.sectionId;
            this.sectionShowName = builder.sectionShowName;
            this.standardId = builder.standardId;
            this.standardShowName = builder.standardShowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckPolicies create() {
            return builder().build();
        }

        /**
         * @return requirementId
         */
        public Long getRequirementId() {
            return this.requirementId;
        }

        /**
         * @return requirementShowName
         */
        public String getRequirementShowName() {
            return this.requirementShowName;
        }

        /**
         * @return sectionId
         */
        public Long getSectionId() {
            return this.sectionId;
        }

        /**
         * @return sectionShowName
         */
        public String getSectionShowName() {
            return this.sectionShowName;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        /**
         * @return standardShowName
         */
        public String getStandardShowName() {
            return this.standardShowName;
        }

        public static final class Builder {
            private Long requirementId; 
            private String requirementShowName; 
            private Long sectionId; 
            private String sectionShowName; 
            private Long standardId; 
            private String standardShowName; 

            /**
             * The ID of the requirement item for the check item.
             */
            public Builder requirementId(Long requirementId) {
                this.requirementId = requirementId;
                return this;
            }

            /**
             * The display name of the requirement item for the check item.
             */
            public Builder requirementShowName(String requirementShowName) {
                this.requirementShowName = requirementShowName;
                return this;
            }

            /**
             * The ID of the section for the check item.
             */
            public Builder sectionId(Long sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            /**
             * The display name of the section for the check item.
             */
            public Builder sectionShowName(String sectionShowName) {
                this.sectionShowName = sectionShowName;
                return this;
            }

            /**
             * The standard ID of the check item.
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * The standard display name of the check item.
             */
            public Builder standardShowName(String standardShowName) {
                this.standardShowName = standardShowName;
                return this;
            }

            public CheckPolicies build() {
                return new CheckPolicies(this);
            } 

        } 

    }
    public static class Checks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("AssetVendor")
        private Integer assetVendor;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckPolicies")
        private java.util.List < CheckPolicies> checkPolicies;

        @com.aliyun.core.annotation.NameInMap("CheckSaleType")
        private Integer checkSaleType;

        @com.aliyun.core.annotation.NameInMap("CheckShowName")
        private String checkShowName;

        @com.aliyun.core.annotation.NameInMap("InstanceSubType")
        private String instanceSubType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private Long lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TrialPermission")
        private Boolean trialPermission;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("VendorShowName")
        private String vendorShowName;

        private Checks(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.assetVendor = builder.assetVendor;
            this.checkId = builder.checkId;
            this.checkPolicies = builder.checkPolicies;
            this.checkSaleType = builder.checkSaleType;
            this.checkShowName = builder.checkShowName;
            this.instanceSubType = builder.instanceSubType;
            this.instanceType = builder.instanceType;
            this.lastCheckTime = builder.lastCheckTime;
            this.riskLevel = builder.riskLevel;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.taskId = builder.taskId;
            this.trialPermission = builder.trialPermission;
            this.vendor = builder.vendor;
            this.vendorShowName = builder.vendorShowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checks create() {
            return builder().build();
        }

        /**
         * @return assetSubType
         */
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return assetVendor
         */
        public Integer getAssetVendor() {
            return this.assetVendor;
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkPolicies
         */
        public java.util.List < CheckPolicies> getCheckPolicies() {
            return this.checkPolicies;
        }

        /**
         * @return checkSaleType
         */
        public Integer getCheckSaleType() {
            return this.checkSaleType;
        }

        /**
         * @return checkShowName
         */
        public String getCheckShowName() {
            return this.checkShowName;
        }

        /**
         * @return instanceSubType
         */
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lastCheckTime
         */
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return trialPermission
         */
        public Boolean getTrialPermission() {
            return this.trialPermission;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorShowName
         */
        public String getVendorShowName() {
            return this.vendorShowName;
        }

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 
            private Integer assetVendor; 
            private Long checkId; 
            private java.util.List < CheckPolicies> checkPolicies; 
            private Integer checkSaleType; 
            private String checkShowName; 
            private String instanceSubType; 
            private String instanceType; 
            private Long lastCheckTime; 
            private String riskLevel; 
            private String status; 
            private String statusMessage; 
            private String taskId; 
            private Boolean trialPermission; 
            private String vendor; 
            private String vendorShowName; 

            /**
             * AssetSubType.
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * AssetType.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * AssetVendor.
             */
            public Builder assetVendor(Integer assetVendor) {
                this.assetVendor = assetVendor;
                return this;
            }

            /**
             * The ID of the check item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The check policies.
             */
            public Builder checkPolicies(java.util.List < CheckPolicies> checkPolicies) {
                this.checkPolicies = checkPolicies;
                return this;
            }

            /**
             * The type of the check item. Valid values:
             * <p>
             * 
             * *   **0**: paid
             * *   **1**: free
             */
            public Builder checkSaleType(Integer checkSaleType) {
                this.checkSaleType = checkSaleType;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder checkShowName(String checkShowName) {
                this.checkShowName = checkShowName;
                return this;
            }

            /**
             * The asset subtype of the cloud service. Valid values:
             * <p>
             * 
             * *   If the **InstanceType** parameter is set to **ECS**, this parameter supports the following valid values:
             * 
             *     *   **INSTANCE**
             *     *   **DISK**
             *     *   **SECURITY_GROUP**
             * 
             * *   If the **InstanceType** parameter is set to **ACR**, this parameter supports the following valid values:
             * 
             *     *   **REPOSITORY_ENTERPRISE**
             *     *   **REPOSITORY_PERSON**
             * 
             * *   If the **InstanceType** parameter is set to **RAM**, this parameter supports the following valid values:
             * 
             *     *   **ALIAS**
             *     *   **USER**
             *     *   **POLICY**
             *     *   **GROUP**
             * 
             * *   If the **InstanceType** parameter is set to **WAF**, this parameter supports the following valid values:
             * 
             *     *   **DOMAIN**
             * 
             * *   If the **InstanceType** parameter is set to other values, this parameter supports the following valid values:
             * 
             *     *   **INSTANCE**
             */
            public Builder instanceSubType(String instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * The asset type of the cloud service. Valid values:
             * <p>
             * 
             * *   **ECS**: ECS
             * *   **SLB**: SLB
             * *   **RDS**: ApsaraDB RDS
             * *   **MONGODB**: MongoDB
             * *   **KVSTORE**: Redis
             * *   **ACR**: Container Registry
             * *   **CSK**: ACK
             * *   **VPC**: VPC
             * *   **ACTIONTRAIL**: ActionTrail
             * *   **CDN**: CDN
             * *   **CAS**: Certificate Management Service (formerly SSL Certificates Service)
             * *   **RDC**: Apsara Devops
             * *   **RAM**: RAM
             * *   **DDOS**: Anti-DDoS
             * *   **WAF**: WAF
             * *   **OSS**: OSS
             * *   **POLARDB**: PolarDB
             * *   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL
             * *   **MSE**: MSE
             * *   **NAS**: NAS
             * *   **SDDP**: SDDP
             * *   **EIP**: EIP
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The timestamp when the last check was performed. Unit: milliseconds.
             */
            public Builder lastCheckTime(Long lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * The risk level of the check item. Valid values:
             * <p>
             * 
             * *   **HIGH**
             * *   **MEDIUM**
             * *   **LOW**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The status of the check item. Valid values:
             * <p>
             * 
             * *   **PASS**: passed
             * *   **NOT_PASS**: failed
             * *   **CHECKING**: being checked
             * *   **NOT_CHECK**: not checked
             * *   **WHITELIST**: added to the whitelist
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The message returned if the status of the check item is abnormal.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The ID of the check task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Indicates whether the TRIAL permission is required.
             */
            public Builder trialPermission(Boolean trialPermission) {
                this.trialPermission = trialPermission;
                return this;
            }

            /**
             * The cloud service provider.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * The name of the cloud service provider.
             */
            public Builder vendorShowName(String vendorShowName) {
                this.vendorShowName = vendorShowName;
                return this;
            }

            public Checks build() {
                return new Checks(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}

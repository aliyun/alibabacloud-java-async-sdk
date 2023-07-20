// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckResultResponseBody</p>
 */
public class ListCheckResultResponseBody extends TeaModel {
    @NameInMap("Checks")
    private java.util.List < Checks> checks;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * The check items.
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
        @NameInMap("RequirementId")
        private Long requirementId;

        @NameInMap("RequirementShowName")
        private String requirementShowName;

        @NameInMap("SectionId")
        private Long sectionId;

        @NameInMap("SectionShowName")
        private String sectionShowName;

        @NameInMap("StandardId")
        private Long standardId;

        @NameInMap("StandardShowName")
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
             * The requirement item ID of the check item.
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
             * The section ID of the check item.
             */
            public Builder sectionId(Long sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            /**
             * The section display name of the check item.
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
        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("CheckPolicies")
        private java.util.List < CheckPolicies> checkPolicies;

        @NameInMap("CheckShowName")
        private String checkShowName;

        @NameInMap("InstanceSubType")
        private String instanceSubType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("LastCheckTime")
        private Long lastCheckTime;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TrialPermission")
        private Boolean trialPermission;

        @NameInMap("Vendor")
        private String vendor;

        @NameInMap("VendorShowName")
        private String vendorShowName;

        private Checks(Builder builder) {
            this.checkId = builder.checkId;
            this.checkPolicies = builder.checkPolicies;
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
            private Long checkId; 
            private java.util.List < CheckPolicies> checkPolicies; 
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
             * *   If **InstanceType** is set to **ECS**, this parameter supports the following valid values:
             * 
             *     *   **INSTANCE**
             *     *   **DISK**
             *     *   **SECURITY_GROUP**
             * 
             * *   If **InstanceType** is set to **ACR**, this parameter supports the following valid values:
             * 
             *     *   **REPOSITORY_ENTERPRISE**
             *     *   **REPOSITORY_PERSON**
             * 
             * *   If **InstanceType** is set to **RAM**, this parameter supports the following valid values:
             * 
             *     *   **ALIAS**
             *     *   **USER**
             *     *   **POLICY**
             *     *   **GROUP**
             * 
             * *   If **InstanceType** is set to **WAF**, this parameter supports the following valid values:
             * 
             *     *   **DOMAIN**
             * 
             * *   If **InstanceType** is set to other values, this parameter supports the following valid values:
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
             * *   **PASS**
             * *   **NOT_PASS**
             * *   **CHECKING**
             * *   **NOT_CHECK**
             * *   **WHITELIST**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusMessage.
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
             * The value of the cloud service provider.
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
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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

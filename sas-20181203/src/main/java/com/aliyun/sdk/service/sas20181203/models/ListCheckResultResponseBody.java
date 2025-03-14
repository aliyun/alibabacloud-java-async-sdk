// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckResultResponseBody</p>
 */
public class ListCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Checks")
    private java.util.List<Checks> checks;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checks
     */
    public java.util.List<Checks> getChecks() {
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
        private java.util.List<Checks> checks; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCheckResultResponseBody model) {
            this.checks = model.checks;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The check items.</p>
         */
        public Builder checks(java.util.List<Checks> checks) {
            this.checks = checks;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F9B6DD67-B289-5406-B35C-B0F4A217S23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckResultResponseBody build() {
            return new ListCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CheckPolicies model) {
                this.requirementId = model.requirementId;
                this.requirementShowName = model.requirementShowName;
                this.sectionId = model.sectionId;
                this.sectionShowName = model.sectionShowName;
                this.standardId = model.standardId;
                this.standardShowName = model.standardShowName;
            } 

            /**
             * <p>The ID of the requirement item for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requirementId(Long requirementId) {
                this.requirementId = requirementId;
                return this;
            }

            /**
             * <p>The display name of the requirement item for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba cloud OSS best security practices</p>
             */
            public Builder requirementShowName(String requirementShowName) {
                this.requirementShowName = requirementShowName;
                return this;
            }

            /**
             * <p>The ID of the section for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sectionId(Long sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            /**
             * <p>The display name of the section for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Log Audit</p>
             */
            public Builder sectionShowName(String sectionShowName) {
                this.sectionShowName = sectionShowName;
                return this;
            }

            /**
             * <p>The standard ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * <p>The standard display name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Best security practices</p>
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
    /**
     * 
     * {@link ListCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckResultResponseBody</p>
     */
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
        private java.util.List<CheckPolicies> checkPolicies;

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

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

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

        @com.aliyun.core.annotation.NameInMap("TrialPermissionType")
        private Integer trialPermissionType;

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
            this.operationType = builder.operationType;
            this.riskLevel = builder.riskLevel;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.taskId = builder.taskId;
            this.trialPermission = builder.trialPermission;
            this.trialPermissionType = builder.trialPermissionType;
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
        public java.util.List<CheckPolicies> getCheckPolicies() {
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
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
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
         * @return trialPermissionType
         */
        public Integer getTrialPermissionType() {
            return this.trialPermissionType;
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
            private java.util.List<CheckPolicies> checkPolicies; 
            private Integer checkSaleType; 
            private String checkShowName; 
            private String instanceSubType; 
            private String instanceType; 
            private Long lastCheckTime; 
            private String operationType; 
            private String riskLevel; 
            private String status; 
            private String statusMessage; 
            private String taskId; 
            private Boolean trialPermission; 
            private Integer trialPermissionType; 
            private String vendor; 
            private String vendorShowName; 

            private Builder() {
            } 

            private Builder(Checks model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.assetVendor = model.assetVendor;
                this.checkId = model.checkId;
                this.checkPolicies = model.checkPolicies;
                this.checkSaleType = model.checkSaleType;
                this.checkShowName = model.checkShowName;
                this.instanceSubType = model.instanceSubType;
                this.instanceType = model.instanceType;
                this.lastCheckTime = model.lastCheckTime;
                this.operationType = model.operationType;
                this.riskLevel = model.riskLevel;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
                this.taskId = model.taskId;
                this.trialPermission = model.trialPermission;
                this.trialPermissionType = model.trialPermissionType;
                this.vendor = model.vendor;
                this.vendorShowName = model.vendorShowName;
            } 

            /**
             * <p>The subtype of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an ECS instance</li>
             * <li><strong>1</strong>: a SLB instance</li>
             * <li><strong>2</strong>: a NAT gateway</li>
             * <li><strong>3</strong>: an ApsaraDB RDS instance</li>
             * <li><strong>4</strong>: an ApsaraDB for MongoDB instance</li>
             * <li><strong>5</strong>: an ApsaraDB for Redis instance</li>
             * <li><strong>6</strong>: a container image</li>
             * <li><strong>7</strong>: a container</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The service provider of the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba Cloud</li>
             * <li><strong>3</strong>: Huawei Cloud</li>
             * <li><strong>4</strong>: Microsoft Azure</li>
             * <li><strong>5</strong>: AWS</li>
             * <li><strong>7</strong>: Tencent Cloud</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder assetVendor(Integer assetVendor) {
                this.assetVendor = assetVendor;
                return this;
            }

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The check policies.</p>
             */
            public Builder checkPolicies(java.util.List<CheckPolicies> checkPolicies) {
                this.checkPolicies = checkPolicies;
                return this;
            }

            /**
             * <p>The type of the check item. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: paid</li>
             * <li><strong>1</strong>: free</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkSaleType(Integer checkSaleType) {
                this.checkSaleType = checkSaleType;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS-PublicReadOpenManifestFileWithoutEncryption</p>
             */
            public Builder checkShowName(String checkShowName) {
                this.checkShowName = checkShowName;
                return this;
            }

            /**
             * <p>The asset subtype of the cloud service. Valid values:</p>
             * <ul>
             * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>ECS</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong></li>
             * <li><strong>DISK</strong></li>
             * <li><strong>SECURITY_GROUP</strong></li>
             * </ul>
             * </li>
             * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>ACR</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>REPOSITORY_ENTERPRISE</strong></li>
             * <li><strong>REPOSITORY_PERSON</strong></li>
             * </ul>
             * </li>
             * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>RAM</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>ALIAS</strong></li>
             * <li><strong>USER</strong></li>
             * <li><strong>POLICY</strong></li>
             * <li><strong>GROUP</strong></li>
             * </ul>
             * </li>
             * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>WAF</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>DOMAIN</strong></li>
             * </ul>
             * </li>
             * <li><p>If the <strong>InstanceType</strong> parameter is set to other values, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISK</p>
             */
            public Builder instanceSubType(String instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * <p>The asset type of the cloud service. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong>: ECS</li>
             * <li><strong>SLB</strong>: SLB</li>
             * <li><strong>RDS</strong>: ApsaraDB RDS</li>
             * <li><strong>MONGODB</strong>: MongoDB</li>
             * <li><strong>KVSTORE</strong>: Redis</li>
             * <li><strong>ACR</strong>: Container Registry</li>
             * <li><strong>CSK</strong>: ACK</li>
             * <li><strong>VPC</strong>: VPC</li>
             * <li><strong>ACTIONTRAIL</strong>: ActionTrail</li>
             * <li><strong>CDN</strong>: CDN</li>
             * <li><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
             * <li><strong>RDC</strong>: Apsara Devops</li>
             * <li><strong>RAM</strong>: RAM</li>
             * <li><strong>DDOS</strong>: Anti-DDoS</li>
             * <li><strong>WAF</strong>: WAF</li>
             * <li><strong>OSS</strong>: OSS</li>
             * <li><strong>POLARDB</strong>: PolarDB</li>
             * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL</li>
             * <li><strong>MSE</strong>: MSE</li>
             * <li><strong>NAS</strong>: NAS</li>
             * <li><strong>SDDP</strong>: SDDP</li>
             * <li><strong>EIP</strong>: EIP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1657793398000</p>
             */
            public Builder lastCheckTime(Long lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>Indicates whether fixing is supported. Valid values:</p>
             * <ul>
             * <li><strong>SUPPORT_REPAIR</strong></li>
             * <li><strong>NOT_SUPPORT_REPAIR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NOT_SUPPORT_REPAIR</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The risk level of the check item. Valid values:</p>
             * <ul>
             * <li><strong>HIGH</strong></li>
             * <li><strong>MEDIUM</strong></li>
             * <li><strong>LOW</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values:</p>
             * <ul>
             * <li><strong>PASS</strong>: passed</li>
             * <li><strong>NOT_PASS</strong>: failed</li>
             * <li><strong>CHECKING</strong>: being checked</li>
             * <li><strong>NOT_CHECK</strong>: not checked</li>
             * <li><strong>WHITELIST</strong>: added to the whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The message returned if the status of the check item is abnormal.</p>
             * 
             * <strong>example:</strong>
             * <p>TIMEOUT</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The ID of the check task.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Indicates whether the TRIAL permission is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder trialPermission(Boolean trialPermission) {
                this.trialPermission = trialPermission;
                return this;
            }

            /**
             * <p>Check whether the data delivery period for ActionTrail is enabled for more than 30 days to establish a baseline of behaviour.</p>
             * <ul>
             * <li><strong>0</strong>: REQUIRED</li>
             * <li><strong>1</strong>: NOT REQUIRED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trialPermissionType(Integer trialPermissionType) {
                this.trialPermissionType = trialPermissionType;
                return this;
            }

            /**
             * <p>The cloud service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The name of the cloud service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
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
    /**
     * 
     * {@link ListCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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

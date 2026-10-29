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
 * {@link ListClusterCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterCheckResultResponseBody</p>
 */
public class ListClusterCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Checks")
    private java.util.List<Checks> checks;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterCheckResultResponseBody(Builder builder) {
        this.checks = builder.checks;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterCheckResultResponseBody create() {
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

        private Builder(ListClusterCheckResultResponseBody model) {
            this.checks = model.checks;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The check result information.</p>
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
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterCheckResultResponseBody build() {
            return new ListClusterCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterCheckResultResponseBody</p>
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
             * <p>The ID of the regulation for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder requirementId(Long requirementId) {
                this.requirementId = requirementId;
                return this;
            }

            /**
             * <p>The display name of the regulation for the check item.</p>
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
             * <p>The ID of the standard for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * <p>The display name of the standard for the check item.</p>
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
     * {@link ListClusterCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterCheckResultResponseBody</p>
     */
    public static class Checks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckPolicies")
        private java.util.List<CheckPolicies> checkPolicies;

        @com.aliyun.core.annotation.NameInMap("CheckShowName")
        private String checkShowName;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private String checkType;

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

        @com.aliyun.core.annotation.NameInMap("TrialPermission")
        private Boolean trialPermission;

        @com.aliyun.core.annotation.NameInMap("TrialPermissionType")
        private Integer trialPermissionType;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private Checks(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.checkId = builder.checkId;
            this.checkPolicies = builder.checkPolicies;
            this.checkShowName = builder.checkShowName;
            this.checkType = builder.checkType;
            this.instanceSubType = builder.instanceSubType;
            this.instanceType = builder.instanceType;
            this.lastCheckTime = builder.lastCheckTime;
            this.riskLevel = builder.riskLevel;
            this.status = builder.status;
            this.trialPermission = builder.trialPermission;
            this.trialPermissionType = builder.trialPermissionType;
            this.vendor = builder.vendor;
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
         * @return checkShowName
         */
        public String getCheckShowName() {
            return this.checkShowName;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
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

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 
            private Long checkId; 
            private java.util.List<CheckPolicies> checkPolicies; 
            private String checkShowName; 
            private String checkType; 
            private String instanceSubType; 
            private String instanceType; 
            private Long lastCheckTime; 
            private String riskLevel; 
            private String status; 
            private Boolean trialPermission; 
            private Integer trialPermissionType; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(Checks model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.checkId = model.checkId;
                this.checkPolicies = model.checkPolicies;
                this.checkShowName = model.checkShowName;
                this.checkType = model.checkType;
                this.instanceSubType = model.instanceSubType;
                this.instanceType = model.instanceType;
                this.lastCheckTime = model.lastCheckTime;
                this.riskLevel = model.riskLevel;
                this.status = model.status;
                this.trialPermission = model.trialPermission;
                this.trialPermissionType = model.trialPermissionType;
                this.vendor = model.vendor;
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
             * <p>The asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
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
             * <p>The standards, regulations, and sections associated with the check result.</p>
             */
            public Builder checkPolicies(java.util.List<CheckPolicies> checkPolicies) {
                this.checkPolicies = checkPolicies;
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
             * <p>The source type of the Threat Detection Service check item. Valid values:</p>
             * <ul>
             * <li><strong>CUSTOM</strong>: Custom.</li>
             * <li><strong>SYSTEM</strong>: Predefined by the Threat Detection Service platform.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The asset subtype of the cloud service. Valid values:</p>
             * <ul>
             * <li>If <strong>InstanceType</strong> is set to <strong>ECS</strong>, valid values are:<ul>
             * <li><strong>INSTANCE</strong></li>
             * <li><strong>DISK</strong></li>
             * <li><strong>SECURITY_GROUP</strong></li>
             * </ul>
             * </li>
             * <li>If <strong>InstanceType</strong> is set to <strong>ACR</strong>, valid values are:<ul>
             * <li><strong>REPOSITORY_ENTERPRISE</strong></li>
             * <li><strong>REPOSITORY_PERSON</strong></li>
             * </ul>
             * </li>
             * <li>If <strong>InstanceType</strong> is set to <strong>RAM</strong>, valid values are:<ul>
             * <li><strong>ALIAS</strong></li>
             * <li><strong>USER</strong></li>
             * <li><strong>POLICY</strong></li>
             * <li><strong>GROUP</strong></li>
             * </ul>
             * </li>
             * <li>If <strong>InstanceType</strong> is set to <strong>WAF</strong>, valid values are:<ul>
             * <li><strong>DOMAIN</strong></li>
             * </ul>
             * </li>
             * <li>If <strong>InstanceType</strong> is set to other values, valid values are:<ul>
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
             * <p>The asset type of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Workload</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The timestamp of the latest check. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1657793398000</p>
             */
            public Builder lastCheckTime(Long lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>The risk level of the check item. Valid values:</p>
             * <ul>
             * <li><strong>HIGH</strong>: High.</li>
             * <li><strong>MEDIUM</strong>: Medium.</li>
             * <li><strong>LOW</strong>: Low.</li>
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
             * <li><strong>PASS</strong>: Passed.</li>
             * <li><strong>NOT_PASS</strong>: Failed.</li>
             * <li><strong>CHECKING</strong>: Checking.</li>
             * <li><strong>NOT_CHECK</strong>: Not checked.</li>
             * <li><strong>WHITELIST</strong>: Whitelisted.</li>
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
             * <p>Specifies whether the check depends on the TRIAL permission.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder trialPermission(Boolean trialPermission) {
                this.trialPermission = trialPermission;
                return this;
            }

            /**
             * <p>Specifies whether the check item requires enabling data delivery for ActionTrail for more than 30 days to build a behavior baseline. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Yes.</li>
             * <li><strong>0</strong>: No.</li>
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
             * <p>The vendor of the asset. Valid values:</p>
             * <p>0: Alibaba Cloud.
             * 3: Other cloud.
             * 4: Other cloud.
             * 5: Other cloud.
             * 7: Other cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Checks build() {
                return new Checks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterCheckResultResponseBody</p>
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
             * <p>The number of data entries displayed on the current page during paging in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the current page during paging in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of alerting events to display on each page during paging in a paged query. Default value: <strong>20</strong>, which indicates that 20 alerting events are displayed on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
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

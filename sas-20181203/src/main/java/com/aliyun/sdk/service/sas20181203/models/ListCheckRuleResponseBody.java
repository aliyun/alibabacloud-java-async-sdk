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
 * {@link ListCheckRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckRuleResponseBody</p>
 */
public class ListCheckRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckRules")
    private java.util.List<CheckRules> checkRules;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCheckRuleResponseBody(Builder builder) {
        this.checkRules = builder.checkRules;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkRules
     */
    public java.util.List<CheckRules> getCheckRules() {
        return this.checkRules;
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
        private java.util.List<CheckRules> checkRules; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * CheckRules.
         */
        public Builder checkRules(java.util.List<CheckRules> checkRules) {
            this.checkRules = checkRules;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckRuleResponseBody build() {
            return new ListCheckRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckRuleResponseBody</p>
     */
    public static class CheckPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sectionShowName")
        private String sectionShowName;

        private CheckPolicies(Builder builder) {
            this.sectionShowName = builder.sectionShowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckPolicies create() {
            return builder().build();
        }

        /**
         * @return sectionShowName
         */
        public String getSectionShowName() {
            return this.sectionShowName;
        }

        public static final class Builder {
            private String sectionShowName; 

            /**
             * sectionShowName.
             */
            public Builder sectionShowName(String sectionShowName) {
                this.sectionShowName = sectionShowName;
                return this;
            }

            public CheckPolicies build() {
                return new CheckPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckRuleResponseBody</p>
     */
    public static class CheckRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

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

        @com.aliyun.core.annotation.NameInMap("InstanceSubType")
        private String instanceSubType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        @com.aliyun.core.annotation.NameInMap("VendorName")
        private String vendorName;

        private CheckRules(Builder builder) {
            this.aliUid = builder.aliUid;
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.checkId = builder.checkId;
            this.checkPolicies = builder.checkPolicies;
            this.checkShowName = builder.checkShowName;
            this.instanceSubType = builder.instanceSubType;
            this.instanceType = builder.instanceType;
            this.remark = builder.remark;
            this.ruleId = builder.ruleId;
            this.ruleType = builder.ruleType;
            this.scopeType = builder.scopeType;
            this.vendor = builder.vendor;
            this.vendorName = builder.vendorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRules create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
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
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        public static final class Builder {
            private Long aliUid; 
            private Integer assetSubType; 
            private Integer assetType; 
            private Long checkId; 
            private java.util.List<CheckPolicies> checkPolicies; 
            private String checkShowName; 
            private String instanceSubType; 
            private String instanceType; 
            private String remark; 
            private Long ruleId; 
            private String ruleType; 
            private String scopeType; 
            private Integer vendor; 
            private String vendorName; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

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
             * CheckId.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * CheckPolicies.
             */
            public Builder checkPolicies(java.util.List<CheckPolicies> checkPolicies) {
                this.checkPolicies = checkPolicies;
                return this;
            }

            /**
             * CheckShowName.
             */
            public Builder checkShowName(String checkShowName) {
                this.checkShowName = checkShowName;
                return this;
            }

            /**
             * InstanceSubType.
             */
            public Builder instanceSubType(String instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * ScopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * VendorName.
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            public CheckRules build() {
                return new CheckRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckRuleResponseBody</p>
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

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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

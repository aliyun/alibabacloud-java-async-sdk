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
 * {@link ListCheckItemWarningSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckItemWarningSummaryResponseBody</p>
 */
public class ListCheckItemWarningSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCheckItemWarningSummaryResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckItemWarningSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
        private java.util.List<List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>List of check item risk statistics.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>DC97C9EC-4B7D-5EFF-8A5E-A5CCC9ED****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckItemWarningSummaryResponseBody build() {
            return new ListCheckItemWarningSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckItemWarningSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemWarningSummaryResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private String advice;

        @com.aliyun.core.annotation.NameInMap("AffiliatedRiskTypes")
        private java.util.List<String> affiliatedRiskTypes;

        @com.aliyun.core.annotation.NameInMap("AffiliatedRisks")
        private java.util.List<String> affiliatedRisks;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("CheckLevel")
        private String checkLevel;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private String checkType;

        @com.aliyun.core.annotation.NameInMap("ContainerCheckItem")
        private Boolean containerCheckItem;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableRisks")
        private java.util.List<String> enableRisks;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("WarningMachineCount")
        private Integer warningMachineCount;

        private List(Builder builder) {
            this.advice = builder.advice;
            this.affiliatedRiskTypes = builder.affiliatedRiskTypes;
            this.affiliatedRisks = builder.affiliatedRisks;
            this.alias = builder.alias;
            this.checkId = builder.checkId;
            this.checkItem = builder.checkItem;
            this.checkLevel = builder.checkLevel;
            this.checkType = builder.checkType;
            this.containerCheckItem = builder.containerCheckItem;
            this.description = builder.description;
            this.enableRisks = builder.enableRisks;
            this.riskType = builder.riskType;
            this.status = builder.status;
            this.warningMachineCount = builder.warningMachineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public String getAdvice() {
            return this.advice;
        }

        /**
         * @return affiliatedRiskTypes
         */
        public java.util.List<String> getAffiliatedRiskTypes() {
            return this.affiliatedRiskTypes;
        }

        /**
         * @return affiliatedRisks
         */
        public java.util.List<String> getAffiliatedRisks() {
            return this.affiliatedRisks;
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return checkLevel
         */
        public String getCheckLevel() {
            return this.checkLevel;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return containerCheckItem
         */
        public Boolean getContainerCheckItem() {
            return this.containerCheckItem;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableRisks
         */
        public java.util.List<String> getEnableRisks() {
            return this.enableRisks;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return warningMachineCount
         */
        public Integer getWarningMachineCount() {
            return this.warningMachineCount;
        }

        public static final class Builder {
            private String advice; 
            private java.util.List<String> affiliatedRiskTypes; 
            private java.util.List<String> affiliatedRisks; 
            private String alias; 
            private Long checkId; 
            private String checkItem; 
            private String checkLevel; 
            private String checkType; 
            private Boolean containerCheckItem; 
            private String description; 
            private java.util.List<String> enableRisks; 
            private String riskType; 
            private Integer status; 
            private Integer warningMachineCount; 

            /**
             * <p>The suggestion on the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>In the Administrative Tools window, double-click Local Security Policy. In the Local Security Policy window that appears, choose Security Settings\Local Policies\Audit Policy, configure all audit policies as: <code>Success, Failure</code>.</p>
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * <p>The types of the baselines to which the check item belongs.</p>
             */
            public Builder affiliatedRiskTypes(java.util.List<String> affiliatedRiskTypes) {
                this.affiliatedRiskTypes = affiliatedRiskTypes;
                return this;
            }

            /**
             * <p>The baselines to which the check item belongs.</p>
             */
            public Builder affiliatedRisks(java.util.List<String> affiliatedRisks) {
                this.affiliatedRisks = affiliatedRisks;
                return this;
            }

            /**
             * <p>The alias of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>week_pa****</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>696</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Config the Event Audit policys</p>
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * <p>The risk level of the check item. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder checkLevel(String checkLevel) {
                this.checkLevel = checkLevel;
                return this;
            }

            /**
             * <p>The type of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Security audit</p>
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>Indicates whether the check item belongs to the container runtime type. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder containerCheckItem(Boolean containerCheckItem) {
                this.containerCheckItem = containerCheckItem;
                return this;
            }

            /**
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Config the Event Audit policys</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The baselines in which the check item is enabled.</p>
             */
            public Builder enableRisks(java.util.List<String> enableRisks) {
                this.enableRisks = enableRisks;
                return this;
            }

            /**
             * <p>The type of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>weak_password</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * <p>Risk status of check items. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: failed</li>
             * <li><strong>3</strong>: passed</li>
             * <li><strong>6</strong>: whitelisted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of servers that are affected by the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder warningMachineCount(Integer warningMachineCount) {
                this.warningMachineCount = warningMachineCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckItemWarningSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemWarningSummaryResponseBody</p>
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
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
             * <p>149</p>
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

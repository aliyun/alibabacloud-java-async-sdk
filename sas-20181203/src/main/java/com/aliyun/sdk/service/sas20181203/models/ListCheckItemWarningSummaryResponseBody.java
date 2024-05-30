// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemWarningSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckItemWarningSummaryResponseBody</p>
 */
public class ListCheckItemWarningSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

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
    public java.util.List < List> getList() {
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
        private java.util.List < List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The risk statistics of check items.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckItemWarningSummaryResponseBody build() {
            return new ListCheckItemWarningSummaryResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private String advice;

        @com.aliyun.core.annotation.NameInMap("AffiliatedRiskTypes")
        private java.util.List < String > affiliatedRiskTypes;

        @com.aliyun.core.annotation.NameInMap("AffiliatedRisks")
        private java.util.List < String > affiliatedRisks;

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
        private java.util.List < String > enableRisks;

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
        public java.util.List < String > getAffiliatedRiskTypes() {
            return this.affiliatedRiskTypes;
        }

        /**
         * @return affiliatedRisks
         */
        public java.util.List < String > getAffiliatedRisks() {
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
        public java.util.List < String > getEnableRisks() {
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
            private java.util.List < String > affiliatedRiskTypes; 
            private java.util.List < String > affiliatedRisks; 
            private String alias; 
            private Long checkId; 
            private String checkItem; 
            private String checkLevel; 
            private String checkType; 
            private Boolean containerCheckItem; 
            private String description; 
            private java.util.List < String > enableRisks; 
            private String riskType; 
            private Integer status; 
            private Integer warningMachineCount; 

            /**
             * The suggestion on the check item.
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * The types of the baselines to which the check item belongs.
             */
            public Builder affiliatedRiskTypes(java.util.List < String > affiliatedRiskTypes) {
                this.affiliatedRiskTypes = affiliatedRiskTypes;
                return this;
            }

            /**
             * The baselines to which the check item belongs.
             */
            public Builder affiliatedRisks(java.util.List < String > affiliatedRisks) {
                this.affiliatedRisks = affiliatedRisks;
                return this;
            }

            /**
             * The alias of the baseline type.
             */
            public Builder alias(String alias) {
                this.alias = alias;
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
             * The description of the check item.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * The risk level of the check item. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder checkLevel(String checkLevel) {
                this.checkLevel = checkLevel;
                return this;
            }

            /**
             * The type of the check item.
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * Indicates whether the check item belongs to the container runtime type. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder containerCheckItem(Boolean containerCheckItem) {
                this.containerCheckItem = containerCheckItem;
                return this;
            }

            /**
             * The description of the check item.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The baselines in which the check item is enabled.
             */
            public Builder enableRisks(java.util.List < String > enableRisks) {
                this.enableRisks = enableRisks;
                return this;
            }

            /**
             * The type of the baseline.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * The risk status of the check item. Valid values:
             * <p>
             * 
             * *   **1**: failed
             * *   **3**: passed
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The number of servers that are affected by the check item.
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
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
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

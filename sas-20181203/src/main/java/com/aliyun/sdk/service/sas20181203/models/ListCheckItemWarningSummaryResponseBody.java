// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemWarningSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckItemWarningSummaryResponseBody</p>
 */
public class ListCheckItemWarningSummaryResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * List.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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

        public ListCheckItemWarningSummaryResponseBody build() {
            return new ListCheckItemWarningSummaryResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Advice")
        private String advice;

        @NameInMap("Alias")
        private String alias;

        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("CheckItem")
        private String checkItem;

        @NameInMap("CheckLevel")
        private String checkLevel;

        @NameInMap("CheckType")
        private String checkType;

        @NameInMap("Description")
        private String description;

        @NameInMap("RiskType")
        private String riskType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("WarningMachineCount")
        private Integer warningMachineCount;

        private List(Builder builder) {
            this.advice = builder.advice;
            this.alias = builder.alias;
            this.checkId = builder.checkId;
            this.checkItem = builder.checkItem;
            this.checkLevel = builder.checkLevel;
            this.checkType = builder.checkType;
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String alias; 
            private Long checkId; 
            private String checkItem; 
            private String checkLevel; 
            private String checkType; 
            private String description; 
            private String riskType; 
            private Integer status; 
            private Integer warningMachineCount; 

            /**
             * 检查项类别
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * 基线分类名称
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * 检查项id
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * 检查项描述
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * 检查项风险等级
             */
            public Builder checkLevel(String checkLevel) {
                this.checkLevel = checkLevel;
                return this;
            }

            /**
             * 检查项类别
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * 检查项类别
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 基线分类
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * 检查项状态
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 检查项风险机器数量
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

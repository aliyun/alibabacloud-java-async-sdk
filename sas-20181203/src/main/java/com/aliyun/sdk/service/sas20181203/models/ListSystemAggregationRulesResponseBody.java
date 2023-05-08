// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemAggregationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemAggregationRulesResponseBody</p>
 */
public class ListSystemAggregationRulesResponseBody extends TeaModel {
    @NameInMap("AggregationList")
    private java.util.List < AggregationList> aggregationList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListSystemAggregationRulesResponseBody(Builder builder) {
        this.aggregationList = builder.aggregationList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemAggregationRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregationList
     */
    public java.util.List < AggregationList> getAggregationList() {
        return this.aggregationList;
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
        private java.util.List < AggregationList> aggregationList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * AggregationList.
         */
        public Builder aggregationList(java.util.List < AggregationList> aggregationList) {
            this.aggregationList = aggregationList;
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

        public ListSystemAggregationRulesResponseBody build() {
            return new ListSystemAggregationRulesResponseBody(this);
        } 

    } 

    public static class AggregationList extends TeaModel {
        @NameInMap("Id")
        private Integer id;

        @NameInMap("Name")
        private String name;

        @NameInMap("RuleCount")
        private Integer ruleCount;

        private AggregationList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregationList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private Integer id; 
            private String name; 
            private Integer ruleCount; 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleCount.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public AggregationList build() {
                return new AggregationList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

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

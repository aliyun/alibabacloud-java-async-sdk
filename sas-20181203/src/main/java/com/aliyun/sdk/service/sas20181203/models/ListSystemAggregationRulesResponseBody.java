// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSystemAggregationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemAggregationRulesResponseBody</p>
 */
public class ListSystemAggregationRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregationList")
    private java.util.List < AggregationList> aggregationList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array that consists of the details about the aggregation types.</p>
         */
        public Builder aggregationList(java.util.List < AggregationList> aggregationList) {
            this.aggregationList = aggregationList;
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
         * <p>6800B790-B10A-5C2F-BEB3-F1D5CE61****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSystemAggregationRulesResponseBody build() {
            return new ListSystemAggregationRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemAggregationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemAggregationRulesResponseBody</p>
     */
    public static class AggregationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
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
             * <p>The ID of the aggregation type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the aggregation type.</p>
             * 
             * <strong>example:</strong>
             * <p>Remote control****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of rules that are of the aggregation type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ListSystemAggregationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemAggregationRulesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>30</p>
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

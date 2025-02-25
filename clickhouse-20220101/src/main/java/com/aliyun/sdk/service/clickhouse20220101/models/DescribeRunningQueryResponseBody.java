// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRunningQueryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRunningQueryResponseBody</p>
 */
public class DescribeRunningQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRunningQueryResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRunningQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRunningQueryResponseBody build() {
            return new DescribeRunningQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRunningQueryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRunningQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InitialAddress")
        private String initialAddress;

        @com.aliyun.core.annotation.NameInMap("InitialQueryId")
        private String initialQueryId;

        @com.aliyun.core.annotation.NameInMap("InitialUser")
        private String initialUser;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
        private Long queryDurationMs;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        private Data(Builder builder) {
            this.initialAddress = builder.initialAddress;
            this.initialQueryId = builder.initialQueryId;
            this.initialUser = builder.initialUser;
            this.query = builder.query;
            this.queryDurationMs = builder.queryDurationMs;
            this.queryStartTime = builder.queryStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return initialAddress
         */
        public String getInitialAddress() {
            return this.initialAddress;
        }

        /**
         * @return initialQueryId
         */
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        /**
         * @return initialUser
         */
        public String getInitialUser() {
            return this.initialUser;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryDurationMs
         */
        public Long getQueryDurationMs() {
            return this.queryDurationMs;
        }

        /**
         * @return queryStartTime
         */
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public static final class Builder {
            private String initialAddress; 
            private String initialQueryId; 
            private String initialUser; 
            private String query; 
            private Long queryDurationMs; 
            private String queryStartTime; 

            /**
             * InitialAddress.
             */
            public Builder initialAddress(String initialAddress) {
                this.initialAddress = initialAddress;
                return this;
            }

            /**
             * InitialQueryId.
             */
            public Builder initialQueryId(String initialQueryId) {
                this.initialQueryId = initialQueryId;
                return this;
            }

            /**
             * InitialUser.
             */
            public Builder initialUser(String initialUser) {
                this.initialUser = initialUser;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * QueryDurationMs.
             */
            public Builder queryDurationMs(Long queryDurationMs) {
                this.queryDurationMs = queryDurationMs;
                return this;
            }

            /**
             * QueryStartTime.
             */
            public Builder queryStartTime(String queryStartTime) {
                this.queryStartTime = queryStartTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

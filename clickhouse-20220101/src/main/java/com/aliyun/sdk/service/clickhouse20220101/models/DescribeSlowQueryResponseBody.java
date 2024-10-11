// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSlowQueryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowQueryResponseBody</p>
 */
public class DescribeSlowQueryResponseBody extends TeaModel {
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

    private DescribeSlowQueryResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowQueryResponseBody create() {
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

        public DescribeSlowQueryResponseBody build() {
            return new DescribeSlowQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowQueryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InitialAddress")
        private String initialAddress;

        @com.aliyun.core.annotation.NameInMap("InitialQueryId")
        private String initialQueryId;

        @com.aliyun.core.annotation.NameInMap("InitialUser")
        private String initialUser;

        @com.aliyun.core.annotation.NameInMap("MemoryUsage")
        private Long memoryUsage;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
        private Long queryDurationMs;

        @com.aliyun.core.annotation.NameInMap("QueryStartTime")
        private String queryStartTime;

        @com.aliyun.core.annotation.NameInMap("QueryState")
        private String queryState;

        @com.aliyun.core.annotation.NameInMap("ReadBytes")
        private Long readBytes;

        @com.aliyun.core.annotation.NameInMap("ReadRows")
        private Long readRows;

        @com.aliyun.core.annotation.NameInMap("ResultBytes")
        private Long resultBytes;

        @com.aliyun.core.annotation.NameInMap("ResultRows")
        private Long resultRows;

        private Data(Builder builder) {
            this.initialAddress = builder.initialAddress;
            this.initialQueryId = builder.initialQueryId;
            this.initialUser = builder.initialUser;
            this.memoryUsage = builder.memoryUsage;
            this.query = builder.query;
            this.queryDurationMs = builder.queryDurationMs;
            this.queryStartTime = builder.queryStartTime;
            this.queryState = builder.queryState;
            this.readBytes = builder.readBytes;
            this.readRows = builder.readRows;
            this.resultBytes = builder.resultBytes;
            this.resultRows = builder.resultRows;
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
         * @return memoryUsage
         */
        public Long getMemoryUsage() {
            return this.memoryUsage;
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

        /**
         * @return queryState
         */
        public String getQueryState() {
            return this.queryState;
        }

        /**
         * @return readBytes
         */
        public Long getReadBytes() {
            return this.readBytes;
        }

        /**
         * @return readRows
         */
        public Long getReadRows() {
            return this.readRows;
        }

        /**
         * @return resultBytes
         */
        public Long getResultBytes() {
            return this.resultBytes;
        }

        /**
         * @return resultRows
         */
        public Long getResultRows() {
            return this.resultRows;
        }

        public static final class Builder {
            private String initialAddress; 
            private String initialQueryId; 
            private String initialUser; 
            private Long memoryUsage; 
            private String query; 
            private Long queryDurationMs; 
            private String queryStartTime; 
            private String queryState; 
            private Long readBytes; 
            private Long readRows; 
            private Long resultBytes; 
            private Long resultRows; 

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
             * MemoryUsage.
             */
            public Builder memoryUsage(Long memoryUsage) {
                this.memoryUsage = memoryUsage;
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

            /**
             * QueryState.
             */
            public Builder queryState(String queryState) {
                this.queryState = queryState;
                return this;
            }

            /**
             * ReadBytes.
             */
            public Builder readBytes(Long readBytes) {
                this.readBytes = readBytes;
                return this;
            }

            /**
             * ReadRows.
             */
            public Builder readRows(Long readRows) {
                this.readRows = readRows;
                return this;
            }

            /**
             * ResultBytes.
             */
            public Builder resultBytes(Long resultBytes) {
                this.resultBytes = resultBytes;
                return this;
            }

            /**
             * ResultRows.
             */
            public Builder resultRows(Long resultRows) {
                this.resultRows = resultRows;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

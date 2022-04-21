// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectionPoolsResponseBody</p>
 */
public class ListConnectionPoolsResponseBody extends TeaModel {
    @NameInMap("ConnectionPools")
    private java.util.List < ConnectionPools> connectionPools;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListConnectionPoolsResponseBody(Builder builder) {
        this.connectionPools = builder.connectionPools;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionPoolsResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionPools
     */
    public java.util.List < ConnectionPools> getConnectionPools() {
        return this.connectionPools;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < ConnectionPools> connectionPools; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ConnectionPools.
         */
        public Builder connectionPools(java.util.List < ConnectionPools> connectionPools) {
            this.connectionPools = connectionPools;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListConnectionPoolsResponseBody build() {
            return new ListConnectionPoolsResponseBody(this);
        } 

    } 

    public static class ConnectionPools extends TeaModel {
        @NameInMap("Cidrs")
        private java.util.List < String > cidrs;

        @NameInMap("ConnectionPoolDescription")
        private String connectionPoolDescription;

        @NameInMap("ConnectionPoolId")
        private String connectionPoolId;

        @NameInMap("ConnectionPoolName")
        private String connectionPoolName;

        @NameInMap("ConnectionPoolStatus")
        private String connectionPoolStatus;

        @NameInMap("OperateResultRequestID")
        private String operateResultRequestID;

        private ConnectionPools(Builder builder) {
            this.cidrs = builder.cidrs;
            this.connectionPoolDescription = builder.connectionPoolDescription;
            this.connectionPoolId = builder.connectionPoolId;
            this.connectionPoolName = builder.connectionPoolName;
            this.connectionPoolStatus = builder.connectionPoolStatus;
            this.operateResultRequestID = builder.operateResultRequestID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionPools create() {
            return builder().build();
        }

        /**
         * @return cidrs
         */
        public java.util.List < String > getCidrs() {
            return this.cidrs;
        }

        /**
         * @return connectionPoolDescription
         */
        public String getConnectionPoolDescription() {
            return this.connectionPoolDescription;
        }

        /**
         * @return connectionPoolId
         */
        public String getConnectionPoolId() {
            return this.connectionPoolId;
        }

        /**
         * @return connectionPoolName
         */
        public String getConnectionPoolName() {
            return this.connectionPoolName;
        }

        /**
         * @return connectionPoolStatus
         */
        public String getConnectionPoolStatus() {
            return this.connectionPoolStatus;
        }

        /**
         * @return operateResultRequestID
         */
        public String getOperateResultRequestID() {
            return this.operateResultRequestID;
        }

        public static final class Builder {
            private java.util.List < String > cidrs; 
            private String connectionPoolDescription; 
            private String connectionPoolId; 
            private String connectionPoolName; 
            private String connectionPoolStatus; 
            private String operateResultRequestID; 

            /**
             * Cidrs.
             */
            public Builder cidrs(java.util.List < String > cidrs) {
                this.cidrs = cidrs;
                return this;
            }

            /**
             * ConnectionPoolDescription.
             */
            public Builder connectionPoolDescription(String connectionPoolDescription) {
                this.connectionPoolDescription = connectionPoolDescription;
                return this;
            }

            /**
             * ConnectionPoolId.
             */
            public Builder connectionPoolId(String connectionPoolId) {
                this.connectionPoolId = connectionPoolId;
                return this;
            }

            /**
             * ConnectionPoolName.
             */
            public Builder connectionPoolName(String connectionPoolName) {
                this.connectionPoolName = connectionPoolName;
                return this;
            }

            /**
             * ConnectionPoolStatus.
             */
            public Builder connectionPoolStatus(String connectionPoolStatus) {
                this.connectionPoolStatus = connectionPoolStatus;
                return this;
            }

            /**
             * OperateResultRequestID.
             */
            public Builder operateResultRequestID(String operateResultRequestID) {
                this.operateResultRequestID = operateResultRequestID;
                return this;
            }

            public ConnectionPools build() {
                return new ConnectionPools(this);
            } 

        } 

    }
}

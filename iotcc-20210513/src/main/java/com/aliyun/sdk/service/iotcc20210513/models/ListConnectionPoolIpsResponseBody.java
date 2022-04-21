// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoolIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectionPoolIpsResponseBody</p>
 */
public class ListConnectionPoolIpsResponseBody extends TeaModel {
    @NameInMap("ConnectionPoolIps")
    private java.util.List < ConnectionPoolIps> connectionPoolIps;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListConnectionPoolIpsResponseBody(Builder builder) {
        this.connectionPoolIps = builder.connectionPoolIps;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionPoolIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionPoolIps
     */
    public java.util.List < ConnectionPoolIps> getConnectionPoolIps() {
        return this.connectionPoolIps;
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
        private java.util.List < ConnectionPoolIps> connectionPoolIps; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ConnectionPoolIps.
         */
        public Builder connectionPoolIps(java.util.List < ConnectionPoolIps> connectionPoolIps) {
            this.connectionPoolIps = connectionPoolIps;
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

        public ListConnectionPoolIpsResponseBody build() {
            return new ListConnectionPoolIpsResponseBody(this);
        } 

    } 

    public static class ConnectionPoolIps extends TeaModel {
        @NameInMap("ConnectionPoolId")
        private String connectionPoolId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Status")
        private String status;

        private ConnectionPoolIps(Builder builder) {
            this.connectionPoolId = builder.connectionPoolId;
            this.ip = builder.ip;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionPoolIps create() {
            return builder().build();
        }

        /**
         * @return connectionPoolId
         */
        public String getConnectionPoolId() {
            return this.connectionPoolId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String connectionPoolId; 
            private String ip; 
            private String status; 

            /**
             * ConnectionPoolId.
             */
            public Builder connectionPoolId(String connectionPoolId) {
                this.connectionPoolId = connectionPoolId;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ConnectionPoolIps build() {
                return new ConnectionPoolIps(this);
            } 

        } 

    }
}

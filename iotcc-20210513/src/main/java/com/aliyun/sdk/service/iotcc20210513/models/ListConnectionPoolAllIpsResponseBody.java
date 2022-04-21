// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoolAllIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectionPoolAllIpsResponseBody</p>
 */
public class ListConnectionPoolAllIpsResponseBody extends TeaModel {
    @NameInMap("ConnectionPoolIps")
    private java.util.List < ConnectionPoolIps> connectionPoolIps;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalIpsCount")
    private Integer totalIpsCount;

    private ListConnectionPoolAllIpsResponseBody(Builder builder) {
        this.connectionPoolIps = builder.connectionPoolIps;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalIpsCount = builder.totalIpsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionPoolAllIpsResponseBody create() {
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
     * @return totalIpsCount
     */
    public Integer getTotalIpsCount() {
        return this.totalIpsCount;
    }

    public static final class Builder {
        private java.util.List < ConnectionPoolIps> connectionPoolIps; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalIpsCount; 

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
         * TotalIpsCount.
         */
        public Builder totalIpsCount(Integer totalIpsCount) {
            this.totalIpsCount = totalIpsCount;
            return this;
        }

        public ListConnectionPoolAllIpsResponseBody build() {
            return new ListConnectionPoolAllIpsResponseBody(this);
        } 

    } 

    public static class ConnectionPoolIps extends TeaModel {
        @NameInMap("ConnectionPoolId")
        private String connectionPoolId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IpNum")
        private Long ipNum;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private ConnectionPoolIps(Builder builder) {
            this.connectionPoolId = builder.connectionPoolId;
            this.ip = builder.ip;
            this.ipNum = builder.ipNum;
            this.status = builder.status;
            this.type = builder.type;
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
         * @return ipNum
         */
        public Long getIpNum() {
            return this.ipNum;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String connectionPoolId; 
            private String ip; 
            private Long ipNum; 
            private String status; 
            private String type; 

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
             * IpNum.
             */
            public Builder ipNum(Long ipNum) {
                this.ipNum = ipNum;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConnectionPoolIps build() {
                return new ConnectionPoolIps(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAccelerateIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBasicAccelerateIpsResponseBody</p>
 */
public class ListBasicAccelerateIpsResponseBody extends TeaModel {
    @NameInMap("AccelerateIps")
    private java.util.List < AccelerateIps> accelerateIps;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListBasicAccelerateIpsResponseBody(Builder builder) {
        this.accelerateIps = builder.accelerateIps;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBasicAccelerateIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateIps
     */
    public java.util.List < AccelerateIps> getAccelerateIps() {
        return this.accelerateIps;
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
        private java.util.List < AccelerateIps> accelerateIps; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The accelerated IP addresses of the basic GA instance.
         */
        public Builder accelerateIps(java.util.List < AccelerateIps> accelerateIps) {
            this.accelerateIps = accelerateIps;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If **NextToken** was not returned, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBasicAccelerateIpsResponseBody build() {
            return new ListBasicAccelerateIpsResponseBody(this);
        } 

    } 

    public static class AccelerateIps extends TeaModel {
        @NameInMap("AccelerateIpAddress")
        private String accelerateIpAddress;

        @NameInMap("AccelerateIpId")
        private String accelerateIpId;

        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("IpSetId")
        private String ipSetId;

        @NameInMap("State")
        private String state;

        private AccelerateIps(Builder builder) {
            this.accelerateIpAddress = builder.accelerateIpAddress;
            this.accelerateIpId = builder.accelerateIpId;
            this.acceleratorId = builder.acceleratorId;
            this.ipSetId = builder.ipSetId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccelerateIps create() {
            return builder().build();
        }

        /**
         * @return accelerateIpAddress
         */
        public String getAccelerateIpAddress() {
            return this.accelerateIpAddress;
        }

        /**
         * @return accelerateIpId
         */
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return ipSetId
         */
        public String getIpSetId() {
            return this.ipSetId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String accelerateIpAddress; 
            private String accelerateIpId; 
            private String acceleratorId; 
            private String ipSetId; 
            private String state; 

            /**
             * The accelerated IP address of the basic GA instance.
             */
            public Builder accelerateIpAddress(String accelerateIpAddress) {
                this.accelerateIpAddress = accelerateIpAddress;
                return this;
            }

            /**
             * The ID of the accelerated IP address of the basic GA instance.
             */
            public Builder accelerateIpId(String accelerateIpId) {
                this.accelerateIpId = accelerateIpId;
                return this;
            }

            /**
             * The ID of the basic GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The ID of the acceleration region.
             */
            public Builder ipSetId(String ipSetId) {
                this.ipSetId = ipSetId;
                return this;
            }

            /**
             * The status of the accelerated IP address. Valid values:
             * <p>
             * 
             * *   **active**: The accelerated IP address is available.
             * *   **binding**: The accelerated IP address is being associated.
             * *   **bound**: The accelerated IP address is associated.
             * *   **unbinding**: The accelerated IP address is being disassociated.
             * *   **deleting**: The accelerated IP address is being deleted.
             * 
             * >  This parameter is unavailable when the accelerated IP address is being created.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AccelerateIps build() {
                return new AccelerateIps(this);
            } 

        } 

    }
}

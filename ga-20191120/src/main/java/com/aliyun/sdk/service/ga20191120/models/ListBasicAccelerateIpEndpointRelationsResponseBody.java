// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAccelerateIpEndpointRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBasicAccelerateIpEndpointRelationsResponseBody</p>
 */
public class ListBasicAccelerateIpEndpointRelationsResponseBody extends TeaModel {
    @NameInMap("AccelerateIpEndpointRelations")
    private java.util.List < AccelerateIpEndpointRelations> accelerateIpEndpointRelations;

    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListBasicAccelerateIpEndpointRelationsResponseBody(Builder builder) {
        this.accelerateIpEndpointRelations = builder.accelerateIpEndpointRelations;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBasicAccelerateIpEndpointRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateIpEndpointRelations
     */
    public java.util.List < AccelerateIpEndpointRelations> getAccelerateIpEndpointRelations() {
        return this.accelerateIpEndpointRelations;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AccelerateIpEndpointRelations> accelerateIpEndpointRelations; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * A list of accelerated IP addresses and the endpoints with which the accelerated IP addresses are associated.
         */
        public Builder accelerateIpEndpointRelations(java.util.List < AccelerateIpEndpointRelations> accelerateIpEndpointRelations) {
            this.accelerateIpEndpointRelations = accelerateIpEndpointRelations;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is not returned, it indicates that no additional results exist.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBasicAccelerateIpEndpointRelationsResponseBody build() {
            return new ListBasicAccelerateIpEndpointRelationsResponseBody(this);
        } 

    } 

    public static class AccelerateIpEndpointRelations extends TeaModel {
        @NameInMap("AccelerateIpId")
        private String accelerateIpId;

        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("EndpointAddress")
        private String endpointAddress;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointName")
        private String endpointName;

        @NameInMap("EndpointSubAddress")
        private String endpointSubAddress;

        @NameInMap("EndpointSubAddressType")
        private String endpointSubAddressType;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("EndpointZoneId")
        private String endpointZoneId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("State")
        private String state;

        private AccelerateIpEndpointRelations(Builder builder) {
            this.accelerateIpId = builder.accelerateIpId;
            this.acceleratorId = builder.acceleratorId;
            this.endpointAddress = builder.endpointAddress;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.endpointSubAddress = builder.endpointSubAddress;
            this.endpointSubAddressType = builder.endpointSubAddressType;
            this.endpointType = builder.endpointType;
            this.endpointZoneId = builder.endpointZoneId;
            this.ipAddress = builder.ipAddress;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccelerateIpEndpointRelations create() {
            return builder().build();
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
         * @return endpointAddress
         */
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointSubAddress
         */
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        /**
         * @return endpointSubAddressType
         */
        public String getEndpointSubAddressType() {
            return this.endpointSubAddressType;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointZoneId
         */
        public String getEndpointZoneId() {
            return this.endpointZoneId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String accelerateIpId; 
            private String acceleratorId; 
            private String endpointAddress; 
            private String endpointId; 
            private String endpointName; 
            private String endpointSubAddress; 
            private String endpointSubAddressType; 
            private String endpointType; 
            private String endpointZoneId; 
            private String ipAddress; 
            private String state; 

            /**
             * The ID of the accelerated IP address.
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
             * The address of the endpoint.
             */
            public Builder endpointAddress(String endpointAddress) {
                this.endpointAddress = endpointAddress;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The name of the endpoint.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * The secondary address of the endpoint.
             * <p>
             * 
             * This parameter is returned if the endpoint type is **ECS**, **ENI**, or **NLB**.
             * 
             * *   If the endpoint type is **ECS**, **EndpointSubAddress** returns the primary or secondary private IP address of the primary ENI.
             * *   If the endpoint type is **ENI**, **EndpointSubAddress** returns the primary or secondary private IP address of the secondary ENI.
             * *   If the endpoint type is **NLB**, **EndpointSubAddress** returns the primary private IP address of the NLB backend server.
             */
            public Builder endpointSubAddress(String endpointSubAddress) {
                this.endpointSubAddress = endpointSubAddress;
                return this;
            }

            /**
             * The type of the secondary address of the endpoint.
             * <p>
             * 
             * *   **primary**: a primary private IP address.
             * *   **secondary**: a secondary private IP address.
             * 
             * This parameter is returned if the endpoint type is **ECS**, **ENI**, or **NLB**. If the endpoint type is set to **NLB**, **primary** is returned.
             */
            public Builder endpointSubAddressType(String endpointSubAddressType) {
                this.endpointSubAddressType = endpointSubAddressType;
                return this;
            }

            /**
             * The type of endpoint. Valid values:
             * <p>
             * 
             * *   **ENI**: elastic network interface (ENI).
             * *   **SLB**: Classic Load Balancer (CLB) instance.
             * *   **ECS**: Elastic Compute Service (ECS) instance.
             * *   **NLB**: Network Load Balancer (NLB) instance.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The ID of the zone where the endpoint is created.
             * <p>
             * 
             * This parameter is returned only when the endpoint type is **NLB**.
             */
            public Builder endpointZoneId(String endpointZoneId) {
                this.endpointZoneId = endpointZoneId;
                return this;
            }

            /**
             * The accelerated IP address of the basic GA instance.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The association status between the accelerated IP address and endpoint.
             * <p>
             * 
             * A value of **active** indicates that the accelerated IP address is associated with the endpoint.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AccelerateIpEndpointRelations build() {
                return new AccelerateIpEndpointRelations(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBasicEndpointsResponseBody</p>
 */
public class ListBasicEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListBasicEndpointsResponseBody(Builder builder) {
        this.endpoints = builder.endpoints;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBasicEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
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
        private java.util.List < Endpoints> endpoints; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * The endpoints that are associated with the basic GA instance.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
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

        public ListBasicEndpointsResponseBody build() {
            return new ListBasicEndpointsResponseBody(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("EndpointAddress")
        private String endpointAddress;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointSubAddress")
        private String endpointSubAddress;

        @com.aliyun.core.annotation.NameInMap("EndpointSubAddressType")
        private String endpointSubAddressType;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("EndpointZoneId")
        private String endpointZoneId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Endpoints(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.endpointAddress = builder.endpointAddress;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointId = builder.endpointId;
            this.endpointSubAddress = builder.endpointSubAddress;
            this.endpointSubAddressType = builder.endpointSubAddressType;
            this.endpointType = builder.endpointType;
            this.endpointZoneId = builder.endpointZoneId;
            this.name = builder.name;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
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
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String endpointAddress; 
            private String endpointGroupId; 
            private String endpointId; 
            private String endpointSubAddress; 
            private String endpointSubAddressType; 
            private String endpointType; 
            private String endpointZoneId; 
            private String name; 
            private String state; 

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
             * The ID of the endpoint group to which the endpoint belongs.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The ID of the endpoint that is associated with the basic GA instance.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
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
             * The secondary address type of the endpoint.
             * <p>
             * 
             * *   **primary**: a primary private IP address.
             * *   **secondary**: a secondary private IP address.
             * 
             * This parameter is returned if the type of the endpoint is set to **ECS**, **ENI**, or **NLB**. If the endpoint type is set to **NLB**, **primary** is returned.
             */
            public Builder endpointSubAddressType(String endpointSubAddressType) {
                this.endpointSubAddressType = endpointSubAddressType;
                return this;
            }

            /**
             * The type of endpoint. Valid values:
             * <p>
             * 
             * *   **ENI**: ENI.
             * *   **SLB**: CLB instance.
             * *   **ECS**: ECS instance.
             * *   **NLB**: NLB instance.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The zone ID of the endpoint.
             * <p>
             * 
             * This parameter is returned only when the endpoint type is set to **NLB**.
             */
            public Builder endpointZoneId(String endpointZoneId) {
                this.endpointZoneId = endpointZoneId;
                return this;
            }

            /**
             * The name of the endpoint.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the endpoint. Valid values:
             * <p>
             * 
             * *   **init**: The endpoint is being initialized.
             * *   **active**: The endpoint is available.
             * *   **updating**: The endpoint is being configured.
             * *   **binding**: The endpoint is being associated.
             * *   **unbinding**: The endpoint is being disassociated.
             * *   **deleting**: The endpoint is being deleted.
             * *   **bound**: The endpoint is associated.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}

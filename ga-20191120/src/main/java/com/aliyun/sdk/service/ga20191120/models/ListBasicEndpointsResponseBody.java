// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListBasicEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBasicEndpointsResponseBody</p>
 */
public class ListBasicEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
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
        private java.util.List<Endpoints> endpoints; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListBasicEndpointsResponseBody model) {
            this.endpoints = model.endpoints;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The endpoints that are associated with the basic GA instance.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBasicEndpointsResponseBody build() {
            return new ListBasicEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBasicEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBasicEndpointsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.acceleratorId = model.acceleratorId;
                this.endpointAddress = model.endpointAddress;
                this.endpointGroupId = model.endpointGroupId;
                this.endpointId = model.endpointId;
                this.endpointSubAddress = model.endpointSubAddress;
                this.endpointSubAddressType = model.endpointSubAddressType;
                this.endpointType = model.endpointType;
                this.endpointZoneId = model.endpointZoneId;
                this.name = model.name;
                this.state = model.state;
            } 

            /**
             * <p>The ID of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp17frjjh0udz4qz****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The address of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp1a05txelswuj8g****</p>
             */
            public Builder endpointAddress(String endpointAddress) {
                this.endpointAddress = endpointAddress;
                return this;
            }

            /**
             * <p>The ID of the endpoint group to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>epg-bp1dmlohjjz4kqaun****</p>
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * <p>The ID of the endpoint that is associated with the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-bp14sz7ftcwwjgrdm****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The secondary address of the endpoint.</p>
             * <p>This parameter is returned if the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
             * <ul>
             * <li>If the endpoint type is <strong>ECS</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the primary ENI.</li>
             * <li>If the endpoint type is <strong>ENI</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the secondary ENI.</li>
             * <li>If the endpoint type is <strong>NLB</strong>, <strong>EndpointSubAddress</strong> returns the primary private IP address of the NLB backend server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder endpointSubAddress(String endpointSubAddress) {
                this.endpointSubAddress = endpointSubAddress;
                return this;
            }

            /**
             * <p>The secondary address type of the endpoint.</p>
             * <ul>
             * <li><strong>primary</strong>: a primary private IP address.</li>
             * <li><strong>secondary</strong>: a secondary private IP address.</li>
             * </ul>
             * <p>This parameter is returned if the type of the endpoint is set to <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If the endpoint type is set to <strong>NLB</strong>, <strong>primary</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder endpointSubAddressType(String endpointSubAddressType) {
                this.endpointSubAddressType = endpointSubAddressType;
                return this;
            }

            /**
             * <p>The type of endpoint. Valid values:</p>
             * <ul>
             * <li><strong>ENI</strong>: ENI.</li>
             * <li><strong>SLB</strong>: CLB instance.</li>
             * <li><strong>ECS</strong>: ECS instance.</li>
             * <li><strong>NLB</strong>: NLB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENI</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The zone ID of the endpoint.</p>
             * <p>This parameter is returned only when the endpoint type is set to <strong>NLB</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder endpointZoneId(String endpointZoneId) {
                this.endpointZoneId = endpointZoneId;
                return this;
            }

            /**
             * <p>The name of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>ep01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>init</strong>: The endpoint is being initialized.</li>
             * <li><strong>active</strong>: The endpoint is available.</li>
             * <li><strong>updating</strong>: The endpoint is being configured.</li>
             * <li><strong>binding</strong>: The endpoint is being associated.</li>
             * <li><strong>unbinding</strong>: The endpoint is being disassociated.</li>
             * <li><strong>deleting</strong>: The endpoint is being deleted.</li>
             * <li><strong>bound</strong>: The endpoint is associated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
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

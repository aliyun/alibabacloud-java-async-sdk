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
 * {@link CreateBasicEndpointsRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicEndpointsRequest</p>
 */
public class CreateBasicEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateBasicEndpointsRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpoints = builder.endpoints;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicEndpointsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicEndpointsRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String endpointGroupId; 
        private java.util.List<Endpoints> endpoints; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicEndpointsRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.endpointGroupId = request.endpointGroupId;
            this.endpoints = request.endpoints;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the basic GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4qz****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the endpoint group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp1dmlohjjz4kqaun****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>The endpoints.</p>
         * <p>This parameter is required.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.putQueryParameter("Endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateBasicEndpointsRequest build() {
            return new CreateBasicEndpointsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBasicEndpointsRequest} extends {@link TeaModel}
     *
     * <p>CreateBasicEndpointsRequest</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointAddress")
        private String endpointAddress;

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

        private Endpoints(Builder builder) {
            this.endpointAddress = builder.endpointAddress;
            this.endpointSubAddress = builder.endpointSubAddress;
            this.endpointSubAddressType = builder.endpointSubAddressType;
            this.endpointType = builder.endpointType;
            this.endpointZoneId = builder.endpointZoneId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpointAddress
         */
        public String getEndpointAddress() {
            return this.endpointAddress;
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

        public static final class Builder {
            private String endpointAddress; 
            private String endpointSubAddress; 
            private String endpointSubAddressType; 
            private String endpointType; 
            private String endpointZoneId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.endpointAddress = model.endpointAddress;
                this.endpointSubAddress = model.endpointSubAddress;
                this.endpointSubAddressType = model.endpointSubAddressType;
                this.endpointType = model.endpointType;
                this.endpointZoneId = model.endpointZoneId;
                this.name = model.name;
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
             * <p>The secondary address of the endpoint.</p>
             * <p>This parameter is required only if you set the endpoint type to <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
             * <ul>
             * <li>If you set the endpoint type to <strong>ECS</strong>, you can set <strong>EndpointSubAddress</strong> to the secondary private IP address of the primary ENI. If you leave this parameter empty, the primary private IP address of the primary ENI is used.</li>
             * <li>If you set the endpoint type to <strong>ENI</strong>, you can set <strong>EndpointSubAddress</strong> to the secondary private IP address of the secondary ENI. If you leave this parameter empty, the primary private IP address of the secondary ENI is used.</li>
             * <li>If you set the endpoint type to <strong>NLB</strong>, you can set <strong>EndpointSubAddress</strong> to the primary private IP address of the NLB backend server.</li>
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
             * <p>The secondary address type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>primary</strong>: a primary private IP address.</li>
             * <li><strong>secondary</strong>: a secondary private IP address.</li>
             * </ul>
             * <p>This parameter is required only if you set the endpoint type to <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If you set the endpoint type to <strong>NLB</strong>, only <strong>primary</strong> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder endpointSubAddressType(String endpointSubAddressType) {
                this.endpointSubAddressType = endpointSubAddressType;
                return this;
            }

            /**
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>ENI</strong>: elastic network interface (ENI).</li>
             * <li><strong>SLB</strong>: Classic Load Balancer (CLB) instance.</li>
             * <li><strong>ECS</strong>: Elastic Compute Service (ECS) instance.</li>
             * <li><strong>NLB</strong>: Network Load Balancer (NLB) instance.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ENI</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The ID of the zone where the endpoint resides.</p>
             * <p>This parameter is required only if you set the endpoint type to <strong>NLB</strong>.</p>
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
             * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>ep01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}

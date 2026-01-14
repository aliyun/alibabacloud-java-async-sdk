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
 * {@link CreateBasicEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicEndpointRequest</p>
 */
public class CreateBasicEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointSubAddress")
    private String endpointSubAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointSubAddressType")
    private String endpointSubAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointZoneId")
    private String endpointZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateBasicEndpointRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointAddress = builder.endpointAddress;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointSubAddress = builder.endpointSubAddress;
        this.endpointSubAddressType = builder.endpointSubAddressType;
        this.endpointType = builder.endpointType;
        this.endpointZoneId = builder.endpointZoneId;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicEndpointRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicEndpointRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String endpointAddress; 
        private String endpointGroupId; 
        private String endpointSubAddress; 
        private String endpointSubAddressType; 
        private String endpointType; 
        private String endpointZoneId; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicEndpointRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.endpointAddress = request.endpointAddress;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointSubAddress = request.endpointSubAddress;
            this.endpointSubAddressType = request.endpointSubAddressType;
            this.endpointType = request.endpointType;
            this.endpointZoneId = request.endpointZoneId;
            this.name = request.name;
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
         * <p>The address of the endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1a05txelswuj8g****</p>
         */
        public Builder endpointAddress(String endpointAddress) {
            this.putQueryParameter("EndpointAddress", endpointAddress);
            this.endpointAddress = endpointAddress;
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
         * <p>The secondary address of the endpoint.</p>
         * <p>This parameter is required if the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
         * <ul>
         * <li>If the endpoint type is <strong>ECS</strong>, you can set <strong>EndpointSubAddress</strong> to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.</li>
         * <li>If the endpoint type is <strong>ENI</strong>, you can set <strong>EndpointSubAddress</strong> to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.</li>
         * <li>This parameter is required if the endpoint type is <strong>NLB</strong>. <strong>EndpointSubAddress</strong> is the primary private IP address of the NLB backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder endpointSubAddress(String endpointSubAddress) {
            this.putQueryParameter("EndpointSubAddress", endpointSubAddress);
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }

        /**
         * <p>The type of the secondary address of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong>: a primary private IP address.</li>
         * <li><strong>secondary</strong>: a secondary private IP address.</li>
         * </ul>
         * <p>This parameter is required if the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>. If the endpoint type is <strong>NLB</strong>, only <strong>primary</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder endpointSubAddressType(String endpointSubAddressType) {
            this.putQueryParameter("EndpointSubAddressType", endpointSubAddressType);
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }

        /**
         * <p>The type of endpoint. Valid values:</p>
         * <ul>
         * <li><strong>ENI</strong>: elastic network interface (ENI)</li>
         * <li><strong>SLB</strong>: Classic Load Balancer (CLB)</li>
         * <li><strong>ECS</strong>: Elastic Compute Service (ECS)</li>
         * <li><strong>NLB</strong>: Network Load Balancer (NLB)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENI</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>The zone ID of the endpoint.</p>
         * <p>This parameter is required only if the endpoint type is <strong>NLB</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder endpointZoneId(String endpointZoneId) {
            this.putQueryParameter("EndpointZoneId", endpointZoneId);
            this.endpointZoneId = endpointZoneId;
            return this;
        }

        /**
         * <p>The name of the endpoint that is associated with the basic GA instance.</p>
         * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>ep01</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public CreateBasicEndpointRequest build() {
            return new CreateBasicEndpointRequest(this);
        } 

    } 

}

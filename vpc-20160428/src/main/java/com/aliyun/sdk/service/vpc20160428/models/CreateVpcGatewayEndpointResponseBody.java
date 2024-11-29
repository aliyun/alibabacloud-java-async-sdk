// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVpcGatewayEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcGatewayEndpointResponseBody</p>
 */
public class CreateVpcGatewayEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("EndpointName")
    private String endpointName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private CreateVpcGatewayEndpointResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.endpointId = builder.endpointId;
        this.endpointName = builder.endpointName;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcGatewayEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private String creationTime; 
        private String endpointId; 
        private String endpointName; 
        private String requestId; 
        private String resourceGroupId; 
        private String serviceName; 

        /**
         * <p>The time when the gateway endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-27T01:58:37Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The ID of the gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vpce-bp1w1dmdqjpwul0v3****</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The name of the gateway endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62CFC815-E08A-5CF4-92D1-54273EC9E406</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.cn-hangzhou.oss</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public CreateVpcGatewayEndpointResponseBody build() {
            return new CreateVpcGatewayEndpointResponseBody(this);
        } 

    } 

}

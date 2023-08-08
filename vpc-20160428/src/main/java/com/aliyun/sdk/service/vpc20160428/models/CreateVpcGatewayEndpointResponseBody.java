// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcGatewayEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcGatewayEndpointResponseBody</p>
 */
public class CreateVpcGatewayEndpointResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("EndpointName")
    private String endpointName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ServiceName")
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
         * The time when the gateway endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The ID of the gateway endpoint.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The name of the gateway endpoint.
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the endpoint service.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteOperationASyncRequest} extends {@link RequestModel}
 *
 * <p>ExecuteOperationASyncRequest</p>
 */
public class ExecuteOperationASyncRequest extends Request {
    @Body
    @NameInMap("Attributes")
    private java.util.Map < String, String > attributes;

    @Body
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("ServiceType")
    @Validation(required = true)
    private String serviceType;

    private ExecuteOperationASyncRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.operation = builder.operation;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteOperationASyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public java.util.Map < String, String > getAttributes() {
        return this.attributes;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<ExecuteOperationASyncRequest, Builder> {
        private java.util.Map < String, String > attributes; 
        private String operation; 
        private String resourceGroupId; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteOperationASyncRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.operation = request.operation;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceType = request.serviceType;
        } 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map < String, String > attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putBodyParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of the service. If you want to perform operations on an Elastic Compute Service (ECS) instance, set ServiceType to ecs.
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public ExecuteOperationASyncRequest build() {
            return new ExecuteOperationASyncRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteOperationSyncRequest} extends {@link RequestModel}
 *
 * <p>ExecuteOperationSyncRequest</p>
 */
public class ExecuteOperationSyncRequest extends Request {
    @Body
    @NameInMap("ApplicationId")
    private String applicationId;

    @Body
    @NameInMap("Attributes")
    private java.util.Map < String, ? > attributes;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

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

    private ExecuteOperationSyncRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.attributes = builder.attributes;
        this.clientToken = builder.clientToken;
        this.operation = builder.operation;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteOperationSyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return attributes
     */
    public java.util.Map < String, ? > getAttributes() {
        return this.attributes;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<ExecuteOperationSyncRequest, Builder> {
        private String applicationId; 
        private java.util.Map < String, ? > attributes; 
        private String clientToken; 
        private String operation; 
        private String resourceGroupId; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteOperationSyncRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.attributes = request.attributes;
            this.clientToken = request.clientToken;
            this.operation = request.operation;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceType = request.serviceType;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Attributes.
         */
        public Builder attributes(java.util.Map < String, ? > attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putBodyParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public ExecuteOperationSyncRequest build() {
            return new ExecuteOperationSyncRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteOperationASyncRequest} extends {@link RequestModel}
 *
 * <p>ExecuteOperationASyncRequest</p>
 */
public class ExecuteOperationASyncRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map < String, ? > attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceType;

    private ExecuteOperationASyncRequest(Builder builder) {
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

    public static ExecuteOperationASyncRequest create() {
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

    public static final class Builder extends Request.Builder<ExecuteOperationASyncRequest, Builder> {
        private String applicationId; 
        private java.util.Map < String, ? > attributes; 
        private String clientToken; 
        private String operation; 
        private String resourceGroupId; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteOperationASyncRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.attributes = request.attributes;
            this.clientToken = request.clientToken;
            this.operation = request.operation;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceType = request.serviceType;
        } 

        /**
         * The ID of the Cloud Architect Design Tools (CADT) application.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * The parameters related to the action. Specify the parameters based on the value of Operation. The parameters are passed in the map format. The following examples show how to specify the parameters if you want to change the specifications of an Elastic Compute Service (ECS) instance:
         * <p>
         * 
         * *   The following common parameters are required: change_type, regionId, instanceId, appId
         * *   Example values for changing the instance type of the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_instance_type","instance_type":"ecs.hfr7.2xlarge","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * *   Example values for stopping the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Stopped","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * *   Example values for starting the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Running","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * *   Example values for restarting the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Restart","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * 
         * Example of enumerating more than one set of parameters:
         * 
         * *   { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{\\"change_type\\":\\"modify_instance_type\\",\\"instance_type\\":\\"ecs.hfr7.2xlarge\\",\\"instanceId\\":\\"i-xxxxxxxxx\\",\\"regionId\\":\\"cn-beijing\\",\\"appId\\":\\"xxxxxxxxxxxxx\\"}" }
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{\\"change_type\\":\\"modify_instance_type\\",\\"instance_type\\":\\"ecs.hfr7.2xlarge\\",\\"instanceId\\":\\"i-xxxxxxxxx\\",\\"regionId\\":\\"cn-beijing\\",\\"appId\\":\\"xxxxxxxxxxxxx\\"}" }
         * 
         *     <!-- -->
         */
        public Builder attributes(java.util.Map < String, ? > attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putBodyParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * This operation type is the operation type of modifying the product, some operation types are generic, and some are used alone. The following is an example of ECS deployment:
         * <p>
         * - The name of the ECS: rename
         * - Specificationof ecs: modifyInstanceType
         * - Startup of ecs: modifyInstanceType
         * - Stop of ecs: modifyInstanceType
         * - Restart of ecs: modifyInstanceType
         * - Ecs Tag: addTags
         * - Deletion of ecs: ecsDelete
         * - Paid type for ecs: modifyPayType
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * Resource group ID, which is used to verify the permissions of the resource group
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

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
         * The parameters that you need to specify when you perform an operation. The parameters vary based on the operation and are specified in the map format. The following examples show how to specify the parameters if you perform an operation on an ECS instance:
         * <p>
         * 
         * *   The following common parameters need to be specified for operations on an ECS instance:
         * 
         * change_type, regionId, instanceId, and appId.
         * 
         * *   To change the instance type of an ECS instance, specify the following parameters:
         * 
         * { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_instance_type","instance_type":"ecs.hfr7.2xlarge","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * 
         * *   To stop an ECS instance, specify the following parameters:
         * 
         * { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Stopped","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * 
         * *   To start an ECS instance, specify the following parameters:
         * 
         * { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Running","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * 
         * *   To restart an ECS instance, specify the following parameters:
         * 
         * { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Restart","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }
         * 
         * Enumeration values
         * 
         * <!-- -->
         * 
         * :
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
         */
        public Builder attributes(java.util.Map < String, String > attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putBodyParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * The type of the operation to be performed to modify the parameters of an instance of the specified service. Some operations are common to different services, and other operations are specific to each service. For example, set this parameter to one of the following values to perform the corresponding operation on an ECS instance:
         * <p>
         * 
         * *   rename: modifies the name of an ECS instance.
         * *   modifyInstanceType: changes the instance type of an ECS instance.
         * *   modifyInstanceType: starts an ECS instance.
         * *   modifyInstanceType: stops an ECS instance.
         * *   modifyInstanceType: restarts an ECS instance.
         * *   addTags: adds tags to an ECS instance.
         * *   ecsDelete: deletes an ECS instance.
         * *   modifyPayType: changes the billing method of an ECS instance.
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * The ID of the resource group. This parameter is specified to verify the permissions on the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of the service. If you want to modify the parameters of an Elastic Compute Service (ECS) instance, set this parameter to ecs.
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

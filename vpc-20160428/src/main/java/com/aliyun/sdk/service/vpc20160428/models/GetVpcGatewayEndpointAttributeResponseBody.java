// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcGatewayEndpointAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcGatewayEndpointAttributeResponseBody</p>
 */
public class GetVpcGatewayEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("EndpointDescription")
    private String endpointDescription;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("EndpointName")
    private String endpointName;

    @NameInMap("EndpointStatus")
    private String endpointStatus;

    @NameInMap("PolicyDocument")
    private String policyDocument;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("RouteTables")
    private java.util.List < String > routeTables;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("VpcId")
    private String vpcId;

    private GetVpcGatewayEndpointAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.endpointDescription = builder.endpointDescription;
        this.endpointId = builder.endpointId;
        this.endpointName = builder.endpointName;
        this.endpointStatus = builder.endpointStatus;
        this.policyDocument = builder.policyDocument;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.routeTables = builder.routeTables;
        this.serviceName = builder.serviceName;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcGatewayEndpointAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return endpointDescription
     */
    public String getEndpointDescription() {
        return this.endpointDescription;
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
     * @return endpointStatus
     */
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
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
     * @return routeTables
     */
    public java.util.List < String > getRouteTables() {
        return this.routeTables;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String creationTime; 
        private String endpointDescription; 
        private String endpointId; 
        private String endpointName; 
        private String endpointStatus; 
        private String policyDocument; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List < String > routeTables; 
        private String serviceName; 
        private java.util.List < Tags> tags; 
        private String vpcId; 

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The status of the gateway endpoint. Valid values:
         * <p>
         * 
         * *   **Creating**: being created
         * *   **Created**: created
         * *   **Modifying**: being modified
         * *   **Associating**: being associated
         * *   **Dissociating**: being disassociated
         * *   **Deleting**: being deleted
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * The access policy for the cloud service.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The time when the endpoint was created. The time follows the ISO 8601 standard in UTC in the YYYY-MM-DDThh:mm:ssZ format.
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * EndpointStatus.
         */
        public Builder endpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * PolicyDocument.
         */
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.
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
         * RouteTables.
         */
        public Builder routeTables(java.util.List < String > routeTables) {
            this.routeTables = routeTables;
            return this;
        }

        /**
         * The ID of the route table associated with the gateway endpoint.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public GetVpcGatewayEndpointAttributeResponseBody build() {
            return new GetVpcGatewayEndpointAttributeResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}

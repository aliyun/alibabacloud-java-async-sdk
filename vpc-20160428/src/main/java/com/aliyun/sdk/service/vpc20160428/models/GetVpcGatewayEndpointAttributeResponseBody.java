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

    @NameInMap("RouteTables")
    private java.util.List < String > routeTables;

    @NameInMap("ServiceName")
    private String serviceName;

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
        this.routeTables = builder.routeTables;
        this.serviceName = builder.serviceName;
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
        private java.util.List < String > routeTables; 
        private String serviceName; 
        private String vpcId; 

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * EndpointDescription.
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * EndpointName.
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
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

}

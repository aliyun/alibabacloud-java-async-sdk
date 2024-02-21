// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointResponseBody</p>
 */
public class CreateVpcEndpointResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @NameInMap("ConnectionStatus")
    private String connectionStatus;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EndpointBusinessStatus")
    private String endpointBusinessStatus;

    @NameInMap("EndpointDescription")
    private String endpointDescription;

    @NameInMap("EndpointDomain")
    private String endpointDomain;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("EndpointName")
    private String endpointName;

    @NameInMap("EndpointStatus")
    private String endpointStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("VpcId")
    private String vpcId;

    private CreateVpcEndpointResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.connectionStatus = builder.connectionStatus;
        this.createTime = builder.createTime;
        this.endpointBusinessStatus = builder.endpointBusinessStatus;
        this.endpointDescription = builder.endpointDescription;
        this.endpointDomain = builder.endpointDomain;
        this.endpointId = builder.endpointId;
        this.endpointName = builder.endpointName;
        this.endpointStatus = builder.endpointStatus;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return endpointBusinessStatus
     */
    public String getEndpointBusinessStatus() {
        return this.endpointBusinessStatus;
    }

    /**
     * @return endpointDescription
     */
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    /**
     * @return endpointDomain
     */
    public String getEndpointDomain() {
        return this.endpointDomain;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
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
        private Long bandwidth; 
        private String connectionStatus; 
        private String createTime; 
        private String endpointBusinessStatus; 
        private String endpointDescription; 
        private String endpointDomain; 
        private String endpointId; 
        private String endpointName; 
        private String endpointStatus; 
        private String requestId; 
        private String serviceId; 
        private String serviceName; 
        private String vpcId; 

        /**
         * The bandwidth of the endpoint connection. Unit: Mbit/s.
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The state of the endpoint connection. Valid values:
         * <p>
         * 
         * *   **Pending**: The connection is being modified.
         * *   **Connecting**: The connection is being established.
         * *   **Connected**: The connection is established.
         * *   **Disconnecting**: The endpoint is being disconnected from the endpoint service.
         * *   **Disconnected**: The endpoint is disconnected from the endpoint service.
         * *   **Deleting**: The connection is being deleted.
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * The time when the endpoint was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The service state of the endpoint. Valid values:
         * <p>
         * 
         * *   **Normal**: The endpoint runs as expected.
         * *   **FinancialLocked**: The endpoint is locked due to overdue payments.
         */
        public Builder endpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }

        /**
         * The description of the endpoint.
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * The domain name of the endpoint.
         */
        public Builder endpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * The endpoint ID.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The name of the endpoint.
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * The state of the endpoint. Valid values:
         * <p>
         * 
         * *   **Creating**: The endpoint is being created.
         * *   **Active**: The endpoint is available.
         * *   **Pending**: The endpoint is being modified.
         * *   **Deleting**: The endpoint is being deleted.
         */
        public Builder endpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the endpoint service with which the endpoint is associated.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The name of the endpoint service with which the endpoint is associated.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The ID of the VPC to which the endpoint belongs.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public CreateVpcEndpointResponseBody build() {
            return new CreateVpcEndpointResponseBody(this);
        } 

    } 

}

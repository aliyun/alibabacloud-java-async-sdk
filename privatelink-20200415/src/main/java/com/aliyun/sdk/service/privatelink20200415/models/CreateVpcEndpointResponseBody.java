// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link CreateVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointResponseBody</p>
 */
public class CreateVpcEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
    private String connectionStatus;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EndpointBusinessStatus")
    private String endpointBusinessStatus;

    @com.aliyun.core.annotation.NameInMap("EndpointDescription")
    private String endpointDescription;

    @com.aliyun.core.annotation.NameInMap("EndpointDomain")
    private String endpointDomain;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("EndpointName")
    private String endpointName;

    @com.aliyun.core.annotation.NameInMap("EndpointStatus")
    private String endpointStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateVpcEndpointResponseBody(Builder builder) {
        this.addressIpVersion = builder.addressIpVersion;
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
     * @return addressIpVersion
     */
    public String getAddressIpVersion() {
        return this.addressIpVersion;
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
        private String addressIpVersion; 
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
         * AddressIpVersion.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The state of the endpoint connection. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: The connection is being modified.</li>
         * <li><strong>Connecting</strong>: The connection is being established.</li>
         * <li><strong>Connected</strong>: The connection is established.</li>
         * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
         * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
         * <li><strong>Deleting</strong>: The connection is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * <p>The time when the endpoint was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-02T19:11:12Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The service state of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The endpoint runs as expected.</li>
         * <li><strong>FinancialLocked</strong>: The endpoint is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder endpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }

        /**
         * <p>The description of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my Endpoint.</p>
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * <p>The domain name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****.epsrv-hp3xdsq46ael67lo****.cn-huhehaote.privatelink.aliyuncs.com</p>
         */
        public Builder endpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * <p>The state of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The endpoint is being created.</li>
         * <li><strong>Active</strong>: The endpoint is available.</li>
         * <li><strong>Pending</strong>: The endpoint is being modified.</li>
         * <li><strong>Deleting</strong>: The endpoint is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder endpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3xdsq46ael67lo****</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-hp356stwkxg3fn2xe****</p>
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

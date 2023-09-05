// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEndpointGroupsRequest} extends {@link RequestModel}
 *
 * <p>UpdateEndpointGroupsRequest</p>
 */
public class UpdateEndpointGroupsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EndpointGroupConfigurations")
    @Validation(required = true)
    private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateEndpointGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointGroupConfigurations = builder.endpointGroupConfigurations;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEndpointGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointGroupConfigurations
     */
    public java.util.List < EndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateEndpointGroupsRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEndpointGroupsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.endpointGroupConfigurations = request.endpointGroupConfigurations;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to only precheck the request. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: prechecks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false**: sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Terminal node group configuration information.
         */
        public Builder endpointGroupConfigurations(java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations) {
            this.putQueryParameter("EndpointGroupConfigurations", endpointGroupConfigurations);
            this.endpointGroupConfigurations = endpointGroupConfigurations;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateEndpointGroupsRequest build() {
            return new UpdateEndpointGroupsRequest(this);
        } 

    } 

    public static class EndpointConfigurations extends TeaModel {
        @NameInMap("Endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("Weight")
        @Validation(required = true)
        private Long weight;

        private EndpointConfigurations(Builder builder) {
            this.endpoint = builder.endpoint;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConfigurations create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String endpoint; 
            private String type; 
            private Long weight; 

            /**
             * The IP address, domain name or instance id according to the type of the endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Domain**: a custom domain name
             * *   **Ip**: a custom IP address
             * *   **PublicIp**: a public IP address provided by Alibaba Cloud
             * *   **ECS**: an Elastic Compute Service (ECS) instance
             * *   **SLB**: a Server Load Balancer (SLB) instance
             * *   **ALB**: an Application Load Balancer (ALB) instance
             * *   **OSS**: an Object Storage Service (OSS) bucket
             * 
             * > 
             * *   If you set this parameter to **ECS** or **SLB** and the service-linked role AliyunServiceRoleForGaVpcEndpoint does not exist, the system creates the service-linked role.
             * *   If you set this parameter to **ALB** and the service-linked role AliyunServiceRoleForGaAlb does not exist, the system creates the service-linked role.
             * *   If you set this parameter to **OSS** and the service-linked role AliyunServiceRoleForGaOss does not exist, the system creates the service-linked role.
             * 
             *     For more information, see [Service-linked roles](~~178360~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the endpoint.
             * <p>
             * 
             * Valid values: **0** to **255**.
             * 
             * >  If the weight of an endpoint is set to 0, GA stops distributing network traffic to the endpoint. Proceed with caution.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public EndpointConfigurations build() {
                return new EndpointConfigurations(this);
            } 

        } 

    }
    public static class PortOverrides extends TeaModel {
        @NameInMap("EndpointPort")
        private Long endpointPort;

        @NameInMap("ListenerPort")
        private Long listenerPort;

        private PortOverrides(Builder builder) {
            this.endpointPort = builder.endpointPort;
            this.listenerPort = builder.listenerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortOverrides create() {
            return builder().build();
        }

        /**
         * @return endpointPort
         */
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        /**
         * @return listenerPort
         */
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private Long endpointPort; 
            private Long listenerPort; 

            /**
             * The endpoint port.
             * <p>
             * 
             * Valid values: **1** to **65499**.
             */
            public Builder endpointPort(Long endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * The listening port.
             * <p>
             * 
             * Valid values: **1** to **65499**.
             * 
             * > 
             * *   Only HTTP and HTTPS listeners support port mapping.
             * *   The listener port in a port mapping must be the one used by the current listener.
             */
            public Builder listenerPort(Long listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public PortOverrides build() {
                return new PortOverrides(this);
            } 

        } 

    }
    public static class EndpointGroupConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        private Boolean enableClientIPPreservationProxyProtocol;

        @NameInMap("EnableClientIPPreservationToa")
        private Boolean enableClientIPPreservationToa;

        @NameInMap("EndpointConfigurations")
        @Validation(required = true)
        private java.util.List < EndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointGroupDescription")
        private String endpointGroupDescription;

        @NameInMap("EndpointGroupId")
        @Validation(required = true)
        private String endpointGroupId;

        @NameInMap("EndpointGroupName")
        private String endpointGroupName;

        @NameInMap("EndpointRequestProtocol")
        private String endpointRequestProtocol;

        @NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @NameInMap("HealthCheckIntervalSeconds")
        private Long healthCheckIntervalSeconds;

        @NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @NameInMap("HealthCheckPort")
        private Long healthCheckPort;

        @NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @NameInMap("PortOverrides")
        private java.util.List < PortOverrides> portOverrides;

        @NameInMap("ThresholdCount")
        private Long thresholdCount;

        @NameInMap("TrafficPercentage")
        private Long trafficPercentage;

        private EndpointGroupConfigurations(Builder builder) {
            this.enableClientIPPreservationProxyProtocol = builder.enableClientIPPreservationProxyProtocol;
            this.enableClientIPPreservationToa = builder.enableClientIPPreservationToa;
            this.endpointConfigurations = builder.endpointConfigurations;
            this.endpointGroupDescription = builder.endpointGroupDescription;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointGroupName = builder.endpointGroupName;
            this.endpointRequestProtocol = builder.endpointRequestProtocol;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckIntervalSeconds = builder.healthCheckIntervalSeconds;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckPort = builder.healthCheckPort;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.portOverrides = builder.portOverrides;
            this.thresholdCount = builder.thresholdCount;
            this.trafficPercentage = builder.trafficPercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroupConfigurations create() {
            return builder().build();
        }

        /**
         * @return enableClientIPPreservationProxyProtocol
         */
        public Boolean getEnableClientIPPreservationProxyProtocol() {
            return this.enableClientIPPreservationProxyProtocol;
        }

        /**
         * @return enableClientIPPreservationToa
         */
        public Boolean getEnableClientIPPreservationToa() {
            return this.enableClientIPPreservationToa;
        }

        /**
         * @return endpointConfigurations
         */
        public java.util.List < EndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        /**
         * @return endpointGroupDescription
         */
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointGroupName
         */
        public String getEndpointGroupName() {
            return this.endpointGroupName;
        }

        /**
         * @return endpointRequestProtocol
         */
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        /**
         * @return healthCheckEnabled
         */
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        /**
         * @return healthCheckIntervalSeconds
         */
        public Long getHealthCheckIntervalSeconds() {
            return this.healthCheckIntervalSeconds;
        }

        /**
         * @return healthCheckPath
         */
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        /**
         * @return healthCheckPort
         */
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        /**
         * @return healthCheckProtocol
         */
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        /**
         * @return portOverrides
         */
        public java.util.List < PortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        /**
         * @return thresholdCount
         */
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        /**
         * @return trafficPercentage
         */
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

        public static final class Builder {
            private Boolean enableClientIPPreservationProxyProtocol; 
            private Boolean enableClientIPPreservationToa; 
            private java.util.List < EndpointConfigurations> endpointConfigurations; 
            private String endpointGroupDescription; 
            private String endpointGroupId; 
            private String endpointGroupName; 
            private String endpointRequestProtocol; 
            private Boolean healthCheckEnabled; 
            private Long healthCheckIntervalSeconds; 
            private String healthCheckPath; 
            private Long healthCheckPort; 
            private String healthCheckProtocol; 
            private java.util.List < PortOverrides> portOverrides; 
            private Long thresholdCount; 
            private Long trafficPercentage; 

            /**
             * Specifies whether to use the proxy protocol to preserve client IP addresses. Valid values:
             * <p>
             * 
             * *   **true**: uses the proxy protocol to preserve client IP addresses.
             * *   **false**: does not use the proxy protocol to preserve client IP addresses.
             */
            public Builder enableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
                this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
                return this;
            }

            /**
             * Specifies whether to preserve client IP addresses by using the TCP Option Address (TOA) module. Valid values:
             * <p>
             * 
             * *   **true**: preserves client IP addresses by using the TOA module.
             * *   **false**: does not preserve client IP addresses by using the TOA module.
             */
            public Builder enableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
                this.enableClientIPPreservationToa = enableClientIPPreservationToa;
                return this;
            }

            /**
             * Terminal node configuration information.
             */
            public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * The description of the endpoint group.
             * <p>
             * 
             * The description cannot exceed 256 characters in length and cannot contain `http://` or `https://`.
             */
            public Builder endpointGroupDescription(String endpointGroupDescription) {
                this.endpointGroupDescription = endpointGroupDescription;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The name of the endpoint group.
             * <p>
             * 
             * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
             */
            public Builder endpointGroupName(String endpointGroupName) {
                this.endpointGroupName = endpointGroupName;
                return this;
            }

            /**
             * The protocol that is used by the backend service. Valid values:
             * <p>
             * 
             * *   **HTTP**: HTTP
             * *   **HTTPS**: HTTPS
             * 
             * > 
             * *   You can set this property only if the listener that is associated with the endpoint group uses the HTTP or HTTPS protocol.
             * *   For an HTTP listener, the backend service protocol must be HTTP.
             */
            public Builder endpointRequestProtocol(String endpointRequestProtocol) {
                this.endpointRequestProtocol = endpointRequestProtocol;
                return this;
            }

            /**
             * Specifies whether to enable the health check feature. Default value: false. Valid values:
             * <p>
             * 
             * *   **true**: enables the health check feature.
             * *   **false**: disables the health check feature.
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * The interval at which health checks are performed. Unit: seconds. Valid values: **1** to **50**.
             */
            public Builder healthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
                this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
                return this;
            }

            /**
             * The path to which health check requests are sent.
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * The port that is used for health checks.
             * <p>
             * 
             * Valid values: **1** to **65535**.
             */
            public Builder healthCheckPort(Long healthCheckPort) {
                this.healthCheckPort = healthCheckPort;
                return this;
            }

            /**
             * The protocol over which health check requests are sent.
             * <p>
             * 
             * *   **tcp**: TCP
             * *   **http**: HTTP
             * *   **https**: HTTPS
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * The mappings between ports.
             */
            public Builder portOverrides(java.util.List < PortOverrides> portOverrides) {
                this.portOverrides = portOverrides;
                return this;
            }

            /**
             * The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder thresholdCount(Long thresholdCount) {
                this.thresholdCount = thresholdCount;
                return this;
            }

            /**
             * The traffic ratio for the endpoint group when the specified listener is associated with multiple endpoint groups.
             * <p>
             * 
             * Valid values: **1** to **100**.
             */
            public Builder trafficPercentage(Long trafficPercentage) {
                this.trafficPercentage = trafficPercentage;
                return this;
            }

            public EndpointGroupConfigurations build() {
                return new EndpointGroupConfigurations(this);
            } 

        } 

    }
}

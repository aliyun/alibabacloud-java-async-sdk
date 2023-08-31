// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndAnalyzeNetworkPathRequest} extends {@link RequestModel}
 *
 * <p>CreateAndAnalyzeNetworkPathRequest</p>
 */
public class CreateAndAnalyzeNetworkPathRequest extends Request {
    @Query
    @NameInMap("AuditParam")
    private String auditParam;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceId")
    @Validation(required = true)
    private String sourceId;

    @Query
    @NameInMap("SourceIpAddress")
    private String sourceIpAddress;

    @Query
    @NameInMap("SourcePort")
    private Integer sourcePort;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    @Query
    @NameInMap("TargetId")
    private String targetId;

    @Query
    @NameInMap("TargetIpAddress")
    private String targetIpAddress;

    @Query
    @NameInMap("TargetPort")
    private Integer targetPort;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    private CreateAndAnalyzeNetworkPathRequest(Builder builder) {
        super(builder);
        this.auditParam = builder.auditParam;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.sourceId = builder.sourceId;
        this.sourceIpAddress = builder.sourceIpAddress;
        this.sourcePort = builder.sourcePort;
        this.sourceType = builder.sourceType;
        this.targetId = builder.targetId;
        this.targetIpAddress = builder.targetIpAddress;
        this.targetPort = builder.targetPort;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndAnalyzeNetworkPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditParam
     */
    public String getAuditParam() {
        return this.auditParam;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * @return sourcePort
     */
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetIpAddress
     */
    public String getTargetIpAddress() {
        return this.targetIpAddress;
    }

    /**
     * @return targetPort
     */
    public Integer getTargetPort() {
        return this.targetPort;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<CreateAndAnalyzeNetworkPathRequest, Builder> {
        private String auditParam; 
        private String protocol; 
        private String regionId; 
        private String sourceId; 
        private String sourceIpAddress; 
        private Integer sourcePort; 
        private String sourceType; 
        private String targetId; 
        private String targetIpAddress; 
        private Integer targetPort; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndAnalyzeNetworkPathRequest request) {
            super(request);
            this.auditParam = request.auditParam;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.sourceId = request.sourceId;
            this.sourceIpAddress = request.sourceIpAddress;
            this.sourcePort = request.sourcePort;
            this.sourceType = request.sourceType;
            this.targetId = request.targetId;
            this.targetIpAddress = request.targetIpAddress;
            this.targetPort = request.targetPort;
            this.targetType = request.targetType;
        } 

        /**
         * AuditParam.
         */
        public Builder auditParam(String auditParam) {
            this.putQueryParameter("AuditParam", auditParam);
            this.auditParam = auditParam;
            return this;
        }

        /**
         * The protocol type. Valid values:
         * <p>
         * 
         * *   **tcp**: Transmission Control Protocol (TCP)
         * *   **udp**: User Datagram Protocol (UDP)
         * *   **icmp**: Internet Control Message Protocol (ICMP)
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The ID of the region for which you want to initiate a task for analyzing network reachability.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the source resource.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The source IP address.
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * The source port.
         */
        public Builder sourcePort(Integer sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * The type of the source resource. Valid values:
         * <p>
         * 
         * *   **ecs**: the Elastic Compute Service (ECS) instance
         * *   **internetIp**: the public IP address
         * *   **vsw**: the vSwitch
         * *   **vpn**: the VPN gateway
         * *   **vbr**: the virtual border router (VBR)
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The ID of the destination resource.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The destination IP address.
         */
        public Builder targetIpAddress(String targetIpAddress) {
            this.putQueryParameter("TargetIpAddress", targetIpAddress);
            this.targetIpAddress = targetIpAddress;
            return this;
        }

        /**
         * The destination port.
         */
        public Builder targetPort(Integer targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * The type of the destination resource. Valid values:
         * <p>
         * 
         * *   **ecs**: the ECS instance
         * *   **internetIp**: the public IP address
         * *   **vsw**: the vSwitch
         * *   **vpn**: the VPN gateway
         * *   **vbr**: the VBR
         * *   **clb**: the Classic Load Balancer (CLB) instance
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public CreateAndAnalyzeNetworkPathRequest build() {
            return new CreateAndAnalyzeNetworkPathRequest(this);
        } 

    } 

}

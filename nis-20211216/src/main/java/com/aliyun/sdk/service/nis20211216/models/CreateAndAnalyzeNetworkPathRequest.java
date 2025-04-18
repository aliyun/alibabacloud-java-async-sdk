// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link CreateAndAnalyzeNetworkPathRequest} extends {@link RequestModel}
 *
 * <p>CreateAndAnalyzeNetworkPathRequest</p>
 */
public class CreateAndAnalyzeNetworkPathRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIpAddress")
    private String sourceIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePort")
    private Integer sourcePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIpAddress")
    private String targetIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPort")
    private Integer targetPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private CreateAndAnalyzeNetworkPathRequest(Builder builder) {
        super(builder);
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
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: Transmission Control Protocol (TCP)</li>
         * <li><strong>udp</strong>: User Datagram Protocol (UDP)</li>
         * <li><strong>icmp</strong>: Internet Control Message Protocol (ICMP)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ID of the region for which you want to initiate a task for analyzing network reachability.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the source resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf62y8khhbkbdrp6****</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.putQueryParameter("SourceIpAddress", sourceIpAddress);
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * <p>The source port.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sourcePort(Integer sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * <p>The type of the source resource. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: the Elastic Compute Service (ECS) instance</li>
         * <li><strong>internetIp</strong>: the public IP address</li>
         * <li><strong>vsw</strong>: the vSwitch</li>
         * <li><strong>vpn</strong>: the VPN gateway</li>
         * <li><strong>vbr</strong>: the virtual border router (VBR)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The ID of the destination resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5eactvw7wtpktv5****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.50.XX.XX</p>
         */
        public Builder targetIpAddress(String targetIpAddress) {
            this.putQueryParameter("TargetIpAddress", targetIpAddress);
            this.targetIpAddress = targetIpAddress;
            return this;
        }

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder targetPort(Integer targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * <p>The type of the destination resource. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: the ECS instance</li>
         * <li><strong>internetIp</strong>: the public IP address</li>
         * <li><strong>vsw</strong>: the vSwitch</li>
         * <li><strong>vpn</strong>: the VPN gateway</li>
         * <li><strong>vbr</strong>: the VBR</li>
         * <li><strong>clb</strong>: the Classic Load Balancer (CLB) instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
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

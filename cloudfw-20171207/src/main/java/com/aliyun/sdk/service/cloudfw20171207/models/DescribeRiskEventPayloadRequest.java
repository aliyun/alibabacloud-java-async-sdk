// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskEventPayloadRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskEventPayloadRequest</p>
 */
public class DescribeRiskEventPayloadRequest extends Request {
    @Query
    @NameInMap("DstIP")
    private String dstIP;

    @Query
    @NameInMap("DstVpcId")
    private String dstVpcId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("FirewallType")
    private String firewallType;

    @Query
    @NameInMap("PublicIP")
    private String publicIP;

    @Query
    @NameInMap("SrcIP")
    private String srcIP;

    @Query
    @NameInMap("SrcVpcId")
    private String srcVpcId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("UUID")
    private String UUID;

    private DescribeRiskEventPayloadRequest(Builder builder) {
        super(builder);
        this.dstIP = builder.dstIP;
        this.dstVpcId = builder.dstVpcId;
        this.endTime = builder.endTime;
        this.firewallType = builder.firewallType;
        this.publicIP = builder.publicIP;
        this.srcIP = builder.srcIP;
        this.srcVpcId = builder.srcVpcId;
        this.startTime = builder.startTime;
        this.UUID = builder.UUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventPayloadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstIP
     */
    public String getDstIP() {
        return this.dstIP;
    }

    /**
     * @return dstVpcId
     */
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return publicIP
     */
    public String getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return srcIP
     */
    public String getSrcIP() {
        return this.srcIP;
    }

    /**
     * @return srcVpcId
     */
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    public static final class Builder extends Request.Builder<DescribeRiskEventPayloadRequest, Builder> {
        private String dstIP; 
        private String dstVpcId; 
        private String endTime; 
        private String firewallType; 
        private String publicIP; 
        private String srcIP; 
        private String srcVpcId; 
        private String startTime; 
        private String UUID; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskEventPayloadRequest request) {
            super(request);
            this.dstIP = request.dstIP;
            this.dstVpcId = request.dstVpcId;
            this.endTime = request.endTime;
            this.firewallType = request.firewallType;
            this.publicIP = request.publicIP;
            this.srcIP = request.srcIP;
            this.srcVpcId = request.srcVpcId;
            this.startTime = request.startTime;
            this.UUID = request.UUID;
        } 

        /**
         * The destination IP address to query. If you specify this parameter, all intrusion events with the specified destination IP address are queried.
         */
        public Builder dstIP(String dstIP) {
            this.putQueryParameter("DstIP", dstIP);
            this.dstIP = dstIP;
            return this;
        }

        /**
         * The ID of the destination VPC to query. If you specify this parameter, all intrusion events that contain the specified ID of the destination VPC are queried.
         */
        public Builder dstVpcId(String dstVpcId) {
            this.putQueryParameter("DstVpcId", dstVpcId);
            this.dstVpcId = dstVpcId;
            return this;
        }

        /**
         * The end of the time range to query. The value is a timestamp. Unit: seconds.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The type of the firewall. Valid values:
         * <p>
         * 
         * *   **VpcFirewall**: virtual private cloud (VPC) firewall
         * *   **InternetFirewall** (default): Internet firewall
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * The public IP address. If you specify this parameter, all intrusion events that contain the specified public IP address are queried.
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * The source IP address to query. If you specify this parameter, all intrusion events from the specified source IP address are queried.
         */
        public Builder srcIP(String srcIP) {
            this.putQueryParameter("SrcIP", srcIP);
            this.srcIP = srcIP;
            return this;
        }

        /**
         * The ID of the source VPC to query. If you specify this parameter, all intrusion events that contain the specified ID of the source VPC are queried.
         */
        public Builder srcVpcId(String srcVpcId) {
            this.putQueryParameter("SrcVpcId", srcVpcId);
            this.srcVpcId = srcVpcId;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a timestamp. Unit: seconds.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The UUID of the intrusion event.
         */
        public Builder UUID(String UUID) {
            this.putQueryParameter("UUID", UUID);
            this.UUID = UUID;
            return this;
        }

        @Override
        public DescribeRiskEventPayloadRequest build() {
            return new DescribeRiskEventPayloadRequest(this);
        } 

    } 

}

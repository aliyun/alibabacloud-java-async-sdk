// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallTrafficTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatFirewallTrafficTrendRequest</p>
 */
public class DescribeNatFirewallTrafficTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPrivateIP")
    private String srcPrivateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPublicIP")
    private String srcPublicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeNatFirewallTrafficTrendRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.natGatewayId = builder.natGatewayId;
        this.srcPrivateIP = builder.srcPrivateIP;
        this.srcPublicIP = builder.srcPublicIP;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallTrafficTrendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return srcPrivateIP
     */
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    /**
     * @return srcPublicIP
     */
    public String getSrcPublicIP() {
        return this.srcPublicIP;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeNatFirewallTrafficTrendRequest, Builder> {
        private Long endTime; 
        private Long interval; 
        private String natGatewayId; 
        private String srcPrivateIP; 
        private String srcPublicIP; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatFirewallTrafficTrendRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.interval = request.interval;
            this.natGatewayId = request.natGatewayId;
            this.srcPrivateIP = request.srcPrivateIP;
            this.srcPublicIP = request.srcPublicIP;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp that is accurate to seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1739330580</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time interval between the data entries to return. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><strong>60</strong>: 1 minute</li>
         * <li><strong>1800</strong>: 30 minutes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-xxxxxx</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The private IP address of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>10.100.134.60</p>
         */
        public Builder srcPrivateIP(String srcPrivateIP) {
            this.putQueryParameter("SrcPrivateIP", srcPrivateIP);
            this.srcPrivateIP = srcPrivateIP;
            return this;
        }

        /**
         * <p>The public IP address of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>47.112.210.136</p>
         */
        public Builder srcPublicIP(String srcPublicIP) {
            this.putQueryParameter("SrcPublicIP", srcPublicIP);
            this.srcPublicIP = srcPublicIP;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1739326980</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeNatFirewallTrafficTrendRequest build() {
            return new DescribeNatFirewallTrafficTrendRequest(this);
        } 

    } 

}

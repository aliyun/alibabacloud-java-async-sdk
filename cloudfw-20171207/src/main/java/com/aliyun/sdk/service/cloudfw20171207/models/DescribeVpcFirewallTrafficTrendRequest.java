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
 * {@link DescribeVpcFirewallTrafficTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallTrafficTrendRequest</p>
 */
public class DescribeVpcFirewallTrafficTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcId")
    private String peerVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIP")
    private String privateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private DescribeVpcFirewallTrafficTrendRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.peerVpcId = builder.peerVpcId;
        this.privateIP = builder.privateIP;
        this.startTime = builder.startTime;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallTrafficTrendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return peerVpcId
     */
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * @return privateIP
     */
    public String getPrivateIP() {
        return this.privateIP;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallTrafficTrendRequest, Builder> {
        private String endTime; 
        private String lang; 
        private String peerVpcId; 
        private String privateIP; 
        private String startTime; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallTrafficTrendRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.peerVpcId = request.peerVpcId;
            this.privateIP = request.privateIP;
            this.startTime = request.startTime;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1767493189</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PeerVpcId.
         */
        public Builder peerVpcId(String peerVpcId) {
            this.putQueryParameter("PeerVpcId", peerVpcId);
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * PrivateIP.
         */
        public Builder privateIP(String privateIP) {
            this.putQueryParameter("PrivateIP", privateIP);
            this.privateIP = privateIP;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1780626107</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-j6cnofg4lg1ujx3xj****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeVpcFirewallTrafficTrendRequest build() {
            return new DescribeVpcFirewallTrafficTrendRequest(this);
        } 

    } 

}

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
 * {@link DescribeFirewallVswitchResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeFirewallVswitchResourcesRequest</p>
 */
public class DescribeFirewallVswitchResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private DescribeFirewallVswitchResourcesRequest(Builder builder) {
        super(builder);
        this.firewallType = builder.firewallType;
        this.lang = builder.lang;
        this.regionNo = builder.regionNo;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallVswitchResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeFirewallVswitchResourcesRequest, Builder> {
        private String firewallType; 
        private String lang; 
        private String regionNo; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFirewallVswitchResourcesRequest request) {
            super(request);
            this.firewallType = request.firewallType;
            this.lang = request.lang;
            this.regionNo = request.regionNo;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze36yb348axtnf****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeFirewallVswitchResourcesRequest build() {
            return new DescribeFirewallVswitchResourcesRequest(this);
        } 

    } 

}

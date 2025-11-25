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
 * {@link DescribeNatFirewallPrecheckDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatFirewallPrecheckDetailRequest</p>
 */
public class DescribeNatFirewallPrecheckDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    private DescribeNatFirewallPrecheckDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallPrecheckDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<DescribeNatFirewallPrecheckDetailRequest, Builder> {
        private String lang; 
        private String natGatewayId; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatFirewallPrecheckDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.regionNo = request.regionNo;
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
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public DescribeNatFirewallPrecheckDetailRequest build() {
            return new DescribeNatFirewallPrecheckDetailRequest(this);
        } 

    } 

}

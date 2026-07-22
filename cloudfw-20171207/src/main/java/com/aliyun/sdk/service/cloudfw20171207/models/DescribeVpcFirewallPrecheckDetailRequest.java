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
 * {@link DescribeVpcFirewallPrecheckDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallPrecheckDetailRequest</p>
 */
public class DescribeVpcFirewallPrecheckDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInstanceType")
    private String networkInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeVpcFirewallPrecheckDetailRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.networkInstanceType = builder.networkInstanceType;
        this.region = builder.region;
        this.transitRouterId = builder.transitRouterId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallPrecheckDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return networkInstanceType
     */
    public String getNetworkInstanceType() {
        return this.networkInstanceType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallPrecheckDetailRequest, Builder> {
        private String cenId; 
        private String lang; 
        private String memberUid; 
        private String networkInstanceType; 
        private String region; 
        private String transitRouterId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallPrecheckDetailRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.networkInstanceType = request.networkInstanceType;
            this.region = request.region;
            this.transitRouterId = request.transitRouterId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>云企业网（CEN）实例 ID（可选）。本接口的预检查询实际使用 VpcId 与 TransitRouterId（二选一），不依赖 CenId。</p>
         * 
         * <strong>example:</strong>
         * <p>cen-hxsqf2bv6di1a****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
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
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>网络实例类型（可选）。本接口的预检查询主要依据 VpcId 与 TransitRouterId 参数，不依赖本字段。</p>
         * 
         * <strong>example:</strong>
         * <p>cen_firewall</p>
         */
        public Builder networkInstanceType(String networkInstanceType) {
            this.putQueryParameter("NetworkInstanceType", networkInstanceType);
            this.networkInstanceType = networkInstanceType;
            return this;
        }

        /**
         * <p>地域编号。本接口必填，缺失时返回 ErrorParameters(-360103)。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>转发路由器（TR）实例 ID。VpcId 与 TransitRouterId 至少须提供其一，两者均缺省时返回 ErrorParameters(-360103)。</p>
         * 
         * <strong>example:</strong>
         * <p>tr-2vcn4u2g86tm72****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>VPC 实例 ID。VpcId 与 TransitRouterId 至少须提供其一：查询 VPC 边界防火墙时传 VpcId，查询转发路由器（TR）场景时传 TransitRouterId；两者均缺省时返回 ErrorParameters(-360103)。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zev8s8rxao33xt****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeVpcFirewallPrecheckDetailRequest build() {
            return new DescribeVpcFirewallPrecheckDetailRequest(this);
        } 

    } 

}

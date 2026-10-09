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
         * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
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
         * <p>The language type. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UID of the Cloud Firewall member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>134388541648****</p>
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><p><strong>cen_firewall</strong>: CEN basic edition firewall</p>
         * </li>
         * <li><p><strong>cen_tr_firewall</strong>: CEN-TR firewall</p>
         * </li>
         * </ul>
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
         * <p>The region ID. This parameter is required. If it is not specified, ErrorParameters is returned.</p>
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
         * <p>The transit router instance ID. You must specify at least one of VpcId and TransitRouterId. Specify VpcId when querying a basic edition firewall, or specify TransitRouterId when querying a transit router (TR) scenario. If neither is specified, ErrorParameters is returned.</p>
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
         * <p>The VPC-connected instance ID. You must specify at least one of VpcId and TransitRouterId. Specify VpcId when querying a basic edition firewall, or specify TransitRouterId when querying a forward routing (TR) scenario. If neither is specified, ErrorParameters is returned.</p>
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

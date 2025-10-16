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
 * {@link CreateVpcFirewallPrecheckRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallPrecheckRequest</p>
 */
public class CreateVpcFirewallPrecheckRequest extends Request {
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

    private CreateVpcFirewallPrecheckRequest(Builder builder) {
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

    public static CreateVpcFirewallPrecheckRequest create() {
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

    public static final class Builder extends Request.Builder<CreateVpcFirewallPrecheckRequest, Builder> {
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

        private Builder(CreateVpcFirewallPrecheckRequest request) {
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
         * CenId.
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
         * NetworkInstanceType.
         */
        public Builder networkInstanceType(String networkInstanceType) {
            this.putQueryParameter("NetworkInstanceType", networkInstanceType);
            this.networkInstanceType = networkInstanceType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * TransitRouterId.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateVpcFirewallPrecheckRequest build() {
            return new CreateVpcFirewallPrecheckRequest(this);
        } 

    } 

}

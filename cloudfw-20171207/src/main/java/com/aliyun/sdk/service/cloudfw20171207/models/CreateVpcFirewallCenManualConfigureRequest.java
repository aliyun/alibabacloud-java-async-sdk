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
 * {@link CreateVpcFirewallCenManualConfigureRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallCenManualConfigureRequest</p>
 */
public class CreateVpcFirewallCenManualConfigureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateVpcFirewallCenManualConfigureRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.vSwitchId = builder.vSwitchId;
        this.vpcFirewallName = builder.vpcFirewallName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallCenManualConfigureRequest create() {
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateVpcFirewallCenManualConfigureRequest, Builder> {
        private String cenId; 
        private String lang; 
        private String memberUid; 
        private String vSwitchId; 
        private String vpcFirewallName; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcFirewallCenManualConfigureRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.vSwitchId = request.vSwitchId;
            this.vpcFirewallName = request.vpcFirewallName;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-37nddhri7jf0d2****</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-qzeaol304m***</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateVpcFirewallCenManualConfigureRequest build() {
            return new CreateVpcFirewallCenManualConfigureRequest(this);
        } 

    } 

}

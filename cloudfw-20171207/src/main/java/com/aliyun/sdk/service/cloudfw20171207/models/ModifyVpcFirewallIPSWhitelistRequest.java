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
 * {@link ModifyVpcFirewallIPSWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallIPSWhitelistRequest</p>
 */
public class ModifyVpcFirewallIPSWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long listType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListValue")
    private String listValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private Long memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long whiteType;

    private ModifyVpcFirewallIPSWhitelistRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.listType = builder.listType;
        this.listValue = builder.listValue;
        this.memberUid = builder.memberUid;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.whiteType = builder.whiteType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallIPSWhitelistRequest create() {
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
     * @return listType
     */
    public Long getListType() {
        return this.listType;
    }

    /**
     * @return listValue
     */
    public String getListValue() {
        return this.listValue;
    }

    /**
     * @return memberUid
     */
    public Long getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    /**
     * @return whiteType
     */
    public Long getWhiteType() {
        return this.whiteType;
    }

    public static final class Builder extends Request.Builder<ModifyVpcFirewallIPSWhitelistRequest, Builder> {
        private String lang; 
        private Long listType; 
        private String listValue; 
        private Long memberUid; 
        private String vpcFirewallId; 
        private Long whiteType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcFirewallIPSWhitelistRequest request) {
            super(request);
            this.lang = request.lang;
            this.listType = request.listType;
            this.listValue = request.listValue;
            this.memberUid = request.memberUid;
            this.vpcFirewallId = request.vpcFirewallId;
            this.whiteType = request.whiteType;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>The type of the list. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: user-defined</li>
         * <li><strong>2</strong>: address book</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder listType(Long listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * <p>The entry in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>10.130.0.0/20,10.130.17.11/32</p>
         */
        public Builder listValue(String listValue) {
            this.putQueryParameter("ListValue", listValue);
            this.listValue = listValue;
            return this;
        }

        /**
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1415189284827022</p>
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-d7b8ce273791475b9b0b</p>
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * <p>The type of the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: destination</li>
         * <li><strong>2</strong>: source</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder whiteType(Long whiteType) {
            this.putQueryParameter("WhiteType", whiteType);
            this.whiteType = whiteType;
            return this;
        }

        @Override
        public ModifyVpcFirewallIPSWhitelistRequest build() {
            return new ModifyVpcFirewallIPSWhitelistRequest(this);
        } 

    } 

}

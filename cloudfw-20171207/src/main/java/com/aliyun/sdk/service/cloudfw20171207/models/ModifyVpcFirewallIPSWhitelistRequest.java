// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallIPSWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallIPSWhitelistRequest</p>
 */
public class ModifyVpcFirewallIPSWhitelistRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ListType")
    @Validation(required = true)
    private Long listType;

    @Query
    @NameInMap("ListValue")
    private String listValue;

    @Query
    @NameInMap("MemberUid")
    private Long memberUid;

    @Query
    @NameInMap("VpcFirewallId")
    @Validation(required = true)
    private String vpcFirewallId;

    @Query
    @NameInMap("WhiteType")
    @Validation(required = true)
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
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The type of the list. Valid values:
         * <p>
         * 
         * *   **1**: user-defined
         * *   **2**: address book
         */
        public Builder listType(Long listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * The entry in the list.
         */
        public Builder listValue(String listValue) {
            this.putQueryParameter("ListValue", listValue);
            this.listValue = listValue;
            return this;
        }

        /**
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * The type of the whitelist. Valid values:
         * <p>
         * 
         * *   **1**: destination
         * *   **2**: source
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupNetworkPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiGroupNetworkPolicyRequest</p>
 */
public class ModifyApiGroupNetworkPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsPolicy")
    private String httpsPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InnerDomainEnable")
    private Boolean innerDomainEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetEnable")
    private Boolean internetEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetIPV6Enable")
    private Boolean internetIPV6Enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcIntranetEnable")
    private Boolean vpcIntranetEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcSlbIntranetEnable")
    private Boolean vpcSlbIntranetEnable;

    private ModifyApiGroupNetworkPolicyRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.httpsPolicy = builder.httpsPolicy;
        this.innerDomainEnable = builder.innerDomainEnable;
        this.internetEnable = builder.internetEnable;
        this.internetIPV6Enable = builder.internetIPV6Enable;
        this.securityToken = builder.securityToken;
        this.vpcIntranetEnable = builder.vpcIntranetEnable;
        this.vpcSlbIntranetEnable = builder.vpcSlbIntranetEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupNetworkPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return httpsPolicy
     */
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    /**
     * @return innerDomainEnable
     */
    public Boolean getInnerDomainEnable() {
        return this.innerDomainEnable;
    }

    /**
     * @return internetEnable
     */
    public Boolean getInternetEnable() {
        return this.internetEnable;
    }

    /**
     * @return internetIPV6Enable
     */
    public Boolean getInternetIPV6Enable() {
        return this.internetIPV6Enable;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return vpcIntranetEnable
     */
    public Boolean getVpcIntranetEnable() {
        return this.vpcIntranetEnable;
    }

    /**
     * @return vpcSlbIntranetEnable
     */
    public Boolean getVpcSlbIntranetEnable() {
        return this.vpcSlbIntranetEnable;
    }

    public static final class Builder extends Request.Builder<ModifyApiGroupNetworkPolicyRequest, Builder> {
        private String groupId; 
        private String httpsPolicy; 
        private Boolean innerDomainEnable; 
        private Boolean internetEnable; 
        private Boolean internetIPV6Enable; 
        private String securityToken; 
        private Boolean vpcIntranetEnable; 
        private Boolean vpcSlbIntranetEnable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiGroupNetworkPolicyRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.httpsPolicy = request.httpsPolicy;
            this.innerDomainEnable = request.innerDomainEnable;
            this.internetEnable = request.internetEnable;
            this.internetIPV6Enable = request.internetIPV6Enable;
            this.securityToken = request.securityToken;
            this.vpcIntranetEnable = request.vpcIntranetEnable;
            this.vpcSlbIntranetEnable = request.vpcSlbIntranetEnable;
        } 

        /**
         * The ID of the API group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The HTTPS security policy.
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.putQueryParameter("HttpsPolicy", httpsPolicy);
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * Specifies whether to disable the public second-level domain name.
         */
        public Builder innerDomainEnable(Boolean innerDomainEnable) {
            this.putQueryParameter("InnerDomainEnable", innerDomainEnable);
            this.innerDomainEnable = innerDomainEnable;
            return this;
        }

        /**
         * Specifies whether to enable the virtual private cloud (VPC) second-level domain name.
         */
        public Builder internetEnable(Boolean internetEnable) {
            this.putQueryParameter("InternetEnable", internetEnable);
            this.internetEnable = internetEnable;
            return this;
        }

        /**
         * Specifies whether to enable IPv6. Valid values: **true** and **false**.
         */
        public Builder internetIPV6Enable(Boolean internetIPV6Enable) {
            this.putQueryParameter("InternetIPV6Enable", internetIPV6Enable);
            this.internetIPV6Enable = internetIPV6Enable;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Specifies whether to enable the VPC domain name. Valid values:
         * <p>
         * 
         * *   TRUE
         * *   FALSE
         */
        public Builder vpcIntranetEnable(Boolean vpcIntranetEnable) {
            this.putQueryParameter("VpcIntranetEnable", vpcIntranetEnable);
            this.vpcIntranetEnable = vpcIntranetEnable;
            return this;
        }

        /**
         * Specifies whether to enable the self-calling domain name.
         */
        public Builder vpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
            this.putQueryParameter("VpcSlbIntranetEnable", vpcSlbIntranetEnable);
            this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
            return this;
        }

        @Override
        public ModifyApiGroupNetworkPolicyRequest build() {
            return new ModifyApiGroupNetworkPolicyRequest(this);
        } 

    } 

}

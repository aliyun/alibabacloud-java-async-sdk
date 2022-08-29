// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupNetworkPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiGroupNetworkPolicyRequest</p>
 */
public class ModifyApiGroupNetworkPolicyRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("HttpsPolicy")
    private String httpsPolicy;

    @Query
    @NameInMap("InternetEnable")
    private Boolean internetEnable;

    @Query
    @NameInMap("InternetIPV6Enable")
    private Boolean internetIPV6Enable;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VpcIntranetEnable")
    private Boolean vpcIntranetEnable;

    @Query
    @NameInMap("VpcSlbIntranetEnable")
    private Boolean vpcSlbIntranetEnable;

    private ModifyApiGroupNetworkPolicyRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.httpsPolicy = builder.httpsPolicy;
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
            this.internetEnable = request.internetEnable;
            this.internetIPV6Enable = request.internetIPV6Enable;
            this.securityToken = request.securityToken;
            this.vpcIntranetEnable = request.vpcIntranetEnable;
            this.vpcSlbIntranetEnable = request.vpcSlbIntranetEnable;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * HttpsPolicy.
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.putQueryParameter("HttpsPolicy", httpsPolicy);
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * InternetEnable.
         */
        public Builder internetEnable(Boolean internetEnable) {
            this.putQueryParameter("InternetEnable", internetEnable);
            this.internetEnable = internetEnable;
            return this;
        }

        /**
         * InternetIPV6Enable.
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
         * VpcIntranetEnable.
         */
        public Builder vpcIntranetEnable(Boolean vpcIntranetEnable) {
            this.putQueryParameter("VpcIntranetEnable", vpcIntranetEnable);
            this.vpcIntranetEnable = vpcIntranetEnable;
            return this;
        }

        /**
         * VpcSlbIntranetEnable.
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

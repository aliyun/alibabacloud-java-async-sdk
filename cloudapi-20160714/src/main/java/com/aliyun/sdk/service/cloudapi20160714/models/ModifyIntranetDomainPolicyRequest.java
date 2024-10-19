// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyIntranetDomainPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyIntranetDomainPolicyRequest</p>
 */
public class ModifyIntranetDomainPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcIntranetEnable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean vpcIntranetEnable;

    private ModifyIntranetDomainPolicyRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.vpcIntranetEnable = builder.vpcIntranetEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIntranetDomainPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyIntranetDomainPolicyRequest, Builder> {
        private String groupId; 
        private String securityToken; 
        private Boolean vpcIntranetEnable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIntranetDomainPolicyRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.vpcIntranetEnable = request.vpcIntranetEnable;
        } 

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * <p>Specifies whether to enable the VPC domain name. Valid values:</p>
         * <ul>
         * <li>TRUE</li>
         * <li>FALSE</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder vpcIntranetEnable(Boolean vpcIntranetEnable) {
            this.putQueryParameter("VpcIntranetEnable", vpcIntranetEnable);
            this.vpcIntranetEnable = vpcIntranetEnable;
            return this;
        }

        @Override
        public ModifyIntranetDomainPolicyRequest build() {
            return new ModifyIntranetDomainPolicyRequest(this);
        } 

    } 

}

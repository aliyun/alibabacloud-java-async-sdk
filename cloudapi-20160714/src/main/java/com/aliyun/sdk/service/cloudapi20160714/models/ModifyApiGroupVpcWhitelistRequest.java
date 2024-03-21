// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupVpcWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiGroupVpcWhitelistRequest</p>
 */
public class ModifyApiGroupVpcWhitelistRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VpcIds")
    @Validation(required = true)
    private String vpcIds;

    private ModifyApiGroupVpcWhitelistRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.vpcIds = builder.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupVpcWhitelistRequest create() {
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
     * @return vpcIds
     */
    public String getVpcIds() {
        return this.vpcIds;
    }

    public static final class Builder extends Request.Builder<ModifyApiGroupVpcWhitelistRequest, Builder> {
        private String groupId; 
        private String securityToken; 
        private String vpcIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiGroupVpcWhitelistRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.vpcIds = request.vpcIds;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The ID of the VPC instance.
         */
        public Builder vpcIds(String vpcIds) {
            this.putQueryParameter("VpcIds", vpcIds);
            this.vpcIds = vpcIds;
            return this;
        }

        @Override
        public ModifyApiGroupVpcWhitelistRequest build() {
            return new ModifyApiGroupVpcWhitelistRequest(this);
        } 

    } 

}

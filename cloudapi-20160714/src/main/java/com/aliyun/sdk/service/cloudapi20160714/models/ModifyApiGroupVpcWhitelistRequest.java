// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ModifyApiGroupVpcWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiGroupVpcWhitelistRequest</p>
 */
public class ModifyApiGroupVpcWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the API group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9b80408147724ddab4c4e2703c6ca019</p>
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
         * <p>The ID of the VPC instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp11w979o2s9rcr962w25</p>
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

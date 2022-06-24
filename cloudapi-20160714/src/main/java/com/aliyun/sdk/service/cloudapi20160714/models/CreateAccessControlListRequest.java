// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessControlListRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessControlListRequest</p>
 */
public class CreateAccessControlListRequest extends Request {
    @Query
    @NameInMap("AclName")
    @Validation(required = true)
    private String aclName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CreateAccessControlListRequest(Builder builder) {
        super(builder);
        this.aclName = builder.aclName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessControlListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclName
     */
    public String getAclName() {
        return this.aclName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateAccessControlListRequest, Builder> {
        private String aclName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessControlListRequest request) {
            super(request);
            this.aclName = request.aclName;
            this.securityToken = request.securityToken;
        } 

        /**
         * AclName.
         */
        public Builder aclName(String aclName) {
            this.putQueryParameter("AclName", aclName);
            this.aclName = aclName;
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

        @Override
        public CreateAccessControlListRequest build() {
            return new CreateAccessControlListRequest(this);
        } 

    } 

}

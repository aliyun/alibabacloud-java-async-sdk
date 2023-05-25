// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccessControlListAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetAccessControlListAttributeRequest</p>
 */
public class SetAccessControlListAttributeRequest extends Request {
    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("AclName")
    @Validation(required = true)
    private String aclName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetAccessControlListAttributeRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccessControlListAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
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

    public static final class Builder extends Request.Builder<SetAccessControlListAttributeRequest, Builder> {
        private String aclId; 
        private String aclName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetAccessControlListAttributeRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.aclName = request.aclName;
            this.securityToken = request.securityToken;
        } 

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
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
        public SetAccessControlListAttributeRequest build() {
            return new SetAccessControlListAttributeRequest(this);
        } 

    } 

}

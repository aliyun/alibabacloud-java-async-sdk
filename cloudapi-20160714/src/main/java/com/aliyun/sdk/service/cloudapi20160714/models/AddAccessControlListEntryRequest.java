// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAccessControlListEntryRequest} extends {@link RequestModel}
 *
 * <p>AddAccessControlListEntryRequest</p>
 */
public class AddAccessControlListEntryRequest extends Request {
    @Query
    @NameInMap("AclEntrys")
    private String aclEntrys;

    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private AddAccessControlListEntryRequest(Builder builder) {
        super(builder);
        this.aclEntrys = builder.aclEntrys;
        this.aclId = builder.aclId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAccessControlListEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclEntrys
     */
    public String getAclEntrys() {
        return this.aclEntrys;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<AddAccessControlListEntryRequest, Builder> {
        private String aclEntrys; 
        private String aclId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddAccessControlListEntryRequest request) {
            super(request);
            this.aclEntrys = request.aclEntrys;
            this.aclId = request.aclId;
            this.securityToken = request.securityToken;
        } 

        /**
         * AclEntrys.
         */
        public Builder aclEntrys(String aclEntrys) {
            this.putQueryParameter("AclEntrys", aclEntrys);
            this.aclEntrys = aclEntrys;
            return this;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public AddAccessControlListEntryRequest build() {
            return new AddAccessControlListEntryRequest(this);
        } 

    } 

}

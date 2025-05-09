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
 * {@link RemoveAccessControlListEntryRequest} extends {@link RequestModel}
 *
 * <p>RemoveAccessControlListEntryRequest</p>
 */
public class RemoveAccessControlListEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclEntrys")
    private String aclEntrys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private RemoveAccessControlListEntryRequest(Builder builder) {
        super(builder);
        this.aclEntrys = builder.aclEntrys;
        this.aclId = builder.aclId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAccessControlListEntryRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveAccessControlListEntryRequest, Builder> {
        private String aclEntrys; 
        private String aclId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAccessControlListEntryRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-bp12ag0xxcfhq1ll68wp9</p>
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
        public RemoveAccessControlListEntryRequest build() {
            return new RemoveAccessControlListEntryRequest(this);
        } 

    } 

}

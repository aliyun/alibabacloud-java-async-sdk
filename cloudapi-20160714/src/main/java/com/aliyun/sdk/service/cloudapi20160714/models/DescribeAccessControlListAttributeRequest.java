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
 * {@link DescribeAccessControlListAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessControlListAttributeRequest</p>
 */
public class DescribeAccessControlListAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeAccessControlListAttributeRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessControlListAttributeRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeAccessControlListAttributeRequest, Builder> {
        private String aclId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessControlListAttributeRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-3nsohdozz0ru8fi5onwz1</p>
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
        public DescribeAccessControlListAttributeRequest build() {
            return new DescribeAccessControlListAttributeRequest(this);
        } 

    } 

}

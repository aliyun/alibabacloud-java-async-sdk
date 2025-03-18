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
 * {@link AddAccessControlListEntryRequest} extends {@link RequestModel}
 *
 * <p>AddAccessControlListEntryRequest</p>
 */
public class AddAccessControlListEntryRequest extends Request {
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
         * <p>The ACL settings.</p>
         * <ul>
         * <li>entry: the entries that you want to add to the ACL. You can add CIDR blocks. Separate multiple CIDR blocks with commas (,).</li>
         * <li>comment: the description of the ACL.</li>
         * </ul>
         * <blockquote>
         * <p>You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;entry&quot;: &quot;192.168.1.0/24&quot;, &quot;comment&quot;: &quot;test&quot;}]</p>
         */
        public Builder aclEntrys(String aclEntrys) {
            this.putQueryParameter("AclEntrys", aclEntrys);
            this.aclEntrys = aclEntrys;
            return this;
        }

        /**
         * <p>The ID of the access control list (ACL).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-bp1ohqkonqybecf4llbrc</p>
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

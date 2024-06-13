// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessControlListRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessControlListRequest</p>
 */
public class CreateAccessControlListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private CreateAccessControlListRequest(Builder builder) {
        super(builder);
        this.aclName = builder.aclName;
        this.addressIPVersion = builder.addressIPVersion;
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
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateAccessControlListRequest, Builder> {
        private String aclName; 
        private String addressIPVersion; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessControlListRequest request) {
            super(request);
            this.aclName = request.aclName;
            this.addressIPVersion = request.addressIPVersion;
            this.securityToken = request.securityToken;
        } 

        /**
         * The name of the ACL. The name must be 1 to 30 characters in length, and can contain letters, digits, periods (.), hyphens (-), forward slashes (/), and underscores (\_). The name must be unique within the region.
         */
        public Builder aclName(String aclName) {
            this.putQueryParameter("AclName", aclName);
            this.aclName = aclName;
            return this;
        }

        /**
         * The IP version of the Classic Load Balancer (CLB) instance with which the ACL is associated. Valid values:
         * <p>
         * 
         * *   **ipv4**
         * *   **ipv6**
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.putQueryParameter("AddressIPVersion", addressIPVersion);
            this.addressIPVersion = addressIPVersion;
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

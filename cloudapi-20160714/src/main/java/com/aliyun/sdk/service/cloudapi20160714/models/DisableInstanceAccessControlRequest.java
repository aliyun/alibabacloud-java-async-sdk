// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInstanceAccessControlRequest} extends {@link RequestModel}
 *
 * <p>DisableInstanceAccessControlRequest</p>
 */
public class DisableInstanceAccessControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DisableInstanceAccessControlRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.addressIPVersion = builder.addressIPVersion;
        this.instanceId = builder.instanceId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableInstanceAccessControlRequest create() {
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
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DisableInstanceAccessControlRequest, Builder> {
        private String aclId; 
        private String addressIPVersion; 
        private String instanceId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DisableInstanceAccessControlRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.addressIPVersion = request.addressIPVersion;
            this.instanceId = request.instanceId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the access control policy.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * IP版本，可以设置为**ipv4**或者**ipv6**。
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.putQueryParameter("AddressIPVersion", addressIPVersion);
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public DisableInstanceAccessControlRequest build() {
            return new DisableInstanceAccessControlRequest(this);
        } 

    } 

}

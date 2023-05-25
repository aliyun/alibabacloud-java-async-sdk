// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableInstanceAccessControlRequest} extends {@link RequestModel}
 *
 * <p>EnableInstanceAccessControlRequest</p>
 */
public class EnableInstanceAccessControlRequest extends Request {
    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("AclType")
    @Validation(required = true)
    private String aclType;

    @Query
    @NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private EnableInstanceAccessControlRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclType = builder.aclType;
        this.addressIPVersion = builder.addressIPVersion;
        this.instanceId = builder.instanceId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInstanceAccessControlRequest create() {
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
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
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

    public static final class Builder extends Request.Builder<EnableInstanceAccessControlRequest, Builder> {
        private String aclId; 
        private String aclType; 
        private String addressIPVersion; 
        private String instanceId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(EnableInstanceAccessControlRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.aclType = request.aclType;
            this.addressIPVersion = request.addressIPVersion;
            this.instanceId = request.instanceId;
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
         * AclType.
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * AddressIPVersion.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.putQueryParameter("AddressIPVersion", addressIPVersion);
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * InstanceId.
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
        public EnableInstanceAccessControlRequest build() {
            return new EnableInstanceAccessControlRequest(this);
        } 

    } 

}

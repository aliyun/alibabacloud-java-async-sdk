// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetReqAuthConfigRequest} extends {@link RequestModel}
 *
 * <p>SetReqAuthConfigRequest</p>
 */
public class SetReqAuthConfigRequest extends Request {
    @Query
    @NameInMap("AuthRemoteDesc")
    private String authRemoteDesc;

    @Query
    @NameInMap("AuthType")
    @Validation(required = true)
    private String authType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Key1")
    private String key1;

    @Query
    @NameInMap("Key2")
    private String key2;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TimeOut")
    private String timeOut;

    private SetReqAuthConfigRequest(Builder builder) {
        super(builder);
        this.authRemoteDesc = builder.authRemoteDesc;
        this.authType = builder.authType;
        this.domainName = builder.domainName;
        this.key1 = builder.key1;
        this.key2 = builder.key2;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.timeOut = builder.timeOut;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetReqAuthConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authRemoteDesc
     */
    public String getAuthRemoteDesc() {
        return this.authRemoteDesc;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return key1
     */
    public String getKey1() {
        return this.key1;
    }

    /**
     * @return key2
     */
    public String getKey2() {
        return this.key2;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return timeOut
     */
    public String getTimeOut() {
        return this.timeOut;
    }

    public static final class Builder extends Request.Builder<SetReqAuthConfigRequest, Builder> {
        private String authRemoteDesc; 
        private String authType; 
        private String domainName; 
        private String key1; 
        private String key2; 
        private Long ownerId; 
        private String securityToken; 
        private String timeOut; 

        private Builder() {
            super();
        } 

        private Builder(SetReqAuthConfigRequest response) {
            super(response);
            this.authRemoteDesc = response.authRemoteDesc;
            this.authType = response.authType;
            this.domainName = response.domainName;
            this.key1 = response.key1;
            this.key2 = response.key2;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
            this.timeOut = response.timeOut;
        } 

        /**
         * AuthRemoteDesc.
         */
        public Builder authRemoteDesc(String authRemoteDesc) {
            this.putQueryParameter("AuthRemoteDesc", authRemoteDesc);
            this.authRemoteDesc = authRemoteDesc;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Key1.
         */
        public Builder key1(String key1) {
            this.putQueryParameter("Key1", key1);
            this.key1 = key1;
            return this;
        }

        /**
         * Key2.
         */
        public Builder key2(String key2) {
            this.putQueryParameter("Key2", key2);
            this.key2 = key2;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * TimeOut.
         */
        public Builder timeOut(String timeOut) {
            this.putQueryParameter("TimeOut", timeOut);
            this.timeOut = timeOut;
            return this;
        }

        @Override
        public SetReqAuthConfigRequest build() {
            return new SetReqAuthConfigRequest(this);
        } 

    } 

}

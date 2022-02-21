// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetReqHeaderConfigRequest} extends {@link RequestModel}
 *
 * <p>SetReqHeaderConfigRequest</p>
 */
public class SetReqHeaderConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private SetReqHeaderConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.key = builder.key;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetReqHeaderConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<SetReqHeaderConfigRequest, Builder> {
        private Long configId; 
        private String domainName; 
        private String key; 
        private Long ownerId; 
        private String securityToken; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(SetReqHeaderConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.key = response.key;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
            this.value = response.value;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
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
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
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
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public SetReqHeaderConfigRequest build() {
            return new SetReqHeaderConfigRequest(this);
        } 

    } 

}

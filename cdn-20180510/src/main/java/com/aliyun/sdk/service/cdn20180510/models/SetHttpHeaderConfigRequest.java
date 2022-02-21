// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetHttpHeaderConfigRequest} extends {@link RequestModel}
 *
 * <p>SetHttpHeaderConfigRequest</p>
 */
public class SetHttpHeaderConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("HeaderKey")
    @Validation(required = true)
    private String headerKey;

    @Query
    @NameInMap("HeaderValue")
    @Validation(required = true)
    private String headerValue;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetHttpHeaderConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.headerKey = builder.headerKey;
        this.headerValue = builder.headerValue;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpHeaderConfigRequest create() {
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
     * @return headerKey
     */
    public String getHeaderKey() {
        return this.headerKey;
    }

    /**
     * @return headerValue
     */
    public String getHeaderValue() {
        return this.headerValue;
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

    public static final class Builder extends Request.Builder<SetHttpHeaderConfigRequest, Builder> {
        private Long configId; 
        private String domainName; 
        private String headerKey; 
        private String headerValue; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetHttpHeaderConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.domainName = response.domainName;
            this.headerKey = response.headerKey;
            this.headerValue = response.headerValue;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
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
         * HeaderKey.
         */
        public Builder headerKey(String headerKey) {
            this.putQueryParameter("HeaderKey", headerKey);
            this.headerKey = headerKey;
            return this;
        }

        /**
         * HeaderValue.
         */
        public Builder headerValue(String headerValue) {
            this.putQueryParameter("HeaderValue", headerValue);
            this.headerValue = headerValue;
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

        @Override
        public SetHttpHeaderConfigRequest build() {
            return new SetHttpHeaderConfigRequest(this);
        } 

    } 

}

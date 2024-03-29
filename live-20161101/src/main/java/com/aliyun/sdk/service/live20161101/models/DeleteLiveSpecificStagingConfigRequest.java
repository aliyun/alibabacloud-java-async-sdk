// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveSpecificStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveSpecificStagingConfigRequest</p>
 */
public class DeleteLiveSpecificStagingConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    @Validation(required = true)
    private String configId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteLiveSpecificStagingConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveSpecificStagingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<DeleteLiveSpecificStagingConfigRequest, Builder> {
        private String configId; 
        private String domainName; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveSpecificStagingConfigRequest request) {
            super(request);
            this.configId = request.configId;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
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
        public DeleteLiveSpecificStagingConfigRequest build() {
            return new DeleteLiveSpecificStagingConfigRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopCdnDomainRequest} extends {@link RequestModel}
 *
 * <p>BatchStopCdnDomainRequest</p>
 */
public class BatchStopCdnDomainRequest extends Request {
    @Query
    @NameInMap("DomainNames")
    @Validation(required = true)
    private String domainNames;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private BatchStopCdnDomainRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStopCdnDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
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

    public static final class Builder extends Request.Builder<BatchStopCdnDomainRequest, Builder> {
        private String domainNames; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchStopCdnDomainRequest response) {
            super(response);
            this.domainNames = response.domainNames;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
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
        public BatchStopCdnDomainRequest build() {
            return new BatchStopCdnDomainRequest(this);
        } 

    } 

}

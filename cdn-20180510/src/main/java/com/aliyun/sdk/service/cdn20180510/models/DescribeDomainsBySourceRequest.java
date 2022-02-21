// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainsBySourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainsBySourceRequest</p>
 */
public class DescribeDomainsBySourceRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Sources")
    @Validation(required = true)
    private String sources;

    private DescribeDomainsBySourceRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.sources = builder.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainsBySourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sources
     */
    public String getSources() {
        return this.sources;
    }

    public static final class Builder extends Request.Builder<DescribeDomainsBySourceRequest, Builder> {
        private Long ownerId; 
        private String securityToken; 
        private String sources; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainsBySourceRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
            this.sources = response.sources;
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
         * Sources.
         */
        public Builder sources(String sources) {
            this.putQueryParameter("Sources", sources);
            this.sources = sources;
            return this;
        }

        @Override
        public DescribeDomainsBySourceRequest build() {
            return new DescribeDomainsBySourceRequest(this);
        } 

    } 

}

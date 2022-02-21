// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnRegionAndIspRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnRegionAndIspRequest</p>
 */
public class DescribeCdnRegionAndIspRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeCdnRegionAndIspRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnRegionAndIspRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCdnRegionAndIspRequest, Builder> {
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnRegionAndIspRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
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
        public DescribeCdnRegionAndIspRequest build() {
            return new DescribeCdnRegionAndIspRequest(this);
        } 

    } 

}

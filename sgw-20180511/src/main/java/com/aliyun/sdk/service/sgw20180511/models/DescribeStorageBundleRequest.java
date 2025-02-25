// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageBundleRequest} extends {@link RequestModel}
 *
 * <p>DescribeStorageBundleRequest</p>
 */
public class DescribeStorageBundleRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StorageBundleId")
    @Validation(required = true)
    private String storageBundleId;

    private DescribeStorageBundleRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.storageBundleId = builder.storageBundleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageBundleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return storageBundleId
     */
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public static final class Builder extends Request.Builder<DescribeStorageBundleRequest, Builder> {
        private String securityToken; 
        private String storageBundleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStorageBundleRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.storageBundleId = request.storageBundleId;
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
         * StorageBundleId.
         */
        public Builder storageBundleId(String storageBundleId) {
            this.putQueryParameter("StorageBundleId", storageBundleId);
            this.storageBundleId = storageBundleId;
            return this;
        }

        @Override
        public DescribeStorageBundleRequest build() {
            return new DescribeStorageBundleRequest(this);
        } 

    } 

}

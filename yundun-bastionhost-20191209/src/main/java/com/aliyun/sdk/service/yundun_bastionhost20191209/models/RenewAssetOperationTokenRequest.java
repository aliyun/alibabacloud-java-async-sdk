// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewAssetOperationTokenRequest} extends {@link RequestModel}
 *
 * <p>RenewAssetOperationTokenRequest</p>
 */
public class RenewAssetOperationTokenRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TokenId")
    private String tokenId;

    private RenewAssetOperationTokenRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.tokenId = builder.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewAssetOperationTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tokenId
     */
    public String getTokenId() {
        return this.tokenId;
    }

    public static final class Builder extends Request.Builder<RenewAssetOperationTokenRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String tokenId; 

        private Builder() {
            super();
        } 

        private Builder(RenewAssetOperationTokenRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.tokenId = request.tokenId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TokenId.
         */
        public Builder tokenId(String tokenId) {
            this.putQueryParameter("TokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        @Override
        public RenewAssetOperationTokenRequest build() {
            return new RenewAssetOperationTokenRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssetsDeleteAssetRequest} extends {@link RequestModel}
 *
 * <p>AssetsDeleteAssetRequest</p>
 */
public class AssetsDeleteAssetRequest extends Request {
    @NameInMap("Asset")
    private CommonAsset asset;

    private AssetsDeleteAssetRequest(Builder builder) {
        super(builder);
        this.asset = builder.asset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssetsDeleteAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asset
     */
    public CommonAsset getAsset() {
        return this.asset;
    }

    public static final class Builder extends Request.Builder<AssetsDeleteAssetRequest, Builder> {
        private CommonAsset asset; 

        private Builder() {
            super();
        } 

        private Builder(AssetsDeleteAssetRequest request) {
            super(request);
            this.asset = request.asset;
        } 

        /**
         * Asset
         */
        public Builder asset(CommonAsset asset) {
            this.asset = asset;
            return this;
        }

        @Override
        public AssetsDeleteAssetRequest build() {
            return new AssetsDeleteAssetRequest(this);
        } 

    } 

}

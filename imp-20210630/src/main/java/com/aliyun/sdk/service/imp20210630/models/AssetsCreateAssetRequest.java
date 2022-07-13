// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssetsCreateAssetRequest} extends {@link RequestModel}
 *
 * <p>AssetsCreateAssetRequest</p>
 */
public class AssetsCreateAssetRequest extends Request {
    @NameInMap("Asset")
    private CommonSimpleAsset asset;

    private AssetsCreateAssetRequest(Builder builder) {
        super(builder);
        this.asset = builder.asset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssetsCreateAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asset
     */
    public CommonSimpleAsset getAsset() {
        return this.asset;
    }

    public static final class Builder extends Request.Builder<AssetsCreateAssetRequest, Builder> {
        private CommonSimpleAsset asset; 

        private Builder() {
            super();
        } 

        private Builder(AssetsCreateAssetRequest request) {
            super(request);
            this.asset = request.asset;
        } 

        /**
         * Asset请求Item
         */
        public Builder asset(CommonSimpleAsset asset) {
            this.asset = asset;
            return this;
        }

        @Override
        public AssetsCreateAssetRequest build() {
            return new AssetsCreateAssetRequest(this);
        } 

    } 

}

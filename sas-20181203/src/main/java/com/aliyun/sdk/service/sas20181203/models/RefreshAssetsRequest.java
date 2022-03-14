// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAssetsRequest} extends {@link RequestModel}
 *
 * <p>RefreshAssetsRequest</p>
 */
public class RefreshAssetsRequest extends Request {
    @Query
    @NameInMap("AssetType")
    private String assetType;

    private RefreshAssetsRequest(Builder builder) {
        super(builder);
        this.assetType = builder.assetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAssetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    public static final class Builder extends Request.Builder<RefreshAssetsRequest, Builder> {
        private String assetType; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAssetsRequest request) {
            super(request);
            this.assetType = request.assetType;
        } 

        /**
         * AssetType.
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        @Override
        public RefreshAssetsRequest build() {
            return new RefreshAssetsRequest(this);
        } 

    } 

}

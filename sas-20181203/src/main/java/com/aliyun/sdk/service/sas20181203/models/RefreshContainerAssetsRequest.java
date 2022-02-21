// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshContainerAssetsRequest} extends {@link RequestModel}
 *
 * <p>RefreshContainerAssetsRequest</p>
 */
public class RefreshContainerAssetsRequest extends Request {
    @Query
    @NameInMap("AssetType")
    @Validation(required = true)
    private String assetType;

    private RefreshContainerAssetsRequest(Builder builder) {
        super(builder);
        this.assetType = builder.assetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshContainerAssetsRequest create() {
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

    public static final class Builder extends Request.Builder<RefreshContainerAssetsRequest, Builder> {
        private String assetType; 

        private Builder() {
            super();
        } 

        private Builder(RefreshContainerAssetsRequest response) {
            super(response);
            this.assetType = response.assetType;
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
        public RefreshContainerAssetsRequest build() {
            return new RefreshContainerAssetsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RefreshContainerAssetsRequest} extends {@link RequestModel}
 *
 * <p>RefreshContainerAssetsRequest</p>
 */
public class RefreshContainerAssetsRequest extends Request {
    @Query
    @NameInMap("AssetType")
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

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    public static final class Builder extends Request.Builder {
        private String assetType; 

        /**
         * <p>AssetType.</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        public RefreshContainerAssetsRequest build() {
            return new RefreshContainerAssetsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String assetType; 

        /**
         * <p>AssetType.</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        public RefreshAssetsRequest build() {
            return new RefreshAssetsRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVodPackagingAssetRequest} extends {@link RequestModel}
 *
 * <p>DeleteVodPackagingAssetRequest</p>
 */
public class DeleteVodPackagingAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    private DeleteVodPackagingAssetRequest(Builder builder) {
        super(builder);
        this.assetName = builder.assetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVodPackagingAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetName
     */
    public String getAssetName() {
        return this.assetName;
    }

    public static final class Builder extends Request.Builder<DeleteVodPackagingAssetRequest, Builder> {
        private String assetName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVodPackagingAssetRequest request) {
            super(request);
            this.assetName = request.assetName;
        } 

        /**
         * <p>The name of the VOD packaging asset.</p>
         * 
         * <strong>example:</strong>
         * <p>30min_movie</p>
         */
        public Builder assetName(String assetName) {
            this.putQueryParameter("AssetName", assetName);
            this.assetName = assetName;
            return this;
        }

        @Override
        public DeleteVodPackagingAssetRequest build() {
            return new DeleteVodPackagingAssetRequest(this);
        } 

    } 

}

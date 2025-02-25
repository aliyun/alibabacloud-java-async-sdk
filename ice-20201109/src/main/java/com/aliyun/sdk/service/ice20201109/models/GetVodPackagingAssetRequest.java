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
 * {@link GetVodPackagingAssetRequest} extends {@link RequestModel}
 *
 * <p>GetVodPackagingAssetRequest</p>
 */
public class GetVodPackagingAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    private GetVodPackagingAssetRequest(Builder builder) {
        super(builder);
        this.assetName = builder.assetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodPackagingAssetRequest create() {
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

    public static final class Builder extends Request.Builder<GetVodPackagingAssetRequest, Builder> {
        private String assetName; 

        private Builder() {
            super();
        } 

        private Builder(GetVodPackagingAssetRequest request) {
            super(request);
            this.assetName = request.assetName;
        } 

        /**
         * AssetName.
         */
        public Builder assetName(String assetName) {
            this.putQueryParameter("AssetName", assetName);
            this.assetName = assetName;
            return this;
        }

        @Override
        public GetVodPackagingAssetRequest build() {
            return new GetVodPackagingAssetRequest(this);
        } 

    } 

}

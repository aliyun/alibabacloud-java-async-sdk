// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteComponentAssetRequest} extends {@link RequestModel}
 *
 * <p>DeleteComponentAssetRequest</p>
 */
public class DeleteComponentAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DeleteComponentAssetRequest(Builder builder) {
        super(builder);
        this.assetId = builder.assetId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteComponentAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetId
     */
    public Long getAssetId() {
        return this.assetId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DeleteComponentAssetRequest, Builder> {
        private Long assetId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteComponentAssetRequest request) {
            super(request);
            this.assetId = request.assetId;
            this.lang = request.lang;
        } 

        /**
         * The ID of the asset.
         * <p>
         * 
         * >  You can call the [DescribeComponentAssets](~~DescribeComponentAssets~~) operation to query the ID.
         */
        public Builder assetId(Long assetId) {
            this.putQueryParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DeleteComponentAssetRequest build() {
            return new DeleteComponentAssetRequest(this);
        } 

    } 

}

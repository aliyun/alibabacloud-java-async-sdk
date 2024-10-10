// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshContainerAssetsRequest} extends {@link RequestModel}
 *
 * <p>RefreshContainerAssetsRequest</p>
 */
public class RefreshContainerAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(RefreshContainerAssetsRequest request) {
            super(request);
            this.assetType = request.assetType;
        } 

        /**
         * <p>The type of the container asset whose statistics you want to refresh. Valid values:</p>
         * <ul>
         * <li><strong>IMAGE</strong></li>
         * <li><strong>CONTAINER</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
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

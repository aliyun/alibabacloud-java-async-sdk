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

    @Query
    @NameInMap("CloudAssetSubType")
    private Integer cloudAssetSubType;

    @Query
    @NameInMap("CloudAssetType")
    private Integer cloudAssetType;

    private RefreshAssetsRequest(Builder builder) {
        super(builder);
        this.assetType = builder.assetType;
        this.cloudAssetSubType = builder.cloudAssetSubType;
        this.cloudAssetType = builder.cloudAssetType;
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

    /**
     * @return cloudAssetSubType
     */
    public Integer getCloudAssetSubType() {
        return this.cloudAssetSubType;
    }

    /**
     * @return cloudAssetType
     */
    public Integer getCloudAssetType() {
        return this.cloudAssetType;
    }

    public static final class Builder extends Request.Builder<RefreshAssetsRequest, Builder> {
        private String assetType; 
        private Integer cloudAssetSubType; 
        private Integer cloudAssetType; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAssetsRequest request) {
            super(request);
            this.assetType = request.assetType;
            this.cloudAssetSubType = request.cloudAssetSubType;
            this.cloudAssetType = request.cloudAssetType;
        } 

        /**
         * AssetType.
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * CloudAssetSubType.
         */
        public Builder cloudAssetSubType(Integer cloudAssetSubType) {
            this.putQueryParameter("CloudAssetSubType", cloudAssetSubType);
            this.cloudAssetSubType = cloudAssetSubType;
            return this;
        }

        /**
         * CloudAssetType.
         */
        public Builder cloudAssetType(Integer cloudAssetType) {
            this.putQueryParameter("CloudAssetType", cloudAssetType);
            this.cloudAssetType = cloudAssetType;
            return this;
        }

        @Override
        public RefreshAssetsRequest build() {
            return new RefreshAssetsRequest(this);
        } 

    } 

}

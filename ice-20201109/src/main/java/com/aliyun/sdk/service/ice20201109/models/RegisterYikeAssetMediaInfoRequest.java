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
 * {@link RegisterYikeAssetMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>RegisterYikeAssetMediaInfoRequest</p>
 */
public class RegisterYikeAssetMediaInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    private String productionId;

    private RegisterYikeAssetMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.folderId = builder.folderId;
        this.inputURL = builder.inputURL;
        this.mediaType = builder.mediaType;
        this.productionId = builder.productionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterYikeAssetMediaInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return inputURL
     */
    public String getInputURL() {
        return this.inputURL;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    public static final class Builder extends Request.Builder<RegisterYikeAssetMediaInfoRequest, Builder> {
        private String regionId; 
        private String folderId; 
        private String inputURL; 
        private String mediaType; 
        private String productionId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterYikeAssetMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.folderId = request.folderId;
            this.inputURL = request.inputURL;
            this.mediaType = request.mediaType;
            this.productionId = request.productionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * ProductionId.
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        @Override
        public RegisterYikeAssetMediaInfoRequest build() {
            return new RegisterYikeAssetMediaInfoRequest(this);
        } 

    } 

}

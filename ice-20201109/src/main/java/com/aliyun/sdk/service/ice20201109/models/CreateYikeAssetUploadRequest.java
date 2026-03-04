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
 * {@link CreateYikeAssetUploadRequest} extends {@link RequestModel}
 *
 * <p>CreateYikeAssetUploadRequest</p>
 */
public class CreateYikeAssetUploadRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileExt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileExt;

    private CreateYikeAssetUploadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileExt = builder.fileExt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYikeAssetUploadRequest create() {
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
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    public static final class Builder extends Request.Builder<CreateYikeAssetUploadRequest, Builder> {
        private String regionId; 
        private String fileExt; 

        private Builder() {
            super();
        } 

        private Builder(CreateYikeAssetUploadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileExt = request.fileExt;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        public Builder fileExt(String fileExt) {
            this.putQueryParameter("FileExt", fileExt);
            this.fileExt = fileExt;
            return this;
        }

        @Override
        public CreateYikeAssetUploadRequest build() {
            return new CreateYikeAssetUploadRequest(this);
        } 

    } 

}

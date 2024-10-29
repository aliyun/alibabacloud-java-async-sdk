// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteImagesRequest} extends {@link RequestModel}
 *
 * <p>DeleteImagesRequest</p>
 */
public class DeleteImagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteCascadedBundle")
    private Boolean deleteCascadedBundle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteImagesRequest(Builder builder) {
        super(builder);
        this.deleteCascadedBundle = builder.deleteCascadedBundle;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteCascadedBundle
     */
    public Boolean getDeleteCascadedBundle() {
        return this.deleteCascadedBundle;
    }

    /**
     * @return imageId
     */
    public java.util.List < String > getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteImagesRequest, Builder> {
        private Boolean deleteCascadedBundle; 
        private java.util.List < String > imageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImagesRequest request) {
            super(request);
            this.deleteCascadedBundle = request.deleteCascadedBundle;
            this.imageId = request.imageId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to delete the associated template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteCascadedBundle(Boolean deleteCascadedBundle) {
            this.putQueryParameter("DeleteCascadedBundle", deleteCascadedBundle);
            this.deleteCascadedBundle = deleteCascadedBundle;
            return this;
        }

        /**
         * <p>The image IDs. You can specify 1 to 100 image IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder imageId(java.util.List < String > imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteImagesRequest build() {
            return new DeleteImagesRequest(this);
        } 

    } 

}

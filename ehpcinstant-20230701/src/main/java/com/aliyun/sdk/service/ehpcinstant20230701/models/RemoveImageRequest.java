// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveImageRequest} extends {@link RequestModel}
 *
 * <p>RemoveImageRequest</p>
 */
public class RemoveImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    private RemoveImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.imageType = builder.imageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    public static final class Builder extends Request.Builder<RemoveImageRequest, Builder> {
        private String imageId; 
        private String imageType; 

        private Builder() {
            super();
        } 

        private Builder(RemoveImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.imageType = request.imageType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp14wakr1rkxtb******</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageType.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        @Override
        public RemoveImageRequest build() {
            return new RemoveImageRequest(this);
        } 

    } 

}

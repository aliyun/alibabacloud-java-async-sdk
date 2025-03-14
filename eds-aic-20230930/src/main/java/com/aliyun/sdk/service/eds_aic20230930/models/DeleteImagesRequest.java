// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeleteImagesRequest} extends {@link RequestModel}
 *
 * <p>DeleteImagesRequest</p>
 */
public class DeleteImagesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> imageIds;

    private DeleteImagesRequest(Builder builder) {
        super(builder);
        this.imageIds = builder.imageIds;
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
     * @return imageIds
     */
    public java.util.List<String> getImageIds() {
        return this.imageIds;
    }

    public static final class Builder extends Request.Builder<DeleteImagesRequest, Builder> {
        private java.util.List<String> imageIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImagesRequest request) {
            super(request);
            this.imageIds = request.imageIds;
        } 

        /**
         * <p>The IDs of the images.</p>
         * <p>This parameter is required.</p>
         */
        public Builder imageIds(java.util.List<String> imageIds) {
            String imageIdsShrink = shrink(imageIds, "ImageIds", "json");
            this.putBodyParameter("ImageIds", imageIdsShrink);
            this.imageIds = imageIds;
            return this;
        }

        @Override
        public DeleteImagesRequest build() {
            return new DeleteImagesRequest(this);
        } 

    } 

}

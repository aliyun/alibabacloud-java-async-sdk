// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveImageRequest} extends {@link RequestModel}
 *
 * <p>RemoveImageRequest</p>
 */
public class RemoveImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    private RemoveImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
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

    public static final class Builder extends Request.Builder<RemoveImageRequest, Builder> {
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveImageRequest request) {
            super(request);
            this.imageId = request.imageId;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public RemoveImageRequest build() {
            return new RemoveImageRequest(this);
        } 

    } 

}

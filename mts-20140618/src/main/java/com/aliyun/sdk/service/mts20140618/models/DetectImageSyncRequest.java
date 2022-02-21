// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageSyncRequest} extends {@link RequestModel}
 *
 * <p>DetectImageSyncRequest</p>
 */
public class DetectImageSyncRequest extends Request {
    @Query
    @NameInMap("Image")
    private String image;

    private DetectImageSyncRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageSyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    public static final class Builder extends Request.Builder<DetectImageSyncRequest, Builder> {
        private String image; 

        private Builder() {
            super();
        } 

        private Builder(DetectImageSyncRequest response) {
            super(response);
            this.image = response.image;
        } 

        /**
         * 图片url链接
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        @Override
        public DetectImageSyncRequest build() {
            return new DetectImageSyncRequest(this);
        } 

    } 

}

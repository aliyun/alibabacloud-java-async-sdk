// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link RemoveImageRequest} extends {@link RequestModel}
 *
 * <p>RemoveImageRequest</p>
 */
public class RemoveImageRequest extends Request {
    @com.aliyun.core.annotation.Path
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
         * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image-rbv******c9ks92</p>
         */
        public Builder imageId(String imageId) {
            this.putPathParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public RemoveImageRequest build() {
            return new RemoveImageRequest(this);
        } 

    } 

}

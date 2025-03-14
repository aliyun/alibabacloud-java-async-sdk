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
 * {@link UpdateCustomImageNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomImageNameRequest</p>
 */
public class UpdateCustomImageNameRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    private UpdateCustomImageNameRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomImageNameRequest create() {
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    public static final class Builder extends Request.Builder<UpdateCustomImageNameRequest, Builder> {
        private String imageId; 
        private String imageName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomImageNameRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.imageName = request.imageName;
        } 

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh0****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>imagename</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        @Override
        public UpdateCustomImageNameRequest build() {
            return new UpdateCustomImageNameRequest(this);
        } 

    } 

}

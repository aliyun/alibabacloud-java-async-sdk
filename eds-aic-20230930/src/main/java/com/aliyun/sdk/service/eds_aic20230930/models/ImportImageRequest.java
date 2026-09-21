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
 * {@link ImportImageRequest} extends {@link RequestModel}
 *
 * <p>ImportImageRequest</p>
 */
public class ImportImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseImageId")
    private String baseImageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageDescription")
    private String imageDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageFileURL")
    private String imageFileURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    private ImportImageRequest(Builder builder) {
        super(builder);
        this.baseImageId = builder.baseImageId;
        this.imageDescription = builder.imageDescription;
        this.imageFileURL = builder.imageFileURL;
        this.imageName = builder.imageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseImageId
     */
    public String getBaseImageId() {
        return this.baseImageId;
    }

    /**
     * @return imageDescription
     */
    public String getImageDescription() {
        return this.imageDescription;
    }

    /**
     * @return imageFileURL
     */
    public String getImageFileURL() {
        return this.imageFileURL;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    public static final class Builder extends Request.Builder<ImportImageRequest, Builder> {
        private String baseImageId; 
        private String imageDescription; 
        private String imageFileURL; 
        private String imageName; 

        private Builder() {
            super();
        } 

        private Builder(ImportImageRequest request) {
            super(request);
            this.baseImageId = request.baseImageId;
            this.imageDescription = request.imageDescription;
            this.imageFileURL = request.imageFileURL;
            this.imageName = request.imageName;
        } 

        /**
         * <p>The ID of the base image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-0aae4rgn0bk8f****</p>
         */
        public Builder baseImageId(String baseImageId) {
            this.putQueryParameter("BaseImageId", baseImageId);
            this.baseImageId = baseImageId;
            return this;
        }

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>android 12 custom image</p>
         */
        public Builder imageDescription(String imageDescription) {
            this.putQueryParameter("ImageDescription", imageDescription);
            this.imageDescription = imageDescription;
            return this;
        }

        /**
         * <p>The URL of the image. The URL must be an Alibaba Cloud Object Storage Service (OSS) address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.oss-xxx/xxxx.tgz">https://xxx.oss-xxx/xxxx.tgz</a></p>
         */
        public Builder imageFileURL(String imageFileURL) {
            this.putQueryParameter("ImageFileURL", imageFileURL);
            this.imageFileURL = imageFileURL;
            return this;
        }

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>import custom image</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        @Override
        public ImportImageRequest build() {
            return new ImportImageRequest(this);
        } 

    } 

}

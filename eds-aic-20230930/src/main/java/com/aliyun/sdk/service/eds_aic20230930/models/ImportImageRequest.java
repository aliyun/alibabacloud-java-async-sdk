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
        private String imageDescription; 
        private String imageFileURL; 
        private String imageName; 

        private Builder() {
            super();
        } 

        private Builder(ImportImageRequest request) {
            super(request);
            this.imageDescription = request.imageDescription;
            this.imageFileURL = request.imageFileURL;
            this.imageName = request.imageName;
        } 

        /**
         * ImageDescription.
         */
        public Builder imageDescription(String imageDescription) {
            this.putQueryParameter("ImageDescription", imageDescription);
            this.imageDescription = imageDescription;
            return this;
        }

        /**
         * ImageFileURL.
         */
        public Builder imageFileURL(String imageFileURL) {
            this.putQueryParameter("ImageFileURL", imageFileURL);
            this.imageFileURL = imageFileURL;
            return this;
        }

        /**
         * ImageName.
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

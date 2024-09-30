// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitConvertImageToPdfJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitConvertImageToPdfJobRequest</p>
 */
public class SubmitConvertImageToPdfJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageNameExtension")
    private String imageNameExtension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageNames")
    private java.util.List < String > imageNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrls")
    private java.util.List < String > imageUrls;

    private SubmitConvertImageToPdfJobRequest(Builder builder) {
        super(builder);
        this.imageNameExtension = builder.imageNameExtension;
        this.imageNames = builder.imageNames;
        this.imageUrls = builder.imageUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitConvertImageToPdfJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageNameExtension
     */
    public String getImageNameExtension() {
        return this.imageNameExtension;
    }

    /**
     * @return imageNames
     */
    public java.util.List < String > getImageNames() {
        return this.imageNames;
    }

    /**
     * @return imageUrls
     */
    public java.util.List < String > getImageUrls() {
        return this.imageUrls;
    }

    public static final class Builder extends Request.Builder<SubmitConvertImageToPdfJobRequest, Builder> {
        private String imageNameExtension; 
        private java.util.List < String > imageNames; 
        private java.util.List < String > imageUrls; 

        private Builder() {
            super();
        } 

        private Builder(SubmitConvertImageToPdfJobRequest request) {
            super(request);
            this.imageNameExtension = request.imageNameExtension;
            this.imageNames = request.imageNames;
            this.imageUrls = request.imageUrls;
        } 

        /**
         * ImageNameExtension.
         */
        public Builder imageNameExtension(String imageNameExtension) {
            this.putQueryParameter("ImageNameExtension", imageNameExtension);
            this.imageNameExtension = imageNameExtension;
            return this;
        }

        /**
         * ImageNames.
         */
        public Builder imageNames(java.util.List < String > imageNames) {
            String imageNamesShrink = shrink(imageNames, "ImageNames", "simple");
            this.putQueryParameter("ImageNames", imageNamesShrink);
            this.imageNames = imageNames;
            return this;
        }

        /**
         * ImageUrls.
         */
        public Builder imageUrls(java.util.List < String > imageUrls) {
            String imageUrlsShrink = shrink(imageUrls, "ImageUrls", "simple");
            this.putQueryParameter("ImageUrls", imageUrlsShrink);
            this.imageUrls = imageUrls;
            return this;
        }

        @Override
        public SubmitConvertImageToPdfJobRequest build() {
            return new SubmitConvertImageToPdfJobRequest(this);
        } 

    } 

}

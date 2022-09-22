// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitConvertImageToWordJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitConvertImageToWordJobRequest</p>
 */
public class SubmitConvertImageToWordJobRequest extends Request {
    @Query
    @NameInMap("ImageNameExtension")
    private String imageNameExtension;

    @Query
    @NameInMap("ImageNames")
    private java.util.List < String > imageNames;

    @Query
    @NameInMap("ImageUrls")
    private java.util.List < String > imageUrls;

    private SubmitConvertImageToWordJobRequest(Builder builder) {
        super(builder);
        this.imageNameExtension = builder.imageNameExtension;
        this.imageNames = builder.imageNames;
        this.imageUrls = builder.imageUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitConvertImageToWordJobRequest create() {
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

    public static final class Builder extends Request.Builder<SubmitConvertImageToWordJobRequest, Builder> {
        private String imageNameExtension; 
        private java.util.List < String > imageNames; 
        private java.util.List < String > imageUrls; 

        private Builder() {
            super();
        } 

        private Builder(SubmitConvertImageToWordJobRequest request) {
            super(request);
            this.imageNameExtension = request.imageNameExtension;
            this.imageNames = request.imageNames;
            this.imageUrls = request.imageUrls;
        } 

        /**
         * 图片扩展名。与imageName二选一
         * <p>
         * 支持类型:JPG、JPEG、PNG、BMP、GIF
         */
        public Builder imageNameExtension(String imageNameExtension) {
            this.putQueryParameter("ImageNameExtension", imageNameExtension);
            this.imageNameExtension = imageNameExtension;
            return this;
        }

        /**
         * 图片名称。文件名称需包含后缀。与imageNameExtension二选一
         */
        public Builder imageNames(java.util.List < String > imageNames) {
            String imageNamesShrink = shrink(imageNames, "ImageNames", "simple");
            this.putQueryParameter("ImageNames", imageNamesShrink);
            this.imageNames = imageNames;
            return this;
        }

        /**
         * 图片url地址.最多支持30个url地址
         */
        public Builder imageUrls(java.util.List < String > imageUrls) {
            String imageUrlsShrink = shrink(imageUrls, "ImageUrls", "simple");
            this.putQueryParameter("ImageUrls", imageUrlsShrink);
            this.imageUrls = imageUrls;
            return this;
        }

        @Override
        public SubmitConvertImageToWordJobRequest build() {
            return new SubmitConvertImageToWordJobRequest(this);
        } 

    } 

}

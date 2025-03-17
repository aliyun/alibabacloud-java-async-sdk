// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

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
 * {@link SubmitConvertImageToExcelJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitConvertImageToExcelJobRequest</p>
 */
public class SubmitConvertImageToExcelJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceMergeExcel")
    private Boolean forceMergeExcel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageNameExtension")
    private String imageNameExtension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageNames")
    private java.util.List<String> imageNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrls")
    private java.util.List<String> imageUrls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    private String ossEndpoint;

    private SubmitConvertImageToExcelJobRequest(Builder builder) {
        super(builder);
        this.forceMergeExcel = builder.forceMergeExcel;
        this.imageNameExtension = builder.imageNameExtension;
        this.imageNames = builder.imageNames;
        this.imageUrls = builder.imageUrls;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitConvertImageToExcelJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceMergeExcel
     */
    public Boolean getForceMergeExcel() {
        return this.forceMergeExcel;
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
    public java.util.List<String> getImageNames() {
        return this.imageNames;
    }

    /**
     * @return imageUrls
     */
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public static final class Builder extends Request.Builder<SubmitConvertImageToExcelJobRequest, Builder> {
        private Boolean forceMergeExcel; 
        private String imageNameExtension; 
        private java.util.List<String> imageNames; 
        private java.util.List<String> imageUrls; 
        private String ossBucket; 
        private String ossEndpoint; 

        private Builder() {
            super();
        } 

        private Builder(SubmitConvertImageToExcelJobRequest request) {
            super(request);
            this.forceMergeExcel = request.forceMergeExcel;
            this.imageNameExtension = request.imageNameExtension;
            this.imageNames = request.imageNames;
            this.imageUrls = request.imageUrls;
            this.ossBucket = request.ossBucket;
            this.ossEndpoint = request.ossEndpoint;
        } 

        /**
         * ForceMergeExcel.
         */
        public Builder forceMergeExcel(Boolean forceMergeExcel) {
            this.putQueryParameter("ForceMergeExcel", forceMergeExcel);
            this.forceMergeExcel = forceMergeExcel;
            return this;
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
        public Builder imageNames(java.util.List<String> imageNames) {
            String imageNamesShrink = shrink(imageNames, "ImageNames", "simple");
            this.putQueryParameter("ImageNames", imageNamesShrink);
            this.imageNames = imageNames;
            return this;
        }

        /**
         * ImageUrls.
         */
        public Builder imageUrls(java.util.List<String> imageUrls) {
            String imageUrlsShrink = shrink(imageUrls, "ImageUrls", "simple");
            this.putQueryParameter("ImageUrls", imageUrlsShrink);
            this.imageUrls = imageUrls;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        @Override
        public SubmitConvertImageToExcelJobRequest build() {
            return new SubmitConvertImageToExcelJobRequest(this);
        } 

    } 

}

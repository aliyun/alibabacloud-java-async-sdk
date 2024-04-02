// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadImageToLibRequest} extends {@link RequestModel}
 *
 * <p>UploadImageToLibRequest</p>
 */
public class UploadImageToLibRequest extends Request {
    @Query
    @NameInMap("ImageLibId")
    @Validation(required = true)
    private Integer imageLibId;

    @Query
    @NameInMap("Images")
    private String images;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Urls")
    private String urls;

    private UploadImageToLibRequest(Builder builder) {
        super(builder);
        this.imageLibId = builder.imageLibId;
        this.images = builder.images;
        this.sourceIp = builder.sourceIp;
        this.urls = builder.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadImageToLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageLibId
     */
    public Integer getImageLibId() {
        return this.imageLibId;
    }

    /**
     * @return images
     */
    public String getImages() {
        return this.images;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return urls
     */
    public String getUrls() {
        return this.urls;
    }

    public static final class Builder extends Request.Builder<UploadImageToLibRequest, Builder> {
        private Integer imageLibId; 
        private String images; 
        private String sourceIp; 
        private String urls; 

        private Builder() {
            super();
        } 

        private Builder(UploadImageToLibRequest request) {
            super(request);
            this.imageLibId = request.imageLibId;
            this.images = request.images;
            this.sourceIp = request.sourceIp;
            this.urls = request.urls;
        } 

        /**
         * ImageLibId.
         */
        public Builder imageLibId(Integer imageLibId) {
            this.putQueryParameter("ImageLibId", imageLibId);
            this.imageLibId = imageLibId;
            return this;
        }

        /**
         * Images.
         */
        public Builder images(String images) {
            this.putQueryParameter("Images", images);
            this.images = images;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Urls.
         */
        public Builder urls(String urls) {
            this.putQueryParameter("Urls", urls);
            this.urls = urls;
            return this;
        }

        @Override
        public UploadImageToLibRequest build() {
            return new UploadImageToLibRequest(this);
        } 

    } 

}

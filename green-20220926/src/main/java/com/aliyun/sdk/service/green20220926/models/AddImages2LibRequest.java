// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link AddImages2LibRequest} extends {@link RequestModel}
 *
 * <p>AddImages2LibRequest</p>
 */
public class AddImages2LibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImgUrl")
    private String imgUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddImages2LibRequest(Builder builder) {
        super(builder);
        this.imgUrl = builder.imgUrl;
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImages2LibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imgUrl
     */
    public String getImgUrl() {
        return this.imgUrl;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddImages2LibRequest, Builder> {
        private String imgUrl; 
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddImages2LibRequest request) {
            super(request);
            this.imgUrl = request.imgUrl;
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The URL of the image. This value must be the Key field returned by GetUploadInfo, in the format of image/upload/<hash>. Passing an external image URL returns a 400 image.url.invalid error.</p>
         * 
         * <strong>example:</strong>
         * <p>image/upload/755c31906fc0b0b5007ecead9660c2ab</p>
         */
        public Builder imgUrl(String imgUrl) {
            this.putBodyParameter("ImgUrl", imgUrl);
            this.imgUrl = imgUrl;
            return this;
        }

        /**
         * <p>The ID of the image library.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_imglib_001</p>
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddImages2LibRequest build() {
            return new AddImages2LibRequest(this);
        } 

    } 

}

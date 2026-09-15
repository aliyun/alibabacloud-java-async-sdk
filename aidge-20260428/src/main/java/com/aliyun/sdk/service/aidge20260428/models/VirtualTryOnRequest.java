// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link VirtualTryOnRequest} extends {@link RequestModel}
 *
 * <p>VirtualTryOnRequest</p>
 */
public class VirtualTryOnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClothImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clothImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClothType")
    private String clothType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resolution;

    private VirtualTryOnRequest(Builder builder) {
        super(builder);
        this.clothImageUrl = builder.clothImageUrl;
        this.clothType = builder.clothType;
        this.modelImageUrl = builder.modelImageUrl;
        this.resolution = builder.resolution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VirtualTryOnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clothImageUrl
     */
    public String getClothImageUrl() {
        return this.clothImageUrl;
    }

    /**
     * @return clothType
     */
    public String getClothType() {
        return this.clothType;
    }

    /**
     * @return modelImageUrl
     */
    public String getModelImageUrl() {
        return this.modelImageUrl;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    public static final class Builder extends Request.Builder<VirtualTryOnRequest, Builder> {
        private String clothImageUrl; 
        private String clothType; 
        private String modelImageUrl; 
        private String resolution; 

        private Builder() {
            super();
        } 

        private Builder(VirtualTryOnRequest request) {
            super(request);
            this.clothImageUrl = request.clothImageUrl;
            this.clothType = request.clothType;
            this.modelImageUrl = request.modelImageUrl;
            this.resolution = request.resolution;
        } 

        /**
         * <p>The URL of the garment image. Only one image is supported. The URL must be a publicly accessible <code>http</code>/<code>https</code> address. The image must be in JPG, JPEG, PNG, BMP, or WEBP format, with a resolution between 256 × 256 and 2049 × 2049 pixels, and a file size of no more than 10 MB.<br></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
         */
        public Builder clothImageUrl(String clothImageUrl) {
            this.putQueryParameter("ClothImageUrl", clothImageUrl);
            this.clothImageUrl = clothImageUrl;
            return this;
        }

        /**
         * <p>The garment type. Valid values: tops, bottoms, dresses, tops_and_bottoms, shoes, and hats. If this parameter is not specified, the system automatically identifies the garment type.</p>
         * 
         * <strong>example:</strong>
         * <p>tops</p>
         */
        public Builder clothType(String clothType) {
            this.putQueryParameter("ClothType", clothType);
            this.clothType = clothType;
            return this;
        }

        /**
         * <p>The URL of the model image. Only one image is supported. The URL must be a publicly accessible <code>http</code>/<code>https</code> address. The image must be in JPG, JPEG, PNG, BMP, or WEBP format, with a resolution between 256 × 256 and 2049 × 2049 pixels, and a file size of no more than 10 MB.<br></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
         */
        public Builder modelImageUrl(String modelImageUrl) {
            this.putQueryParameter("ModelImageUrl", modelImageUrl);
            this.modelImageUrl = modelImageUrl;
            return this;
        }

        /**
         * <p>Required. The image resolution. Valid values: 1K and 2K.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1K</p>
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        @Override
        public VirtualTryOnRequest build() {
            return new VirtualTryOnRequest(this);
        } 

    } 

}

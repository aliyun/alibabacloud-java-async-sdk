// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWmBaseImageRequest} extends {@link RequestModel}
 *
 * <p>CreateWmBaseImageRequest</p>
 */
public class CreateWmBaseImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Height")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 5000, minimum = 100)
    private Integer height;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Opacity")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 255, minimum = 1)
    private Integer opacity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scale")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 3, minimum = 1)
    private Integer scale;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Width")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 5000, minimum = 100)
    private Integer width;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoBytesB64")
    @com.aliyun.core.annotation.Validation(maxLength = 400)
    private String wmInfoBytesB64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoSize")
    private Long wmInfoSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmInfoUint")
    private String wmInfoUint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmType;

    private CreateWmBaseImageRequest(Builder builder) {
        super(builder);
        this.height = builder.height;
        this.opacity = builder.opacity;
        this.scale = builder.scale;
        this.width = builder.width;
        this.wmInfoBytesB64 = builder.wmInfoBytesB64;
        this.wmInfoSize = builder.wmInfoSize;
        this.wmInfoUint = builder.wmInfoUint;
        this.wmType = builder.wmType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWmBaseImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return opacity
     */
    public Integer getOpacity() {
        return this.opacity;
    }

    /**
     * @return scale
     */
    public Integer getScale() {
        return this.scale;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    /**
     * @return wmInfoBytesB64
     */
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    /**
     * @return wmInfoSize
     */
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    /**
     * @return wmInfoUint
     */
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    /**
     * @return wmType
     */
    public String getWmType() {
        return this.wmType;
    }

    public static final class Builder extends Request.Builder<CreateWmBaseImageRequest, Builder> {
        private Integer height; 
        private Integer opacity; 
        private Integer scale; 
        private Integer width; 
        private String wmInfoBytesB64; 
        private Long wmInfoSize; 
        private String wmInfoUint; 
        private String wmType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWmBaseImageRequest request) {
            super(request);
            this.height = request.height;
            this.opacity = request.opacity;
            this.scale = request.scale;
            this.width = request.width;
            this.wmInfoBytesB64 = request.wmInfoBytesB64;
            this.wmInfoSize = request.wmInfoSize;
            this.wmInfoUint = request.wmInfoUint;
            this.wmType = request.wmType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        public Builder height(Integer height) {
            this.putBodyParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        public Builder opacity(Integer opacity) {
            this.putBodyParameter("Opacity", opacity);
            this.opacity = opacity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scale(Integer scale) {
            this.putBodyParameter("Scale", scale);
            this.scale = scale;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        public Builder width(Integer width) {
            this.putBodyParameter("Width", width);
            this.width = width;
            return this;
        }

        /**
         * WmInfoBytesB64.
         */
        public Builder wmInfoBytesB64(String wmInfoBytesB64) {
            this.putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }

        /**
         * WmInfoSize.
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putBodyParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * WmInfoUint.
         */
        public Builder wmInfoUint(String wmInfoUint) {
            this.putBodyParameter("WmInfoUint", wmInfoUint);
            this.wmInfoUint = wmInfoUint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PureWebappInvisible</p>
         */
        public Builder wmType(String wmType) {
            this.putBodyParameter("WmType", wmType);
            this.wmType = wmType;
            return this;
        }

        @Override
        public CreateWmBaseImageRequest build() {
            return new CreateWmBaseImageRequest(this);
        } 

    } 

}

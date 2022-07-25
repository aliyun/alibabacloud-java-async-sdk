// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictionWallLineRequest} extends {@link RequestModel}
 *
 * <p>PredictionWallLineRequest</p>
 */
public class PredictionWallLineRequest extends Request {
    @Query
    @NameInMap("CameraHeight")
    private Long cameraHeight;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private PredictionWallLineRequest(Builder builder) {
        super(builder);
        this.cameraHeight = builder.cameraHeight;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictionWallLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cameraHeight
     */
    public Long getCameraHeight() {
        return this.cameraHeight;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<PredictionWallLineRequest, Builder> {
        private Long cameraHeight; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(PredictionWallLineRequest request) {
            super(request);
            this.cameraHeight = request.cameraHeight;
            this.url = request.url;
        } 

        /**
         * 相机高度 单位 cm
         */
        public Builder cameraHeight(Long cameraHeight) {
            this.putQueryParameter("CameraHeight", cameraHeight);
            this.cameraHeight = cameraHeight;
            return this;
        }

        /**
         * 图片地址
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public PredictionWallLineRequest build() {
            return new PredictionWallLineRequest(this);
        } 

    } 

}

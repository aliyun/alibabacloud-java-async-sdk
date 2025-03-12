// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link RectifyImageRequest} extends {@link RequestModel}
 *
 * <p>RectifyImageRequest</p>
 */
public class RectifyImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CameraHeight")
    private Long cameraHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private RectifyImageRequest(Builder builder) {
        super(builder);
        this.cameraHeight = builder.cameraHeight;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RectifyImageRequest create() {
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

    public static final class Builder extends Request.Builder<RectifyImageRequest, Builder> {
        private Long cameraHeight; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(RectifyImageRequest request) {
            super(request);
            this.cameraHeight = request.cameraHeight;
            this.url = request.url;
        } 

        /**
         * CameraHeight.
         */
        public Builder cameraHeight(Long cameraHeight) {
            this.putQueryParameter("CameraHeight", cameraHeight);
            this.cameraHeight = cameraHeight;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyundoc.com/****.jpg">https://www.aliyundoc.com/****.jpg</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public RectifyImageRequest build() {
            return new RectifyImageRequest(this);
        } 

    } 

}

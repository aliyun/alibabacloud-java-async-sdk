// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link CreateEduHomeworkCorrectSubmitRequest} extends {@link RequestModel}
 *
 * <p>CreateEduHomeworkCorrectSubmitRequest</p>
 */
public class CreateEduHomeworkCorrectSubmitRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dewarp")
    private Boolean dewarp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageBase64")
    private String imageBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateEduHomeworkCorrectSubmitRequest(Builder builder) {
        super(builder);
        this.dewarp = builder.dewarp;
        this.imageBase64 = builder.imageBase64;
        this.imageUrl = builder.imageUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEduHomeworkCorrectSubmitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dewarp
     */
    public Boolean getDewarp() {
        return this.dewarp;
    }

    /**
     * @return imageBase64
     */
    public String getImageBase64() {
        return this.imageBase64;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<CreateEduHomeworkCorrectSubmitRequest, Builder> {
        private Boolean dewarp; 
        private String imageBase64; 
        private String imageUrl; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEduHomeworkCorrectSubmitRequest request) {
            super(request);
            this.dewarp = request.dewarp;
            this.imageBase64 = request.imageBase64;
            this.imageUrl = request.imageUrl;
            this.requestId = request.requestId;
        } 

        /**
         * <p>Specifies whether to correct the image distortion.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dewarp(Boolean dewarp) {
            this.putBodyParameter("dewarp", dewarp);
            this.dewarp = dewarp;
            return this;
        }

        /**
         * <p>The Base64-encoded image.</p>
         * 
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAASABIAAD/4QCMRXhpZgAATU0AK...</p>
         */
        public Builder imageBase64(String imageBase64) {
            this.putBodyParameter("imageBase64", imageBase64);
            this.imageBase64 = imageBase64;
            return this;
        }

        /**
         * <p>The URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx/xxx.jpg">https://xxx/xxx.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019F593F-D6EE-5F44-819A-6CDA127D1637</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public CreateEduHomeworkCorrectSubmitRequest build() {
            return new CreateEduHomeworkCorrectSubmitRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateImageIncomeTaxDetectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageIncomeTaxDetectionTaskRequest</p>
 */
public class CreateImageIncomeTaxDetectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    private CreateImageIncomeTaxDetectionTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageIncomeTaxDetectionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public static final class Builder extends Request.Builder<CreateImageIncomeTaxDetectionTaskRequest, Builder> {
        private String clientToken; 
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageIncomeTaxDetectionTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.imageUrl = request.imageUrl;
        } 

        /**
         * <p>The idempotency parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The URL of the income tax screenshot to detect. Only HTTP/HTTPS URLs are supported. The image size cannot exceed 10 MB. External images are not supported. Only URLs accessible from the Chinese mainland public network are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/incometax.png">https://example.com/incometax.png</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public CreateImageIncomeTaxDetectionTaskRequest build() {
            return new CreateImageIncomeTaxDetectionTaskRequest(this);
        } 

    } 

}

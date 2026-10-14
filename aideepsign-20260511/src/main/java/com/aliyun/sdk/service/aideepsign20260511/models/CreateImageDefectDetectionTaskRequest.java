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
 * {@link CreateImageDefectDetectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageDefectDetectionTaskRequest</p>
 */
public class CreateImageDefectDetectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    private CreateImageDefectDetectionTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageDefectDetectionTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CreateImageDefectDetectionTaskRequest, Builder> {
        private String clientToken; 
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageDefectDetectionTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.imageUrl = request.imageUrl;
        } 

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The URL of the image to be detected. Only HTTP/HTTPS protocols are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/product.jpg">https://example.com/product.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public CreateImageDefectDetectionTaskRequest build() {
            return new CreateImageDefectDetectionTaskRequest(this);
        } 

    } 

}

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
 * {@link SignUserImageRequest} extends {@link RequestModel}
 *
 * <p>SignUserImageRequest</p>
 */
public class SignUserImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    private SignUserImageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignUserImageRequest create() {
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

    public static final class Builder extends Request.Builder<SignUserImageRequest, Builder> {
        private String clientToken; 
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(SignUserImageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.imageUrl = request.imageUrl;
        } 

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The URL of the image to be signed. HTTP/HTTPS URLs are supported. Specify either <code>ImageUrl</code> or <code>ObjectKey</code>. At least one of them is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/photo.jpg">https://example.com/photo.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public SignUserImageRequest build() {
            return new SignUserImageRequest(this);
        } 

    } 

}

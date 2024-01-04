// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateMotionShopVideoUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GenerateMotionShopVideoUploadUrlRequest</p>
 */
public class GenerateMotionShopVideoUploadUrlRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    private GenerateMotionShopVideoUploadUrlRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMotionShopVideoUploadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<GenerateMotionShopVideoUploadUrlRequest, Builder> {
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(GenerateMotionShopVideoUploadUrlRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public GenerateMotionShopVideoUploadUrlRequest build() {
            return new GenerateMotionShopVideoUploadUrlRequest(this);
        } 

    } 

}

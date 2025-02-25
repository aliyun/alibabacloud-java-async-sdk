// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MotionShopVideoDetectRequest} extends {@link RequestModel}
 *
 * <p>MotionShopVideoDetectRequest</p>
 */
public class MotionShopVideoDetectRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("OssKey")
    @Validation(required = true)
    private String ossKey;

    private MotionShopVideoDetectRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.ossKey = builder.ossKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MotionShopVideoDetectRequest create() {
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

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    public static final class Builder extends Request.Builder<MotionShopVideoDetectRequest, Builder> {
        private String jwtToken; 
        private String ossKey; 

        private Builder() {
            super();
        } 

        private Builder(MotionShopVideoDetectRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.ossKey = request.ossKey;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putBodyParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        @Override
        public MotionShopVideoDetectRequest build() {
            return new MotionShopVideoDetectRequest(this);
        } 

    } 

}

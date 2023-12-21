// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LocateRequest} extends {@link RequestModel}
 *
 * <p>LocateRequest</p>
 */
public class LocateRequest extends Request {
    @Body
    @NameInMap("Image")
    private String image;

    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Params")
    @Validation(required = true)
    private String params;

    private LocateRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
        this.jwtToken = builder.jwtToken;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LocateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<LocateRequest, Builder> {
        private String image; 
        private String jwtToken; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(LocateRequest request) {
            super(request);
            this.image = request.image;
            this.jwtToken = request.jwtToken;
            this.params = request.params;
        } 

        /**
         * Image.
         */
        public Builder image(String image) {
            this.putBodyParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public LocateRequest build() {
            return new LocateRequest(this);
        } 

    } 

}

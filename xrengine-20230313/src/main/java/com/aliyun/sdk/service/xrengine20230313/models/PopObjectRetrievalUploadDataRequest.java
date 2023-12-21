// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopObjectRetrievalUploadDataRequest} extends {@link RequestModel}
 *
 * <p>PopObjectRetrievalUploadDataRequest</p>
 */
public class PopObjectRetrievalUploadDataRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    private PopObjectRetrievalUploadDataRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopObjectRetrievalUploadDataRequest create() {
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

    public static final class Builder extends Request.Builder<PopObjectRetrievalUploadDataRequest, Builder> {
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(PopObjectRetrievalUploadDataRequest request) {
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
        public PopObjectRetrievalUploadDataRequest build() {
            return new PopObjectRetrievalUploadDataRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAppAuthTokenResponse} extends {@link TeaModel}
 *
 * <p>SaveAppAuthTokenResponse</p>
 */
public class SaveAppAuthTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveAppAuthTokenResponseBody body;

    private SaveAppAuthTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveAppAuthTokenResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public SaveAppAuthTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveAppAuthTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveAppAuthTokenResponseBody body);

        @Override
        SaveAppAuthTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveAppAuthTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveAppAuthTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveAppAuthTokenResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(SaveAppAuthTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveAppAuthTokenResponse build() {
            return new SaveAppAuthTokenResponse(this);
        } 

    } 

}

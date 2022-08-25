// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptKMSDataKeyResponse} extends {@link TeaModel}
 *
 * <p>DecryptKMSDataKeyResponse</p>
 */
public class DecryptKMSDataKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DecryptKMSDataKeyResponseBody body;

    private DecryptKMSDataKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DecryptKMSDataKeyResponse create() {
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
    public DecryptKMSDataKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DecryptKMSDataKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DecryptKMSDataKeyResponseBody body);

        @Override
        DecryptKMSDataKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DecryptKMSDataKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DecryptKMSDataKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DecryptKMSDataKeyResponse response) {
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
        public Builder body(DecryptKMSDataKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DecryptKMSDataKeyResponse build() {
            return new DecryptKMSDataKeyResponse(this);
        } 

    } 

}

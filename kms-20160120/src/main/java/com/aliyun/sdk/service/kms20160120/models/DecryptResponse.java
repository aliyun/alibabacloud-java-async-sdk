// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptResponse} extends {@link TeaModel}
 *
 * <p>DecryptResponse</p>
 */
public class DecryptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DecryptResponseBody body;

    private DecryptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DecryptResponse create() {
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
    public DecryptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DecryptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DecryptResponseBody body);

        @Override
        DecryptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DecryptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DecryptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DecryptResponse response) {
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
        public Builder body(DecryptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DecryptResponse build() {
            return new DecryptResponse(this);
        } 

    } 

}

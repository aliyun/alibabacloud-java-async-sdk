// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptContentResponse} extends {@link TeaModel}
 *
 * <p>DecryptContentResponse</p>
 */
public class DecryptContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DecryptContentResponseBody body;

    private DecryptContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DecryptContentResponse create() {
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
    public DecryptContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DecryptContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DecryptContentResponseBody body);

        @Override
        DecryptContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DecryptContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DecryptContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DecryptContentResponse response) {
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
        public Builder body(DecryptContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DecryptContentResponse build() {
            return new DecryptContentResponse(this);
        } 

    } 

}

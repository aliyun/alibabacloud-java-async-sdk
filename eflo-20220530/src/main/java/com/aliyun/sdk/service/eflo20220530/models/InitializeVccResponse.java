// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeVccResponse} extends {@link TeaModel}
 *
 * <p>InitializeVccResponse</p>
 */
public class InitializeVccResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitializeVccResponseBody body;

    private InitializeVccResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitializeVccResponse create() {
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
    public InitializeVccResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeVccResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitializeVccResponseBody body);

        @Override
        InitializeVccResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeVccResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitializeVccResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeVccResponse response) {
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
        public Builder body(InitializeVccResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeVccResponse build() {
            return new InitializeVccResponse(this);
        } 

    } 

}

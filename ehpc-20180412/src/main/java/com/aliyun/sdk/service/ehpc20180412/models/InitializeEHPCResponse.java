// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeEHPCResponse} extends {@link TeaModel}
 *
 * <p>InitializeEHPCResponse</p>
 */
public class InitializeEHPCResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitializeEHPCResponseBody body;

    private InitializeEHPCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitializeEHPCResponse create() {
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
    public InitializeEHPCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeEHPCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitializeEHPCResponseBody body);

        @Override
        InitializeEHPCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeEHPCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitializeEHPCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeEHPCResponse response) {
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
        public Builder body(InitializeEHPCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeEHPCResponse build() {
            return new InitializeEHPCResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRPCPathTestResponse} extends {@link TeaModel}
 *
 * <p>CreateRPCPathTestResponse</p>
 */
public class CreateRPCPathTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRPCPathTestResponseBody body;

    private CreateRPCPathTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRPCPathTestResponse create() {
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
    public CreateRPCPathTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRPCPathTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRPCPathTestResponseBody body);

        @Override
        CreateRPCPathTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRPCPathTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRPCPathTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRPCPathTestResponse response) {
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
        public Builder body(CreateRPCPathTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRPCPathTestResponse build() {
            return new CreateRPCPathTestResponse(this);
        } 

    } 

}

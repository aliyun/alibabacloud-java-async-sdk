// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUpstreamAppServerResponse} extends {@link TeaModel}
 *
 * <p>CreateUpstreamAppServerResponse</p>
 */
public class CreateUpstreamAppServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUpstreamAppServerResponseBody body;

    private CreateUpstreamAppServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUpstreamAppServerResponse create() {
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
    public CreateUpstreamAppServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUpstreamAppServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUpstreamAppServerResponseBody body);

        @Override
        CreateUpstreamAppServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUpstreamAppServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUpstreamAppServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUpstreamAppServerResponse response) {
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
        public Builder body(CreateUpstreamAppServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUpstreamAppServerResponse build() {
            return new CreateUpstreamAppServerResponse(this);
        } 

    } 

}

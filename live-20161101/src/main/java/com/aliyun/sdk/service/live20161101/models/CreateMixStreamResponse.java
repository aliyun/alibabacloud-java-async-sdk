// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMixStreamResponse} extends {@link TeaModel}
 *
 * <p>CreateMixStreamResponse</p>
 */
public class CreateMixStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMixStreamResponseBody body;

    private CreateMixStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMixStreamResponse create() {
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
    public CreateMixStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMixStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMixStreamResponseBody body);

        @Override
        CreateMixStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMixStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMixStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMixStreamResponse response) {
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
        public Builder body(CreateMixStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMixStreamResponse build() {
            return new CreateMixStreamResponse(this);
        } 

    } 

}

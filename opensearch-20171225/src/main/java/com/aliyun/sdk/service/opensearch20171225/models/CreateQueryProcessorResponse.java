// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQueryProcessorResponse} extends {@link TeaModel}
 *
 * <p>CreateQueryProcessorResponse</p>
 */
public class CreateQueryProcessorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateQueryProcessorResponseBody body;

    private CreateQueryProcessorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateQueryProcessorResponse create() {
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
    public CreateQueryProcessorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateQueryProcessorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateQueryProcessorResponseBody body);

        @Override
        CreateQueryProcessorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateQueryProcessorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateQueryProcessorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateQueryProcessorResponse response) {
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
        public Builder body(CreateQueryProcessorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateQueryProcessorResponse build() {
            return new CreateQueryProcessorResponse(this);
        } 

    } 

}

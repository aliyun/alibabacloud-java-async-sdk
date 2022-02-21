// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveQueryProcessorResponse} extends {@link TeaModel}
 *
 * <p>RemoveQueryProcessorResponse</p>
 */
public class RemoveQueryProcessorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveQueryProcessorResponseBody body;

    private RemoveQueryProcessorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveQueryProcessorResponse create() {
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
    public RemoveQueryProcessorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveQueryProcessorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveQueryProcessorResponseBody body);

        @Override
        RemoveQueryProcessorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveQueryProcessorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveQueryProcessorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveQueryProcessorResponse response) {
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
        public Builder body(RemoveQueryProcessorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveQueryProcessorResponse build() {
            return new RemoveQueryProcessorResponse(this);
        } 

    } 

}

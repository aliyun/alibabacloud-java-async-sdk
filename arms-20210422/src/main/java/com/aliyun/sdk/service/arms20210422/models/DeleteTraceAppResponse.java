// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTraceAppResponse} extends {@link TeaModel}
 *
 * <p>DeleteTraceAppResponse</p>
 */
public class DeleteTraceAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTraceAppResponseBody body;

    private DeleteTraceAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTraceAppResponse create() {
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
    public DeleteTraceAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTraceAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTraceAppResponseBody body);

        @Override
        DeleteTraceAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTraceAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTraceAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTraceAppResponse response) {
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
        public Builder body(DeleteTraceAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTraceAppResponse build() {
            return new DeleteTraceAppResponse(this);
        } 

    } 

}

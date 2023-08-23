// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRealTimeLogLogstoreResponse} extends {@link TeaModel}
 *
 * <p>DeleteRealTimeLogLogstoreResponse</p>
 */
public class DeleteRealTimeLogLogstoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRealTimeLogLogstoreResponseBody body;

    private DeleteRealTimeLogLogstoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRealTimeLogLogstoreResponse create() {
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
    public DeleteRealTimeLogLogstoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRealTimeLogLogstoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRealTimeLogLogstoreResponseBody body);

        @Override
        DeleteRealTimeLogLogstoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRealTimeLogLogstoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRealTimeLogLogstoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRealTimeLogLogstoreResponse response) {
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
        public Builder body(DeleteRealTimeLogLogstoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRealTimeLogLogstoreResponse build() {
            return new DeleteRealTimeLogLogstoreResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRealTimeLogLogstoreResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveRealTimeLogLogstoreResponse</p>
 */
public class DeleteLiveRealTimeLogLogstoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveRealTimeLogLogstoreResponseBody body;

    private DeleteLiveRealTimeLogLogstoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveRealTimeLogLogstoreResponse create() {
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
    public DeleteLiveRealTimeLogLogstoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveRealTimeLogLogstoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveRealTimeLogLogstoreResponseBody body);

        @Override
        DeleteLiveRealTimeLogLogstoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveRealTimeLogLogstoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveRealTimeLogLogstoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveRealTimeLogLogstoreResponse response) {
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
        public Builder body(DeleteLiveRealTimeLogLogstoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveRealTimeLogLogstoreResponse build() {
            return new DeleteLiveRealTimeLogLogstoreResponse(this);
        } 

    } 

}

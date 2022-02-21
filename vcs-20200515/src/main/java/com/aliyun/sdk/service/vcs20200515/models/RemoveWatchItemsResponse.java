// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveWatchItemsResponse} extends {@link TeaModel}
 *
 * <p>RemoveWatchItemsResponse</p>
 */
public class RemoveWatchItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveWatchItemsResponseBody body;

    private RemoveWatchItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveWatchItemsResponse create() {
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
    public RemoveWatchItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveWatchItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveWatchItemsResponseBody body);

        @Override
        RemoveWatchItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveWatchItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveWatchItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveWatchItemsResponse response) {
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
        public Builder body(RemoveWatchItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveWatchItemsResponse build() {
            return new RemoveWatchItemsResponse(this);
        } 

    } 

}

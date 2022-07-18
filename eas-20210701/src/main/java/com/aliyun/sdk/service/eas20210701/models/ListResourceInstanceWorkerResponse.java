// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceInstanceWorkerResponse} extends {@link TeaModel}
 *
 * <p>ListResourceInstanceWorkerResponse</p>
 */
public class ListResourceInstanceWorkerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceInstanceWorkerResponseBody body;

    private ListResourceInstanceWorkerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceInstanceWorkerResponse create() {
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
    public ListResourceInstanceWorkerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceInstanceWorkerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceInstanceWorkerResponseBody body);

        @Override
        ListResourceInstanceWorkerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceInstanceWorkerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceInstanceWorkerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceInstanceWorkerResponse response) {
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
        public Builder body(ListResourceInstanceWorkerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceInstanceWorkerResponse build() {
            return new ListResourceInstanceWorkerResponse(this);
        } 

    } 

}

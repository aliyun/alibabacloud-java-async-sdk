// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsyncTaskResponse} extends {@link TeaModel}
 *
 * <p>ListAsyncTaskResponse</p>
 */
public class ListAsyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAsyncTaskResponseBody body;

    private ListAsyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAsyncTaskResponse create() {
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
    public ListAsyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAsyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAsyncTaskResponseBody body);

        @Override
        ListAsyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAsyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAsyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAsyncTaskResponse response) {
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
        public Builder body(ListAsyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAsyncTaskResponse build() {
            return new ListAsyncTaskResponse(this);
        } 

    } 

}

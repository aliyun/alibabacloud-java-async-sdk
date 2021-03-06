// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueueResponse} extends {@link TeaModel}
 *
 * <p>ListQueueResponse</p>
 */
public class ListQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueueResponseBody body;

    private ListQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueueResponse create() {
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
    public ListQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueueResponseBody body);

        @Override
        ListQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueueResponse response) {
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
        public Builder body(ListQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueueResponse build() {
            return new ListQueueResponse(this);
        } 

    } 

}

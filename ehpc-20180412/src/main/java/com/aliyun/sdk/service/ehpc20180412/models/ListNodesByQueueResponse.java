// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesByQueueResponse} extends {@link TeaModel}
 *
 * <p>ListNodesByQueueResponse</p>
 */
public class ListNodesByQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodesByQueueResponseBody body;

    private ListNodesByQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodesByQueueResponse create() {
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
    public ListNodesByQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodesByQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodesByQueueResponseBody body);

        @Override
        ListNodesByQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodesByQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodesByQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodesByQueueResponse response) {
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
        public Builder body(ListNodesByQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodesByQueueResponse build() {
            return new ListNodesByQueueResponse(this);
        } 

    } 

}

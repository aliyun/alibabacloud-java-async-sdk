// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesNoPagingResponse} extends {@link TeaModel}
 *
 * <p>ListNodesNoPagingResponse</p>
 */
public class ListNodesNoPagingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodesNoPagingResponseBody body;

    private ListNodesNoPagingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodesNoPagingResponse create() {
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
    public ListNodesNoPagingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodesNoPagingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodesNoPagingResponseBody body);

        @Override
        ListNodesNoPagingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodesNoPagingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodesNoPagingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodesNoPagingResponse response) {
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
        public Builder body(ListNodesNoPagingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodesNoPagingResponse build() {
            return new ListNodesNoPagingResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFreeNodesResponse} extends {@link TeaModel}
 *
 * <p>ListFreeNodesResponse</p>
 */
public class ListFreeNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFreeNodesResponseBody body;

    private ListFreeNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFreeNodesResponse create() {
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
    public ListFreeNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFreeNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFreeNodesResponseBody body);

        @Override
        ListFreeNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFreeNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFreeNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFreeNodesResponse response) {
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
        public Builder body(ListFreeNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFreeNodesResponse build() {
            return new ListFreeNodesResponse(this);
        } 

    } 

}

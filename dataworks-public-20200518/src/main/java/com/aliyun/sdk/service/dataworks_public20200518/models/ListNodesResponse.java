// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesResponse} extends {@link TeaModel}
 *
 * <p>ListNodesResponse</p>
 */
public class ListNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodesResponseBody body;

    private ListNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodesResponse create() {
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
    public ListNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodesResponseBody body);

        @Override
        ListNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodesResponse response) {
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
        public Builder body(ListNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodesResponse build() {
            return new ListNodesResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInnerNodesResponse} extends {@link TeaModel}
 *
 * <p>ListInnerNodesResponse</p>
 */
public class ListInnerNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInnerNodesResponseBody body;

    private ListInnerNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInnerNodesResponse create() {
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
    public ListInnerNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInnerNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInnerNodesResponseBody body);

        @Override
        ListInnerNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInnerNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInnerNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInnerNodesResponse response) {
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
        public Builder body(ListInnerNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInnerNodesResponse build() {
            return new ListInnerNodesResponse(this);
        } 

    } 

}

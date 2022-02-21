// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowsResponse} extends {@link TeaModel}
 *
 * <p>ListFlowsResponse</p>
 */
public class ListFlowsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowsResponseBody body;

    private ListFlowsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowsResponse create() {
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
    public ListFlowsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowsResponseBody body);

        @Override
        ListFlowsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowsResponse response) {
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
        public Builder body(ListFlowsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowsResponse build() {
            return new ListFlowsResponse(this);
        } 

    } 

}

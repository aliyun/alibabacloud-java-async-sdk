// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContactFlowsResponse} extends {@link TeaModel}
 *
 * <p>ListContactFlowsResponse</p>
 */
public class ListContactFlowsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListContactFlowsResponseBody body;

    private ListContactFlowsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListContactFlowsResponse create() {
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
    public ListContactFlowsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListContactFlowsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListContactFlowsResponseBody body);

        @Override
        ListContactFlowsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListContactFlowsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListContactFlowsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListContactFlowsResponse response) {
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
        public Builder body(ListContactFlowsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListContactFlowsResponse build() {
            return new ListContactFlowsResponse(this);
        } 

    } 

}

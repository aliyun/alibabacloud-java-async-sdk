// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowProjectsResponse} extends {@link TeaModel}
 *
 * <p>ListFlowProjectsResponse</p>
 */
public class ListFlowProjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowProjectsResponseBody body;

    private ListFlowProjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowProjectsResponse create() {
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
    public ListFlowProjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowProjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowProjectsResponseBody body);

        @Override
        ListFlowProjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowProjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowProjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowProjectsResponse response) {
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
        public Builder body(ListFlowProjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowProjectsResponse build() {
            return new ListFlowProjectsResponse(this);
        } 

    } 

}

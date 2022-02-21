// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowJobsResponse} extends {@link TeaModel}
 *
 * <p>ListFlowJobsResponse</p>
 */
public class ListFlowJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowJobsResponseBody body;

    private ListFlowJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowJobsResponse create() {
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
    public ListFlowJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowJobsResponseBody body);

        @Override
        ListFlowJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowJobsResponse response) {
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
        public Builder body(ListFlowJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowJobsResponse build() {
            return new ListFlowJobsResponse(this);
        } 

    } 

}

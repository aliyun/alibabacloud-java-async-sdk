// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineRunsResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineRunsResponse</p>
 */
public class ListPipelineRunsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineRunsResponseBody body;

    private ListPipelineRunsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineRunsResponse create() {
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
    public ListPipelineRunsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineRunsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineRunsResponseBody body);

        @Override
        ListPipelineRunsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineRunsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineRunsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineRunsResponse response) {
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
        public Builder body(ListPipelineRunsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineRunsResponse build() {
            return new ListPipelineRunsResponse(this);
        } 

    } 

}

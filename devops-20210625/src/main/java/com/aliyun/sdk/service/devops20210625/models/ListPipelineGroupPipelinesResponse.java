// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineGroupPipelinesResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineGroupPipelinesResponse</p>
 */
public class ListPipelineGroupPipelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineGroupPipelinesResponseBody body;

    private ListPipelineGroupPipelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineGroupPipelinesResponse create() {
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
    public ListPipelineGroupPipelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineGroupPipelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineGroupPipelinesResponseBody body);

        @Override
        ListPipelineGroupPipelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineGroupPipelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineGroupPipelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineGroupPipelinesResponse response) {
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
        public Builder body(ListPipelineGroupPipelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineGroupPipelinesResponse build() {
            return new ListPipelineGroupPipelinesResponse(this);
        } 

    } 

}

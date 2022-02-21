// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineJobsResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineJobsResponse</p>
 */
public class ListPipelineJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineJobsResponseBody body;

    private ListPipelineJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineJobsResponse create() {
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
    public ListPipelineJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineJobsResponseBody body);

        @Override
        ListPipelineJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineJobsResponse response) {
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
        public Builder body(ListPipelineJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineJobsResponse build() {
            return new ListPipelineJobsResponse(this);
        } 

    } 

}

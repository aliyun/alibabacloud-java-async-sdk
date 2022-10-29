// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineGroupsResponse</p>
 */
public class ListPipelineGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineGroupsResponseBody body;

    private ListPipelineGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineGroupsResponse create() {
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
    public ListPipelineGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineGroupsResponseBody body);

        @Override
        ListPipelineGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineGroupsResponse response) {
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
        public Builder body(ListPipelineGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineGroupsResponse build() {
            return new ListPipelineGroupsResponse(this);
        } 

    } 

}

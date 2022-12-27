// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineRelationsResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineRelationsResponse</p>
 */
public class ListPipelineRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineRelationsResponseBody body;

    private ListPipelineRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineRelationsResponse create() {
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
    public ListPipelineRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineRelationsResponseBody body);

        @Override
        ListPipelineRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineRelationsResponse response) {
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
        public Builder body(ListPipelineRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineRelationsResponse build() {
            return new ListPipelineRelationsResponse(this);
        } 

    } 

}

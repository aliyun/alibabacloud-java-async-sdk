// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineResponse</p>
 */
public class ListPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineResponseBody body;

    private ListPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineResponse create() {
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
    public ListPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineResponseBody body);

        @Override
        ListPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineResponse response) {
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
        public Builder body(ListPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineResponse build() {
            return new ListPipelineResponse(this);
        } 

    } 

}

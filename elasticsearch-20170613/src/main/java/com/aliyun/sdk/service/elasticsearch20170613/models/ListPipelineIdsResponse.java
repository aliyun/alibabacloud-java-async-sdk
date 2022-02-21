// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineIdsResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineIdsResponse</p>
 */
public class ListPipelineIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineIdsResponseBody body;

    private ListPipelineIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineIdsResponse create() {
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
    public ListPipelineIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineIdsResponseBody body);

        @Override
        ListPipelineIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineIdsResponse response) {
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
        public Builder body(ListPipelineIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineIdsResponse build() {
            return new ListPipelineIdsResponse(this);
        } 

    } 

}

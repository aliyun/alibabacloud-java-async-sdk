// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchPipelineResponse} extends {@link TeaModel}
 *
 * <p>SearchPipelineResponse</p>
 */
public class SearchPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchPipelineResponseBody body;

    private SearchPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchPipelineResponse create() {
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
    public SearchPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchPipelineResponseBody body);

        @Override
        SearchPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchPipelineResponse response) {
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
        public Builder body(SearchPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchPipelineResponse build() {
            return new SearchPipelineResponse(this);
        } 

    } 

}

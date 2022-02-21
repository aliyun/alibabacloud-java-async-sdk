// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaWorkflowResponse} extends {@link TeaModel}
 *
 * <p>SearchMediaWorkflowResponse</p>
 */
public class SearchMediaWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchMediaWorkflowResponseBody body;

    private SearchMediaWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchMediaWorkflowResponse create() {
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
    public SearchMediaWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchMediaWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchMediaWorkflowResponseBody body);

        @Override
        SearchMediaWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchMediaWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchMediaWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchMediaWorkflowResponse response) {
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
        public Builder body(SearchMediaWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchMediaWorkflowResponse build() {
            return new SearchMediaWorkflowResponse(this);
        } 

    } 

}

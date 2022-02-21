// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorAnalyzerResultsResponse} extends {@link TeaModel}
 *
 * <p>ListQueryProcessorAnalyzerResultsResponse</p>
 */
public class ListQueryProcessorAnalyzerResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueryProcessorAnalyzerResultsResponseBody body;

    private ListQueryProcessorAnalyzerResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueryProcessorAnalyzerResultsResponse create() {
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
    public ListQueryProcessorAnalyzerResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueryProcessorAnalyzerResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueryProcessorAnalyzerResultsResponseBody body);

        @Override
        ListQueryProcessorAnalyzerResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueryProcessorAnalyzerResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueryProcessorAnalyzerResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueryProcessorAnalyzerResultsResponse response) {
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
        public Builder body(ListQueryProcessorAnalyzerResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueryProcessorAnalyzerResultsResponse build() {
            return new ListQueryProcessorAnalyzerResultsResponse(this);
        } 

    } 

}

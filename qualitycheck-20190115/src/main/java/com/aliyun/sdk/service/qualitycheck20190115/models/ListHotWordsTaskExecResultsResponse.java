// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotWordsTaskExecResultsResponse} extends {@link TeaModel}
 *
 * <p>ListHotWordsTaskExecResultsResponse</p>
 */
public class ListHotWordsTaskExecResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotWordsTaskExecResultsResponseBody body;

    private ListHotWordsTaskExecResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotWordsTaskExecResultsResponse create() {
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
    public ListHotWordsTaskExecResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotWordsTaskExecResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotWordsTaskExecResultsResponseBody body);

        @Override
        ListHotWordsTaskExecResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotWordsTaskExecResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotWordsTaskExecResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotWordsTaskExecResultsResponse response) {
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
        public Builder body(ListHotWordsTaskExecResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotWordsTaskExecResultsResponse build() {
            return new ListHotWordsTaskExecResultsResponse(this);
        } 

    } 

}

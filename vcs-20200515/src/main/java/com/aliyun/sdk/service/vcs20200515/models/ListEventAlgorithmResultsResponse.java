// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventAlgorithmResultsResponse} extends {@link TeaModel}
 *
 * <p>ListEventAlgorithmResultsResponse</p>
 */
public class ListEventAlgorithmResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEventAlgorithmResultsResponseBody body;

    private ListEventAlgorithmResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEventAlgorithmResultsResponse create() {
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
    public ListEventAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEventAlgorithmResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEventAlgorithmResultsResponseBody body);

        @Override
        ListEventAlgorithmResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEventAlgorithmResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEventAlgorithmResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEventAlgorithmResultsResponse response) {
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
        public Builder body(ListEventAlgorithmResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEventAlgorithmResultsResponse build() {
            return new ListEventAlgorithmResultsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBodyAlgorithmResultsResponse} extends {@link TeaModel}
 *
 * <p>ListBodyAlgorithmResultsResponse</p>
 */
public class ListBodyAlgorithmResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBodyAlgorithmResultsResponseBody body;

    private ListBodyAlgorithmResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBodyAlgorithmResultsResponse create() {
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
    public ListBodyAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBodyAlgorithmResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBodyAlgorithmResultsResponseBody body);

        @Override
        ListBodyAlgorithmResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBodyAlgorithmResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBodyAlgorithmResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBodyAlgorithmResultsResponse response) {
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
        public Builder body(ListBodyAlgorithmResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBodyAlgorithmResultsResponse build() {
            return new ListBodyAlgorithmResultsResponse(this);
        } 

    } 

}

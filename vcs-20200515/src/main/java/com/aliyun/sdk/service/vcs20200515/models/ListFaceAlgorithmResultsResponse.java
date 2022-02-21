// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceAlgorithmResultsResponse} extends {@link TeaModel}
 *
 * <p>ListFaceAlgorithmResultsResponse</p>
 */
public class ListFaceAlgorithmResultsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFaceAlgorithmResultsResponseBody body;

    private ListFaceAlgorithmResultsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFaceAlgorithmResultsResponse create() {
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
    public ListFaceAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFaceAlgorithmResultsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFaceAlgorithmResultsResponseBody body);

        @Override
        ListFaceAlgorithmResultsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFaceAlgorithmResultsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFaceAlgorithmResultsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFaceAlgorithmResultsResponse response) {
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
        public Builder body(ListFaceAlgorithmResultsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFaceAlgorithmResultsResponse build() {
            return new ListFaceAlgorithmResultsResponse(this);
        } 

    } 

}

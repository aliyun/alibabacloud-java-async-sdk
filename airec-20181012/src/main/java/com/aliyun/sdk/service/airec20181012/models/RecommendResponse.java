// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecommendResponse} extends {@link TeaModel}
 *
 * <p>RecommendResponse</p>
 */
public class RecommendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecommendResponseBody body;

    private RecommendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecommendResponse create() {
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
    public RecommendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecommendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecommendResponseBody body);

        @Override
        RecommendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecommendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecommendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecommendResponse response) {
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
        public Builder body(RecommendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecommendResponse build() {
            return new RecommendResponse(this);
        } 

    } 

}

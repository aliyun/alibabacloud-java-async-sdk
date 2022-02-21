// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitReviewInfoResponse} extends {@link TeaModel}
 *
 * <p>SubmitReviewInfoResponse</p>
 */
public class SubmitReviewInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitReviewInfoResponseBody body;

    private SubmitReviewInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitReviewInfoResponse create() {
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
    public SubmitReviewInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitReviewInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitReviewInfoResponseBody body);

        @Override
        SubmitReviewInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitReviewInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitReviewInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitReviewInfoResponse response) {
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
        public Builder body(SubmitReviewInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitReviewInfoResponse build() {
            return new SubmitReviewInfoResponse(this);
        } 

    } 

}

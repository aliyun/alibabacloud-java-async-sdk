// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReviewMergeRequestResponse} extends {@link TeaModel}
 *
 * <p>ReviewMergeRequestResponse</p>
 */
public class ReviewMergeRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReviewMergeRequestResponseBody body;

    private ReviewMergeRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReviewMergeRequestResponse create() {
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
    public ReviewMergeRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReviewMergeRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReviewMergeRequestResponseBody body);

        @Override
        ReviewMergeRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReviewMergeRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReviewMergeRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReviewMergeRequestResponse response) {
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
        public Builder body(ReviewMergeRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReviewMergeRequestResponse build() {
            return new ReviewMergeRequestResponse(this);
        } 

    } 

}

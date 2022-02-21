// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitPreprocessJobsResponse} extends {@link TeaModel}
 *
 * <p>SubmitPreprocessJobsResponse</p>
 */
public class SubmitPreprocessJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitPreprocessJobsResponseBody body;

    private SubmitPreprocessJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitPreprocessJobsResponse create() {
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
    public SubmitPreprocessJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitPreprocessJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitPreprocessJobsResponseBody body);

        @Override
        SubmitPreprocessJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitPreprocessJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitPreprocessJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitPreprocessJobsResponse response) {
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
        public Builder body(SubmitPreprocessJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitPreprocessJobsResponse build() {
            return new SubmitPreprocessJobsResponse(this);
        } 

    } 

}

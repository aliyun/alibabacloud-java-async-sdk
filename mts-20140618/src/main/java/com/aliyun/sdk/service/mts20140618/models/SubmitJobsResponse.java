// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitJobsResponse} extends {@link TeaModel}
 *
 * <p>SubmitJobsResponse</p>
 */
public class SubmitJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitJobsResponseBody body;

    private SubmitJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitJobsResponse create() {
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
    public SubmitJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitJobsResponseBody body);

        @Override
        SubmitJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitJobsResponse response) {
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
        public Builder body(SubmitJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitJobsResponse build() {
            return new SubmitJobsResponse(this);
        } 

    } 

}

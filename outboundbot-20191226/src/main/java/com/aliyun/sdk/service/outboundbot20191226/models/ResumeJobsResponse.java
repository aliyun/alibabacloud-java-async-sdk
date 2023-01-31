// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeJobsResponse} extends {@link TeaModel}
 *
 * <p>ResumeJobsResponse</p>
 */
public class ResumeJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeJobsResponseBody body;

    private ResumeJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeJobsResponse create() {
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
    public ResumeJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeJobsResponseBody body);

        @Override
        ResumeJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeJobsResponse response) {
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
        public Builder body(ResumeJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeJobsResponse build() {
            return new ResumeJobsResponse(this);
        } 

    } 

}

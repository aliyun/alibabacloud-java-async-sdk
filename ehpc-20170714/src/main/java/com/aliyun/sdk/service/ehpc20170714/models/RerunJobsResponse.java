// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RerunJobsResponse} extends {@link TeaModel}
 *
 * <p>RerunJobsResponse</p>
 */
public class RerunJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RerunJobsResponseBody body;

    private RerunJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RerunJobsResponse create() {
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
    public RerunJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RerunJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RerunJobsResponseBody body);

        @Override
        RerunJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RerunJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RerunJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RerunJobsResponse response) {
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
        public Builder body(RerunJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RerunJobsResponse build() {
            return new RerunJobsResponse(this);
        } 

    } 

}

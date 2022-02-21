// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDtsJobsResponse} extends {@link TeaModel}
 *
 * <p>StartDtsJobsResponse</p>
 */
public class StartDtsJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDtsJobsResponseBody body;

    private StartDtsJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDtsJobsResponse create() {
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
    public StartDtsJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDtsJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDtsJobsResponseBody body);

        @Override
        StartDtsJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDtsJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDtsJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDtsJobsResponse response) {
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
        public Builder body(StartDtsJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDtsJobsResponse build() {
            return new StartDtsJobsResponse(this);
        } 

    } 

}

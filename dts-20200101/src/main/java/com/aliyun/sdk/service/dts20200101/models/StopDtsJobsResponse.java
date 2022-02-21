// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDtsJobsResponse} extends {@link TeaModel}
 *
 * <p>StopDtsJobsResponse</p>
 */
public class StopDtsJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDtsJobsResponseBody body;

    private StopDtsJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDtsJobsResponse create() {
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
    public StopDtsJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDtsJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDtsJobsResponseBody body);

        @Override
        StopDtsJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDtsJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDtsJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDtsJobsResponse response) {
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
        public Builder body(StopDtsJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDtsJobsResponse build() {
            return new StopDtsJobsResponse(this);
        } 

    } 

}

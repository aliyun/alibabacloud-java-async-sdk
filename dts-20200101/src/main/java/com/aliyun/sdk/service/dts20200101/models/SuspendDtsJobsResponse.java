// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendDtsJobsResponse} extends {@link TeaModel}
 *
 * <p>SuspendDtsJobsResponse</p>
 */
public class SuspendDtsJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendDtsJobsResponseBody body;

    private SuspendDtsJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendDtsJobsResponse create() {
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
    public SuspendDtsJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendDtsJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendDtsJobsResponseBody body);

        @Override
        SuspendDtsJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendDtsJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendDtsJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendDtsJobsResponse response) {
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
        public Builder body(SuspendDtsJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendDtsJobsResponse build() {
            return new SuspendDtsJobsResponse(this);
        } 

    } 

}

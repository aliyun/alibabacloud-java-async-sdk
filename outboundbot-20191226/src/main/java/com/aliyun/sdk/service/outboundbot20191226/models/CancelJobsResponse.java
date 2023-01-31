// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelJobsResponse} extends {@link TeaModel}
 *
 * <p>CancelJobsResponse</p>
 */
public class CancelJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelJobsResponseBody body;

    private CancelJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelJobsResponse create() {
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
    public CancelJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelJobsResponseBody body);

        @Override
        CancelJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelJobsResponse response) {
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
        public Builder body(CancelJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelJobsResponse build() {
            return new CancelJobsResponse(this);
        } 

    } 

}

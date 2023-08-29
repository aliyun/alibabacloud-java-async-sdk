// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPushSchedulerResponse} extends {@link TeaModel}
 *
 * <p>CancelPushSchedulerResponse</p>
 */
public class CancelPushSchedulerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelPushSchedulerResponseBody body;

    private CancelPushSchedulerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelPushSchedulerResponse create() {
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
    public CancelPushSchedulerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelPushSchedulerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelPushSchedulerResponseBody body);

        @Override
        CancelPushSchedulerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelPushSchedulerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelPushSchedulerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelPushSchedulerResponse response) {
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
        public Builder body(CancelPushSchedulerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelPushSchedulerResponse build() {
            return new CancelPushSchedulerResponse(this);
        } 

    } 

}

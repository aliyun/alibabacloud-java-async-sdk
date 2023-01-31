// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendCallWithFileResponse} extends {@link TeaModel}
 *
 * <p>SuspendCallWithFileResponse</p>
 */
public class SuspendCallWithFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendCallWithFileResponseBody body;

    private SuspendCallWithFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendCallWithFileResponse create() {
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
    public SuspendCallWithFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendCallWithFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendCallWithFileResponseBody body);

        @Override
        SuspendCallWithFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendCallWithFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendCallWithFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendCallWithFileResponse response) {
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
        public Builder body(SuspendCallWithFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendCallWithFileResponse build() {
            return new SuspendCallWithFileResponse(this);
        } 

    } 

}

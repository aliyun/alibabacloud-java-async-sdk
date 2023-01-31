// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendCallResponse} extends {@link TeaModel}
 *
 * <p>SuspendCallResponse</p>
 */
public class SuspendCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendCallResponseBody body;

    private SuspendCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendCallResponse create() {
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
    public SuspendCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendCallResponseBody body);

        @Override
        SuspendCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendCallResponse response) {
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
        public Builder body(SuspendCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendCallResponse build() {
            return new SuspendCallResponse(this);
        } 

    } 

}

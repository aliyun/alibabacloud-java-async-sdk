// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendOutboundTaskResponse} extends {@link TeaModel}
 *
 * <p>SuspendOutboundTaskResponse</p>
 */
public class SuspendOutboundTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendOutboundTaskResponseBody body;

    private SuspendOutboundTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendOutboundTaskResponse create() {
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
    public SuspendOutboundTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendOutboundTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendOutboundTaskResponseBody body);

        @Override
        SuspendOutboundTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendOutboundTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendOutboundTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendOutboundTaskResponse response) {
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
        public Builder body(SuspendOutboundTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendOutboundTaskResponse build() {
            return new SuspendOutboundTaskResponse(this);
        } 

    } 

}

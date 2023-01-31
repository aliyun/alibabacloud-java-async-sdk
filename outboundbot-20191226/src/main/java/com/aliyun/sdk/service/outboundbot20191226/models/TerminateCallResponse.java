// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateCallResponse} extends {@link TeaModel}
 *
 * <p>TerminateCallResponse</p>
 */
public class TerminateCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TerminateCallResponseBody body;

    private TerminateCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TerminateCallResponse create() {
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
    public TerminateCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TerminateCallResponseBody body);

        @Override
        TerminateCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TerminateCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateCallResponse response) {
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
        public Builder body(TerminateCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateCallResponse build() {
            return new TerminateCallResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackScriptResponse} extends {@link TeaModel}
 *
 * <p>RollbackScriptResponse</p>
 */
public class RollbackScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RollbackScriptResponseBody body;

    private RollbackScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RollbackScriptResponse create() {
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
    public RollbackScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RollbackScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RollbackScriptResponseBody body);

        @Override
        RollbackScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RollbackScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RollbackScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RollbackScriptResponse response) {
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
        public Builder body(RollbackScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RollbackScriptResponse build() {
            return new RollbackScriptResponse(this);
        } 

    } 

}

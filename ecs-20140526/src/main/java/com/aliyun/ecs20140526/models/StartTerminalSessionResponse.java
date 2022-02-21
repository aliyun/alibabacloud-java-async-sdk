// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTerminalSessionResponse} extends {@link TeaModel}
 *
 * <p>StartTerminalSessionResponse</p>
 */
public class StartTerminalSessionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartTerminalSessionResponseBody body;

    private StartTerminalSessionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartTerminalSessionResponse create() {
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
    public StartTerminalSessionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartTerminalSessionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartTerminalSessionResponseBody body);

        @Override
        StartTerminalSessionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartTerminalSessionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartTerminalSessionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartTerminalSessionResponse response) {
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
        public Builder body(StartTerminalSessionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartTerminalSessionResponse build() {
            return new StartTerminalSessionResponse(this);
        } 

    } 

}

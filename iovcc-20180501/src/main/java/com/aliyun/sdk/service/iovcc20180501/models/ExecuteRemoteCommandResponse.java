// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteRemoteCommandResponse} extends {@link TeaModel}
 *
 * <p>ExecuteRemoteCommandResponse</p>
 */
public class ExecuteRemoteCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteRemoteCommandResponseBody body;

    private ExecuteRemoteCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteRemoteCommandResponse create() {
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
    public ExecuteRemoteCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteRemoteCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteRemoteCommandResponseBody body);

        @Override
        ExecuteRemoteCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteRemoteCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteRemoteCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteRemoteCommandResponse response) {
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
        public Builder body(ExecuteRemoteCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteRemoteCommandResponse build() {
            return new ExecuteRemoteCommandResponse(this);
        } 

    } 

}

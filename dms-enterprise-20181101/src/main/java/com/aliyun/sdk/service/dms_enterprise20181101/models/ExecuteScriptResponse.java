// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteScriptResponse} extends {@link TeaModel}
 *
 * <p>ExecuteScriptResponse</p>
 */
public class ExecuteScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteScriptResponseBody body;

    private ExecuteScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteScriptResponse create() {
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
    public ExecuteScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteScriptResponseBody body);

        @Override
        ExecuteScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteScriptResponse response) {
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
        public Builder body(ExecuteScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteScriptResponse build() {
            return new ExecuteScriptResponse(this);
        } 

    } 

}

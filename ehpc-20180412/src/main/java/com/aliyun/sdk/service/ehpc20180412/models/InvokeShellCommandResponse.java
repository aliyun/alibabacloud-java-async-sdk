// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeShellCommandResponse} extends {@link TeaModel}
 *
 * <p>InvokeShellCommandResponse</p>
 */
public class InvokeShellCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvokeShellCommandResponseBody body;

    private InvokeShellCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvokeShellCommandResponse create() {
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
    public InvokeShellCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvokeShellCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvokeShellCommandResponseBody body);

        @Override
        InvokeShellCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvokeShellCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvokeShellCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvokeShellCommandResponse response) {
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
        public Builder body(InvokeShellCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvokeShellCommandResponse build() {
            return new InvokeShellCommandResponse(this);
        } 

    } 

}

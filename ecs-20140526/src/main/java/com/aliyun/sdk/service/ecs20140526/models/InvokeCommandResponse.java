// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeCommandResponse} extends {@link TeaModel}
 *
 * <p>InvokeCommandResponse</p>
 */
public class InvokeCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvokeCommandResponseBody body;

    private InvokeCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvokeCommandResponse create() {
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
    public InvokeCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvokeCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvokeCommandResponseBody body);

        @Override
        InvokeCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvokeCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvokeCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvokeCommandResponse response) {
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
        public Builder body(InvokeCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvokeCommandResponse build() {
            return new InvokeCommandResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetBackendServersResponse} extends {@link TeaModel}
 *
 * <p>SetBackendServersResponse</p>
 */
public class SetBackendServersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetBackendServersResponseBody body;

    private SetBackendServersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetBackendServersResponse create() {
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
    public SetBackendServersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetBackendServersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetBackendServersResponseBody body);

        @Override
        SetBackendServersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetBackendServersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetBackendServersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetBackendServersResponse response) {
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
        public Builder body(SetBackendServersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetBackendServersResponse build() {
            return new SetBackendServersResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDevicesResponse} extends {@link TeaModel}
 *
 * <p>UnbindDevicesResponse</p>
 */
public class UnbindDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindDevicesResponseBody body;

    private UnbindDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindDevicesResponse create() {
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
    public UnbindDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindDevicesResponseBody body);

        @Override
        UnbindDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindDevicesResponse response) {
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
        public Builder body(UnbindDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindDevicesResponse build() {
            return new UnbindDevicesResponse(this);
        } 

    } 

}

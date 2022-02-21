// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnRegisterDeviceCredentialResponse} extends {@link TeaModel}
 *
 * <p>UnRegisterDeviceCredentialResponse</p>
 */
public class UnRegisterDeviceCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnRegisterDeviceCredentialResponseBody body;

    private UnRegisterDeviceCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnRegisterDeviceCredentialResponse create() {
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
    public UnRegisterDeviceCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnRegisterDeviceCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnRegisterDeviceCredentialResponseBody body);

        @Override
        UnRegisterDeviceCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnRegisterDeviceCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnRegisterDeviceCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnRegisterDeviceCredentialResponse response) {
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
        public Builder body(UnRegisterDeviceCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnRegisterDeviceCredentialResponse build() {
            return new UnRegisterDeviceCredentialResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceCredentialResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceCredentialResponse</p>
 */
public class GetDeviceCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceCredentialResponseBody body;

    private GetDeviceCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceCredentialResponse create() {
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
    public GetDeviceCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceCredentialResponseBody body);

        @Override
        GetDeviceCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceCredentialResponse response) {
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
        public Builder body(GetDeviceCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceCredentialResponse build() {
            return new GetDeviceCredentialResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDeviceResponse} extends {@link TeaModel}
 *
 * <p>VerifyDeviceResponse</p>
 */
public class VerifyDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyDeviceResponseBody body;

    private VerifyDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyDeviceResponse create() {
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
    public VerifyDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyDeviceResponseBody body);

        @Override
        VerifyDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyDeviceResponse response) {
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
        public Builder body(VerifyDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyDeviceResponse build() {
            return new VerifyDeviceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScanDeviceResponse} extends {@link TeaModel}
 *
 * <p>CreateScanDeviceResponse</p>
 */
public class CreateScanDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScanDeviceResponseBody body;

    private CreateScanDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScanDeviceResponse create() {
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
    public CreateScanDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScanDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScanDeviceResponseBody body);

        @Override
        CreateScanDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScanDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScanDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScanDeviceResponse response) {
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
        public Builder body(CreateScanDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScanDeviceResponse build() {
            return new CreateScanDeviceResponse(this);
        } 

    } 

}

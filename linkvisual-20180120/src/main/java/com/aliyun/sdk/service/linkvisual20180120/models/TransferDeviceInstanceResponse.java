// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferDeviceInstanceResponse} extends {@link TeaModel}
 *
 * <p>TransferDeviceInstanceResponse</p>
 */
public class TransferDeviceInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferDeviceInstanceResponseBody body;

    private TransferDeviceInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferDeviceInstanceResponse create() {
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
    public TransferDeviceInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferDeviceInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferDeviceInstanceResponseBody body);

        @Override
        TransferDeviceInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferDeviceInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferDeviceInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferDeviceInstanceResponse response) {
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
        public Builder body(TransferDeviceInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferDeviceInstanceResponse build() {
            return new TransferDeviceInstanceResponse(this);
        } 

    } 

}

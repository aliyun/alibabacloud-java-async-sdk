// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRegisteredDeviceResponse} extends {@link TeaModel}
 *
 * <p>AddRegisteredDeviceResponse</p>
 */
public class AddRegisteredDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRegisteredDeviceResponseBody body;

    private AddRegisteredDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRegisteredDeviceResponse create() {
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
    public AddRegisteredDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRegisteredDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRegisteredDeviceResponseBody body);

        @Override
        AddRegisteredDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRegisteredDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRegisteredDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRegisteredDeviceResponse response) {
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
        public Builder body(AddRegisteredDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRegisteredDeviceResponse build() {
            return new AddRegisteredDeviceResponse(this);
        } 

    } 

}

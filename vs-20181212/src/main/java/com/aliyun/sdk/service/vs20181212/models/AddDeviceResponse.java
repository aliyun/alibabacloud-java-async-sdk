// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDeviceResponse} extends {@link TeaModel}
 *
 * <p>AddDeviceResponse</p>
 */
public class AddDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDeviceResponseBody body;

    private AddDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDeviceResponse create() {
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
    public AddDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDeviceResponseBody body);

        @Override
        AddDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDeviceResponse response) {
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
        public Builder body(AddDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDeviceResponse build() {
            return new AddDeviceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShareTaskDeviceResponse} extends {@link TeaModel}
 *
 * <p>AddShareTaskDeviceResponse</p>
 */
public class AddShareTaskDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddShareTaskDeviceResponseBody body;

    private AddShareTaskDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddShareTaskDeviceResponse create() {
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
    public AddShareTaskDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddShareTaskDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddShareTaskDeviceResponseBody body);

        @Override
        AddShareTaskDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddShareTaskDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddShareTaskDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddShareTaskDeviceResponse response) {
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
        public Builder body(AddShareTaskDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddShareTaskDeviceResponse build() {
            return new AddShareTaskDeviceResponse(this);
        } 

    } 

}

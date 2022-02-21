// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceResponse</p>
 */
public class CreateDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceResponseBody body;

    private CreateDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceResponse create() {
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
    public CreateDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceResponseBody body);

        @Override
        CreateDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceResponse response) {
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
        public Builder body(CreateDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceResponse build() {
            return new CreateDeviceResponse(this);
        } 

    } 

}

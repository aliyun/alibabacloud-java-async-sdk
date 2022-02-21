// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceModelResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceModelResponse</p>
 */
public class CreateDeviceModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceModelResponseBody body;

    private CreateDeviceModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceModelResponse create() {
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
    public CreateDeviceModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceModelResponseBody body);

        @Override
        CreateDeviceModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceModelResponse response) {
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
        public Builder body(CreateDeviceModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceModelResponse build() {
            return new CreateDeviceModelResponse(this);
        } 

    } 

}

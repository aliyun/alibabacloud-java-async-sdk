// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVersionWhiteDevicesResponse} extends {@link TeaModel}
 *
 * <p>AddVersionWhiteDevicesResponse</p>
 */
public class AddVersionWhiteDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddVersionWhiteDevicesResponseBody body;

    private AddVersionWhiteDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddVersionWhiteDevicesResponse create() {
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
    public AddVersionWhiteDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddVersionWhiteDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddVersionWhiteDevicesResponseBody body);

        @Override
        AddVersionWhiteDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddVersionWhiteDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddVersionWhiteDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddVersionWhiteDevicesResponse response) {
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
        public Builder body(AddVersionWhiteDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddVersionWhiteDevicesResponse build() {
            return new AddVersionWhiteDevicesResponse(this);
        } 

    } 

}

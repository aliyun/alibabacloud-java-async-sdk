// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVersionGroupDevicesResponse} extends {@link TeaModel}
 *
 * <p>AddVersionGroupDevicesResponse</p>
 */
public class AddVersionGroupDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddVersionGroupDevicesResponseBody body;

    private AddVersionGroupDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddVersionGroupDevicesResponse create() {
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
    public AddVersionGroupDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddVersionGroupDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddVersionGroupDevicesResponseBody body);

        @Override
        AddVersionGroupDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddVersionGroupDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddVersionGroupDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddVersionGroupDevicesResponse response) {
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
        public Builder body(AddVersionGroupDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddVersionGroupDevicesResponse build() {
            return new AddVersionGroupDevicesResponse(this);
        } 

    } 

}

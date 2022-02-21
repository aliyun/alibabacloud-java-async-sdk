// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotDevicesResponse} extends {@link TeaModel}
 *
 * <p>AddAiotDevicesResponse</p>
 */
public class AddAiotDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAiotDevicesResponseBody body;

    private AddAiotDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAiotDevicesResponse create() {
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
    public AddAiotDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAiotDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAiotDevicesResponseBody body);

        @Override
        AddAiotDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAiotDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAiotDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAiotDevicesResponse response) {
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
        public Builder body(AddAiotDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAiotDevicesResponse build() {
            return new AddAiotDevicesResponse(this);
        } 

    } 

}

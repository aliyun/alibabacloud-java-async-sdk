// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCameraForInstanceResponse} extends {@link TeaModel}
 *
 * <p>AddCameraForInstanceResponse</p>
 */
public class AddCameraForInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCameraForInstanceResponseBody body;

    private AddCameraForInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCameraForInstanceResponse create() {
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
    public AddCameraForInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCameraForInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCameraForInstanceResponseBody body);

        @Override
        AddCameraForInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCameraForInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCameraForInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCameraForInstanceResponse response) {
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
        public Builder body(AddCameraForInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCameraForInstanceResponse build() {
            return new AddCameraForInstanceResponse(this);
        } 

    } 

}

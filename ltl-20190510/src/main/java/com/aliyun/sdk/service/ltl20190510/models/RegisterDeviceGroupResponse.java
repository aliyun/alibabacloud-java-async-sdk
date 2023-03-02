// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>RegisterDeviceGroupResponse</p>
 */
public class RegisterDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterDeviceGroupResponseBody body;

    private RegisterDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterDeviceGroupResponse create() {
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
    public RegisterDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterDeviceGroupResponseBody body);

        @Override
        RegisterDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterDeviceGroupResponse response) {
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
        public Builder body(RegisterDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterDeviceGroupResponse build() {
            return new RegisterDeviceGroupResponse(this);
        } 

    } 

}

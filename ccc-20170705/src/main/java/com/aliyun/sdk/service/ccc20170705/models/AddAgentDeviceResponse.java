// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAgentDeviceResponse} extends {@link TeaModel}
 *
 * <p>AddAgentDeviceResponse</p>
 */
public class AddAgentDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAgentDeviceResponseBody body;

    private AddAgentDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAgentDeviceResponse create() {
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
    public AddAgentDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAgentDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAgentDeviceResponseBody body);

        @Override
        AddAgentDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAgentDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAgentDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAgentDeviceResponse response) {
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
        public Builder body(AddAgentDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAgentDeviceResponse build() {
            return new AddAgentDeviceResponse(this);
        } 

    } 

}

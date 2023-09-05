// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAccelerateIpResponse} extends {@link TeaModel}
 *
 * <p>CreateBasicAccelerateIpResponse</p>
 */
public class CreateBasicAccelerateIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBasicAccelerateIpResponseBody body;

    private CreateBasicAccelerateIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBasicAccelerateIpResponse create() {
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
    public CreateBasicAccelerateIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBasicAccelerateIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBasicAccelerateIpResponseBody body);

        @Override
        CreateBasicAccelerateIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBasicAccelerateIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBasicAccelerateIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBasicAccelerateIpResponse response) {
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
        public Builder body(CreateBasicAccelerateIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBasicAccelerateIpResponse build() {
            return new CreateBasicAccelerateIpResponse(this);
        } 

    } 

}

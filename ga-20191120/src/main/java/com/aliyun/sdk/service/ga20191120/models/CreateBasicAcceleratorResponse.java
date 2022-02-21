// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>CreateBasicAcceleratorResponse</p>
 */
public class CreateBasicAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBasicAcceleratorResponseBody body;

    private CreateBasicAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBasicAcceleratorResponse create() {
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
    public CreateBasicAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBasicAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBasicAcceleratorResponseBody body);

        @Override
        CreateBasicAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBasicAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBasicAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBasicAcceleratorResponse response) {
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
        public Builder body(CreateBasicAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBasicAcceleratorResponse build() {
            return new CreateBasicAcceleratorResponse(this);
        } 

    } 

}

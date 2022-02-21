// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>CreateAcceleratorResponse</p>
 */
public class CreateAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAcceleratorResponseBody body;

    private CreateAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAcceleratorResponse create() {
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
    public CreateAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAcceleratorResponseBody body);

        @Override
        CreateAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAcceleratorResponse response) {
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
        public Builder body(CreateAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAcceleratorResponse build() {
            return new CreateAcceleratorResponse(this);
        } 

    } 

}

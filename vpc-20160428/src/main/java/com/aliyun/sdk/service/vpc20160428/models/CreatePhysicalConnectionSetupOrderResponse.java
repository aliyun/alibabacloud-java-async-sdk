// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalConnectionSetupOrderResponse} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionSetupOrderResponse</p>
 */
public class CreatePhysicalConnectionSetupOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePhysicalConnectionSetupOrderResponseBody body;

    private CreatePhysicalConnectionSetupOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePhysicalConnectionSetupOrderResponse create() {
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
    public CreatePhysicalConnectionSetupOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePhysicalConnectionSetupOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePhysicalConnectionSetupOrderResponseBody body);

        @Override
        CreatePhysicalConnectionSetupOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePhysicalConnectionSetupOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePhysicalConnectionSetupOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePhysicalConnectionSetupOrderResponse response) {
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
        public Builder body(CreatePhysicalConnectionSetupOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePhysicalConnectionSetupOrderResponse build() {
            return new CreatePhysicalConnectionSetupOrderResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalConnectionOccupancyOrderResponse} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionOccupancyOrderResponse</p>
 */
public class CreatePhysicalConnectionOccupancyOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePhysicalConnectionOccupancyOrderResponseBody body;

    private CreatePhysicalConnectionOccupancyOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePhysicalConnectionOccupancyOrderResponse create() {
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
    public CreatePhysicalConnectionOccupancyOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePhysicalConnectionOccupancyOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePhysicalConnectionOccupancyOrderResponseBody body);

        @Override
        CreatePhysicalConnectionOccupancyOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePhysicalConnectionOccupancyOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePhysicalConnectionOccupancyOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePhysicalConnectionOccupancyOrderResponse response) {
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
        public Builder body(CreatePhysicalConnectionOccupancyOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePhysicalConnectionOccupancyOrderResponse build() {
            return new CreatePhysicalConnectionOccupancyOrderResponse(this);
        } 

    } 

}

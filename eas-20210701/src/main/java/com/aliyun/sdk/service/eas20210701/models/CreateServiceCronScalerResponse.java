// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceCronScalerResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceCronScalerResponse</p>
 */
public class CreateServiceCronScalerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceCronScalerResponseBody body;

    private CreateServiceCronScalerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceCronScalerResponse create() {
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
    public CreateServiceCronScalerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceCronScalerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceCronScalerResponseBody body);

        @Override
        CreateServiceCronScalerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceCronScalerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceCronScalerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceCronScalerResponse response) {
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
        public Builder body(CreateServiceCronScalerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceCronScalerResponse build() {
            return new CreateServiceCronScalerResponse(this);
        } 

    } 

}

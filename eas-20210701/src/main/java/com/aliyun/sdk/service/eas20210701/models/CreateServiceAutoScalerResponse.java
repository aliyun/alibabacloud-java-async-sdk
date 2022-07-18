// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceAutoScalerResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceAutoScalerResponse</p>
 */
public class CreateServiceAutoScalerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceAutoScalerResponseBody body;

    private CreateServiceAutoScalerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceAutoScalerResponse create() {
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
    public CreateServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceAutoScalerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceAutoScalerResponseBody body);

        @Override
        CreateServiceAutoScalerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceAutoScalerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceAutoScalerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceAutoScalerResponse response) {
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
        public Builder body(CreateServiceAutoScalerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceAutoScalerResponse build() {
            return new CreateServiceAutoScalerResponse(this);
        } 

    } 

}

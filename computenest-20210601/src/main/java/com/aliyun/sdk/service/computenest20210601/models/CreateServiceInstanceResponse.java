// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceInstanceResponse</p>
 */
public class CreateServiceInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceInstanceResponseBody body;

    private CreateServiceInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceInstanceResponse create() {
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
    public CreateServiceInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceInstanceResponseBody body);

        @Override
        CreateServiceInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceInstanceResponse response) {
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
        public Builder body(CreateServiceInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceInstanceResponse build() {
            return new CreateServiceInstanceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGlobalAccelerationInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateGlobalAccelerationInstanceResponse</p>
 */
public class CreateGlobalAccelerationInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGlobalAccelerationInstanceResponseBody body;

    private CreateGlobalAccelerationInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGlobalAccelerationInstanceResponse create() {
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
    public CreateGlobalAccelerationInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGlobalAccelerationInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGlobalAccelerationInstanceResponseBody body);

        @Override
        CreateGlobalAccelerationInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGlobalAccelerationInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGlobalAccelerationInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGlobalAccelerationInstanceResponse response) {
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
        public Builder body(CreateGlobalAccelerationInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGlobalAccelerationInstanceResponse build() {
            return new CreateGlobalAccelerationInstanceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAModuleResponse} extends {@link TeaModel}
 *
 * <p>CreateOTAModuleResponse</p>
 */
public class CreateOTAModuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOTAModuleResponseBody body;

    private CreateOTAModuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOTAModuleResponse create() {
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
    public CreateOTAModuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOTAModuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOTAModuleResponseBody body);

        @Override
        CreateOTAModuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOTAModuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOTAModuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOTAModuleResponse response) {
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
        public Builder body(CreateOTAModuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOTAModuleResponse build() {
            return new CreateOTAModuleResponse(this);
        } 

    } 

}

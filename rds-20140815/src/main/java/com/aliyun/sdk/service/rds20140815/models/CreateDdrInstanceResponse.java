// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDdrInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateDdrInstanceResponse</p>
 */
public class CreateDdrInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDdrInstanceResponseBody body;

    private CreateDdrInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDdrInstanceResponse create() {
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
    public CreateDdrInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDdrInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDdrInstanceResponseBody body);

        @Override
        CreateDdrInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDdrInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDdrInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDdrInstanceResponse response) {
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
        public Builder body(CreateDdrInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDdrInstanceResponse build() {
            return new CreateDdrInstanceResponse(this);
        } 

    } 

}

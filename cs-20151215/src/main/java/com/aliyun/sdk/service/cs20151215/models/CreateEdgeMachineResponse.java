// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeMachineResponse} extends {@link TeaModel}
 *
 * <p>CreateEdgeMachineResponse</p>
 */
public class CreateEdgeMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEdgeMachineResponseBody body;

    private CreateEdgeMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEdgeMachineResponse create() {
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
    public CreateEdgeMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEdgeMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEdgeMachineResponseBody body);

        @Override
        CreateEdgeMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEdgeMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEdgeMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEdgeMachineResponse response) {
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
        public Builder body(CreateEdgeMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEdgeMachineResponse build() {
            return new CreateEdgeMachineResponse(this);
        } 

    } 

}

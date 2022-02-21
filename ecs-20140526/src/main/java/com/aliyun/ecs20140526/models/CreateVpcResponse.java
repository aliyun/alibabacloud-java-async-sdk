// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcResponse} extends {@link TeaModel}
 *
 * <p>CreateVpcResponse</p>
 */
public class CreateVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpcResponseBody body;

    private CreateVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpcResponse create() {
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
    public CreateVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpcResponseBody body);

        @Override
        CreateVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpcResponse response) {
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
        public Builder body(CreateVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcResponse build() {
            return new CreateVpcResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceConnectionResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceConnectionResponse</p>
 */
public class CreateServiceConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceConnectionResponseBody body;

    private CreateServiceConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceConnectionResponse create() {
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
    public CreateServiceConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceConnectionResponseBody body);

        @Override
        CreateServiceConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceConnectionResponse response) {
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
        public Builder body(CreateServiceConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceConnectionResponse build() {
            return new CreateServiceConnectionResponse(this);
        } 

    } 

}

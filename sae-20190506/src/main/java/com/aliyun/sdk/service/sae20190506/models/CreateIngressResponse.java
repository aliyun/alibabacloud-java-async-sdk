// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIngressResponse} extends {@link TeaModel}
 *
 * <p>CreateIngressResponse</p>
 */
public class CreateIngressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIngressResponseBody body;

    private CreateIngressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIngressResponse create() {
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
    public CreateIngressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIngressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIngressResponseBody body);

        @Override
        CreateIngressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIngressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIngressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIngressResponse response) {
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
        public Builder body(CreateIngressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIngressResponse build() {
            return new CreateIngressResponse(this);
        } 

    } 

}

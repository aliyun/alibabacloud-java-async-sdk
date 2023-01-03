// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpdResponse} extends {@link TeaModel}
 *
 * <p>CreateVpdResponse</p>
 */
public class CreateVpdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVpdResponseBody body;

    private CreateVpdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVpdResponse create() {
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
    public CreateVpdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVpdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVpdResponseBody body);

        @Override
        CreateVpdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVpdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVpdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVpdResponse response) {
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
        public Builder body(CreateVpdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVpdResponse build() {
            return new CreateVpdResponse(this);
        } 

    } 

}

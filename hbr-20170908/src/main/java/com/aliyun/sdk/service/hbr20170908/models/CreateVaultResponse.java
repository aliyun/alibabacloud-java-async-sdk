// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVaultResponse} extends {@link TeaModel}
 *
 * <p>CreateVaultResponse</p>
 */
public class CreateVaultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVaultResponseBody body;

    private CreateVaultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVaultResponse create() {
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
    public CreateVaultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVaultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVaultResponseBody body);

        @Override
        CreateVaultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVaultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVaultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVaultResponse response) {
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
        public Builder body(CreateVaultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVaultResponse build() {
            return new CreateVaultResponse(this);
        } 

    } 

}

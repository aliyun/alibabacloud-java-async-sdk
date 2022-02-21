// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSuperAccountResponse} extends {@link TeaModel}
 *
 * <p>CreateSuperAccountResponse</p>
 */
public class CreateSuperAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSuperAccountResponseBody body;

    private CreateSuperAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSuperAccountResponse create() {
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
    public CreateSuperAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSuperAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSuperAccountResponseBody body);

        @Override
        CreateSuperAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSuperAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSuperAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSuperAccountResponse response) {
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
        public Builder body(CreateSuperAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSuperAccountResponse build() {
            return new CreateSuperAccountResponse(this);
        } 

    } 

}

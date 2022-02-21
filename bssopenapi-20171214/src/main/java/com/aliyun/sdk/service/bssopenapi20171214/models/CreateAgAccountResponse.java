// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAgAccountResponse} extends {@link TeaModel}
 *
 * <p>CreateAgAccountResponse</p>
 */
public class CreateAgAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAgAccountResponseBody body;

    private CreateAgAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAgAccountResponse create() {
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
    public CreateAgAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAgAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAgAccountResponseBody body);

        @Override
        CreateAgAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAgAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAgAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAgAccountResponse response) {
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
        public Builder body(CreateAgAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAgAccountResponse build() {
            return new CreateAgAccountResponse(this);
        } 

    } 

}

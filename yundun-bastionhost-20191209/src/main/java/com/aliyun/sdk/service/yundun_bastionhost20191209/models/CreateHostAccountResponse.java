// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostAccountResponse} extends {@link TeaModel}
 *
 * <p>CreateHostAccountResponse</p>
 */
public class CreateHostAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHostAccountResponseBody body;

    private CreateHostAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHostAccountResponse create() {
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
    public CreateHostAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHostAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHostAccountResponseBody body);

        @Override
        CreateHostAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHostAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHostAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHostAccountResponse response) {
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
        public Builder body(CreateHostAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHostAccountResponse build() {
            return new CreateHostAccountResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceAccountResponse} extends {@link TeaModel}
 *
 * <p>CreateResourceAccountResponse</p>
 */
public class CreateResourceAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourceAccountResponseBody body;

    private CreateResourceAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourceAccountResponse create() {
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
    public CreateResourceAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourceAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourceAccountResponseBody body);

        @Override
        CreateResourceAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourceAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourceAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourceAccountResponse response) {
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
        public Builder body(CreateResourceAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourceAccountResponse build() {
            return new CreateResourceAccountResponse(this);
        } 

    } 

}

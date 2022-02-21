// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyPairResponse} extends {@link TeaModel}
 *
 * <p>CreateKeyPairResponse</p>
 */
public class CreateKeyPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateKeyPairResponseBody body;

    private CreateKeyPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateKeyPairResponse create() {
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
    public CreateKeyPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateKeyPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateKeyPairResponseBody body);

        @Override
        CreateKeyPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateKeyPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateKeyPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateKeyPairResponse response) {
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
        public Builder body(CreateKeyPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateKeyPairResponse build() {
            return new CreateKeyPairResponse(this);
        } 

    } 

}

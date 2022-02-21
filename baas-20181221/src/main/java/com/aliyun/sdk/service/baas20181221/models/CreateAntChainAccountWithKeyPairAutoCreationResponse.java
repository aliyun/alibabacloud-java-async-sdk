// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainAccountWithKeyPairAutoCreationResponse} extends {@link TeaModel}
 *
 * <p>CreateAntChainAccountWithKeyPairAutoCreationResponse</p>
 */
public class CreateAntChainAccountWithKeyPairAutoCreationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAntChainAccountWithKeyPairAutoCreationResponseBody body;

    private CreateAntChainAccountWithKeyPairAutoCreationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAntChainAccountWithKeyPairAutoCreationResponse create() {
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
    public CreateAntChainAccountWithKeyPairAutoCreationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAntChainAccountWithKeyPairAutoCreationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAntChainAccountWithKeyPairAutoCreationResponseBody body);

        @Override
        CreateAntChainAccountWithKeyPairAutoCreationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAntChainAccountWithKeyPairAutoCreationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAntChainAccountWithKeyPairAutoCreationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAntChainAccountWithKeyPairAutoCreationResponse response) {
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
        public Builder body(CreateAntChainAccountWithKeyPairAutoCreationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAntChainAccountWithKeyPairAutoCreationResponse build() {
            return new CreateAntChainAccountWithKeyPairAutoCreationResponse(this);
        } 

    } 

}

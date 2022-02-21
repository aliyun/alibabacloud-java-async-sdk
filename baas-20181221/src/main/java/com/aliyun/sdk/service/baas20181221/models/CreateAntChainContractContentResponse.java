// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainContractContentResponse} extends {@link TeaModel}
 *
 * <p>CreateAntChainContractContentResponse</p>
 */
public class CreateAntChainContractContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAntChainContractContentResponseBody body;

    private CreateAntChainContractContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAntChainContractContentResponse create() {
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
    public CreateAntChainContractContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAntChainContractContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAntChainContractContentResponseBody body);

        @Override
        CreateAntChainContractContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAntChainContractContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAntChainContractContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAntChainContractContentResponse response) {
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
        public Builder body(CreateAntChainContractContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAntChainContractContentResponse build() {
            return new CreateAntChainContractContentResponse(this);
        } 

    } 

}

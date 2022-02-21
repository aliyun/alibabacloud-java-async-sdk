// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainConsortiumResponse} extends {@link TeaModel}
 *
 * <p>CreateAntChainConsortiumResponse</p>
 */
public class CreateAntChainConsortiumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAntChainConsortiumResponseBody body;

    private CreateAntChainConsortiumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAntChainConsortiumResponse create() {
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
    public CreateAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAntChainConsortiumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAntChainConsortiumResponseBody body);

        @Override
        CreateAntChainConsortiumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAntChainConsortiumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAntChainConsortiumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAntChainConsortiumResponse response) {
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
        public Builder body(CreateAntChainConsortiumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAntChainConsortiumResponse build() {
            return new CreateAntChainConsortiumResponse(this);
        } 

    } 

}

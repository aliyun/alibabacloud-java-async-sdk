// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainContractProjectResponse} extends {@link TeaModel}
 *
 * <p>UpdateAntChainContractProjectResponse</p>
 */
public class UpdateAntChainContractProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAntChainContractProjectResponseBody body;

    private UpdateAntChainContractProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAntChainContractProjectResponse create() {
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
    public UpdateAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAntChainContractProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAntChainContractProjectResponseBody body);

        @Override
        UpdateAntChainContractProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAntChainContractProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAntChainContractProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAntChainContractProjectResponse response) {
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
        public Builder body(UpdateAntChainContractProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAntChainContractProjectResponse build() {
            return new UpdateAntChainContractProjectResponse(this);
        } 

    } 

}

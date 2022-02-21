// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyAntChainContractProjectResponse} extends {@link TeaModel}
 *
 * <p>CopyAntChainContractProjectResponse</p>
 */
public class CopyAntChainContractProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyAntChainContractProjectResponseBody body;

    private CopyAntChainContractProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyAntChainContractProjectResponse create() {
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
    public CopyAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyAntChainContractProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyAntChainContractProjectResponseBody body);

        @Override
        CopyAntChainContractProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyAntChainContractProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyAntChainContractProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyAntChainContractProjectResponse response) {
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
        public Builder body(CopyAntChainContractProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyAntChainContractProjectResponse build() {
            return new CopyAntChainContractProjectResponse(this);
        } 

    } 

}

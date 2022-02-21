// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainContractContentResponse} extends {@link TeaModel}
 *
 * <p>UpdateAntChainContractContentResponse</p>
 */
public class UpdateAntChainContractContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAntChainContractContentResponseBody body;

    private UpdateAntChainContractContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAntChainContractContentResponse create() {
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
    public UpdateAntChainContractContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAntChainContractContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAntChainContractContentResponseBody body);

        @Override
        UpdateAntChainContractContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAntChainContractContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAntChainContractContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAntChainContractContentResponse response) {
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
        public Builder body(UpdateAntChainContractContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAntChainContractContentResponse build() {
            return new UpdateAntChainContractContentResponse(this);
        } 

    } 

}

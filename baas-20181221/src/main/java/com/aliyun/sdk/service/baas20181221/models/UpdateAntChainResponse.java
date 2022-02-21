// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainResponse} extends {@link TeaModel}
 *
 * <p>UpdateAntChainResponse</p>
 */
public class UpdateAntChainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAntChainResponseBody body;

    private UpdateAntChainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAntChainResponse create() {
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
    public UpdateAntChainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAntChainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAntChainResponseBody body);

        @Override
        UpdateAntChainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAntChainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAntChainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAntChainResponse response) {
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
        public Builder body(UpdateAntChainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAntChainResponse build() {
            return new UpdateAntChainResponse(this);
        } 

    } 

}

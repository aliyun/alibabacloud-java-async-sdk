// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainConsortiumResponse} extends {@link TeaModel}
 *
 * <p>UpdateAntChainConsortiumResponse</p>
 */
public class UpdateAntChainConsortiumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAntChainConsortiumResponseBody body;

    private UpdateAntChainConsortiumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAntChainConsortiumResponse create() {
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
    public UpdateAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAntChainConsortiumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAntChainConsortiumResponseBody body);

        @Override
        UpdateAntChainConsortiumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAntChainConsortiumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAntChainConsortiumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAntChainConsortiumResponse response) {
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
        public Builder body(UpdateAntChainConsortiumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAntChainConsortiumResponse build() {
            return new UpdateAntChainConsortiumResponse(this);
        } 

    } 

}

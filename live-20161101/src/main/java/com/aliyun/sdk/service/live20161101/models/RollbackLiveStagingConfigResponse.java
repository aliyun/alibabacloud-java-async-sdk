// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackLiveStagingConfigResponse} extends {@link TeaModel}
 *
 * <p>RollbackLiveStagingConfigResponse</p>
 */
public class RollbackLiveStagingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RollbackLiveStagingConfigResponseBody body;

    private RollbackLiveStagingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RollbackLiveStagingConfigResponse create() {
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
    public RollbackLiveStagingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RollbackLiveStagingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RollbackLiveStagingConfigResponseBody body);

        @Override
        RollbackLiveStagingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RollbackLiveStagingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RollbackLiveStagingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RollbackLiveStagingConfigResponse response) {
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
        public Builder body(RollbackLiveStagingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RollbackLiveStagingConfigResponse build() {
            return new RollbackLiveStagingConfigResponse(this);
        } 

    } 

}

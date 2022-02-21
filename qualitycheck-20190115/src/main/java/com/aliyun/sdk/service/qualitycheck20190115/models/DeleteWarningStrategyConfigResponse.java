// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWarningStrategyConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteWarningStrategyConfigResponse</p>
 */
public class DeleteWarningStrategyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWarningStrategyConfigResponseBody body;

    private DeleteWarningStrategyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWarningStrategyConfigResponse create() {
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
    public DeleteWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWarningStrategyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWarningStrategyConfigResponseBody body);

        @Override
        DeleteWarningStrategyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWarningStrategyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWarningStrategyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWarningStrategyConfigResponse response) {
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
        public Builder body(DeleteWarningStrategyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWarningStrategyConfigResponse build() {
            return new DeleteWarningStrategyConfigResponse(this);
        } 

    } 

}

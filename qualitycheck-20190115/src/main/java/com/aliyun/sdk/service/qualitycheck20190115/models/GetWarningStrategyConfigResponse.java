// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWarningStrategyConfigResponse} extends {@link TeaModel}
 *
 * <p>GetWarningStrategyConfigResponse</p>
 */
public class GetWarningStrategyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWarningStrategyConfigResponseBody body;

    private GetWarningStrategyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWarningStrategyConfigResponse create() {
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
    public GetWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWarningStrategyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWarningStrategyConfigResponseBody body);

        @Override
        GetWarningStrategyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWarningStrategyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWarningStrategyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWarningStrategyConfigResponse response) {
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
        public Builder body(GetWarningStrategyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWarningStrategyConfigResponse build() {
            return new GetWarningStrategyConfigResponse(this);
        } 

    } 

}

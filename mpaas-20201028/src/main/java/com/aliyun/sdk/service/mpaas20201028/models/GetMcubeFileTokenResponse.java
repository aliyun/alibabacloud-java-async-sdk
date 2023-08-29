// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcubeFileTokenResponse} extends {@link TeaModel}
 *
 * <p>GetMcubeFileTokenResponse</p>
 */
public class GetMcubeFileTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMcubeFileTokenResponseBody body;

    private GetMcubeFileTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMcubeFileTokenResponse create() {
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
    public GetMcubeFileTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMcubeFileTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMcubeFileTokenResponseBody body);

        @Override
        GetMcubeFileTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMcubeFileTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMcubeFileTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMcubeFileTokenResponse response) {
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
        public Builder body(GetMcubeFileTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMcubeFileTokenResponse build() {
            return new GetMcubeFileTokenResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserConfigResponse} extends {@link TeaModel}
 *
 * <p>GetUserConfigResponse</p>
 */
public class GetUserConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserConfigResponseBody body;

    private GetUserConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserConfigResponse create() {
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
    public GetUserConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserConfigResponseBody body);

        @Override
        GetUserConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserConfigResponse response) {
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
        public Builder body(GetUserConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserConfigResponse build() {
            return new GetUserConfigResponse(this);
        } 

    } 

}

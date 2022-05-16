// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageConfigResponse} extends {@link TeaModel}
 *
 * <p>GetMessageConfigResponse</p>
 */
public class GetMessageConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMessageConfigResponseBody body;

    private GetMessageConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMessageConfigResponse create() {
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
    public GetMessageConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMessageConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMessageConfigResponseBody body);

        @Override
        GetMessageConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMessageConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMessageConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMessageConfigResponse response) {
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
        public Builder body(GetMessageConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMessageConfigResponse build() {
            return new GetMessageConfigResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSmsConfigResponse} extends {@link TeaModel}
 *
 * <p>GetSmsConfigResponse</p>
 */
public class GetSmsConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSmsConfigResponseBody body;

    private GetSmsConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSmsConfigResponse create() {
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
    public GetSmsConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSmsConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSmsConfigResponseBody body);

        @Override
        GetSmsConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSmsConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSmsConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSmsConfigResponse response) {
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
        public Builder body(GetSmsConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSmsConfigResponse build() {
            return new GetSmsConfigResponse(this);
        } 

    } 

}

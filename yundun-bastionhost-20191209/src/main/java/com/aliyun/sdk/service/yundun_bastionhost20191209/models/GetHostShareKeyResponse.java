// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostShareKeyResponse} extends {@link TeaModel}
 *
 * <p>GetHostShareKeyResponse</p>
 */
public class GetHostShareKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHostShareKeyResponseBody body;

    private GetHostShareKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHostShareKeyResponse create() {
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
    public GetHostShareKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHostShareKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHostShareKeyResponseBody body);

        @Override
        GetHostShareKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHostShareKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHostShareKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHostShareKeyResponse response) {
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
        public Builder body(GetHostShareKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHostShareKeyResponse build() {
            return new GetHostShareKeyResponse(this);
        } 

    } 

}

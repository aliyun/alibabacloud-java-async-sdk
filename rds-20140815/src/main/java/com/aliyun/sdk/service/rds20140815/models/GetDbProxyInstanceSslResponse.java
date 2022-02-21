// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDbProxyInstanceSslResponse} extends {@link TeaModel}
 *
 * <p>GetDbProxyInstanceSslResponse</p>
 */
public class GetDbProxyInstanceSslResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDbProxyInstanceSslResponseBody body;

    private GetDbProxyInstanceSslResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDbProxyInstanceSslResponse create() {
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
    public GetDbProxyInstanceSslResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDbProxyInstanceSslResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDbProxyInstanceSslResponseBody body);

        @Override
        GetDbProxyInstanceSslResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDbProxyInstanceSslResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDbProxyInstanceSslResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDbProxyInstanceSslResponse response) {
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
        public Builder body(GetDbProxyInstanceSslResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDbProxyInstanceSslResponse build() {
            return new GetDbProxyInstanceSslResponse(this);
        } 

    } 

}

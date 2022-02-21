// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceExtensionsResponse} extends {@link TeaModel}
 *
 * <p>GetServiceExtensionsResponse</p>
 */
public class GetServiceExtensionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceExtensionsResponseBody body;

    private GetServiceExtensionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceExtensionsResponse create() {
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
    public GetServiceExtensionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceExtensionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceExtensionsResponseBody body);

        @Override
        GetServiceExtensionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceExtensionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceExtensionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceExtensionsResponse response) {
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
        public Builder body(GetServiceExtensionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceExtensionsResponse build() {
            return new GetServiceExtensionsResponse(this);
        } 

    } 

}

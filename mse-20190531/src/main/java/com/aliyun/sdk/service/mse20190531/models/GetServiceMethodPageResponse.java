// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceMethodPageResponse} extends {@link TeaModel}
 *
 * <p>GetServiceMethodPageResponse</p>
 */
public class GetServiceMethodPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceMethodPageResponseBody body;

    private GetServiceMethodPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceMethodPageResponse create() {
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
    public GetServiceMethodPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceMethodPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceMethodPageResponseBody body);

        @Override
        GetServiceMethodPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceMethodPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceMethodPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceMethodPageResponse response) {
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
        public Builder body(GetServiceMethodPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceMethodPageResponse build() {
            return new GetServiceMethodPageResponse(this);
        } 

    } 

}

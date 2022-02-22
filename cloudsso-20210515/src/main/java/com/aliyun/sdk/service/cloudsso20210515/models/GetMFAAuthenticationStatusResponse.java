// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMFAAuthenticationStatusResponse} extends {@link TeaModel}
 *
 * <p>GetMFAAuthenticationStatusResponse</p>
 */
public class GetMFAAuthenticationStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMFAAuthenticationStatusResponseBody body;

    private GetMFAAuthenticationStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMFAAuthenticationStatusResponse create() {
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
    public GetMFAAuthenticationStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMFAAuthenticationStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMFAAuthenticationStatusResponseBody body);

        @Override
        GetMFAAuthenticationStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMFAAuthenticationStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMFAAuthenticationStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMFAAuthenticationStatusResponse response) {
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
        public Builder body(GetMFAAuthenticationStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMFAAuthenticationStatusResponse build() {
            return new GetMFAAuthenticationStatusResponse(this);
        } 

    } 

}

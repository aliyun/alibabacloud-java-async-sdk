// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallerIdentityResponse} extends {@link TeaModel}
 *
 * <p>GetCallerIdentityResponse</p>
 */
public class GetCallerIdentityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCallerIdentityResponseBody body;

    private GetCallerIdentityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCallerIdentityResponse create() {
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
    public GetCallerIdentityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCallerIdentityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCallerIdentityResponseBody body);

        @Override
        GetCallerIdentityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCallerIdentityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCallerIdentityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCallerIdentityResponse response) {
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
        public Builder body(GetCallerIdentityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCallerIdentityResponse build() {
            return new GetCallerIdentityResponse(this);
        } 

    } 

}

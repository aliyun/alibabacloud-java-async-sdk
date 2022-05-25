// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetApplicationProvisioningScopeResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningScopeResponse</p>
 */
public class GetApplicationProvisioningScopeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApplicationProvisioningScopeResponseBody body;

    private GetApplicationProvisioningScopeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApplicationProvisioningScopeResponse create() {
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
    public GetApplicationProvisioningScopeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationProvisioningScopeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApplicationProvisioningScopeResponseBody body);

        @Override
        GetApplicationProvisioningScopeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationProvisioningScopeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApplicationProvisioningScopeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationProvisioningScopeResponse response) {
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
        public Builder body(GetApplicationProvisioningScopeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationProvisioningScopeResponse build() {
            return new GetApplicationProvisioningScopeResponse(this);
        } 

    } 

}

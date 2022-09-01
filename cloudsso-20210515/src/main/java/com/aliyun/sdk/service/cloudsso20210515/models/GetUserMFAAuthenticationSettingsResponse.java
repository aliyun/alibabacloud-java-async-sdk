// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserMFAAuthenticationSettingsResponse} extends {@link TeaModel}
 *
 * <p>GetUserMFAAuthenticationSettingsResponse</p>
 */
public class GetUserMFAAuthenticationSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserMFAAuthenticationSettingsResponseBody body;

    private GetUserMFAAuthenticationSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserMFAAuthenticationSettingsResponse create() {
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
    public GetUserMFAAuthenticationSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserMFAAuthenticationSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserMFAAuthenticationSettingsResponseBody body);

        @Override
        GetUserMFAAuthenticationSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserMFAAuthenticationSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserMFAAuthenticationSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserMFAAuthenticationSettingsResponse response) {
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
        public Builder body(GetUserMFAAuthenticationSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserMFAAuthenticationSettingsResponse build() {
            return new GetUserMFAAuthenticationSettingsResponse(this);
        } 

    } 

}

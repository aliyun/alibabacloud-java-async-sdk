// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserMFAAuthenticationSettingsResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserMFAAuthenticationSettingsResponse</p>
 */
public class UpdateUserMFAAuthenticationSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUserMFAAuthenticationSettingsResponseBody body;

    private UpdateUserMFAAuthenticationSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUserMFAAuthenticationSettingsResponse create() {
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
    public UpdateUserMFAAuthenticationSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserMFAAuthenticationSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUserMFAAuthenticationSettingsResponseBody body);

        @Override
        UpdateUserMFAAuthenticationSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserMFAAuthenticationSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUserMFAAuthenticationSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserMFAAuthenticationSettingsResponse response) {
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
        public Builder body(UpdateUserMFAAuthenticationSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserMFAAuthenticationSettingsResponse build() {
            return new UpdateUserMFAAuthenticationSettingsResponse(this);
        } 

    } 

}

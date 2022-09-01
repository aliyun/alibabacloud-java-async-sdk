// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMFAAuthenticationSettingsResponse} extends {@link TeaModel}
 *
 * <p>UpdateMFAAuthenticationSettingsResponse</p>
 */
public class UpdateMFAAuthenticationSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMFAAuthenticationSettingsResponseBody body;

    private UpdateMFAAuthenticationSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMFAAuthenticationSettingsResponse create() {
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
    public UpdateMFAAuthenticationSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMFAAuthenticationSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMFAAuthenticationSettingsResponseBody body);

        @Override
        UpdateMFAAuthenticationSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMFAAuthenticationSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMFAAuthenticationSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMFAAuthenticationSettingsResponse response) {
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
        public Builder body(UpdateMFAAuthenticationSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMFAAuthenticationSettingsResponse build() {
            return new UpdateMFAAuthenticationSettingsResponse(this);
        } 

    } 

}

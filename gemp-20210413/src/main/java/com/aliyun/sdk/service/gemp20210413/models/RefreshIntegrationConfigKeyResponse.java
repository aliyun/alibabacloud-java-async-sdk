// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshIntegrationConfigKeyResponse} extends {@link TeaModel}
 *
 * <p>RefreshIntegrationConfigKeyResponse</p>
 */
public class RefreshIntegrationConfigKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshIntegrationConfigKeyResponseBody body;

    private RefreshIntegrationConfigKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshIntegrationConfigKeyResponse create() {
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
    public RefreshIntegrationConfigKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshIntegrationConfigKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshIntegrationConfigKeyResponseBody body);

        @Override
        RefreshIntegrationConfigKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshIntegrationConfigKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshIntegrationConfigKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshIntegrationConfigKeyResponse response) {
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
        public Builder body(RefreshIntegrationConfigKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshIntegrationConfigKeyResponse build() {
            return new RefreshIntegrationConfigKeyResponse(this);
        } 

    } 

}

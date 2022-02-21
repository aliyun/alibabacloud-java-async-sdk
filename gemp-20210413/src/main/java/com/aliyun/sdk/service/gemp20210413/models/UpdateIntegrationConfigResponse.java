// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntegrationConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateIntegrationConfigResponse</p>
 */
public class UpdateIntegrationConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIntegrationConfigResponseBody body;

    private UpdateIntegrationConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIntegrationConfigResponse create() {
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
    public UpdateIntegrationConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIntegrationConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIntegrationConfigResponseBody body);

        @Override
        UpdateIntegrationConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIntegrationConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIntegrationConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIntegrationConfigResponse response) {
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
        public Builder body(UpdateIntegrationConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIntegrationConfigResponse build() {
            return new UpdateIntegrationConfigResponse(this);
        } 

    } 

}

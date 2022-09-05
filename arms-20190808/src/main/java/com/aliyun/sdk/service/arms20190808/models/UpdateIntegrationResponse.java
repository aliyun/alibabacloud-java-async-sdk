// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntegrationResponse} extends {@link TeaModel}
 *
 * <p>UpdateIntegrationResponse</p>
 */
public class UpdateIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIntegrationResponseBody body;

    private UpdateIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIntegrationResponse create() {
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
    public UpdateIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIntegrationResponseBody body);

        @Override
        UpdateIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIntegrationResponse response) {
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
        public Builder body(UpdateIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIntegrationResponse build() {
            return new UpdateIntegrationResponse(this);
        } 

    } 

}

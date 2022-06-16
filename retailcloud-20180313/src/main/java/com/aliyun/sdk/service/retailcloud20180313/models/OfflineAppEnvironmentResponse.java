// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineAppEnvironmentResponse} extends {@link TeaModel}
 *
 * <p>OfflineAppEnvironmentResponse</p>
 */
public class OfflineAppEnvironmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OfflineAppEnvironmentResponseBody body;

    private OfflineAppEnvironmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OfflineAppEnvironmentResponse create() {
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
    public OfflineAppEnvironmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OfflineAppEnvironmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OfflineAppEnvironmentResponseBody body);

        @Override
        OfflineAppEnvironmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OfflineAppEnvironmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OfflineAppEnvironmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OfflineAppEnvironmentResponse response) {
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
        public Builder body(OfflineAppEnvironmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OfflineAppEnvironmentResponse build() {
            return new OfflineAppEnvironmentResponse(this);
        } 

    } 

}

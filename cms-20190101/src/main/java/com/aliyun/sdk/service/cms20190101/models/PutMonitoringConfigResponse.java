// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMonitoringConfigResponse} extends {@link TeaModel}
 *
 * <p>PutMonitoringConfigResponse</p>
 */
public class PutMonitoringConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutMonitoringConfigResponseBody body;

    private PutMonitoringConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutMonitoringConfigResponse create() {
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
    public PutMonitoringConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutMonitoringConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutMonitoringConfigResponseBody body);

        @Override
        PutMonitoringConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutMonitoringConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutMonitoringConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutMonitoringConfigResponse response) {
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
        public Builder body(PutMonitoringConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutMonitoringConfigResponse build() {
            return new PutMonitoringConfigResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyCoordinationForMonitoringResponse} extends {@link TeaModel}
 *
 * <p>ApplyCoordinationForMonitoringResponse</p>
 */
public class ApplyCoordinationForMonitoringResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyCoordinationForMonitoringResponseBody body;

    private ApplyCoordinationForMonitoringResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyCoordinationForMonitoringResponse create() {
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
    public ApplyCoordinationForMonitoringResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyCoordinationForMonitoringResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyCoordinationForMonitoringResponseBody body);

        @Override
        ApplyCoordinationForMonitoringResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyCoordinationForMonitoringResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyCoordinationForMonitoringResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyCoordinationForMonitoringResponse response) {
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
        public Builder body(ApplyCoordinationForMonitoringResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyCoordinationForMonitoringResponse build() {
            return new ApplyCoordinationForMonitoringResponse(this);
        } 

    } 

}

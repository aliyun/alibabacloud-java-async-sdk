// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrometheusMonitoringStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdatePrometheusMonitoringStatusResponse</p>
 */
public class UpdatePrometheusMonitoringStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePrometheusMonitoringStatusResponseBody body;

    private UpdatePrometheusMonitoringStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdatePrometheusMonitoringStatusResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public UpdatePrometheusMonitoringStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePrometheusMonitoringStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdatePrometheusMonitoringStatusResponseBody body);

        @Override
        UpdatePrometheusMonitoringStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePrometheusMonitoringStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdatePrometheusMonitoringStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePrometheusMonitoringStatusResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(UpdatePrometheusMonitoringStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePrometheusMonitoringStatusResponse build() {
            return new UpdatePrometheusMonitoringStatusResponse(this);
        } 

    } 

}

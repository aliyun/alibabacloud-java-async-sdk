// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrometheusMonitoringResponse} extends {@link TeaModel}
 *
 * <p>CreatePrometheusMonitoringResponse</p>
 */
public class CreatePrometheusMonitoringResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePrometheusMonitoringResponseBody body;

    private CreatePrometheusMonitoringResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreatePrometheusMonitoringResponse create() {
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
    public CreatePrometheusMonitoringResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrometheusMonitoringResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreatePrometheusMonitoringResponseBody body);

        @Override
        CreatePrometheusMonitoringResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrometheusMonitoringResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreatePrometheusMonitoringResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrometheusMonitoringResponse response) {
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
        public Builder body(CreatePrometheusMonitoringResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrometheusMonitoringResponse build() {
            return new CreatePrometheusMonitoringResponse(this);
        } 

    } 

}

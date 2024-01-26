// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusIntegrationResponse} extends {@link TeaModel}
 *
 * <p>AddPrometheusIntegrationResponse</p>
 */
public class AddPrometheusIntegrationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AddPrometheusIntegrationResponseBody body;

    private AddPrometheusIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddPrometheusIntegrationResponse create() {
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
    public AddPrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPrometheusIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddPrometheusIntegrationResponseBody body);

        @Override
        AddPrometheusIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPrometheusIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddPrometheusIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPrometheusIntegrationResponse response) {
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
        public Builder body(AddPrometheusIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPrometheusIntegrationResponse build() {
            return new AddPrometheusIntegrationResponse(this);
        } 

    } 

}

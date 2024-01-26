// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallManagedPrometheusResponse} extends {@link TeaModel}
 *
 * <p>UninstallManagedPrometheusResponse</p>
 */
public class UninstallManagedPrometheusResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UninstallManagedPrometheusResponseBody body;

    private UninstallManagedPrometheusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UninstallManagedPrometheusResponse create() {
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
    public UninstallManagedPrometheusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallManagedPrometheusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UninstallManagedPrometheusResponseBody body);

        @Override
        UninstallManagedPrometheusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallManagedPrometheusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UninstallManagedPrometheusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallManagedPrometheusResponse response) {
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
        public Builder body(UninstallManagedPrometheusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallManagedPrometheusResponse build() {
            return new UninstallManagedPrometheusResponse(this);
        } 

    } 

}

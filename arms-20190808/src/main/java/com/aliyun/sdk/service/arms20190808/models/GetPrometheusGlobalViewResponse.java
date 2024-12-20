// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPrometheusGlobalViewResponse} extends {@link TeaModel}
 *
 * <p>GetPrometheusGlobalViewResponse</p>
 */
public class GetPrometheusGlobalViewResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetPrometheusGlobalViewResponseBody body;

    private GetPrometheusGlobalViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetPrometheusGlobalViewResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public GetPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrometheusGlobalViewResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetPrometheusGlobalViewResponseBody body);

        @Override
        GetPrometheusGlobalViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrometheusGlobalViewResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetPrometheusGlobalViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrometheusGlobalViewResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(GetPrometheusGlobalViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrometheusGlobalViewResponse build() {
            return new GetPrometheusGlobalViewResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartHpoTrialsResponse} extends {@link TeaModel}
 *
 * <p>RestartHpoTrialsResponse</p>
 */
public class RestartHpoTrialsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RestartHpoTrialsResponseBody body;

    private RestartHpoTrialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RestartHpoTrialsResponse create() {
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
    public RestartHpoTrialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartHpoTrialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RestartHpoTrialsResponseBody body);

        @Override
        RestartHpoTrialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartHpoTrialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RestartHpoTrialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartHpoTrialsResponse response) {
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
        public Builder body(RestartHpoTrialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartHpoTrialsResponse build() {
            return new RestartHpoTrialsResponse(this);
        } 

    } 

}

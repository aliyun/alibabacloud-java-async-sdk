// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link RunEnterpriseVocAnalysisResponse} extends {@link TeaModel}
 *
 * <p>RunEnterpriseVocAnalysisResponse</p>
 */
public class RunEnterpriseVocAnalysisResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RunEnterpriseVocAnalysisResponseBody body;

    private RunEnterpriseVocAnalysisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RunEnterpriseVocAnalysisResponse create() {
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
    public RunEnterpriseVocAnalysisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunEnterpriseVocAnalysisResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RunEnterpriseVocAnalysisResponseBody body);

        @Override
        RunEnterpriseVocAnalysisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunEnterpriseVocAnalysisResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RunEnterpriseVocAnalysisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunEnterpriseVocAnalysisResponse response) {
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
        public Builder body(RunEnterpriseVocAnalysisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunEnterpriseVocAnalysisResponse build() {
            return new RunEnterpriseVocAnalysisResponse(this);
        } 

    } 

}

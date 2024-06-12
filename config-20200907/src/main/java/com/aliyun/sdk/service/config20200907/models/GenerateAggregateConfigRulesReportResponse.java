// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAggregateConfigRulesReportResponse} extends {@link TeaModel}
 *
 * <p>GenerateAggregateConfigRulesReportResponse</p>
 */
public class GenerateAggregateConfigRulesReportResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GenerateAggregateConfigRulesReportResponseBody body;

    private GenerateAggregateConfigRulesReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GenerateAggregateConfigRulesReportResponse create() {
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
    public GenerateAggregateConfigRulesReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateAggregateConfigRulesReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GenerateAggregateConfigRulesReportResponseBody body);

        @Override
        GenerateAggregateConfigRulesReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateAggregateConfigRulesReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GenerateAggregateConfigRulesReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateAggregateConfigRulesReportResponse response) {
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
        public Builder body(GenerateAggregateConfigRulesReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateAggregateConfigRulesReportResponse build() {
            return new GenerateAggregateConfigRulesReportResponse(this);
        } 

    } 

}

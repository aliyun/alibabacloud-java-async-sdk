// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateConfigRuleReportResponse} extends {@link TeaModel}
 *
 * <p>GenerateConfigRuleReportResponse</p>
 */
public class GenerateConfigRuleReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateConfigRuleReportResponseBody body;

    private GenerateConfigRuleReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateConfigRuleReportResponse create() {
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
    public GenerateConfigRuleReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateConfigRuleReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateConfigRuleReportResponseBody body);

        @Override
        GenerateConfigRuleReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateConfigRuleReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateConfigRuleReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateConfigRuleReportResponse response) {
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
        public Builder body(GenerateConfigRuleReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateConfigRuleReportResponse build() {
            return new GenerateConfigRuleReportResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExporterRuleListResponse} extends {@link TeaModel}
 *
 * <p>DescribeExporterRuleListResponse</p>
 */
public class DescribeExporterRuleListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExporterRuleListResponseBody body;

    private DescribeExporterRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExporterRuleListResponse create() {
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
    public DescribeExporterRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExporterRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExporterRuleListResponseBody body);

        @Override
        DescribeExporterRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExporterRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExporterRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExporterRuleListResponse response) {
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
        public Builder body(DescribeExporterRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExporterRuleListResponse build() {
            return new DescribeExporterRuleListResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeGraph4InvestigationOnlineResponse} extends {@link TeaModel}
 *
 * <p>DescribeGraph4InvestigationOnlineResponse</p>
 */
public class DescribeGraph4InvestigationOnlineResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeGraph4InvestigationOnlineResponseBody body;

    private DescribeGraph4InvestigationOnlineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeGraph4InvestigationOnlineResponse create() {
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
    public DescribeGraph4InvestigationOnlineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGraph4InvestigationOnlineResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeGraph4InvestigationOnlineResponseBody body);

        @Override
        DescribeGraph4InvestigationOnlineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGraph4InvestigationOnlineResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeGraph4InvestigationOnlineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGraph4InvestigationOnlineResponse response) {
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
        public Builder body(DescribeGraph4InvestigationOnlineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGraph4InvestigationOnlineResponse build() {
            return new DescribeGraph4InvestigationOnlineResponse(this);
        } 

    } 

}

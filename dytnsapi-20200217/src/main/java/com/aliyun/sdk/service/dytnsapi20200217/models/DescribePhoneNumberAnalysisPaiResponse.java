// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link DescribePhoneNumberAnalysisPaiResponse} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberAnalysisPaiResponse</p>
 */
public class DescribePhoneNumberAnalysisPaiResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribePhoneNumberAnalysisPaiResponseBody body;

    private DescribePhoneNumberAnalysisPaiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribePhoneNumberAnalysisPaiResponse create() {
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
    public DescribePhoneNumberAnalysisPaiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePhoneNumberAnalysisPaiResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribePhoneNumberAnalysisPaiResponseBody body);

        @Override
        DescribePhoneNumberAnalysisPaiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePhoneNumberAnalysisPaiResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribePhoneNumberAnalysisPaiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePhoneNumberAnalysisPaiResponse response) {
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
        public Builder body(DescribePhoneNumberAnalysisPaiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePhoneNumberAnalysisPaiResponse build() {
            return new DescribePhoneNumberAnalysisPaiResponse(this);
        } 

    } 

}

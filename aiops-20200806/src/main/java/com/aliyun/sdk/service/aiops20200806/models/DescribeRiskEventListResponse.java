// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskEventListResponse} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventListResponse</p>
 */
public class DescribeRiskEventListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeRiskEventListResponseBody body;

    private DescribeRiskEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeRiskEventListResponse create() {
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
    public DescribeRiskEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRiskEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeRiskEventListResponseBody body);

        @Override
        DescribeRiskEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRiskEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeRiskEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRiskEventListResponse response) {
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
        public Builder body(DescribeRiskEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRiskEventListResponse build() {
            return new DescribeRiskEventListResponse(this);
        } 

    } 

}

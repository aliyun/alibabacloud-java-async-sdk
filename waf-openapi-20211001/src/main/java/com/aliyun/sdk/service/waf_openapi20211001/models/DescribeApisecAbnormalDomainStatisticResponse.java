// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApisecAbnormalDomainStatisticResponse} extends {@link TeaModel}
 *
 * <p>DescribeApisecAbnormalDomainStatisticResponse</p>
 */
public class DescribeApisecAbnormalDomainStatisticResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeApisecAbnormalDomainStatisticResponseBody body;

    private DescribeApisecAbnormalDomainStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeApisecAbnormalDomainStatisticResponse create() {
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
    public DescribeApisecAbnormalDomainStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApisecAbnormalDomainStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeApisecAbnormalDomainStatisticResponseBody body);

        @Override
        DescribeApisecAbnormalDomainStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApisecAbnormalDomainStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeApisecAbnormalDomainStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApisecAbnormalDomainStatisticResponse response) {
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
        public Builder body(DescribeApisecAbnormalDomainStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApisecAbnormalDomainStatisticResponse build() {
            return new DescribeApisecAbnormalDomainStatisticResponse(this);
        } 

    } 

}

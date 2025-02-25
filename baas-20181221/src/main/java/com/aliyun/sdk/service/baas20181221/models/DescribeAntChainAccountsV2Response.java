// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainAccountsV2Response} extends {@link TeaModel}
 *
 * <p>DescribeAntChainAccountsV2Response</p>
 */
public class DescribeAntChainAccountsV2Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAntChainAccountsV2ResponseBody body;

    private DescribeAntChainAccountsV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAntChainAccountsV2Response create() {
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
    public DescribeAntChainAccountsV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainAccountsV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAntChainAccountsV2ResponseBody body);

        @Override
        DescribeAntChainAccountsV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainAccountsV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeAntChainAccountsV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainAccountsV2Response response) {
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
        public Builder body(DescribeAntChainAccountsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainAccountsV2Response build() {
            return new DescribeAntChainAccountsV2Response(this);
        } 

    } 

}

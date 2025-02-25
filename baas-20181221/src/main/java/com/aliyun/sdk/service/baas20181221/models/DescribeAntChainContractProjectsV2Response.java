// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainContractProjectsV2Response} extends {@link TeaModel}
 *
 * <p>DescribeAntChainContractProjectsV2Response</p>
 */
public class DescribeAntChainContractProjectsV2Response extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAntChainContractProjectsV2ResponseBody body;

    private DescribeAntChainContractProjectsV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAntChainContractProjectsV2Response create() {
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
    public DescribeAntChainContractProjectsV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAntChainContractProjectsV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAntChainContractProjectsV2ResponseBody body);

        @Override
        DescribeAntChainContractProjectsV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAntChainContractProjectsV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeAntChainContractProjectsV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAntChainContractProjectsV2Response response) {
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
        public Builder body(DescribeAntChainContractProjectsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAntChainContractProjectsV2Response build() {
            return new DescribeAntChainContractProjectsV2Response(this);
        } 

    } 

}

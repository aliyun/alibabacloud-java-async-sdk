// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnOrderCommodityCodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnOrderCommodityCodeResponse</p>
 */
public class DescribeCdnOrderCommodityCodeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeCdnOrderCommodityCodeResponseBody body;

    private DescribeCdnOrderCommodityCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeCdnOrderCommodityCodeResponse create() {
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
    public DescribeCdnOrderCommodityCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnOrderCommodityCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeCdnOrderCommodityCodeResponseBody body);

        @Override
        DescribeCdnOrderCommodityCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnOrderCommodityCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeCdnOrderCommodityCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnOrderCommodityCodeResponse response) {
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
        public Builder body(DescribeCdnOrderCommodityCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnOrderCommodityCodeResponse build() {
            return new DescribeCdnOrderCommodityCodeResponse(this);
        } 

    } 

}

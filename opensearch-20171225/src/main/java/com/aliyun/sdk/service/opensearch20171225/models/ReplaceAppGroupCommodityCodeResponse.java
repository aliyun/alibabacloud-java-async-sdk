// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceAppGroupCommodityCodeResponse} extends {@link TeaModel}
 *
 * <p>ReplaceAppGroupCommodityCodeResponse</p>
 */
public class ReplaceAppGroupCommodityCodeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReplaceAppGroupCommodityCodeResponseBody body;

    private ReplaceAppGroupCommodityCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReplaceAppGroupCommodityCodeResponse create() {
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
    public ReplaceAppGroupCommodityCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplaceAppGroupCommodityCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReplaceAppGroupCommodityCodeResponseBody body);

        @Override
        ReplaceAppGroupCommodityCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplaceAppGroupCommodityCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReplaceAppGroupCommodityCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplaceAppGroupCommodityCodeResponse response) {
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
        public Builder body(ReplaceAppGroupCommodityCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplaceAppGroupCommodityCodeResponse build() {
            return new ReplaceAppGroupCommodityCodeResponse(this);
        } 

    } 

}

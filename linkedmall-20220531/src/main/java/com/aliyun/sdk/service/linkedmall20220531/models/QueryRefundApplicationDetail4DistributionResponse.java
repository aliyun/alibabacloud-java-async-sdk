// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRefundApplicationDetail4DistributionResponse} extends {@link TeaModel}
 *
 * <p>QueryRefundApplicationDetail4DistributionResponse</p>
 */
public class QueryRefundApplicationDetail4DistributionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryRefundApplicationDetail4DistributionResponseBody body;

    private QueryRefundApplicationDetail4DistributionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryRefundApplicationDetail4DistributionResponse create() {
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
    public QueryRefundApplicationDetail4DistributionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRefundApplicationDetail4DistributionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryRefundApplicationDetail4DistributionResponseBody body);

        @Override
        QueryRefundApplicationDetail4DistributionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRefundApplicationDetail4DistributionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryRefundApplicationDetail4DistributionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRefundApplicationDetail4DistributionResponse response) {
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
        public Builder body(QueryRefundApplicationDetail4DistributionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRefundApplicationDetail4DistributionResponse build() {
            return new QueryRefundApplicationDetail4DistributionResponse(this);
        } 

    } 

}

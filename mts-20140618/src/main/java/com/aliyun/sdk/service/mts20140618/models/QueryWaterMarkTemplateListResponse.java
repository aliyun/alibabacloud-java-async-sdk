// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryWaterMarkTemplateListResponse} extends {@link TeaModel}
 *
 * <p>QueryWaterMarkTemplateListResponse</p>
 */
public class QueryWaterMarkTemplateListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryWaterMarkTemplateListResponseBody body;

    private QueryWaterMarkTemplateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryWaterMarkTemplateListResponse create() {
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
    public QueryWaterMarkTemplateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryWaterMarkTemplateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryWaterMarkTemplateListResponseBody body);

        @Override
        QueryWaterMarkTemplateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryWaterMarkTemplateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryWaterMarkTemplateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryWaterMarkTemplateListResponse response) {
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
        public Builder body(QueryWaterMarkTemplateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryWaterMarkTemplateListResponse build() {
            return new QueryWaterMarkTemplateListResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRecognizeRulesTypeResponse} extends {@link TeaModel}
 *
 * <p>QueryRecognizeRulesTypeResponse</p>
 */
public class QueryRecognizeRulesTypeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryRecognizeRulesTypeResponseBody body;

    private QueryRecognizeRulesTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryRecognizeRulesTypeResponse create() {
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
    public QueryRecognizeRulesTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecognizeRulesTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryRecognizeRulesTypeResponseBody body);

        @Override
        QueryRecognizeRulesTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecognizeRulesTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryRecognizeRulesTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecognizeRulesTypeResponse response) {
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
        public Builder body(QueryRecognizeRulesTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecognizeRulesTypeResponse build() {
            return new QueryRecognizeRulesTypeResponse(this);
        } 

    } 

}

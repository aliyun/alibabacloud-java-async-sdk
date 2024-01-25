// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTemplateListByGroupIdResponse} extends {@link TeaModel}
 *
 * <p>QueryTemplateListByGroupIdResponse</p>
 */
public class QueryTemplateListByGroupIdResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryTemplateListByGroupIdResponseBody body;

    private QueryTemplateListByGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryTemplateListByGroupIdResponse create() {
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
    public QueryTemplateListByGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTemplateListByGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryTemplateListByGroupIdResponseBody body);

        @Override
        QueryTemplateListByGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTemplateListByGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryTemplateListByGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTemplateListByGroupIdResponse response) {
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
        public Builder body(QueryTemplateListByGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTemplateListByGroupIdResponse build() {
            return new QueryTemplateListByGroupIdResponse(this);
        } 

    } 

}

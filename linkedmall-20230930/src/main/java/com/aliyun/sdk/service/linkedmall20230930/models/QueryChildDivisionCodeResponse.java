// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChildDivisionCodeResponse} extends {@link TeaModel}
 *
 * <p>QueryChildDivisionCodeResponse</p>
 */
public class QueryChildDivisionCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DivisionPageResult body;

    private QueryChildDivisionCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryChildDivisionCodeResponse create() {
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
    public DivisionPageResult getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryChildDivisionCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DivisionPageResult body);

        @Override
        QueryChildDivisionCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryChildDivisionCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DivisionPageResult body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryChildDivisionCodeResponse response) {
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
        public Builder body(DivisionPageResult body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryChildDivisionCodeResponse build() {
            return new QueryChildDivisionCodeResponse(this);
        } 

    } 

}

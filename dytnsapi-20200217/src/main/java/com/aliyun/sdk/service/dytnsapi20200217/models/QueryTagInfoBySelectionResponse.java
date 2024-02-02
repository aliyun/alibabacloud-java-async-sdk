// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTagInfoBySelectionResponse} extends {@link TeaModel}
 *
 * <p>QueryTagInfoBySelectionResponse</p>
 */
public class QueryTagInfoBySelectionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private QueryTagInfoBySelectionResponseBody body;

    private QueryTagInfoBySelectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryTagInfoBySelectionResponse create() {
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
    public QueryTagInfoBySelectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTagInfoBySelectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryTagInfoBySelectionResponseBody body);

        @Override
        QueryTagInfoBySelectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTagInfoBySelectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryTagInfoBySelectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTagInfoBySelectionResponse response) {
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
        public Builder body(QueryTagInfoBySelectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTagInfoBySelectionResponse build() {
            return new QueryTagInfoBySelectionResponse(this);
        } 

    } 

}

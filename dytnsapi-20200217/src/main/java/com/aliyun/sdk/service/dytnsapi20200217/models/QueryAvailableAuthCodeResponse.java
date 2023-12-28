// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvailableAuthCodeResponse} extends {@link TeaModel}
 *
 * <p>QueryAvailableAuthCodeResponse</p>
 */
public class QueryAvailableAuthCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAvailableAuthCodeResponseBody body;

    private QueryAvailableAuthCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryAvailableAuthCodeResponse create() {
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
    public QueryAvailableAuthCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAvailableAuthCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryAvailableAuthCodeResponseBody body);

        @Override
        QueryAvailableAuthCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAvailableAuthCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryAvailableAuthCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAvailableAuthCodeResponse response) {
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
        public Builder body(QueryAvailableAuthCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAvailableAuthCodeResponse build() {
            return new QueryAvailableAuthCodeResponse(this);
        } 

    } 

}

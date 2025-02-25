// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAccessTokensResponse} extends {@link TeaModel}
 *
 * <p>ListAccessTokensResponse</p>
 */
public class ListAccessTokensResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAccessTokensResponseBody body;

    private ListAccessTokensResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAccessTokensResponse create() {
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
    public ListAccessTokensResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAccessTokensResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAccessTokensResponseBody body);

        @Override
        ListAccessTokensResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAccessTokensResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAccessTokensResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAccessTokensResponse response) {
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
        public Builder body(ListAccessTokensResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAccessTokensResponse build() {
            return new ListAccessTokensResponse(this);
        } 

    } 

}

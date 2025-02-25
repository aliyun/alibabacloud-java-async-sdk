// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupAuthorizationRulesResponse} extends {@link TeaModel}
 *
 * <p>ListGroupAuthorizationRulesResponse</p>
 */
public class ListGroupAuthorizationRulesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListGroupAuthorizationRulesResponseBody body;

    private ListGroupAuthorizationRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListGroupAuthorizationRulesResponse create() {
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
    public ListGroupAuthorizationRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupAuthorizationRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListGroupAuthorizationRulesResponseBody body);

        @Override
        ListGroupAuthorizationRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupAuthorizationRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListGroupAuthorizationRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupAuthorizationRulesResponse response) {
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
        public Builder body(ListGroupAuthorizationRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupAuthorizationRulesResponse build() {
            return new ListGroupAuthorizationRulesResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIsolationRulesResponse} extends {@link TeaModel}
 *
 * <p>ListIsolationRulesResponse</p>
 */
public class ListIsolationRulesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListIsolationRulesResponseBody body;

    private ListIsolationRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListIsolationRulesResponse create() {
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
    public ListIsolationRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIsolationRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListIsolationRulesResponseBody body);

        @Override
        ListIsolationRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIsolationRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListIsolationRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIsolationRulesResponse response) {
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
        public Builder body(ListIsolationRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIsolationRulesResponse build() {
            return new ListIsolationRulesResponse(this);
        } 

    } 

}

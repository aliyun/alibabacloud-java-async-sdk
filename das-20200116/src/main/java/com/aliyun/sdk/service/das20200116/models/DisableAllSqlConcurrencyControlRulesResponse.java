// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableAllSqlConcurrencyControlRulesResponse} extends {@link TeaModel}
 *
 * <p>DisableAllSqlConcurrencyControlRulesResponse</p>
 */
public class DisableAllSqlConcurrencyControlRulesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DisableAllSqlConcurrencyControlRulesResponseBody body;

    private DisableAllSqlConcurrencyControlRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DisableAllSqlConcurrencyControlRulesResponse create() {
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
    public DisableAllSqlConcurrencyControlRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableAllSqlConcurrencyControlRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DisableAllSqlConcurrencyControlRulesResponseBody body);

        @Override
        DisableAllSqlConcurrencyControlRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableAllSqlConcurrencyControlRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DisableAllSqlConcurrencyControlRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableAllSqlConcurrencyControlRulesResponse response) {
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
        public Builder body(DisableAllSqlConcurrencyControlRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableAllSqlConcurrencyControlRulesResponse build() {
            return new DisableAllSqlConcurrencyControlRulesResponse(this);
        } 

    } 

}

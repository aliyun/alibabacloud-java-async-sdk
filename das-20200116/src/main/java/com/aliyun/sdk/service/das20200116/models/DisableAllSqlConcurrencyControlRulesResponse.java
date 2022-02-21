// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAllSqlConcurrencyControlRulesResponse} extends {@link TeaModel}
 *
 * <p>DisableAllSqlConcurrencyControlRulesResponse</p>
 */
public class DisableAllSqlConcurrencyControlRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableAllSqlConcurrencyControlRulesResponseBody body;

    private DisableAllSqlConcurrencyControlRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public DisableAllSqlConcurrencyControlRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableAllSqlConcurrencyControlRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableAllSqlConcurrencyControlRulesResponseBody body);

        @Override
        DisableAllSqlConcurrencyControlRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableAllSqlConcurrencyControlRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableAllSqlConcurrencyControlRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableAllSqlConcurrencyControlRulesResponse response) {
            super(response);
            this.headers = response.headers;
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

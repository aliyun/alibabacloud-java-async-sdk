// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlConcurrencyControlRulesHistoryResponse} extends {@link TeaModel}
 *
 * <p>GetSqlConcurrencyControlRulesHistoryResponse</p>
 */
public class GetSqlConcurrencyControlRulesHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSqlConcurrencyControlRulesHistoryResponseBody body;

    private GetSqlConcurrencyControlRulesHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSqlConcurrencyControlRulesHistoryResponse create() {
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
    public GetSqlConcurrencyControlRulesHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSqlConcurrencyControlRulesHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSqlConcurrencyControlRulesHistoryResponseBody body);

        @Override
        GetSqlConcurrencyControlRulesHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSqlConcurrencyControlRulesHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSqlConcurrencyControlRulesHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSqlConcurrencyControlRulesHistoryResponse response) {
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
        public Builder body(GetSqlConcurrencyControlRulesHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSqlConcurrencyControlRulesHistoryResponse build() {
            return new GetSqlConcurrencyControlRulesHistoryResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRunningSqlConcurrencyControlRulesResponse} extends {@link TeaModel}
 *
 * <p>GetRunningSqlConcurrencyControlRulesResponse</p>
 */
public class GetRunningSqlConcurrencyControlRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRunningSqlConcurrencyControlRulesResponseBody body;

    private GetRunningSqlConcurrencyControlRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRunningSqlConcurrencyControlRulesResponse create() {
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
    public GetRunningSqlConcurrencyControlRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRunningSqlConcurrencyControlRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRunningSqlConcurrencyControlRulesResponseBody body);

        @Override
        GetRunningSqlConcurrencyControlRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRunningSqlConcurrencyControlRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRunningSqlConcurrencyControlRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRunningSqlConcurrencyControlRulesResponse response) {
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
        public Builder body(GetRunningSqlConcurrencyControlRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRunningSqlConcurrencyControlRulesResponse build() {
            return new GetRunningSqlConcurrencyControlRulesResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlConcurrencyControlKeywordsFromSqlTextResponse} extends {@link TeaModel}
 *
 * <p>GetSqlConcurrencyControlKeywordsFromSqlTextResponse</p>
 */
public class GetSqlConcurrencyControlKeywordsFromSqlTextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody body;

    private GetSqlConcurrencyControlKeywordsFromSqlTextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSqlConcurrencyControlKeywordsFromSqlTextResponse create() {
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
    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSqlConcurrencyControlKeywordsFromSqlTextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody body);

        @Override
        GetSqlConcurrencyControlKeywordsFromSqlTextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSqlConcurrencyControlKeywordsFromSqlTextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSqlConcurrencyControlKeywordsFromSqlTextResponse response) {
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
        public Builder body(GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSqlConcurrencyControlKeywordsFromSqlTextResponse build() {
            return new GetSqlConcurrencyControlKeywordsFromSqlTextResponse(this);
        } 

    } 

}

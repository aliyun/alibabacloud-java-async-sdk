// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSqlConcurrencyControlResponse} extends {@link TeaModel}
 *
 * <p>EnableSqlConcurrencyControlResponse</p>
 */
public class EnableSqlConcurrencyControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSqlConcurrencyControlResponseBody body;

    private EnableSqlConcurrencyControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSqlConcurrencyControlResponse create() {
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
    public EnableSqlConcurrencyControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSqlConcurrencyControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSqlConcurrencyControlResponseBody body);

        @Override
        EnableSqlConcurrencyControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSqlConcurrencyControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSqlConcurrencyControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSqlConcurrencyControlResponse response) {
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
        public Builder body(EnableSqlConcurrencyControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSqlConcurrencyControlResponse build() {
            return new EnableSqlConcurrencyControlResponse(this);
        } 

    } 

}

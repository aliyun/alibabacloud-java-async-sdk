// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlOptimizeAdviceResponse} extends {@link TeaModel}
 *
 * <p>GetSqlOptimizeAdviceResponse</p>
 */
public class GetSqlOptimizeAdviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSqlOptimizeAdviceResponseBody body;

    private GetSqlOptimizeAdviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSqlOptimizeAdviceResponse create() {
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
    public GetSqlOptimizeAdviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSqlOptimizeAdviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSqlOptimizeAdviceResponseBody body);

        @Override
        GetSqlOptimizeAdviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSqlOptimizeAdviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSqlOptimizeAdviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSqlOptimizeAdviceResponse response) {
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
        public Builder body(GetSqlOptimizeAdviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSqlOptimizeAdviceResponse build() {
            return new GetSqlOptimizeAdviceResponse(this);
        } 

    } 

}

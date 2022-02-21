// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExpenseSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetExpenseSummaryResponse</p>
 */
public class GetExpenseSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExpenseSummaryResponseBody body;

    private GetExpenseSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExpenseSummaryResponse create() {
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
    public GetExpenseSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExpenseSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExpenseSummaryResponseBody body);

        @Override
        GetExpenseSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExpenseSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExpenseSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExpenseSummaryResponse response) {
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
        public Builder body(GetExpenseSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExpenseSummaryResponse build() {
            return new GetExpenseSummaryResponse(this);
        } 

    } 

}

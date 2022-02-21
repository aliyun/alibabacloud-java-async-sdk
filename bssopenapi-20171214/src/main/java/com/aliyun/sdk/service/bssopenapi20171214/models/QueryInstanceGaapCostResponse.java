// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceGaapCostResponse} extends {@link TeaModel}
 *
 * <p>QueryInstanceGaapCostResponse</p>
 */
public class QueryInstanceGaapCostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryInstanceGaapCostResponseBody body;

    private QueryInstanceGaapCostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryInstanceGaapCostResponse create() {
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
    public QueryInstanceGaapCostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInstanceGaapCostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryInstanceGaapCostResponseBody body);

        @Override
        QueryInstanceGaapCostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInstanceGaapCostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryInstanceGaapCostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInstanceGaapCostResponse response) {
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
        public Builder body(QueryInstanceGaapCostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInstanceGaapCostResponse build() {
            return new QueryInstanceGaapCostResponse(this);
        } 

    } 

}

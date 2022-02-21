// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonthlyInstanceConsumptionResponse} extends {@link TeaModel}
 *
 * <p>QueryMonthlyInstanceConsumptionResponse</p>
 */
public class QueryMonthlyInstanceConsumptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMonthlyInstanceConsumptionResponseBody body;

    private QueryMonthlyInstanceConsumptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMonthlyInstanceConsumptionResponse create() {
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
    public QueryMonthlyInstanceConsumptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMonthlyInstanceConsumptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMonthlyInstanceConsumptionResponseBody body);

        @Override
        QueryMonthlyInstanceConsumptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMonthlyInstanceConsumptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMonthlyInstanceConsumptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMonthlyInstanceConsumptionResponse response) {
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
        public Builder body(QueryMonthlyInstanceConsumptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMonthlyInstanceConsumptionResponse build() {
            return new QueryMonthlyInstanceConsumptionResponse(this);
        } 

    } 

}

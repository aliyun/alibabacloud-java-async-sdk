// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePurifyPlanByPlanIdResponse} extends {@link TeaModel}
 *
 * <p>QueryDevicePurifyPlanByPlanIdResponse</p>
 */
public class QueryDevicePurifyPlanByPlanIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDevicePurifyPlanByPlanIdResponseBody body;

    private QueryDevicePurifyPlanByPlanIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDevicePurifyPlanByPlanIdResponse create() {
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
    public QueryDevicePurifyPlanByPlanIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDevicePurifyPlanByPlanIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDevicePurifyPlanByPlanIdResponseBody body);

        @Override
        QueryDevicePurifyPlanByPlanIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDevicePurifyPlanByPlanIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDevicePurifyPlanByPlanIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDevicePurifyPlanByPlanIdResponse response) {
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
        public Builder body(QueryDevicePurifyPlanByPlanIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDevicePurifyPlanByPlanIdResponse build() {
            return new QueryDevicePurifyPlanByPlanIdResponse(this);
        } 

    } 

}

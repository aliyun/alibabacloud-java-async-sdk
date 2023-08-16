// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBrokerDemandResponse} extends {@link TeaModel}
 *
 * <p>QueryBrokerDemandResponse</p>
 */
public class QueryBrokerDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBrokerDemandResponseBody body;

    private QueryBrokerDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBrokerDemandResponse create() {
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
    public QueryBrokerDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBrokerDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBrokerDemandResponseBody body);

        @Override
        QueryBrokerDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBrokerDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBrokerDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBrokerDemandResponse response) {
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
        public Builder body(QueryBrokerDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBrokerDemandResponse build() {
            return new QueryBrokerDemandResponse(this);
        } 

    } 

}

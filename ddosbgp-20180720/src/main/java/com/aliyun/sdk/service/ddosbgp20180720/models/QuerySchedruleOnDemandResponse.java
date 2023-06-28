// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySchedruleOnDemandResponse} extends {@link TeaModel}
 *
 * <p>QuerySchedruleOnDemandResponse</p>
 */
public class QuerySchedruleOnDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySchedruleOnDemandResponseBody body;

    private QuerySchedruleOnDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySchedruleOnDemandResponse create() {
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
    public QuerySchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySchedruleOnDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySchedruleOnDemandResponseBody body);

        @Override
        QuerySchedruleOnDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySchedruleOnDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySchedruleOnDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySchedruleOnDemandResponse response) {
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
        public Builder body(QuerySchedruleOnDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySchedruleOnDemandResponse build() {
            return new QuerySchedruleOnDemandResponse(this);
        } 

    } 

}

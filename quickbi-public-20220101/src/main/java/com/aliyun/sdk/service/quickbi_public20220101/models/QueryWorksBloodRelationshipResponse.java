// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksBloodRelationshipResponse} extends {@link TeaModel}
 *
 * <p>QueryWorksBloodRelationshipResponse</p>
 */
public class QueryWorksBloodRelationshipResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryWorksBloodRelationshipResponseBody body;

    private QueryWorksBloodRelationshipResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryWorksBloodRelationshipResponse create() {
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
    public QueryWorksBloodRelationshipResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryWorksBloodRelationshipResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryWorksBloodRelationshipResponseBody body);

        @Override
        QueryWorksBloodRelationshipResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryWorksBloodRelationshipResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryWorksBloodRelationshipResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryWorksBloodRelationshipResponse response) {
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
        public Builder body(QueryWorksBloodRelationshipResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryWorksBloodRelationshipResponse build() {
            return new QueryWorksBloodRelationshipResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEnsAssociationResponse} extends {@link TeaModel}
 *
 * <p>QueryEnsAssociationResponse</p>
 */
public class QueryEnsAssociationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEnsAssociationResponseBody body;

    private QueryEnsAssociationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEnsAssociationResponse create() {
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
    public QueryEnsAssociationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEnsAssociationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEnsAssociationResponseBody body);

        @Override
        QueryEnsAssociationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEnsAssociationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEnsAssociationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEnsAssociationResponse response) {
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
        public Builder body(QueryEnsAssociationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEnsAssociationResponse build() {
            return new QueryEnsAssociationResponse(this);
        } 

    } 

}

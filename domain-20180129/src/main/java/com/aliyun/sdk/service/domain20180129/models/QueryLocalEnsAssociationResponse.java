// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLocalEnsAssociationResponse} extends {@link TeaModel}
 *
 * <p>QueryLocalEnsAssociationResponse</p>
 */
public class QueryLocalEnsAssociationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryLocalEnsAssociationResponseBody body;

    private QueryLocalEnsAssociationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryLocalEnsAssociationResponse create() {
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
    public QueryLocalEnsAssociationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryLocalEnsAssociationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryLocalEnsAssociationResponseBody body);

        @Override
        QueryLocalEnsAssociationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryLocalEnsAssociationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryLocalEnsAssociationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryLocalEnsAssociationResponse response) {
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
        public Builder body(QueryLocalEnsAssociationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryLocalEnsAssociationResponse build() {
            return new QueryLocalEnsAssociationResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksByOrganizationResponse} extends {@link TeaModel}
 *
 * <p>QueryWorksByOrganizationResponse</p>
 */
public class QueryWorksByOrganizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryWorksByOrganizationResponseBody body;

    private QueryWorksByOrganizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryWorksByOrganizationResponse create() {
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
    public QueryWorksByOrganizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryWorksByOrganizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryWorksByOrganizationResponseBody body);

        @Override
        QueryWorksByOrganizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryWorksByOrganizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryWorksByOrganizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryWorksByOrganizationResponse response) {
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
        public Builder body(QueryWorksByOrganizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryWorksByOrganizationResponse build() {
            return new QueryWorksByOrganizationResponse(this);
        } 

    } 

}

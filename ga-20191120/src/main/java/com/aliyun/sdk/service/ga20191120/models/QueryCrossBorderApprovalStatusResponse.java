// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCrossBorderApprovalStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryCrossBorderApprovalStatusResponse</p>
 */
public class QueryCrossBorderApprovalStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCrossBorderApprovalStatusResponseBody body;

    private QueryCrossBorderApprovalStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCrossBorderApprovalStatusResponse create() {
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
    public QueryCrossBorderApprovalStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCrossBorderApprovalStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCrossBorderApprovalStatusResponseBody body);

        @Override
        QueryCrossBorderApprovalStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCrossBorderApprovalStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCrossBorderApprovalStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCrossBorderApprovalStatusResponse response) {
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
        public Builder body(QueryCrossBorderApprovalStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCrossBorderApprovalStatusResponse build() {
            return new QueryCrossBorderApprovalStatusResponse(this);
        } 

    } 

}

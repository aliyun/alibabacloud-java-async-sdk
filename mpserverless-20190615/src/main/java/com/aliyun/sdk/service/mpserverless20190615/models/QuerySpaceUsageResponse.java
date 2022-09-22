// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpaceUsageResponse} extends {@link TeaModel}
 *
 * <p>QuerySpaceUsageResponse</p>
 */
public class QuerySpaceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpaceUsageResponseBody body;

    private QuerySpaceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpaceUsageResponse create() {
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
    public QuerySpaceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpaceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpaceUsageResponseBody body);

        @Override
        QuerySpaceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpaceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpaceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpaceUsageResponse response) {
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
        public Builder body(QuerySpaceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpaceUsageResponse build() {
            return new QuerySpaceUsageResponse(this);
        } 

    } 

}

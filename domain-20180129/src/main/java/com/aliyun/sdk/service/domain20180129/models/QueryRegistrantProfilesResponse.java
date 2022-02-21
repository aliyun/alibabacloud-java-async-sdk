// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRegistrantProfilesResponse} extends {@link TeaModel}
 *
 * <p>QueryRegistrantProfilesResponse</p>
 */
public class QueryRegistrantProfilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRegistrantProfilesResponseBody body;

    private QueryRegistrantProfilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRegistrantProfilesResponse create() {
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
    public QueryRegistrantProfilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRegistrantProfilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRegistrantProfilesResponseBody body);

        @Override
        QueryRegistrantProfilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRegistrantProfilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRegistrantProfilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRegistrantProfilesResponse response) {
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
        public Builder body(QueryRegistrantProfilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRegistrantProfilesResponse build() {
            return new QueryRegistrantProfilesResponse(this);
        } 

    } 

}

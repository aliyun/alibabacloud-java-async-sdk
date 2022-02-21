// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStudioAppPageListOpenResponse} extends {@link TeaModel}
 *
 * <p>QueryStudioAppPageListOpenResponse</p>
 */
public class QueryStudioAppPageListOpenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryStudioAppPageListOpenResponseBody body;

    private QueryStudioAppPageListOpenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryStudioAppPageListOpenResponse create() {
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
    public QueryStudioAppPageListOpenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryStudioAppPageListOpenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryStudioAppPageListOpenResponseBody body);

        @Override
        QueryStudioAppPageListOpenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryStudioAppPageListOpenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryStudioAppPageListOpenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryStudioAppPageListOpenResponse response) {
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
        public Builder body(QueryStudioAppPageListOpenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryStudioAppPageListOpenResponse build() {
            return new QueryStudioAppPageListOpenResponse(this);
        } 

    } 

}

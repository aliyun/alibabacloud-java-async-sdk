// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPageByApplyIdResponse} extends {@link TeaModel}
 *
 * <p>QueryPageByApplyIdResponse</p>
 */
public class QueryPageByApplyIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPageByApplyIdResponseBody body;

    private QueryPageByApplyIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPageByApplyIdResponse create() {
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
    public QueryPageByApplyIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPageByApplyIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPageByApplyIdResponseBody body);

        @Override
        QueryPageByApplyIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPageByApplyIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPageByApplyIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPageByApplyIdResponse response) {
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
        public Builder body(QueryPageByApplyIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPageByApplyIdResponse build() {
            return new QueryPageByApplyIdResponse(this);
        } 

    } 

}

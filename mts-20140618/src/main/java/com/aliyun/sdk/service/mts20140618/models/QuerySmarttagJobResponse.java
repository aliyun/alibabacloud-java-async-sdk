// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmarttagJobResponse} extends {@link TeaModel}
 *
 * <p>QuerySmarttagJobResponse</p>
 */
public class QuerySmarttagJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySmarttagJobResponseBody body;

    private QuerySmarttagJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySmarttagJobResponse create() {
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
    public QuerySmarttagJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySmarttagJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySmarttagJobResponseBody body);

        @Override
        QuerySmarttagJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySmarttagJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySmarttagJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySmarttagJobResponse response) {
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
        public Builder body(QuerySmarttagJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySmarttagJobResponse build() {
            return new QuerySmarttagJobResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOTAJobResponse} extends {@link TeaModel}
 *
 * <p>QueryOTAJobResponse</p>
 */
public class QueryOTAJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryOTAJobResponseBody body;

    private QueryOTAJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryOTAJobResponse create() {
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
    public QueryOTAJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryOTAJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryOTAJobResponseBody body);

        @Override
        QueryOTAJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryOTAJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryOTAJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryOTAJobResponse response) {
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
        public Builder body(QueryOTAJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryOTAJobResponse build() {
            return new QueryOTAJobResponse(this);
        } 

    } 

}

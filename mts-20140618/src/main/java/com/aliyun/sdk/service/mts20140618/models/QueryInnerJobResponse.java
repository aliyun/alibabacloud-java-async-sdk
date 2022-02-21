// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInnerJobResponse} extends {@link TeaModel}
 *
 * <p>QueryInnerJobResponse</p>
 */
public class QueryInnerJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryInnerJobResponseBody body;

    private QueryInnerJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryInnerJobResponse create() {
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
    public QueryInnerJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInnerJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryInnerJobResponseBody body);

        @Override
        QueryInnerJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInnerJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryInnerJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInnerJobResponse response) {
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
        public Builder body(QueryInnerJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInnerJobResponse build() {
            return new QueryInnerJobResponse(this);
        } 

    } 

}

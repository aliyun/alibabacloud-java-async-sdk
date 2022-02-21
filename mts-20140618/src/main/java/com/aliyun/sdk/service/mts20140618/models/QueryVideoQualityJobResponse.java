// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVideoQualityJobResponse} extends {@link TeaModel}
 *
 * <p>QueryVideoQualityJobResponse</p>
 */
public class QueryVideoQualityJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryVideoQualityJobResponseBody body;

    private QueryVideoQualityJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryVideoQualityJobResponse create() {
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
    public QueryVideoQualityJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryVideoQualityJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryVideoQualityJobResponseBody body);

        @Override
        QueryVideoQualityJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryVideoQualityJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryVideoQualityJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryVideoQualityJobResponse response) {
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
        public Builder body(QueryVideoQualityJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryVideoQualityJobResponse build() {
            return new QueryVideoQualityJobResponse(this);
        } 

    } 

}

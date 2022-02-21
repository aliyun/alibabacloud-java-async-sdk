// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryThingModelResponse} extends {@link TeaModel}
 *
 * <p>QueryThingModelResponse</p>
 */
public class QueryThingModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryThingModelResponseBody body;

    private QueryThingModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryThingModelResponse create() {
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
    public QueryThingModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryThingModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryThingModelResponseBody body);

        @Override
        QueryThingModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryThingModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryThingModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryThingModelResponse response) {
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
        public Builder body(QueryThingModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryThingModelResponse build() {
            return new QueryThingModelResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryThingModelExtendConfigResponse} extends {@link TeaModel}
 *
 * <p>QueryThingModelExtendConfigResponse</p>
 */
public class QueryThingModelExtendConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryThingModelExtendConfigResponseBody body;

    private QueryThingModelExtendConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryThingModelExtendConfigResponse create() {
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
    public QueryThingModelExtendConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryThingModelExtendConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryThingModelExtendConfigResponseBody body);

        @Override
        QueryThingModelExtendConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryThingModelExtendConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryThingModelExtendConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryThingModelExtendConfigResponse response) {
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
        public Builder body(QueryThingModelExtendConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryThingModelExtendConfigResponse build() {
            return new QueryThingModelExtendConfigResponse(this);
        } 

    } 

}

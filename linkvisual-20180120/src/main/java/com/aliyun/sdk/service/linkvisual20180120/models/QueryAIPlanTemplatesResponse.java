// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIPlanTemplatesResponse} extends {@link TeaModel}
 *
 * <p>QueryAIPlanTemplatesResponse</p>
 */
public class QueryAIPlanTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAIPlanTemplatesResponseBody body;

    private QueryAIPlanTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAIPlanTemplatesResponse create() {
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
    public QueryAIPlanTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAIPlanTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAIPlanTemplatesResponseBody body);

        @Override
        QueryAIPlanTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAIPlanTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAIPlanTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAIPlanTemplatesResponse response) {
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
        public Builder body(QueryAIPlanTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAIPlanTemplatesResponse build() {
            return new QueryAIPlanTemplatesResponse(this);
        } 

    } 

}

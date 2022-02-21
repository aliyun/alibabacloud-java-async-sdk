// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEniQosGroupByEniResponse} extends {@link TeaModel}
 *
 * <p>QueryEniQosGroupByEniResponse</p>
 */
public class QueryEniQosGroupByEniResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEniQosGroupByEniResponseBody body;

    private QueryEniQosGroupByEniResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEniQosGroupByEniResponse create() {
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
    public QueryEniQosGroupByEniResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEniQosGroupByEniResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEniQosGroupByEniResponseBody body);

        @Override
        QueryEniQosGroupByEniResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEniQosGroupByEniResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEniQosGroupByEniResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEniQosGroupByEniResponse response) {
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
        public Builder body(QueryEniQosGroupByEniResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEniQosGroupByEniResponse build() {
            return new QueryEniQosGroupByEniResponse(this);
        } 

    } 

}

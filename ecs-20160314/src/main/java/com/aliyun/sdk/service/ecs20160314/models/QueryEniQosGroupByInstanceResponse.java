// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEniQosGroupByInstanceResponse} extends {@link TeaModel}
 *
 * <p>QueryEniQosGroupByInstanceResponse</p>
 */
public class QueryEniQosGroupByInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEniQosGroupByInstanceResponseBody body;

    private QueryEniQosGroupByInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEniQosGroupByInstanceResponse create() {
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
    public QueryEniQosGroupByInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEniQosGroupByInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEniQosGroupByInstanceResponseBody body);

        @Override
        QueryEniQosGroupByInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEniQosGroupByInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEniQosGroupByInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEniQosGroupByInstanceResponse response) {
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
        public Builder body(QueryEniQosGroupByInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEniQosGroupByInstanceResponse build() {
            return new QueryEniQosGroupByInstanceResponse(this);
        } 

    } 

}

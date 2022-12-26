// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemAggregationRulesResponse} extends {@link TeaModel}
 *
 * <p>ListSystemAggregationRulesResponse</p>
 */
public class ListSystemAggregationRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSystemAggregationRulesResponseBody body;

    private ListSystemAggregationRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSystemAggregationRulesResponse create() {
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
    public ListSystemAggregationRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSystemAggregationRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSystemAggregationRulesResponseBody body);

        @Override
        ListSystemAggregationRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSystemAggregationRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSystemAggregationRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSystemAggregationRulesResponse response) {
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
        public Builder body(ListSystemAggregationRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSystemAggregationRulesResponse build() {
            return new ListSystemAggregationRulesResponse(this);
        } 

    } 

}

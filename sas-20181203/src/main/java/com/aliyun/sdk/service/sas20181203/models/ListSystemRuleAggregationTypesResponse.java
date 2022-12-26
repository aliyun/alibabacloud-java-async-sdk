// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemRuleAggregationTypesResponse} extends {@link TeaModel}
 *
 * <p>ListSystemRuleAggregationTypesResponse</p>
 */
public class ListSystemRuleAggregationTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSystemRuleAggregationTypesResponseBody body;

    private ListSystemRuleAggregationTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSystemRuleAggregationTypesResponse create() {
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
    public ListSystemRuleAggregationTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSystemRuleAggregationTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSystemRuleAggregationTypesResponseBody body);

        @Override
        ListSystemRuleAggregationTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSystemRuleAggregationTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSystemRuleAggregationTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSystemRuleAggregationTypesResponse response) {
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
        public Builder body(ListSystemRuleAggregationTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSystemRuleAggregationTypesResponse build() {
            return new ListSystemRuleAggregationTypesResponse(this);
        } 

    } 

}

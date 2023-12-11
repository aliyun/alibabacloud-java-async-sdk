// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityResultsByRuleResponse} extends {@link TeaModel}
 *
 * <p>ListQualityResultsByRuleResponse</p>
 */
public class ListQualityResultsByRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQualityResultsByRuleResponseBody body;

    private ListQualityResultsByRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQualityResultsByRuleResponse create() {
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
    public ListQualityResultsByRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQualityResultsByRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQualityResultsByRuleResponseBody body);

        @Override
        ListQualityResultsByRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQualityResultsByRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQualityResultsByRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQualityResultsByRuleResponse response) {
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
        public Builder body(ListQualityResultsByRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQualityResultsByRuleResponse build() {
            return new ListQualityResultsByRuleResponse(this);
        } 

    } 

}

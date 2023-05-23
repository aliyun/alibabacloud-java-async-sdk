// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowRulesResponse} extends {@link TeaModel}
 *
 * <p>ListFlowRulesResponse</p>
 */
public class ListFlowRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowRulesResponseBody body;

    private ListFlowRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowRulesResponse create() {
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
    public ListFlowRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowRulesResponseBody body);

        @Override
        ListFlowRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowRulesResponse response) {
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
        public Builder body(ListFlowRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowRulesResponse build() {
            return new ListFlowRulesResponse(this);
        } 

    } 

}

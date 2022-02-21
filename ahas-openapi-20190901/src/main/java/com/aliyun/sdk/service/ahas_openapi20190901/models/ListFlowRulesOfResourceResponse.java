// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowRulesOfResourceResponse} extends {@link TeaModel}
 *
 * <p>ListFlowRulesOfResourceResponse</p>
 */
public class ListFlowRulesOfResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowRulesOfResourceResponseBody body;

    private ListFlowRulesOfResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowRulesOfResourceResponse create() {
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
    public ListFlowRulesOfResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowRulesOfResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowRulesOfResourceResponseBody body);

        @Override
        ListFlowRulesOfResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowRulesOfResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowRulesOfResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowRulesOfResourceResponse response) {
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
        public Builder body(ListFlowRulesOfResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowRulesOfResourceResponse build() {
            return new ListFlowRulesOfResourceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowRulesOfAppResponse} extends {@link TeaModel}
 *
 * <p>ListFlowRulesOfAppResponse</p>
 */
public class ListFlowRulesOfAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowRulesOfAppResponseBody body;

    private ListFlowRulesOfAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowRulesOfAppResponse create() {
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
    public ListFlowRulesOfAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowRulesOfAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowRulesOfAppResponseBody body);

        @Override
        ListFlowRulesOfAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowRulesOfAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowRulesOfAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowRulesOfAppResponse response) {
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
        public Builder body(ListFlowRulesOfAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowRulesOfAppResponse build() {
            return new ListFlowRulesOfAppResponse(this);
        } 

    } 

}

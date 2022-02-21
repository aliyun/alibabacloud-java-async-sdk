// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIsolationRulesOfResourceResponse} extends {@link TeaModel}
 *
 * <p>ListIsolationRulesOfResourceResponse</p>
 */
public class ListIsolationRulesOfResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIsolationRulesOfResourceResponseBody body;

    private ListIsolationRulesOfResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIsolationRulesOfResourceResponse create() {
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
    public ListIsolationRulesOfResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIsolationRulesOfResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIsolationRulesOfResourceResponseBody body);

        @Override
        ListIsolationRulesOfResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIsolationRulesOfResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIsolationRulesOfResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIsolationRulesOfResourceResponse response) {
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
        public Builder body(ListIsolationRulesOfResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIsolationRulesOfResourceResponse build() {
            return new ListIsolationRulesOfResourceResponse(this);
        } 

    } 

}

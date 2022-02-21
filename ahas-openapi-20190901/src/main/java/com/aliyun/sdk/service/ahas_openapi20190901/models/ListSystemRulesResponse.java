// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemRulesResponse} extends {@link TeaModel}
 *
 * <p>ListSystemRulesResponse</p>
 */
public class ListSystemRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSystemRulesResponseBody body;

    private ListSystemRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSystemRulesResponse create() {
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
    public ListSystemRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSystemRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSystemRulesResponseBody body);

        @Override
        ListSystemRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSystemRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSystemRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSystemRulesResponse response) {
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
        public Builder body(ListSystemRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSystemRulesResponse build() {
            return new ListSystemRulesResponse(this);
        } 

    } 

}

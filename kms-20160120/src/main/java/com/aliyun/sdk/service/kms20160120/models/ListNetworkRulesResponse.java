// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkRulesResponse} extends {@link TeaModel}
 *
 * <p>ListNetworkRulesResponse</p>
 */
public class ListNetworkRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNetworkRulesResponseBody body;

    private ListNetworkRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNetworkRulesResponse create() {
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
    public ListNetworkRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNetworkRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNetworkRulesResponseBody body);

        @Override
        ListNetworkRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNetworkRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNetworkRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNetworkRulesResponse response) {
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
        public Builder body(ListNetworkRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNetworkRulesResponse build() {
            return new ListNetworkRulesResponse(this);
        } 

    } 

}

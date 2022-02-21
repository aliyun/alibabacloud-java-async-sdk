// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListForwardingRulesResponse} extends {@link TeaModel}
 *
 * <p>ListForwardingRulesResponse</p>
 */
public class ListForwardingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListForwardingRulesResponseBody body;

    private ListForwardingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListForwardingRulesResponse create() {
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
    public ListForwardingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListForwardingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListForwardingRulesResponseBody body);

        @Override
        ListForwardingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListForwardingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListForwardingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListForwardingRulesResponse response) {
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
        public Builder body(ListForwardingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListForwardingRulesResponse build() {
            return new ListForwardingRulesResponse(this);
        } 

    } 

}

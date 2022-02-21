// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRulesResponse} extends {@link TeaModel}
 *
 * <p>ListConfigRulesResponse</p>
 */
public class ListConfigRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConfigRulesResponseBody body;

    private ListConfigRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConfigRulesResponse create() {
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
    public ListConfigRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConfigRulesResponseBody body);

        @Override
        ListConfigRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConfigRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigRulesResponse response) {
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
        public Builder body(ListConfigRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigRulesResponse build() {
            return new ListConfigRulesResponse(this);
        } 

    } 

}

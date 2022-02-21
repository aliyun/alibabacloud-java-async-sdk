// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRulesResponse} extends {@link TeaModel}
 *
 * <p>ListRulesResponse</p>
 */
public class ListRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRulesResponseBody body;

    private ListRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRulesResponse create() {
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
    public ListRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRulesResponseBody body);

        @Override
        ListRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRulesResponse response) {
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
        public Builder body(ListRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRulesResponse build() {
            return new ListRulesResponse(this);
        } 

    } 

}

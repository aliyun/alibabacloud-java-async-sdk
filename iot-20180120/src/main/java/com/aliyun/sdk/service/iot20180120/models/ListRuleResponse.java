// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleResponse} extends {@link TeaModel}
 *
 * <p>ListRuleResponse</p>
 */
public class ListRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRuleResponseBody body;

    private ListRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRuleResponse create() {
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
    public ListRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRuleResponseBody body);

        @Override
        ListRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRuleResponse response) {
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
        public Builder body(ListRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRuleResponse build() {
            return new ListRuleResponse(this);
        } 

    } 

}

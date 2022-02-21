// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleConditionsResponse} extends {@link TeaModel}
 *
 * <p>ListRuleConditionsResponse</p>
 */
public class ListRuleConditionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRuleConditionsResponseBody body;

    private ListRuleConditionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRuleConditionsResponse create() {
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
    public ListRuleConditionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRuleConditionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRuleConditionsResponseBody body);

        @Override
        ListRuleConditionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRuleConditionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRuleConditionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRuleConditionsResponse response) {
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
        public Builder body(ListRuleConditionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRuleConditionsResponse build() {
            return new ListRuleConditionsResponse(this);
        } 

    } 

}

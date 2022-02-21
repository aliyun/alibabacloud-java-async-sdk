// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleActionsResponse} extends {@link TeaModel}
 *
 * <p>ListRuleActionsResponse</p>
 */
public class ListRuleActionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRuleActionsResponseBody body;

    private ListRuleActionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRuleActionsResponse create() {
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
    public ListRuleActionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRuleActionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRuleActionsResponseBody body);

        @Override
        ListRuleActionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRuleActionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRuleActionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRuleActionsResponse response) {
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
        public Builder body(ListRuleActionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRuleActionsResponse build() {
            return new ListRuleActionsResponse(this);
        } 

    } 

}

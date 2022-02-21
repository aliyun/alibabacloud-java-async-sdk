// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoBuildRuleResponse} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRuleResponse</p>
 */
public class ListRepoBuildRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepoBuildRuleResponseBody body;

    private ListRepoBuildRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepoBuildRuleResponse create() {
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
    public ListRepoBuildRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepoBuildRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepoBuildRuleResponseBody body);

        @Override
        ListRepoBuildRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepoBuildRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepoBuildRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepoBuildRuleResponse response) {
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
        public Builder body(ListRepoBuildRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepoBuildRuleResponse build() {
            return new ListRepoBuildRuleResponse(this);
        } 

    } 

}

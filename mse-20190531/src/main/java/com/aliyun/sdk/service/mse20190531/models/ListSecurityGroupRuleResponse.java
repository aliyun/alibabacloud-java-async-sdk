// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityGroupRuleResponse} extends {@link TeaModel}
 *
 * <p>ListSecurityGroupRuleResponse</p>
 */
public class ListSecurityGroupRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecurityGroupRuleResponseBody body;

    private ListSecurityGroupRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecurityGroupRuleResponse create() {
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
    public ListSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecurityGroupRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecurityGroupRuleResponseBody body);

        @Override
        ListSecurityGroupRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecurityGroupRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecurityGroupRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecurityGroupRuleResponse response) {
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
        public Builder body(ListSecurityGroupRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecurityGroupRuleResponse build() {
            return new ListSecurityGroupRuleResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSecurityGroupRuleResponse} extends {@link TeaModel}
 *
 * <p>AddSecurityGroupRuleResponse</p>
 */
public class AddSecurityGroupRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSecurityGroupRuleResponseBody body;

    private AddSecurityGroupRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSecurityGroupRuleResponse create() {
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
    public AddSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSecurityGroupRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSecurityGroupRuleResponseBody body);

        @Override
        AddSecurityGroupRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSecurityGroupRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSecurityGroupRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSecurityGroupRuleResponse response) {
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
        public Builder body(AddSecurityGroupRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSecurityGroupRuleResponse build() {
            return new AddSecurityGroupRuleResponse(this);
        } 

    } 

}

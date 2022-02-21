// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResolverRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateResolverRuleResponse</p>
 */
public class UpdateResolverRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateResolverRuleResponseBody body;

    private UpdateResolverRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateResolverRuleResponse create() {
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
    public UpdateResolverRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateResolverRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateResolverRuleResponseBody body);

        @Override
        UpdateResolverRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateResolverRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateResolverRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateResolverRuleResponse response) {
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
        public Builder body(UpdateResolverRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateResolverRuleResponse build() {
            return new UpdateResolverRuleResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateAccessRuleResponse</p>
 */
public class CreateAccessRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAccessRuleResponseBody body;

    private CreateAccessRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAccessRuleResponse create() {
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
    public CreateAccessRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAccessRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAccessRuleResponseBody body);

        @Override
        CreateAccessRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAccessRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAccessRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAccessRuleResponse response) {
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
        public Builder body(CreateAccessRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAccessRuleResponse build() {
            return new CreateAccessRuleResponse(this);
        } 

    } 

}

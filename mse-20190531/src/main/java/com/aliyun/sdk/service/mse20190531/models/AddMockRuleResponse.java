// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMockRuleResponse} extends {@link TeaModel}
 *
 * <p>AddMockRuleResponse</p>
 */
public class AddMockRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMockRuleResponseBody body;

    private AddMockRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMockRuleResponse create() {
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
    public AddMockRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMockRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMockRuleResponseBody body);

        @Override
        AddMockRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMockRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMockRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMockRuleResponse response) {
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
        public Builder body(AddMockRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMockRuleResponse build() {
            return new AddMockRuleResponse(this);
        } 

    } 

}

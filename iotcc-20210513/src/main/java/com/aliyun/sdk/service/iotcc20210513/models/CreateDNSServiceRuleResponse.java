// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDNSServiceRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateDNSServiceRuleResponse</p>
 */
public class CreateDNSServiceRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDNSServiceRuleResponseBody body;

    private CreateDNSServiceRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDNSServiceRuleResponse create() {
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
    public CreateDNSServiceRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDNSServiceRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDNSServiceRuleResponseBody body);

        @Override
        CreateDNSServiceRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDNSServiceRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDNSServiceRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDNSServiceRuleResponse response) {
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
        public Builder body(CreateDNSServiceRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDNSServiceRuleResponse build() {
            return new CreateDNSServiceRuleResponse(this);
        } 

    } 

}

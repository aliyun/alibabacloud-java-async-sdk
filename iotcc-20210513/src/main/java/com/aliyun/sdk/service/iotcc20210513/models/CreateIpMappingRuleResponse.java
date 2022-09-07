// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpMappingRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateIpMappingRuleResponse</p>
 */
public class CreateIpMappingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIpMappingRuleResponseBody body;

    private CreateIpMappingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIpMappingRuleResponse create() {
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
    public CreateIpMappingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIpMappingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIpMappingRuleResponseBody body);

        @Override
        CreateIpMappingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIpMappingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIpMappingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIpMappingRuleResponse response) {
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
        public Builder body(CreateIpMappingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIpMappingRuleResponse build() {
            return new CreateIpMappingRuleResponse(this);
        } 

    } 

}

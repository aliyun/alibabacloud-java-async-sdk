// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupIpMappingRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateGroupIpMappingRuleResponse</p>
 */
public class CreateGroupIpMappingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGroupIpMappingRuleResponseBody body;

    private CreateGroupIpMappingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGroupIpMappingRuleResponse create() {
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
    public CreateGroupIpMappingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGroupIpMappingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGroupIpMappingRuleResponseBody body);

        @Override
        CreateGroupIpMappingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGroupIpMappingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGroupIpMappingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGroupIpMappingRuleResponse response) {
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
        public Builder body(CreateGroupIpMappingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGroupIpMappingRuleResponse build() {
            return new CreateGroupIpMappingRuleResponse(this);
        } 

    } 

}

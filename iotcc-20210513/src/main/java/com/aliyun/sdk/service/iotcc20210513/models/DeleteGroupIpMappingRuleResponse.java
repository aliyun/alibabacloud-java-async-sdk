// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupIpMappingRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteGroupIpMappingRuleResponse</p>
 */
public class DeleteGroupIpMappingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGroupIpMappingRuleResponseBody body;

    private DeleteGroupIpMappingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGroupIpMappingRuleResponse create() {
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
    public DeleteGroupIpMappingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGroupIpMappingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGroupIpMappingRuleResponseBody body);

        @Override
        DeleteGroupIpMappingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGroupIpMappingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGroupIpMappingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGroupIpMappingRuleResponse response) {
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
        public Builder body(DeleteGroupIpMappingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGroupIpMappingRuleResponse build() {
            return new DeleteGroupIpMappingRuleResponse(this);
        } 

    } 

}

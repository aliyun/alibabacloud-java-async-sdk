// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpMappingRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpMappingRuleResponse</p>
 */
public class DeleteIpMappingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIpMappingRuleResponseBody body;

    private DeleteIpMappingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIpMappingRuleResponse create() {
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
    public DeleteIpMappingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpMappingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIpMappingRuleResponseBody body);

        @Override
        DeleteIpMappingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpMappingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIpMappingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpMappingRuleResponse response) {
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
        public Builder body(DeleteIpMappingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpMappingRuleResponse build() {
            return new DeleteIpMappingRuleResponse(this);
        } 

    } 

}

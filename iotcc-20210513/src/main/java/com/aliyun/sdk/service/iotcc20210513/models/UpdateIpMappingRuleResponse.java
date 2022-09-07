// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIpMappingRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateIpMappingRuleResponse</p>
 */
public class UpdateIpMappingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIpMappingRuleResponseBody body;

    private UpdateIpMappingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIpMappingRuleResponse create() {
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
    public UpdateIpMappingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIpMappingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIpMappingRuleResponseBody body);

        @Override
        UpdateIpMappingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIpMappingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIpMappingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIpMappingRuleResponse response) {
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
        public Builder body(UpdateIpMappingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIpMappingRuleResponse build() {
            return new UpdateIpMappingRuleResponse(this);
        } 

    } 

}

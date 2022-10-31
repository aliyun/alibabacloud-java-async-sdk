// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DynamicUpdateWaterMarkStreamRuleResponse} extends {@link TeaModel}
 *
 * <p>DynamicUpdateWaterMarkStreamRuleResponse</p>
 */
public class DynamicUpdateWaterMarkStreamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DynamicUpdateWaterMarkStreamRuleResponseBody body;

    private DynamicUpdateWaterMarkStreamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DynamicUpdateWaterMarkStreamRuleResponse create() {
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
    public DynamicUpdateWaterMarkStreamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DynamicUpdateWaterMarkStreamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DynamicUpdateWaterMarkStreamRuleResponseBody body);

        @Override
        DynamicUpdateWaterMarkStreamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DynamicUpdateWaterMarkStreamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DynamicUpdateWaterMarkStreamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DynamicUpdateWaterMarkStreamRuleResponse response) {
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
        public Builder body(DynamicUpdateWaterMarkStreamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DynamicUpdateWaterMarkStreamRuleResponse build() {
            return new DynamicUpdateWaterMarkStreamRuleResponse(this);
        } 

    } 

}

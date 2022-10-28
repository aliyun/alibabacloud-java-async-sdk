// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesensitizationStrategyResponse} extends {@link TeaModel}
 *
 * <p>ModifyDesensitizationStrategyResponse</p>
 */
public class ModifyDesensitizationStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDesensitizationStrategyResponseBody body;

    private ModifyDesensitizationStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDesensitizationStrategyResponse create() {
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
    public ModifyDesensitizationStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDesensitizationStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDesensitizationStrategyResponseBody body);

        @Override
        ModifyDesensitizationStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDesensitizationStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDesensitizationStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDesensitizationStrategyResponse response) {
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
        public Builder body(ModifyDesensitizationStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDesensitizationStrategyResponse build() {
            return new ModifyDesensitizationStrategyResponse(this);
        } 

    } 

}

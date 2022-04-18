// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRuleStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyRuleStatusResponse</p>
 */
public class ModifyRuleStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRuleStatusResponseBody body;

    private ModifyRuleStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRuleStatusResponse create() {
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
    public ModifyRuleStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRuleStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRuleStatusResponseBody body);

        @Override
        ModifyRuleStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRuleStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRuleStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRuleStatusResponse response) {
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
        public Builder body(ModifyRuleStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRuleStatusResponse build() {
            return new ModifyRuleStatusResponse(this);
        } 

    } 

}

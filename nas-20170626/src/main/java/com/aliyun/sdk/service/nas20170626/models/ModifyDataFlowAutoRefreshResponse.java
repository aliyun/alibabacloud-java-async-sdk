// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataFlowAutoRefreshResponse} extends {@link TeaModel}
 *
 * <p>ModifyDataFlowAutoRefreshResponse</p>
 */
public class ModifyDataFlowAutoRefreshResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDataFlowAutoRefreshResponseBody body;

    private ModifyDataFlowAutoRefreshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDataFlowAutoRefreshResponse create() {
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
    public ModifyDataFlowAutoRefreshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDataFlowAutoRefreshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDataFlowAutoRefreshResponseBody body);

        @Override
        ModifyDataFlowAutoRefreshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDataFlowAutoRefreshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDataFlowAutoRefreshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDataFlowAutoRefreshResponse response) {
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
        public Builder body(ModifyDataFlowAutoRefreshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDataFlowAutoRefreshResponse build() {
            return new ModifyDataFlowAutoRefreshResponse(this);
        } 

    } 

}

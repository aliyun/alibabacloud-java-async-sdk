// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEmptyNumberNoMoreCallsInfoResponse} extends {@link TeaModel}
 *
 * <p>ModifyEmptyNumberNoMoreCallsInfoResponse</p>
 */
public class ModifyEmptyNumberNoMoreCallsInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyEmptyNumberNoMoreCallsInfoResponseBody body;

    private ModifyEmptyNumberNoMoreCallsInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyEmptyNumberNoMoreCallsInfoResponse create() {
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
    public ModifyEmptyNumberNoMoreCallsInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyEmptyNumberNoMoreCallsInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyEmptyNumberNoMoreCallsInfoResponseBody body);

        @Override
        ModifyEmptyNumberNoMoreCallsInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyEmptyNumberNoMoreCallsInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyEmptyNumberNoMoreCallsInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyEmptyNumberNoMoreCallsInfoResponse response) {
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
        public Builder body(ModifyEmptyNumberNoMoreCallsInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyEmptyNumberNoMoreCallsInfoResponse build() {
            return new ModifyEmptyNumberNoMoreCallsInfoResponse(this);
        } 

    } 

}

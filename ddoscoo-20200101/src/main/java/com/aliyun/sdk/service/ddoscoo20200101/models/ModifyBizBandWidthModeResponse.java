// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBizBandWidthModeResponse} extends {@link TeaModel}
 *
 * <p>ModifyBizBandWidthModeResponse</p>
 */
public class ModifyBizBandWidthModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBizBandWidthModeResponseBody body;

    private ModifyBizBandWidthModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBizBandWidthModeResponse create() {
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
    public ModifyBizBandWidthModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBizBandWidthModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBizBandWidthModeResponseBody body);

        @Override
        ModifyBizBandWidthModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBizBandWidthModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBizBandWidthModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBizBandWidthModeResponse response) {
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
        public Builder body(ModifyBizBandWidthModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBizBandWidthModeResponse build() {
            return new ModifyBizBandWidthModeResponse(this);
        } 

    } 

}

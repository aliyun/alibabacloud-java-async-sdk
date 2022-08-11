// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkOrderQosProductResponse} extends {@link TeaModel}
 *
 * <p>SdkOrderQosProductResponse</p>
 */
public class SdkOrderQosProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SdkOrderQosProductResponseBody body;

    private SdkOrderQosProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SdkOrderQosProductResponse create() {
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
    public SdkOrderQosProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SdkOrderQosProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SdkOrderQosProductResponseBody body);

        @Override
        SdkOrderQosProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SdkOrderQosProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SdkOrderQosProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SdkOrderQosProductResponse response) {
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
        public Builder body(SdkOrderQosProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SdkOrderQosProductResponse build() {
            return new SdkOrderQosProductResponse(this);
        } 

    } 

}

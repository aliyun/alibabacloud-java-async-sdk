// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGetInventoryInfoResponse} extends {@link TeaModel}
 *
 * <p>SdkGetInventoryInfoResponse</p>
 */
public class SdkGetInventoryInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SdkGetInventoryInfoResponseBody body;

    private SdkGetInventoryInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SdkGetInventoryInfoResponse create() {
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
    public SdkGetInventoryInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SdkGetInventoryInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SdkGetInventoryInfoResponseBody body);

        @Override
        SdkGetInventoryInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SdkGetInventoryInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SdkGetInventoryInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SdkGetInventoryInfoResponse response) {
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
        public Builder body(SdkGetInventoryInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SdkGetInventoryInfoResponse build() {
            return new SdkGetInventoryInfoResponse(this);
        } 

    } 

}

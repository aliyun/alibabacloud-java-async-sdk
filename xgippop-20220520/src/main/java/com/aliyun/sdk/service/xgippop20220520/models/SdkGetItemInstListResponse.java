// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGetItemInstListResponse} extends {@link TeaModel}
 *
 * <p>SdkGetItemInstListResponse</p>
 */
public class SdkGetItemInstListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SdkGetItemInstListResponseBody body;

    private SdkGetItemInstListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SdkGetItemInstListResponse create() {
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
    public SdkGetItemInstListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SdkGetItemInstListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SdkGetItemInstListResponseBody body);

        @Override
        SdkGetItemInstListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SdkGetItemInstListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SdkGetItemInstListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SdkGetItemInstListResponse response) {
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
        public Builder body(SdkGetItemInstListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SdkGetItemInstListResponse build() {
            return new SdkGetItemInstListResponse(this);
        } 

    } 

}

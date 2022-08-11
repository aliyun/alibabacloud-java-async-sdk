// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtDynamicAddressHsfResponse} extends {@link TeaModel}
 *
 * <p>FtDynamicAddressHsfResponse</p>
 */
public class FtDynamicAddressHsfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FtDynamicAddressHsfResponseBody body;

    private FtDynamicAddressHsfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FtDynamicAddressHsfResponse create() {
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
    public FtDynamicAddressHsfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FtDynamicAddressHsfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FtDynamicAddressHsfResponseBody body);

        @Override
        FtDynamicAddressHsfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FtDynamicAddressHsfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FtDynamicAddressHsfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FtDynamicAddressHsfResponse response) {
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
        public Builder body(FtDynamicAddressHsfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FtDynamicAddressHsfResponse build() {
            return new FtDynamicAddressHsfResponse(this);
        } 

    } 

}

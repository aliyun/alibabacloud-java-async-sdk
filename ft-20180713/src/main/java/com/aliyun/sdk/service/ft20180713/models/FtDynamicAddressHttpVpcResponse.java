// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtDynamicAddressHttpVpcResponse} extends {@link TeaModel}
 *
 * <p>FtDynamicAddressHttpVpcResponse</p>
 */
public class FtDynamicAddressHttpVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FtDynamicAddressHttpVpcResponseBody body;

    private FtDynamicAddressHttpVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FtDynamicAddressHttpVpcResponse create() {
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
    public FtDynamicAddressHttpVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FtDynamicAddressHttpVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FtDynamicAddressHttpVpcResponseBody body);

        @Override
        FtDynamicAddressHttpVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FtDynamicAddressHttpVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FtDynamicAddressHttpVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FtDynamicAddressHttpVpcResponse response) {
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
        public Builder body(FtDynamicAddressHttpVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FtDynamicAddressHttpVpcResponse build() {
            return new FtDynamicAddressHttpVpcResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtDynamicAddressDubboResponse} extends {@link TeaModel}
 *
 * <p>FtDynamicAddressDubboResponse</p>
 */
public class FtDynamicAddressDubboResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FtDynamicAddressDubboResponseBody body;

    private FtDynamicAddressDubboResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FtDynamicAddressDubboResponse create() {
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
    public FtDynamicAddressDubboResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FtDynamicAddressDubboResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FtDynamicAddressDubboResponseBody body);

        @Override
        FtDynamicAddressDubboResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FtDynamicAddressDubboResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FtDynamicAddressDubboResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FtDynamicAddressDubboResponse response) {
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
        public Builder body(FtDynamicAddressDubboResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FtDynamicAddressDubboResponse build() {
            return new FtDynamicAddressDubboResponse(this);
        } 

    } 

}

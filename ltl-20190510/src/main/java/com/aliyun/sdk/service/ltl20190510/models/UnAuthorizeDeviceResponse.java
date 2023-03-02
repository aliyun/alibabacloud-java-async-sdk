// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnAuthorizeDeviceResponse} extends {@link TeaModel}
 *
 * <p>UnAuthorizeDeviceResponse</p>
 */
public class UnAuthorizeDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnAuthorizeDeviceResponseBody body;

    private UnAuthorizeDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnAuthorizeDeviceResponse create() {
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
    public UnAuthorizeDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnAuthorizeDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnAuthorizeDeviceResponseBody body);

        @Override
        UnAuthorizeDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnAuthorizeDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnAuthorizeDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnAuthorizeDeviceResponse response) {
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
        public Builder body(UnAuthorizeDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnAuthorizeDeviceResponse build() {
            return new UnAuthorizeDeviceResponse(this);
        } 

    } 

}

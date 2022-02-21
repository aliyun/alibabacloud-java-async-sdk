// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindEslDeviceResponse} extends {@link TeaModel}
 *
 * <p>UnbindEslDeviceResponse</p>
 */
public class UnbindEslDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindEslDeviceResponseBody body;

    private UnbindEslDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindEslDeviceResponse create() {
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
    public UnbindEslDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindEslDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindEslDeviceResponseBody body);

        @Override
        UnbindEslDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindEslDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindEslDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindEslDeviceResponse response) {
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
        public Builder body(UnbindEslDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindEslDeviceResponse build() {
            return new UnbindEslDeviceResponse(this);
        } 

    } 

}

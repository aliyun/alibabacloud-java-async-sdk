// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableVirtualMFAResponse} extends {@link TeaModel}
 *
 * <p>DisableVirtualMFAResponse</p>
 */
public class DisableVirtualMFAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableVirtualMFAResponseBody body;

    private DisableVirtualMFAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableVirtualMFAResponse create() {
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
    public DisableVirtualMFAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableVirtualMFAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableVirtualMFAResponseBody body);

        @Override
        DisableVirtualMFAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableVirtualMFAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableVirtualMFAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableVirtualMFAResponse response) {
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
        public Builder body(DisableVirtualMFAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableVirtualMFAResponse build() {
            return new DisableVirtualMFAResponse(this);
        } 

    } 

}

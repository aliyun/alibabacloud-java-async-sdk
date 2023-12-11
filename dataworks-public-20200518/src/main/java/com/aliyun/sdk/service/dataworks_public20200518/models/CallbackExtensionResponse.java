// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallbackExtensionResponse} extends {@link TeaModel}
 *
 * <p>CallbackExtensionResponse</p>
 */
public class CallbackExtensionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CallbackExtensionResponseBody body;

    private CallbackExtensionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CallbackExtensionResponse create() {
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
    public CallbackExtensionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CallbackExtensionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CallbackExtensionResponseBody body);

        @Override
        CallbackExtensionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CallbackExtensionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CallbackExtensionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CallbackExtensionResponse response) {
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
        public Builder body(CallbackExtensionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CallbackExtensionResponse build() {
            return new CallbackExtensionResponse(this);
        } 

    } 

}

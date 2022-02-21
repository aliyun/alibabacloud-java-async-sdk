// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAxnExtensionResponse} extends {@link TeaModel}
 *
 * <p>BindAxnExtensionResponse</p>
 */
public class BindAxnExtensionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindAxnExtensionResponseBody body;

    private BindAxnExtensionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindAxnExtensionResponse create() {
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
    public BindAxnExtensionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindAxnExtensionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindAxnExtensionResponseBody body);

        @Override
        BindAxnExtensionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindAxnExtensionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindAxnExtensionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindAxnExtensionResponse response) {
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
        public Builder body(BindAxnExtensionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindAxnExtensionResponse build() {
            return new BindAxnExtensionResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveChildAccountAuthResponse} extends {@link TeaModel}
 *
 * <p>RemoveChildAccountAuthResponse</p>
 */
public class RemoveChildAccountAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveChildAccountAuthResponseBody body;

    private RemoveChildAccountAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveChildAccountAuthResponse create() {
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
    public RemoveChildAccountAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveChildAccountAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveChildAccountAuthResponseBody body);

        @Override
        RemoveChildAccountAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveChildAccountAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveChildAccountAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveChildAccountAuthResponse response) {
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
        public Builder body(RemoveChildAccountAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveChildAccountAuthResponse build() {
            return new RemoveChildAccountAuthResponse(this);
        } 

    } 

}

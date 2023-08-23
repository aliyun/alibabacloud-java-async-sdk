// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChildAccountAuthResponse} extends {@link TeaModel}
 *
 * <p>ChildAccountAuthResponse</p>
 */
public class ChildAccountAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChildAccountAuthResponseBody body;

    private ChildAccountAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChildAccountAuthResponse create() {
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
    public ChildAccountAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChildAccountAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChildAccountAuthResponseBody body);

        @Override
        ChildAccountAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChildAccountAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChildAccountAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChildAccountAuthResponse response) {
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
        public Builder body(ChildAccountAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChildAccountAuthResponse build() {
            return new ChildAccountAuthResponse(this);
        } 

    } 

}

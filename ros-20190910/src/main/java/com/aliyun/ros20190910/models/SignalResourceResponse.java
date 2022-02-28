// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SignalResourceResponse} extends {@link TeaModel}
 *
 * <p>SignalResourceResponse</p>
 */
public class SignalResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SignalResourceResponseBody body;

    private SignalResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SignalResourceResponse create() {
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
    public SignalResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SignalResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SignalResourceResponseBody body);

        @Override
        SignalResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SignalResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SignalResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SignalResourceResponse response) {
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
        public Builder body(SignalResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SignalResourceResponse build() {
            return new SignalResourceResponse(this);
        } 

    } 

}

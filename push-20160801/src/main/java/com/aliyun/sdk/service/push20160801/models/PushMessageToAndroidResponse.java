// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMessageToAndroidResponse} extends {@link TeaModel}
 *
 * <p>PushMessageToAndroidResponse</p>
 */
public class PushMessageToAndroidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushMessageToAndroidResponseBody body;

    private PushMessageToAndroidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushMessageToAndroidResponse create() {
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
    public PushMessageToAndroidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushMessageToAndroidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushMessageToAndroidResponseBody body);

        @Override
        PushMessageToAndroidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushMessageToAndroidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushMessageToAndroidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushMessageToAndroidResponse response) {
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
        public Builder body(PushMessageToAndroidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushMessageToAndroidResponse build() {
            return new PushMessageToAndroidResponse(this);
        } 

    } 

}

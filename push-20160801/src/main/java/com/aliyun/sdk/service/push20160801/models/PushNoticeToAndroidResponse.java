// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushNoticeToAndroidResponse} extends {@link TeaModel}
 *
 * <p>PushNoticeToAndroidResponse</p>
 */
public class PushNoticeToAndroidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushNoticeToAndroidResponseBody body;

    private PushNoticeToAndroidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushNoticeToAndroidResponse create() {
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
    public PushNoticeToAndroidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushNoticeToAndroidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushNoticeToAndroidResponseBody body);

        @Override
        PushNoticeToAndroidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushNoticeToAndroidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushNoticeToAndroidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushNoticeToAndroidResponse response) {
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
        public Builder body(PushNoticeToAndroidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushNoticeToAndroidResponse build() {
            return new PushNoticeToAndroidResponse(this);
        } 

    } 

}

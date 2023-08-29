// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokePushMessageResponse} extends {@link TeaModel}
 *
 * <p>RevokePushMessageResponse</p>
 */
public class RevokePushMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokePushMessageResponseBody body;

    private RevokePushMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokePushMessageResponse create() {
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
    public RevokePushMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokePushMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokePushMessageResponseBody body);

        @Override
        RevokePushMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokePushMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokePushMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokePushMessageResponse response) {
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
        public Builder body(RevokePushMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokePushMessageResponse build() {
            return new RevokePushMessageResponse(this);
        } 

    } 

}

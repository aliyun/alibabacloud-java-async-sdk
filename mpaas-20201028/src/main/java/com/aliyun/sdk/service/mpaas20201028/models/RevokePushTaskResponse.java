// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokePushTaskResponse} extends {@link TeaModel}
 *
 * <p>RevokePushTaskResponse</p>
 */
public class RevokePushTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokePushTaskResponseBody body;

    private RevokePushTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokePushTaskResponse create() {
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
    public RevokePushTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokePushTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokePushTaskResponseBody body);

        @Override
        RevokePushTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokePushTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokePushTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokePushTaskResponse response) {
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
        public Builder body(RevokePushTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokePushTaskResponse build() {
            return new RevokePushTaskResponse(this);
        } 

    } 

}

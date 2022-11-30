// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceSafetyLockResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceSafetyLockResponse</p>
 */
public class UpdateServiceSafetyLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServiceSafetyLockResponseBody body;

    private UpdateServiceSafetyLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServiceSafetyLockResponse create() {
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
    public UpdateServiceSafetyLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceSafetyLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServiceSafetyLockResponseBody body);

        @Override
        UpdateServiceSafetyLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceSafetyLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServiceSafetyLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceSafetyLockResponse response) {
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
        public Builder body(UpdateServiceSafetyLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceSafetyLockResponse build() {
            return new UpdateServiceSafetyLockResponse(this);
        } 

    } 

}

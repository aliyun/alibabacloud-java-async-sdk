// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccessKeyResponse} extends {@link TeaModel}
 *
 * <p>UpdateAccessKeyResponse</p>
 */
public class UpdateAccessKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAccessKeyResponseBody body;

    private UpdateAccessKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAccessKeyResponse create() {
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
    public UpdateAccessKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAccessKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAccessKeyResponseBody body);

        @Override
        UpdateAccessKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAccessKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAccessKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAccessKeyResponse response) {
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
        public Builder body(UpdateAccessKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAccessKeyResponse build() {
            return new UpdateAccessKeyResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateZnodeResponse} extends {@link TeaModel}
 *
 * <p>UpdateZnodeResponse</p>
 */
public class UpdateZnodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateZnodeResponseBody body;

    private UpdateZnodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateZnodeResponse create() {
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
    public UpdateZnodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateZnodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateZnodeResponseBody body);

        @Override
        UpdateZnodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateZnodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateZnodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateZnodeResponse response) {
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
        public Builder body(UpdateZnodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateZnodeResponse build() {
            return new UpdateZnodeResponse(this);
        } 

    } 

}

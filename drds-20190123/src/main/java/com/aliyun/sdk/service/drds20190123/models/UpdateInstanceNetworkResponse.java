// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceNetworkResponse} extends {@link TeaModel}
 *
 * <p>UpdateInstanceNetworkResponse</p>
 */
public class UpdateInstanceNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateInstanceNetworkResponseBody body;

    private UpdateInstanceNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateInstanceNetworkResponse create() {
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
    public UpdateInstanceNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateInstanceNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateInstanceNetworkResponseBody body);

        @Override
        UpdateInstanceNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateInstanceNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateInstanceNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateInstanceNetworkResponse response) {
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
        public Builder body(UpdateInstanceNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateInstanceNetworkResponse build() {
            return new UpdateInstanceNetworkResponse(this);
        } 

    } 

}

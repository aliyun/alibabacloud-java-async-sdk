// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTransferCalleePoolConfigResponse} extends {@link TeaModel}
 *
 * <p>SetTransferCalleePoolConfigResponse</p>
 */
public class SetTransferCalleePoolConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetTransferCalleePoolConfigResponseBody body;

    private SetTransferCalleePoolConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetTransferCalleePoolConfigResponse create() {
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
    public SetTransferCalleePoolConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetTransferCalleePoolConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetTransferCalleePoolConfigResponseBody body);

        @Override
        SetTransferCalleePoolConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetTransferCalleePoolConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetTransferCalleePoolConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetTransferCalleePoolConfigResponse response) {
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
        public Builder body(SetTransferCalleePoolConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetTransferCalleePoolConfigResponse build() {
            return new SetTransferCalleePoolConfigResponse(this);
        } 

    } 

}

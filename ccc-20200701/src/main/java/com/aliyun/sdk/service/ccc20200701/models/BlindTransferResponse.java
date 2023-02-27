// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BlindTransferResponse} extends {@link TeaModel}
 *
 * <p>BlindTransferResponse</p>
 */
public class BlindTransferResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BlindTransferResponseBody body;

    private BlindTransferResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BlindTransferResponse create() {
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
    public BlindTransferResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BlindTransferResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BlindTransferResponseBody body);

        @Override
        BlindTransferResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BlindTransferResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BlindTransferResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BlindTransferResponse response) {
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
        public Builder body(BlindTransferResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BlindTransferResponse build() {
            return new BlindTransferResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVersionTransferResponse} extends {@link TeaModel}
 *
 * <p>CheckVersionTransferResponse</p>
 */
public class CheckVersionTransferResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckVersionTransferResponseBody body;

    private CheckVersionTransferResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckVersionTransferResponse create() {
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
    public CheckVersionTransferResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckVersionTransferResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckVersionTransferResponseBody body);

        @Override
        CheckVersionTransferResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckVersionTransferResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckVersionTransferResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckVersionTransferResponse response) {
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
        public Builder body(CheckVersionTransferResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckVersionTransferResponse build() {
            return new CheckVersionTransferResponse(this);
        } 

    } 

}

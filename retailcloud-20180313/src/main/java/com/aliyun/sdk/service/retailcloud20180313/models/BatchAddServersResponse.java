// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddServersResponse} extends {@link TeaModel}
 *
 * <p>BatchAddServersResponse</p>
 */
public class BatchAddServersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddServersResponseBody body;

    private BatchAddServersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddServersResponse create() {
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
    public BatchAddServersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddServersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddServersResponseBody body);

        @Override
        BatchAddServersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddServersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddServersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddServersResponse response) {
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
        public Builder body(BatchAddServersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddServersResponse build() {
            return new BatchAddServersResponse(this);
        } 

    } 

}

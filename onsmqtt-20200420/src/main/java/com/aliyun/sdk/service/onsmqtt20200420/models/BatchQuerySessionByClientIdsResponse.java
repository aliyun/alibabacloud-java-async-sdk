// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchQuerySessionByClientIdsResponse} extends {@link TeaModel}
 *
 * <p>BatchQuerySessionByClientIdsResponse</p>
 */
public class BatchQuerySessionByClientIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchQuerySessionByClientIdsResponseBody body;

    private BatchQuerySessionByClientIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchQuerySessionByClientIdsResponse create() {
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
    public BatchQuerySessionByClientIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchQuerySessionByClientIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchQuerySessionByClientIdsResponseBody body);

        @Override
        BatchQuerySessionByClientIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchQuerySessionByClientIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchQuerySessionByClientIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchQuerySessionByClientIdsResponse response) {
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
        public Builder body(BatchQuerySessionByClientIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchQuerySessionByClientIdsResponse build() {
            return new BatchQuerySessionByClientIdsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSendMessageToGlobeResponse} extends {@link TeaModel}
 *
 * <p>BatchSendMessageToGlobeResponse</p>
 */
public class BatchSendMessageToGlobeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchSendMessageToGlobeResponseBody body;

    private BatchSendMessageToGlobeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchSendMessageToGlobeResponse create() {
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
    public BatchSendMessageToGlobeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchSendMessageToGlobeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchSendMessageToGlobeResponseBody body);

        @Override
        BatchSendMessageToGlobeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchSendMessageToGlobeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchSendMessageToGlobeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchSendMessageToGlobeResponse response) {
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
        public Builder body(BatchSendMessageToGlobeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchSendMessageToGlobeResponse build() {
            return new BatchSendMessageToGlobeResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddDataForApiSourceResponse} extends {@link TeaModel}
 *
 * <p>BatchAddDataForApiSourceResponse</p>
 */
public class BatchAddDataForApiSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddDataForApiSourceResponseBody body;

    private BatchAddDataForApiSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddDataForApiSourceResponse create() {
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
    public BatchAddDataForApiSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddDataForApiSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddDataForApiSourceResponseBody body);

        @Override
        BatchAddDataForApiSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddDataForApiSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddDataForApiSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddDataForApiSourceResponse response) {
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
        public Builder body(BatchAddDataForApiSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddDataForApiSourceResponse build() {
            return new BatchAddDataForApiSourceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForTransferProhibitionLockResponse} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForTransferProhibitionLockResponse</p>
 */
public class SaveBatchTaskForTransferProhibitionLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveBatchTaskForTransferProhibitionLockResponseBody body;

    private SaveBatchTaskForTransferProhibitionLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveBatchTaskForTransferProhibitionLockResponse create() {
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
    public SaveBatchTaskForTransferProhibitionLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBatchTaskForTransferProhibitionLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveBatchTaskForTransferProhibitionLockResponseBody body);

        @Override
        SaveBatchTaskForTransferProhibitionLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBatchTaskForTransferProhibitionLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveBatchTaskForTransferProhibitionLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBatchTaskForTransferProhibitionLockResponse response) {
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
        public Builder body(SaveBatchTaskForTransferProhibitionLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBatchTaskForTransferProhibitionLockResponse build() {
            return new SaveBatchTaskForTransferProhibitionLockResponse(this);
        } 

    } 

}

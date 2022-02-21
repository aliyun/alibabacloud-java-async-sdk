// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForTransferProhibitionLockResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForTransferProhibitionLockResponse</p>
 */
public class SaveSingleTaskForTransferProhibitionLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSingleTaskForTransferProhibitionLockResponseBody body;

    private SaveSingleTaskForTransferProhibitionLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSingleTaskForTransferProhibitionLockResponse create() {
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
    public SaveSingleTaskForTransferProhibitionLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForTransferProhibitionLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSingleTaskForTransferProhibitionLockResponseBody body);

        @Override
        SaveSingleTaskForTransferProhibitionLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForTransferProhibitionLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSingleTaskForTransferProhibitionLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForTransferProhibitionLockResponse response) {
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
        public Builder body(SaveSingleTaskForTransferProhibitionLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForTransferProhibitionLockResponse build() {
            return new SaveSingleTaskForTransferProhibitionLockResponse(this);
        } 

    } 

}

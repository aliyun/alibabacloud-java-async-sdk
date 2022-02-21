// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForCancelingTransferOutResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForCancelingTransferOutResponse</p>
 */
public class SaveSingleTaskForCancelingTransferOutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSingleTaskForCancelingTransferOutResponseBody body;

    private SaveSingleTaskForCancelingTransferOutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSingleTaskForCancelingTransferOutResponse create() {
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
    public SaveSingleTaskForCancelingTransferOutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForCancelingTransferOutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSingleTaskForCancelingTransferOutResponseBody body);

        @Override
        SaveSingleTaskForCancelingTransferOutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForCancelingTransferOutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSingleTaskForCancelingTransferOutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForCancelingTransferOutResponse response) {
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
        public Builder body(SaveSingleTaskForCancelingTransferOutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForCancelingTransferOutResponse build() {
            return new SaveSingleTaskForCancelingTransferOutResponse(this);
        } 

    } 

}

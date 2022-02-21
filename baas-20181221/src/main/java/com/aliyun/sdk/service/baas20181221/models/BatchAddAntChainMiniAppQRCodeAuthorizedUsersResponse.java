// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse} extends {@link TeaModel}
 *
 * <p>BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse</p>
 */
public class BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody body;

    private BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse create() {
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
    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody body);

        @Override
        BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse response) {
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
        public Builder body(BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse build() {
            return new BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse(this);
        } 

    } 

}

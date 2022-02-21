// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForQueryingTransferAuthorizationCodeResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForQueryingTransferAuthorizationCodeResponse</p>
 */
public class SaveSingleTaskForQueryingTransferAuthorizationCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody body;

    private SaveSingleTaskForQueryingTransferAuthorizationCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSingleTaskForQueryingTransferAuthorizationCodeResponse create() {
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
    public SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForQueryingTransferAuthorizationCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody body);

        @Override
        SaveSingleTaskForQueryingTransferAuthorizationCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForQueryingTransferAuthorizationCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForQueryingTransferAuthorizationCodeResponse response) {
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
        public Builder body(SaveSingleTaskForQueryingTransferAuthorizationCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForQueryingTransferAuthorizationCodeResponse build() {
            return new SaveSingleTaskForQueryingTransferAuthorizationCodeResponse(this);
        } 

    } 

}

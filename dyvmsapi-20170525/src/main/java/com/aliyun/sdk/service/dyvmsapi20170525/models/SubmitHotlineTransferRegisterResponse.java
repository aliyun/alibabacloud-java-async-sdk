// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotlineTransferRegisterResponse} extends {@link TeaModel}
 *
 * <p>SubmitHotlineTransferRegisterResponse</p>
 */
public class SubmitHotlineTransferRegisterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitHotlineTransferRegisterResponseBody body;

    private SubmitHotlineTransferRegisterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitHotlineTransferRegisterResponse create() {
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
    public SubmitHotlineTransferRegisterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitHotlineTransferRegisterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitHotlineTransferRegisterResponseBody body);

        @Override
        SubmitHotlineTransferRegisterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitHotlineTransferRegisterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitHotlineTransferRegisterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitHotlineTransferRegisterResponse response) {
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
        public Builder body(SubmitHotlineTransferRegisterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitHotlineTransferRegisterResponse build() {
            return new SubmitHotlineTransferRegisterResponse(this);
        } 

    } 

}

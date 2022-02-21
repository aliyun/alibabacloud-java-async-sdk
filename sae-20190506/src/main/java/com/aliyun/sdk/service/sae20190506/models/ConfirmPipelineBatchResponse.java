// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmPipelineBatchResponse} extends {@link TeaModel}
 *
 * <p>ConfirmPipelineBatchResponse</p>
 */
public class ConfirmPipelineBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmPipelineBatchResponseBody body;

    private ConfirmPipelineBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfirmPipelineBatchResponse create() {
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
    public ConfirmPipelineBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmPipelineBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfirmPipelineBatchResponseBody body);

        @Override
        ConfirmPipelineBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmPipelineBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfirmPipelineBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmPipelineBatchResponse response) {
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
        public Builder body(ConfirmPipelineBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmPipelineBatchResponse build() {
            return new ConfirmPipelineBatchResponse(this);
        } 

    } 

}

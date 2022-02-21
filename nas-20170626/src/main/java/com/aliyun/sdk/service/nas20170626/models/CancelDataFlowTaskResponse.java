// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDataFlowTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelDataFlowTaskResponse</p>
 */
public class CancelDataFlowTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelDataFlowTaskResponseBody body;

    private CancelDataFlowTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelDataFlowTaskResponse create() {
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
    public CancelDataFlowTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelDataFlowTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelDataFlowTaskResponseBody body);

        @Override
        CancelDataFlowTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelDataFlowTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelDataFlowTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelDataFlowTaskResponse response) {
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
        public Builder body(CancelDataFlowTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelDataFlowTaskResponse build() {
            return new CancelDataFlowTaskResponse(this);
        } 

    } 

}

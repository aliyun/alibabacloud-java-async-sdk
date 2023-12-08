// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelExecutionResponse} extends {@link TeaModel}
 *
 * <p>CancelExecutionResponse</p>
 */
public class CancelExecutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelExecutionResponseBody body;

    private CancelExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelExecutionResponse create() {
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
    public CancelExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelExecutionResponseBody body);

        @Override
        CancelExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelExecutionResponse response) {
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
        public Builder body(CancelExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelExecutionResponse build() {
            return new CancelExecutionResponse(this);
        } 

    } 

}

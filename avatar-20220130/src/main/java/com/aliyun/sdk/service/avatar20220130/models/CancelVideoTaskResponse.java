// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelVideoTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelVideoTaskResponse</p>
 */
public class CancelVideoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelVideoTaskResponseBody body;

    private CancelVideoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelVideoTaskResponse create() {
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
    public CancelVideoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelVideoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelVideoTaskResponseBody body);

        @Override
        CancelVideoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelVideoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelVideoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelVideoTaskResponse response) {
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
        public Builder body(CancelVideoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelVideoTaskResponse build() {
            return new CancelVideoTaskResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UndoVerifyTaskResponse} extends {@link TeaModel}
 *
 * <p>UndoVerifyTaskResponse</p>
 */
public class UndoVerifyTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UndoVerifyTaskResponseBody body;

    private UndoVerifyTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UndoVerifyTaskResponse create() {
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
    public UndoVerifyTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UndoVerifyTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UndoVerifyTaskResponseBody body);

        @Override
        UndoVerifyTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UndoVerifyTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UndoVerifyTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UndoVerifyTaskResponse response) {
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
        public Builder body(UndoVerifyTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UndoVerifyTaskResponse build() {
            return new UndoVerifyTaskResponse(this);
        } 

    } 

}

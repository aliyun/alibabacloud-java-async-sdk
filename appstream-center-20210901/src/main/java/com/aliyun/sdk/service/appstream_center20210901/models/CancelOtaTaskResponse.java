// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOtaTaskResponse} extends {@link TeaModel}
 *
 * <p>CancelOtaTaskResponse</p>
 */
public class CancelOtaTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelOtaTaskResponseBody body;

    private CancelOtaTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelOtaTaskResponse create() {
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
    public CancelOtaTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelOtaTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelOtaTaskResponseBody body);

        @Override
        CancelOtaTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelOtaTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelOtaTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelOtaTaskResponse response) {
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
        public Builder body(CancelOtaTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelOtaTaskResponse build() {
            return new CancelOtaTaskResponse(this);
        } 

    } 

}

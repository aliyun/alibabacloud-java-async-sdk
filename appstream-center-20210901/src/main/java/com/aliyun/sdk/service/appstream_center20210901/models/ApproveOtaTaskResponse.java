// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveOtaTaskResponse} extends {@link TeaModel}
 *
 * <p>ApproveOtaTaskResponse</p>
 */
public class ApproveOtaTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApproveOtaTaskResponseBody body;

    private ApproveOtaTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApproveOtaTaskResponse create() {
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
    public ApproveOtaTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApproveOtaTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApproveOtaTaskResponseBody body);

        @Override
        ApproveOtaTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApproveOtaTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApproveOtaTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApproveOtaTaskResponse response) {
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
        public Builder body(ApproveOtaTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApproveOtaTaskResponse build() {
            return new ApproveOtaTaskResponse(this);
        } 

    } 

}

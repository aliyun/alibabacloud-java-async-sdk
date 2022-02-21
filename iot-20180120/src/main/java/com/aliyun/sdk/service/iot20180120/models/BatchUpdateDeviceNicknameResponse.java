// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateDeviceNicknameResponse} extends {@link TeaModel}
 *
 * <p>BatchUpdateDeviceNicknameResponse</p>
 */
public class BatchUpdateDeviceNicknameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUpdateDeviceNicknameResponseBody body;

    private BatchUpdateDeviceNicknameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUpdateDeviceNicknameResponse create() {
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
    public BatchUpdateDeviceNicknameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUpdateDeviceNicknameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUpdateDeviceNicknameResponseBody body);

        @Override
        BatchUpdateDeviceNicknameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUpdateDeviceNicknameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUpdateDeviceNicknameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUpdateDeviceNicknameResponse response) {
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
        public Builder body(BatchUpdateDeviceNicknameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUpdateDeviceNicknameResponse build() {
            return new BatchUpdateDeviceNicknameResponse(this);
        } 

    } 

}

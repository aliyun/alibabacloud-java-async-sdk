// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMPUTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateMPUTaskResponse</p>
 */
public class UpdateMPUTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMPUTaskResponseBody body;

    private UpdateMPUTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMPUTaskResponse create() {
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
    public UpdateMPUTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMPUTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMPUTaskResponseBody body);

        @Override
        UpdateMPUTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMPUTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMPUTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMPUTaskResponse response) {
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
        public Builder body(UpdateMPUTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMPUTaskResponse build() {
            return new UpdateMPUTaskResponse(this);
        } 

    } 

}

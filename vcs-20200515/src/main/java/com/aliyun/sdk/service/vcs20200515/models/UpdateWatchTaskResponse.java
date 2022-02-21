// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWatchTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateWatchTaskResponse</p>
 */
public class UpdateWatchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWatchTaskResponseBody body;

    private UpdateWatchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWatchTaskResponse create() {
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
    public UpdateWatchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWatchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWatchTaskResponseBody body);

        @Override
        UpdateWatchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWatchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWatchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWatchTaskResponse response) {
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
        public Builder body(UpdateWatchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWatchTaskResponse build() {
            return new UpdateWatchTaskResponse(this);
        } 

    } 

}

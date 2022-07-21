// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTensorboardResponse} extends {@link TeaModel}
 *
 * <p>StartTensorboardResponse</p>
 */
public class StartTensorboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartTensorboardResponseBody body;

    private StartTensorboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartTensorboardResponse create() {
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
    public StartTensorboardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartTensorboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartTensorboardResponseBody body);

        @Override
        StartTensorboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartTensorboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartTensorboardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartTensorboardResponse response) {
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
        public Builder body(StartTensorboardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartTensorboardResponse build() {
            return new StartTensorboardResponse(this);
        } 

    } 

}

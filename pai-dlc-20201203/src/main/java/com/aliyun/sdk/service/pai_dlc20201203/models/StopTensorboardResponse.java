// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTensorboardResponse} extends {@link TeaModel}
 *
 * <p>StopTensorboardResponse</p>
 */
public class StopTensorboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopTensorboardResponseBody body;

    private StopTensorboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopTensorboardResponse create() {
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
    public StopTensorboardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopTensorboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopTensorboardResponseBody body);

        @Override
        StopTensorboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopTensorboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopTensorboardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopTensorboardResponse response) {
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
        public Builder body(StopTensorboardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopTensorboardResponse build() {
            return new StopTensorboardResponse(this);
        } 

    } 

}

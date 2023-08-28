// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTaskResponse} extends {@link TeaModel}
 *
 * <p>StopTaskResponse</p>
 */
public class StopTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopTaskResponseBody body;

    private StopTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopTaskResponse create() {
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
    public StopTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopTaskResponseBody body);

        @Override
        StopTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopTaskResponse response) {
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
        public Builder body(StopTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopTaskResponse build() {
            return new StopTaskResponse(this);
        } 

    } 

}

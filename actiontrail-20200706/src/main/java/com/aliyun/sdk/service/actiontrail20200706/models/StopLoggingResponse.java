// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLoggingResponse} extends {@link TeaModel}
 *
 * <p>StopLoggingResponse</p>
 */
public class StopLoggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopLoggingResponseBody body;

    private StopLoggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopLoggingResponse create() {
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
    public StopLoggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopLoggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopLoggingResponseBody body);

        @Override
        StopLoggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopLoggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopLoggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopLoggingResponse response) {
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
        public Builder body(StopLoggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopLoggingResponse build() {
            return new StopLoggingResponse(this);
        } 

    } 

}

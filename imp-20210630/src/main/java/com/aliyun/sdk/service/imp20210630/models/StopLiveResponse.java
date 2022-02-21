// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLiveResponse} extends {@link TeaModel}
 *
 * <p>StopLiveResponse</p>
 */
public class StopLiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopLiveResponseBody body;

    private StopLiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopLiveResponse create() {
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
    public StopLiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopLiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopLiveResponseBody body);

        @Override
        StopLiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopLiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopLiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopLiveResponse response) {
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
        public Builder body(StopLiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopLiveResponse build() {
            return new StopLiveResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLiveIndexResponse} extends {@link TeaModel}
 *
 * <p>StopLiveIndexResponse</p>
 */
public class StopLiveIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopLiveIndexResponseBody body;

    private StopLiveIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopLiveIndexResponse create() {
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
    public StopLiveIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopLiveIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopLiveIndexResponseBody body);

        @Override
        StopLiveIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopLiveIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopLiveIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopLiveIndexResponse response) {
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
        public Builder body(StopLiveIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopLiveIndexResponse build() {
            return new StopLiveIndexResponse(this);
        } 

    } 

}

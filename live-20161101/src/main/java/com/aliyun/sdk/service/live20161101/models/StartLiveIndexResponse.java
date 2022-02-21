// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLiveIndexResponse} extends {@link TeaModel}
 *
 * <p>StartLiveIndexResponse</p>
 */
public class StartLiveIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartLiveIndexResponseBody body;

    private StartLiveIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartLiveIndexResponse create() {
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
    public StartLiveIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartLiveIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartLiveIndexResponseBody body);

        @Override
        StartLiveIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartLiveIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartLiveIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartLiveIndexResponse response) {
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
        public Builder body(StartLiveIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartLiveIndexResponse build() {
            return new StartLiveIndexResponse(this);
        } 

    } 

}

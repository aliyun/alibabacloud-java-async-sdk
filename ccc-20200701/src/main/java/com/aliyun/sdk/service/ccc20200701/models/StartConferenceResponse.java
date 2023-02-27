// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConferenceResponse} extends {@link TeaModel}
 *
 * <p>StartConferenceResponse</p>
 */
public class StartConferenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartConferenceResponseBody body;

    private StartConferenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartConferenceResponse create() {
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
    public StartConferenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartConferenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartConferenceResponseBody body);

        @Override
        StartConferenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartConferenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartConferenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartConferenceResponse response) {
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
        public Builder body(StartConferenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartConferenceResponse build() {
            return new StartConferenceResponse(this);
        } 

    } 

}

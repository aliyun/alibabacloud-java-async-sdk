// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConfigurationRecorderResponse} extends {@link TeaModel}
 *
 * <p>StartConfigurationRecorderResponse</p>
 */
public class StartConfigurationRecorderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartConfigurationRecorderResponseBody body;

    private StartConfigurationRecorderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartConfigurationRecorderResponse create() {
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
    public StartConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartConfigurationRecorderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartConfigurationRecorderResponseBody body);

        @Override
        StartConfigurationRecorderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartConfigurationRecorderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartConfigurationRecorderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartConfigurationRecorderResponse response) {
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
        public Builder body(StartConfigurationRecorderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartConfigurationRecorderResponse build() {
            return new StartConfigurationRecorderResponse(this);
        } 

    } 

}

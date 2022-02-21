// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutConfigurationRecorderResponse} extends {@link TeaModel}
 *
 * <p>PutConfigurationRecorderResponse</p>
 */
public class PutConfigurationRecorderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutConfigurationRecorderResponseBody body;

    private PutConfigurationRecorderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutConfigurationRecorderResponse create() {
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
    public PutConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutConfigurationRecorderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutConfigurationRecorderResponseBody body);

        @Override
        PutConfigurationRecorderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutConfigurationRecorderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutConfigurationRecorderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutConfigurationRecorderResponse response) {
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
        public Builder body(PutConfigurationRecorderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutConfigurationRecorderResponse build() {
            return new PutConfigurationRecorderResponse(this);
        } 

    } 

}

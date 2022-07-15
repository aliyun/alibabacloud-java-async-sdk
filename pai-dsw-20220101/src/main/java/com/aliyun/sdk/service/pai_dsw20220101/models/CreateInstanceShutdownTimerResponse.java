// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceShutdownTimerResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceShutdownTimerResponse</p>
 */
public class CreateInstanceShutdownTimerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceShutdownTimerResponseBody body;

    private CreateInstanceShutdownTimerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceShutdownTimerResponse create() {
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
    public CreateInstanceShutdownTimerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceShutdownTimerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceShutdownTimerResponseBody body);

        @Override
        CreateInstanceShutdownTimerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceShutdownTimerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceShutdownTimerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceShutdownTimerResponse response) {
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
        public Builder body(CreateInstanceShutdownTimerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceShutdownTimerResponse build() {
            return new CreateInstanceShutdownTimerResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceShutdownTimerResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceShutdownTimerResponse</p>
 */
public class GetInstanceShutdownTimerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceShutdownTimerResponseBody body;

    private GetInstanceShutdownTimerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceShutdownTimerResponse create() {
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
    public GetInstanceShutdownTimerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceShutdownTimerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceShutdownTimerResponseBody body);

        @Override
        GetInstanceShutdownTimerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceShutdownTimerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceShutdownTimerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceShutdownTimerResponse response) {
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
        public Builder body(GetInstanceShutdownTimerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceShutdownTimerResponse build() {
            return new GetInstanceShutdownTimerResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCpuResponse} extends {@link TeaModel}
 *
 * <p>StartCpuResponse</p>
 */
public class StartCpuResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartCpuResponseBody body;

    private StartCpuResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartCpuResponse create() {
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
    public StartCpuResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartCpuResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartCpuResponseBody body);

        @Override
        StartCpuResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartCpuResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartCpuResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartCpuResponse response) {
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
        public Builder body(StartCpuResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartCpuResponse build() {
            return new StartCpuResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDtsJobResponse} extends {@link TeaModel}
 *
 * <p>StartDtsJobResponse</p>
 */
public class StartDtsJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDtsJobResponseBody body;

    private StartDtsJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDtsJobResponse create() {
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
    public StartDtsJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDtsJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDtsJobResponseBody body);

        @Override
        StartDtsJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDtsJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDtsJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDtsJobResponse response) {
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
        public Builder body(StartDtsJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDtsJobResponse build() {
            return new StartDtsJobResponse(this);
        } 

    } 

}

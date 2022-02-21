// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartModelServiceResponse} extends {@link TeaModel}
 *
 * <p>StartModelServiceResponse</p>
 */
public class StartModelServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartModelServiceResponseBody body;

    private StartModelServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartModelServiceResponse create() {
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
    public StartModelServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartModelServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartModelServiceResponseBody body);

        @Override
        StartModelServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartModelServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartModelServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartModelServiceResponse response) {
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
        public Builder body(StartModelServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartModelServiceResponse build() {
            return new StartModelServiceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartHotlineServiceResponse} extends {@link TeaModel}
 *
 * <p>StartHotlineServiceResponse</p>
 */
public class StartHotlineServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartHotlineServiceResponseBody body;

    private StartHotlineServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartHotlineServiceResponse create() {
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
    public StartHotlineServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartHotlineServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartHotlineServiceResponseBody body);

        @Override
        StartHotlineServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartHotlineServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartHotlineServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartHotlineServiceResponse response) {
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
        public Builder body(StartHotlineServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartHotlineServiceResponse build() {
            return new StartHotlineServiceResponse(this);
        } 

    } 

}

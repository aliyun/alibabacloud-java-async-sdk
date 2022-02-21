// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopModelServiceResponse} extends {@link TeaModel}
 *
 * <p>StopModelServiceResponse</p>
 */
public class StopModelServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopModelServiceResponseBody body;

    private StopModelServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopModelServiceResponse create() {
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
    public StopModelServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopModelServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopModelServiceResponseBody body);

        @Override
        StopModelServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopModelServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopModelServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopModelServiceResponse response) {
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
        public Builder body(StopModelServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopModelServiceResponse build() {
            return new StopModelServiceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseServiceResponse} extends {@link TeaModel}
 *
 * <p>ReleaseServiceResponse</p>
 */
public class ReleaseServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseServiceResponseBody body;

    private ReleaseServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseServiceResponse create() {
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
    public ReleaseServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseServiceResponseBody body);

        @Override
        ReleaseServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseServiceResponse response) {
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
        public Builder body(ReleaseServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseServiceResponse build() {
            return new ReleaseServiceResponse(this);
        } 

    } 

}

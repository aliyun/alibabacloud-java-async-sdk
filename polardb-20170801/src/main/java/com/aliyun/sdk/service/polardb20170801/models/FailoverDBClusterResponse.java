// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FailoverDBClusterResponse} extends {@link TeaModel}
 *
 * <p>FailoverDBClusterResponse</p>
 */
public class FailoverDBClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FailoverDBClusterResponseBody body;

    private FailoverDBClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FailoverDBClusterResponse create() {
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
    public FailoverDBClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FailoverDBClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FailoverDBClusterResponseBody body);

        @Override
        FailoverDBClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FailoverDBClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FailoverDBClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FailoverDBClusterResponse response) {
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
        public Builder body(FailoverDBClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FailoverDBClusterResponse build() {
            return new FailoverDBClusterResponse(this);
        } 

    } 

}

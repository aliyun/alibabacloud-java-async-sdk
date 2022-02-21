// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebalanceInstancesResponse} extends {@link TeaModel}
 *
 * <p>RebalanceInstancesResponse</p>
 */
public class RebalanceInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebalanceInstancesResponseBody body;

    private RebalanceInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebalanceInstancesResponse create() {
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
    public RebalanceInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebalanceInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebalanceInstancesResponseBody body);

        @Override
        RebalanceInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebalanceInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebalanceInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebalanceInstancesResponse response) {
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
        public Builder body(RebalanceInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebalanceInstancesResponse build() {
            return new RebalanceInstancesResponse(this);
        } 

    } 

}

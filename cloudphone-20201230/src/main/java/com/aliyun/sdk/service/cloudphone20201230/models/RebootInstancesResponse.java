// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstancesResponse} extends {@link TeaModel}
 *
 * <p>RebootInstancesResponse</p>
 */
public class RebootInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebootInstancesResponseBody body;

    private RebootInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebootInstancesResponse create() {
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
    public RebootInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebootInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebootInstancesResponseBody body);

        @Override
        RebootInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebootInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebootInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebootInstancesResponse response) {
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
        public Builder body(RebootInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebootInstancesResponse build() {
            return new RebootInstancesResponse(this);
        } 

    } 

}

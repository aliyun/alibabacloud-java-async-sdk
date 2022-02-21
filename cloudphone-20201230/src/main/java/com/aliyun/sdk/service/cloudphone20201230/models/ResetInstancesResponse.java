// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetInstancesResponse} extends {@link TeaModel}
 *
 * <p>ResetInstancesResponse</p>
 */
public class ResetInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetInstancesResponseBody body;

    private ResetInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetInstancesResponse create() {
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
    public ResetInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetInstancesResponseBody body);

        @Override
        ResetInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetInstancesResponse response) {
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
        public Builder body(ResetInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetInstancesResponse build() {
            return new ResetInstancesResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstancesResponse} extends {@link TeaModel}
 *
 * <p>StopInstancesResponse</p>
 */
public class StopInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopInstancesResponseBody body;

    private StopInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopInstancesResponse create() {
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
    public StopInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopInstancesResponseBody body);

        @Override
        StopInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopInstancesResponse response) {
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
        public Builder body(StopInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopInstancesResponse build() {
            return new StopInstancesResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopStatefulAsyncInvocationResponse} extends {@link TeaModel}
 *
 * <p>StopStatefulAsyncInvocationResponse</p>
 */
public class StopStatefulAsyncInvocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private StopStatefulAsyncInvocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static StopStatefulAsyncInvocationResponse create() {
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

    public interface Builder extends Response.Builder<StopStatefulAsyncInvocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        StopStatefulAsyncInvocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopStatefulAsyncInvocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopStatefulAsyncInvocationResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public StopStatefulAsyncInvocationResponse build() {
            return new StopStatefulAsyncInvocationResponse(this);
        } 

    } 

}

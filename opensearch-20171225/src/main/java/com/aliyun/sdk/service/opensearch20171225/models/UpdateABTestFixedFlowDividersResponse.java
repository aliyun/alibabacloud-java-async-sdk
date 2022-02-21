// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestFixedFlowDividersResponse} extends {@link TeaModel}
 *
 * <p>UpdateABTestFixedFlowDividersResponse</p>
 */
public class UpdateABTestFixedFlowDividersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateABTestFixedFlowDividersResponseBody body;

    private UpdateABTestFixedFlowDividersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateABTestFixedFlowDividersResponse create() {
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
    public UpdateABTestFixedFlowDividersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateABTestFixedFlowDividersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateABTestFixedFlowDividersResponseBody body);

        @Override
        UpdateABTestFixedFlowDividersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateABTestFixedFlowDividersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateABTestFixedFlowDividersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateABTestFixedFlowDividersResponse response) {
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
        public Builder body(UpdateABTestFixedFlowDividersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateABTestFixedFlowDividersResponse build() {
            return new UpdateABTestFixedFlowDividersResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTaskFlowInstanceResponse} extends {@link TeaModel}
 *
 * <p>StopTaskFlowInstanceResponse</p>
 */
public class StopTaskFlowInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopTaskFlowInstanceResponseBody body;

    private StopTaskFlowInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopTaskFlowInstanceResponse create() {
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
    public StopTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopTaskFlowInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopTaskFlowInstanceResponseBody body);

        @Override
        StopTaskFlowInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopTaskFlowInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopTaskFlowInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopTaskFlowInstanceResponse response) {
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
        public Builder body(StopTaskFlowInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopTaskFlowInstanceResponse build() {
            return new StopTaskFlowInstanceResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReRunTaskFlowInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReRunTaskFlowInstanceResponse</p>
 */
public class ReRunTaskFlowInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReRunTaskFlowInstanceResponseBody body;

    private ReRunTaskFlowInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReRunTaskFlowInstanceResponse create() {
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
    public ReRunTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReRunTaskFlowInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReRunTaskFlowInstanceResponseBody body);

        @Override
        ReRunTaskFlowInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReRunTaskFlowInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReRunTaskFlowInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReRunTaskFlowInstanceResponse response) {
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
        public Builder body(ReRunTaskFlowInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReRunTaskFlowInstanceResponse build() {
            return new ReRunTaskFlowInstanceResponse(this);
        } 

    } 

}

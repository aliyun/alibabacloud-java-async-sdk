// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeTaskFlowInstanceResponse} extends {@link TeaModel}
 *
 * <p>ResumeTaskFlowInstanceResponse</p>
 */
public class ResumeTaskFlowInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeTaskFlowInstanceResponseBody body;

    private ResumeTaskFlowInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeTaskFlowInstanceResponse create() {
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
    public ResumeTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeTaskFlowInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeTaskFlowInstanceResponseBody body);

        @Override
        ResumeTaskFlowInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeTaskFlowInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeTaskFlowInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeTaskFlowInstanceResponse response) {
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
        public Builder body(ResumeTaskFlowInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeTaskFlowInstanceResponse build() {
            return new ResumeTaskFlowInstanceResponse(this);
        } 

    } 

}

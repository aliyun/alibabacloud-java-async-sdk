// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MakeTaskFlowInstanceSuccessResponse} extends {@link TeaModel}
 *
 * <p>MakeTaskFlowInstanceSuccessResponse</p>
 */
public class MakeTaskFlowInstanceSuccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MakeTaskFlowInstanceSuccessResponseBody body;

    private MakeTaskFlowInstanceSuccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MakeTaskFlowInstanceSuccessResponse create() {
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
    public MakeTaskFlowInstanceSuccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MakeTaskFlowInstanceSuccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MakeTaskFlowInstanceSuccessResponseBody body);

        @Override
        MakeTaskFlowInstanceSuccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MakeTaskFlowInstanceSuccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MakeTaskFlowInstanceSuccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MakeTaskFlowInstanceSuccessResponse response) {
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
        public Builder body(MakeTaskFlowInstanceSuccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MakeTaskFlowInstanceSuccessResponse build() {
            return new MakeTaskFlowInstanceSuccessResponse(this);
        } 

    } 

}

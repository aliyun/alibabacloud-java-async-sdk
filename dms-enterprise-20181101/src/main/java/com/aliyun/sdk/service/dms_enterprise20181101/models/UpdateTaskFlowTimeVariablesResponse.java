// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowTimeVariablesResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskFlowTimeVariablesResponse</p>
 */
public class UpdateTaskFlowTimeVariablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskFlowTimeVariablesResponseBody body;

    private UpdateTaskFlowTimeVariablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskFlowTimeVariablesResponse create() {
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
    public UpdateTaskFlowTimeVariablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskFlowTimeVariablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskFlowTimeVariablesResponseBody body);

        @Override
        UpdateTaskFlowTimeVariablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskFlowTimeVariablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskFlowTimeVariablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskFlowTimeVariablesResponse response) {
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
        public Builder body(UpdateTaskFlowTimeVariablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskFlowTimeVariablesResponse build() {
            return new UpdateTaskFlowTimeVariablesResponse(this);
        } 

    } 

}

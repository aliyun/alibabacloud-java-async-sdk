// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipVMDeployMachineResponse} extends {@link TeaModel}
 *
 * <p>SkipVMDeployMachineResponse</p>
 */
public class SkipVMDeployMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SkipVMDeployMachineResponseBody body;

    private SkipVMDeployMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SkipVMDeployMachineResponse create() {
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
    public SkipVMDeployMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SkipVMDeployMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SkipVMDeployMachineResponseBody body);

        @Override
        SkipVMDeployMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SkipVMDeployMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SkipVMDeployMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SkipVMDeployMachineResponse response) {
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
        public Builder body(SkipVMDeployMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SkipVMDeployMachineResponse build() {
            return new SkipVMDeployMachineResponse(this);
        } 

    } 

}

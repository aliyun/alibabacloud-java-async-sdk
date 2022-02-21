// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogVMDeployMachineResponse} extends {@link TeaModel}
 *
 * <p>LogVMDeployMachineResponse</p>
 */
public class LogVMDeployMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LogVMDeployMachineResponseBody body;

    private LogVMDeployMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LogVMDeployMachineResponse create() {
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
    public LogVMDeployMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LogVMDeployMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LogVMDeployMachineResponseBody body);

        @Override
        LogVMDeployMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LogVMDeployMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LogVMDeployMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LogVMDeployMachineResponse response) {
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
        public Builder body(LogVMDeployMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LogVMDeployMachineResponse build() {
            return new LogVMDeployMachineResponse(this);
        } 

    } 

}

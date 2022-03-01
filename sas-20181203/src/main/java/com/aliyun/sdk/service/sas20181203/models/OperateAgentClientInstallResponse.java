// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateAgentClientInstallResponse} extends {@link TeaModel}
 *
 * <p>OperateAgentClientInstallResponse</p>
 */
public class OperateAgentClientInstallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateAgentClientInstallResponseBody body;

    private OperateAgentClientInstallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateAgentClientInstallResponse create() {
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
    public OperateAgentClientInstallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateAgentClientInstallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateAgentClientInstallResponseBody body);

        @Override
        OperateAgentClientInstallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateAgentClientInstallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateAgentClientInstallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateAgentClientInstallResponse response) {
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
        public Builder body(OperateAgentClientInstallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateAgentClientInstallResponse build() {
            return new OperateAgentClientInstallResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RepairClusterNodePoolResponse} extends {@link TeaModel}
 *
 * <p>RepairClusterNodePoolResponse</p>
 */
public class RepairClusterNodePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RepairClusterNodePoolResponseBody body;

    private RepairClusterNodePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RepairClusterNodePoolResponse create() {
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
    public RepairClusterNodePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RepairClusterNodePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RepairClusterNodePoolResponseBody body);

        @Override
        RepairClusterNodePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RepairClusterNodePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RepairClusterNodePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RepairClusterNodePoolResponse response) {
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
        public Builder body(RepairClusterNodePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RepairClusterNodePoolResponse build() {
            return new RepairClusterNodePoolResponse(this);
        } 

    } 

}

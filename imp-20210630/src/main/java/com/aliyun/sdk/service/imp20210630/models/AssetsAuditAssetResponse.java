// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssetsAuditAssetResponse} extends {@link TeaModel}
 *
 * <p>AssetsAuditAssetResponse</p>
 */
public class AssetsAuditAssetResponse extends Response {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private RpcStatus status;

    private AssetsAuditAssetResponse(BuilderImpl builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static AssetsAuditAssetResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public RpcStatus getStatus() {
        return this.status;
    }

    public interface Builder extends Response.Builder<AssetsAuditAssetResponse, Builder> {

        Builder requestId(String requestId);

        Builder status(RpcStatus status);

        @Override
        AssetsAuditAssetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssetsAuditAssetResponse, Builder>
            implements Builder {
        private String requestId; 
        private RpcStatus status; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssetsAuditAssetResponse response) {
            super(response);
            this.requestId = response.requestId;
            this.status = response.status;
        } 

        /**
         * 请求ID
         */
        @Override
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 响应状态
         */
        @Override
        public Builder status(RpcStatus status) {
            this.status = status;
            return this;
        }

        @Override
        public AssetsAuditAssetResponse build() {
            return new AssetsAuditAssetResponse(this);
        } 

    } 

}

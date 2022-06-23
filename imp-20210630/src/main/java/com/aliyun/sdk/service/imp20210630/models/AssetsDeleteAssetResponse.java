// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssetsDeleteAssetResponse} extends {@link TeaModel}
 *
 * <p>AssetsDeleteAssetResponse</p>
 */
public class AssetsDeleteAssetResponse extends Response {
    @NameInMap("Asset")
    private CommonAsset asset;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private RpcStatus status;

    private AssetsDeleteAssetResponse(BuilderImpl builder) {
        super(builder);
        this.asset = builder.asset;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static AssetsDeleteAssetResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return asset
     */
    public CommonAsset getAsset() {
        return this.asset;
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

    public interface Builder extends Response.Builder<AssetsDeleteAssetResponse, Builder> {

        Builder asset(CommonAsset asset);

        Builder requestId(String requestId);

        Builder status(RpcStatus status);

        @Override
        AssetsDeleteAssetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssetsDeleteAssetResponse, Builder>
            implements Builder {
        private CommonAsset asset; 
        private String requestId; 
        private RpcStatus status; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssetsDeleteAssetResponse response) {
            super(response);
            this.asset = response.asset;
            this.requestId = response.requestId;
            this.status = response.status;
        } 

        /**
         * 资产信息
         */
        @Override
        public Builder asset(CommonAsset asset) {
            this.asset = asset;
            return this;
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
        public AssetsDeleteAssetResponse build() {
            return new AssetsDeleteAssetResponse(this);
        } 

    } 

}

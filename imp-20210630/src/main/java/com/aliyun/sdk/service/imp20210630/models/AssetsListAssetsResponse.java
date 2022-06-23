// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssetsListAssetsResponse} extends {@link TeaModel}
 *
 * <p>AssetsListAssetsResponse</p>
 */
public class AssetsListAssetsResponse extends Response {
    @NameInMap("Assets")
    private java.util.List < CommonAsset > assets;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private RpcStatus status;

    private AssetsListAssetsResponse(BuilderImpl builder) {
        super(builder);
        this.assets = builder.assets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static AssetsListAssetsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return assets
     */
    public java.util.List < CommonAsset > getAssets() {
        return this.assets;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public interface Builder extends Response.Builder<AssetsListAssetsResponse, Builder> {

        Builder assets(java.util.List < CommonAsset > assets);

        Builder nextToken(String nextToken);

        Builder requestId(String requestId);

        Builder status(RpcStatus status);

        @Override
        AssetsListAssetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssetsListAssetsResponse, Builder>
            implements Builder {
        private java.util.List < CommonAsset > assets; 
        private String nextToken; 
        private String requestId; 
        private RpcStatus status; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssetsListAssetsResponse response) {
            super(response);
            this.assets = response.assets;
            this.nextToken = response.nextToken;
            this.requestId = response.requestId;
            this.status = response.status;
        } 

        /**
         * Asset列表
         */
        @Override
        public Builder assets(java.util.List < CommonAsset > assets) {
            this.assets = assets;
            return this;
        }

        /**
         * 分页Token
         */
        @Override
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public AssetsListAssetsResponse build() {
            return new AssetsListAssetsResponse(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInfoFromMdpRequest} extends {@link RequestModel}
 *
 * <p>QueryInfoFromMdpRequest</p>
 */
public class QueryInfoFromMdpRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Mobile")
    private String mobile;

    @Body
    @NameInMap("MobileMd5")
    private String mobileMd5;

    @Body
    @NameInMap("MobileSha256")
    private String mobileSha256;

    @Body
    @NameInMap("RiskScene")
    @Validation(required = true)
    private String riskScene;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private QueryInfoFromMdpRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mobile = builder.mobile;
        this.mobileMd5 = builder.mobileMd5;
        this.mobileSha256 = builder.mobileSha256;
        this.riskScene = builder.riskScene;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInfoFromMdpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return mobileMd5
     */
    public String getMobileMd5() {
        return this.mobileMd5;
    }

    /**
     * @return mobileSha256
     */
    public String getMobileSha256() {
        return this.mobileSha256;
    }

    /**
     * @return riskScene
     */
    public String getRiskScene() {
        return this.riskScene;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryInfoFromMdpRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mobile; 
        private String mobileMd5; 
        private String mobileSha256; 
        private String riskScene; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryInfoFromMdpRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mobile = request.mobile;
            this.mobileMd5 = request.mobileMd5;
            this.mobileSha256 = request.mobileSha256;
            this.riskScene = request.riskScene;
            this.tenantId = request.tenantId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * MobileMd5.
         */
        public Builder mobileMd5(String mobileMd5) {
            this.putBodyParameter("MobileMd5", mobileMd5);
            this.mobileMd5 = mobileMd5;
            return this;
        }

        /**
         * MobileSha256.
         */
        public Builder mobileSha256(String mobileSha256) {
            this.putBodyParameter("MobileSha256", mobileSha256);
            this.mobileSha256 = mobileSha256;
            return this;
        }

        /**
         * RiskScene.
         */
        public Builder riskScene(String riskScene) {
            this.putBodyParameter("RiskScene", riskScene);
            this.riskScene = riskScene;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryInfoFromMdpRequest build() {
            return new QueryInfoFromMdpRequest(this);
        } 

    } 

}

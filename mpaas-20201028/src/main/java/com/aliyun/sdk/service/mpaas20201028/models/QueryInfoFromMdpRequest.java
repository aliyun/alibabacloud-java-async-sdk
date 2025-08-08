// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryInfoFromMdpRequest} extends {@link RequestModel}
 *
 * <p>QueryInfoFromMdpRequest</p>
 */
public class QueryInfoFromMdpRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MobileMd5")
    private String mobileMd5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MobileSha256")
    private String mobileSha256;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MobileSm3")
    private String mobileSm3;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String riskScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private QueryInfoFromMdpRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mobile = builder.mobile;
        this.mobileMd5 = builder.mobileMd5;
        this.mobileSha256 = builder.mobileSha256;
        this.mobileSm3 = builder.mobileSm3;
        this.riskScene = builder.riskScene;
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
     * @return mobileSm3
     */
    public String getMobileSm3() {
        return this.mobileSm3;
    }

    /**
     * @return riskScene
     */
    public String getRiskScene() {
        return this.riskScene;
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
        private String mobileSm3; 
        private String riskScene; 
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
            this.mobileSm3 = request.mobileSm3;
            this.riskScene = request.riskScene;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIPUBE5C3F6D091419</p>
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
         * MobileSm3.
         */
        public Builder mobileSm3(String mobileSm3) {
            this.putBodyParameter("MobileSm3", mobileSm3);
            this.mobileSm3 = mobileSm3;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder riskScene(String riskScene) {
            this.putBodyParameter("RiskScene", riskScene);
            this.riskScene = riskScene;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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

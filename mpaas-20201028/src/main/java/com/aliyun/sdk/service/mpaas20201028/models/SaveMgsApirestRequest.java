// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveMgsApirestRequest} extends {@link RequestModel}
 *
 * <p>SaveMgsApirestRequest</p>
 */
public class SaveMgsApirestRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MpaasMappcenterMgsApirestSaveJsonStr")
    private String mpaasMappcenterMgsApirestSaveJsonStr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SaveMgsApirestRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mpaasMappcenterMgsApirestSaveJsonStr = builder.mpaasMappcenterMgsApirestSaveJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveMgsApirestRequest create() {
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
     * @return mpaasMappcenterMgsApirestSaveJsonStr
     */
    public String getMpaasMappcenterMgsApirestSaveJsonStr() {
        return this.mpaasMappcenterMgsApirestSaveJsonStr;
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

    public static final class Builder extends Request.Builder<SaveMgsApirestRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mpaasMappcenterMgsApirestSaveJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveMgsApirestRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mpaasMappcenterMgsApirestSaveJsonStr = request.mpaasMappcenterMgsApirestSaveJsonStr;
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
         * MpaasMappcenterMgsApirestSaveJsonStr.
         */
        public Builder mpaasMappcenterMgsApirestSaveJsonStr(String mpaasMappcenterMgsApirestSaveJsonStr) {
            this.putBodyParameter("MpaasMappcenterMgsApirestSaveJsonStr", mpaasMappcenterMgsApirestSaveJsonStr);
            this.mpaasMappcenterMgsApirestSaveJsonStr = mpaasMappcenterMgsApirestSaveJsonStr;
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
        public SaveMgsApirestRequest build() {
            return new SaveMgsApirestRequest(this);
        } 

    } 

}

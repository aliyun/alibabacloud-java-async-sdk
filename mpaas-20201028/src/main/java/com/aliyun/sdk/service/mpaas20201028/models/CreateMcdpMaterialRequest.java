// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcdpMaterialRequest} extends {@link RequestModel}
 *
 * <p>CreateMcdpMaterialRequest</p>
 */
public class CreateMcdpMaterialRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("MpaasMappcenterMcdpMaterialCreateJsonStr")
    @Validation(required = true)
    private String mpaasMappcenterMcdpMaterialCreateJsonStr;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMcdpMaterialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mpaasMappcenterMcdpMaterialCreateJsonStr = builder.mpaasMappcenterMcdpMaterialCreateJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcdpMaterialRequest create() {
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
     * @return mpaasMappcenterMcdpMaterialCreateJsonStr
     */
    public String getMpaasMappcenterMcdpMaterialCreateJsonStr() {
        return this.mpaasMappcenterMcdpMaterialCreateJsonStr;
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

    public static final class Builder extends Request.Builder<CreateMcdpMaterialRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mpaasMappcenterMcdpMaterialCreateJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcdpMaterialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mpaasMappcenterMcdpMaterialCreateJsonStr = request.mpaasMappcenterMcdpMaterialCreateJsonStr;
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
         * MpaasMappcenterMcdpMaterialCreateJsonStr.
         */
        public Builder mpaasMappcenterMcdpMaterialCreateJsonStr(String mpaasMappcenterMcdpMaterialCreateJsonStr) {
            this.putBodyParameter("MpaasMappcenterMcdpMaterialCreateJsonStr", mpaasMappcenterMcdpMaterialCreateJsonStr);
            this.mpaasMappcenterMcdpMaterialCreateJsonStr = mpaasMappcenterMcdpMaterialCreateJsonStr;
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
        public CreateMcdpMaterialRequest build() {
            return new CreateMcdpMaterialRequest(this);
        } 

    } 

}

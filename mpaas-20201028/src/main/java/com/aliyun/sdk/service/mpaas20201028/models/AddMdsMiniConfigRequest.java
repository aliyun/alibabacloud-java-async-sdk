// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMdsMiniConfigRequest} extends {@link RequestModel}
 *
 * <p>AddMdsMiniConfigRequest</p>
 */
public class AddMdsMiniConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("MpaasMappcenterMiniConfigAddJsonStr")
    @Validation(required = true)
    private String mpaasMappcenterMiniConfigAddJsonStr;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private AddMdsMiniConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mpaasMappcenterMiniConfigAddJsonStr = builder.mpaasMappcenterMiniConfigAddJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMdsMiniConfigRequest create() {
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
     * @return mpaasMappcenterMiniConfigAddJsonStr
     */
    public String getMpaasMappcenterMiniConfigAddJsonStr() {
        return this.mpaasMappcenterMiniConfigAddJsonStr;
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

    public static final class Builder extends Request.Builder<AddMdsMiniConfigRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mpaasMappcenterMiniConfigAddJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AddMdsMiniConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mpaasMappcenterMiniConfigAddJsonStr = request.mpaasMappcenterMiniConfigAddJsonStr;
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
         * MpaasMappcenterMiniConfigAddJsonStr.
         */
        public Builder mpaasMappcenterMiniConfigAddJsonStr(String mpaasMappcenterMiniConfigAddJsonStr) {
            this.putBodyParameter("MpaasMappcenterMiniConfigAddJsonStr", mpaasMappcenterMiniConfigAddJsonStr);
            this.mpaasMappcenterMiniConfigAddJsonStr = mpaasMappcenterMiniConfigAddJsonStr;
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
        public AddMdsMiniConfigRequest build() {
            return new AddMdsMiniConfigRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMsaEnhanceRequest} extends {@link RequestModel}
 *
 * <p>CreateMsaEnhanceRequest</p>
 */
public class CreateMsaEnhanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("MpaasMappcenterMsaEnhanceCreateJsonStr")
    @Validation(required = true)
    private String mpaasMappcenterMsaEnhanceCreateJsonStr;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private CreateMsaEnhanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mpaasMappcenterMsaEnhanceCreateJsonStr = builder.mpaasMappcenterMsaEnhanceCreateJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMsaEnhanceRequest create() {
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
     * @return mpaasMappcenterMsaEnhanceCreateJsonStr
     */
    public String getMpaasMappcenterMsaEnhanceCreateJsonStr() {
        return this.mpaasMappcenterMsaEnhanceCreateJsonStr;
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

    public static final class Builder extends Request.Builder<CreateMsaEnhanceRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mpaasMappcenterMsaEnhanceCreateJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMsaEnhanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mpaasMappcenterMsaEnhanceCreateJsonStr = request.mpaasMappcenterMsaEnhanceCreateJsonStr;
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
         * MpaasMappcenterMsaEnhanceCreateJsonStr.
         */
        public Builder mpaasMappcenterMsaEnhanceCreateJsonStr(String mpaasMappcenterMsaEnhanceCreateJsonStr) {
            this.putBodyParameter("MpaasMappcenterMsaEnhanceCreateJsonStr", mpaasMappcenterMsaEnhanceCreateJsonStr);
            this.mpaasMappcenterMsaEnhanceCreateJsonStr = mpaasMappcenterMsaEnhanceCreateJsonStr;
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
        public CreateMsaEnhanceRequest build() {
            return new CreateMsaEnhanceRequest(this);
        } 

    } 

}

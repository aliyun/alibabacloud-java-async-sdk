// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMasCrowdRequest} extends {@link RequestModel}
 *
 * <p>CreateMasCrowdRequest</p>
 */
public class CreateMasCrowdRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("MpaasMappcenterMcdpMasCrowdCreateJsonStr")
    @Validation(required = true)
    private String mpaasMappcenterMcdpMasCrowdCreateJsonStr;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMasCrowdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mpaasMappcenterMcdpMasCrowdCreateJsonStr = builder.mpaasMappcenterMcdpMasCrowdCreateJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMasCrowdRequest create() {
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
     * @return mpaasMappcenterMcdpMasCrowdCreateJsonStr
     */
    public String getMpaasMappcenterMcdpMasCrowdCreateJsonStr() {
        return this.mpaasMappcenterMcdpMasCrowdCreateJsonStr;
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

    public static final class Builder extends Request.Builder<CreateMasCrowdRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mpaasMappcenterMcdpMasCrowdCreateJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMasCrowdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mpaasMappcenterMcdpMasCrowdCreateJsonStr = request.mpaasMappcenterMcdpMasCrowdCreateJsonStr;
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
         * MpaasMappcenterMcdpMasCrowdCreateJsonStr.
         */
        public Builder mpaasMappcenterMcdpMasCrowdCreateJsonStr(String mpaasMappcenterMcdpMasCrowdCreateJsonStr) {
            this.putBodyParameter("MpaasMappcenterMcdpMasCrowdCreateJsonStr", mpaasMappcenterMcdpMasCrowdCreateJsonStr);
            this.mpaasMappcenterMcdpMasCrowdCreateJsonStr = mpaasMappcenterMcdpMasCrowdCreateJsonStr;
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
        public CreateMasCrowdRequest build() {
            return new CreateMasCrowdRequest(this);
        } 

    } 

}

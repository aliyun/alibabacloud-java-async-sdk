// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunMsaDiffRequest} extends {@link RequestModel}
 *
 * <p>RunMsaDiffRequest</p>
 */
public class RunMsaDiffRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("MpaasMappcenterMsaDiffRunJsonStr")
    @Validation(required = true)
    private String mpaasMappcenterMsaDiffRunJsonStr;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private RunMsaDiffRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mpaasMappcenterMsaDiffRunJsonStr = builder.mpaasMappcenterMsaDiffRunJsonStr;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunMsaDiffRequest create() {
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
     * @return mpaasMappcenterMsaDiffRunJsonStr
     */
    public String getMpaasMappcenterMsaDiffRunJsonStr() {
        return this.mpaasMappcenterMsaDiffRunJsonStr;
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

    public static final class Builder extends Request.Builder<RunMsaDiffRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mpaasMappcenterMsaDiffRunJsonStr; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunMsaDiffRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mpaasMappcenterMsaDiffRunJsonStr = request.mpaasMappcenterMsaDiffRunJsonStr;
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
         * MpaasMappcenterMsaDiffRunJsonStr.
         */
        public Builder mpaasMappcenterMsaDiffRunJsonStr(String mpaasMappcenterMsaDiffRunJsonStr) {
            this.putBodyParameter("MpaasMappcenterMsaDiffRunJsonStr", mpaasMappcenterMsaDiffRunJsonStr);
            this.mpaasMappcenterMsaDiffRunJsonStr = mpaasMappcenterMsaDiffRunJsonStr;
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
        public RunMsaDiffRequest build() {
            return new RunMsaDiffRequest(this);
        } 

    } 

}

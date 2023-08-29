// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeWhitelistForIdeRequest} extends {@link RequestModel}
 *
 * <p>CreateMcubeWhitelistForIdeRequest</p>
 */
public class CreateMcubeWhitelistForIdeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("WhitelistValue")
    @Validation(required = true)
    private String whitelistValue;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private CreateMcubeWhitelistForIdeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
        this.whitelistValue = builder.whitelistValue;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeWhitelistForIdeRequest create() {
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return whitelistValue
     */
    public String getWhitelistValue() {
        return this.whitelistValue;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateMcubeWhitelistForIdeRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String tenantId; 
        private String userId; 
        private String whitelistValue; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcubeWhitelistForIdeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.tenantId = request.tenantId;
            this.userId = request.userId;
            this.whitelistValue = request.whitelistValue;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WhitelistValue.
         */
        public Builder whitelistValue(String whitelistValue) {
            this.putBodyParameter("WhitelistValue", whitelistValue);
            this.whitelistValue = whitelistValue;
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
        public CreateMcubeWhitelistForIdeRequest build() {
            return new CreateMcubeWhitelistForIdeRequest(this);
        } 

    } 

}

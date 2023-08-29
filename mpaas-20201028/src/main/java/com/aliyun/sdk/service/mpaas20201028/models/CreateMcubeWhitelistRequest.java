// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeWhitelistRequest} extends {@link RequestModel}
 *
 * <p>CreateMcubeWhitelistRequest</p>
 */
public class CreateMcubeWhitelistRequest extends Request {
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
    @NameInMap("WhiteListName")
    @Validation(required = true)
    private String whiteListName;

    @Body
    @NameInMap("WhitelistType")
    @Validation(required = true)
    private String whitelistType;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private CreateMcubeWhitelistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.tenantId = builder.tenantId;
        this.whiteListName = builder.whiteListName;
        this.whitelistType = builder.whitelistType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeWhitelistRequest create() {
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
     * @return whiteListName
     */
    public String getWhiteListName() {
        return this.whiteListName;
    }

    /**
     * @return whitelistType
     */
    public String getWhitelistType() {
        return this.whitelistType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateMcubeWhitelistRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String tenantId; 
        private String whiteListName; 
        private String whitelistType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcubeWhitelistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.tenantId = request.tenantId;
            this.whiteListName = request.whiteListName;
            this.whitelistType = request.whitelistType;
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
         * WhiteListName.
         */
        public Builder whiteListName(String whiteListName) {
            this.putBodyParameter("WhiteListName", whiteListName);
            this.whiteListName = whiteListName;
            return this;
        }

        /**
         * WhitelistType.
         */
        public Builder whitelistType(String whitelistType) {
            this.putBodyParameter("WhitelistType", whitelistType);
            this.whitelistType = whitelistType;
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
        public CreateMcubeWhitelistRequest build() {
            return new CreateMcubeWhitelistRequest(this);
        } 

    } 

}

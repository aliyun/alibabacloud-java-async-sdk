// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCubecardWhitelistContentRequest} extends {@link RequestModel}
 *
 * <p>DeleteCubecardWhitelistContentRequest</p>
 */
public class DeleteCubecardWhitelistContentRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("WhitelistId")
    private String whitelistId;

    @Body
    @NameInMap("WhitelistValue")
    private String whitelistValue;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private DeleteCubecardWhitelistContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.tenantId = builder.tenantId;
        this.whitelistId = builder.whitelistId;
        this.whitelistValue = builder.whitelistValue;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCubecardWhitelistContentRequest create() {
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
     * @return whitelistId
     */
    public String getWhitelistId() {
        return this.whitelistId;
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

    public static final class Builder extends Request.Builder<DeleteCubecardWhitelistContentRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String tenantId; 
        private String whitelistId; 
        private String whitelistValue; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCubecardWhitelistContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.tenantId = request.tenantId;
            this.whitelistId = request.whitelistId;
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
         * WhitelistId.
         */
        public Builder whitelistId(String whitelistId) {
            this.putBodyParameter("WhitelistId", whitelistId);
            this.whitelistId = whitelistId;
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
        public DeleteCubecardWhitelistContentRequest build() {
            return new DeleteCubecardWhitelistContentRequest(this);
        } 

    } 

}

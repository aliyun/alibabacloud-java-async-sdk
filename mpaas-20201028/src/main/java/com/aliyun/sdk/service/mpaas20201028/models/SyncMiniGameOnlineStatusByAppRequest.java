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
 * {@link SyncMiniGameOnlineStatusByAppRequest} extends {@link RequestModel}
 *
 * <p>SyncMiniGameOnlineStatusByAppRequest</p>
 */
public class SyncMiniGameOnlineStatusByAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MiniProgramCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String miniProgramCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnlineStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer onlineStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SyncMiniGameOnlineStatusByAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.miniProgramCode = builder.miniProgramCode;
        this.onlineStatus = builder.onlineStatus;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncMiniGameOnlineStatusByAppRequest create() {
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
     * @return miniProgramCode
     */
    public String getMiniProgramCode() {
        return this.miniProgramCode;
    }

    /**
     * @return onlineStatus
     */
    public Integer getOnlineStatus() {
        return this.onlineStatus;
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

    public static final class Builder extends Request.Builder<SyncMiniGameOnlineStatusByAppRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String miniProgramCode; 
        private Integer onlineStatus; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SyncMiniGameOnlineStatusByAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.miniProgramCode = request.miniProgramCode;
            this.onlineStatus = request.onlineStatus;
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
         * <p>This parameter is required.</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder miniProgramCode(String miniProgramCode) {
            this.putBodyParameter("MiniProgramCode", miniProgramCode);
            this.miniProgramCode = miniProgramCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder onlineStatus(Integer onlineStatus) {
            this.putBodyParameter("OnlineStatus", onlineStatus);
            this.onlineStatus = onlineStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SyncMiniGameOnlineStatusByAppRequest build() {
            return new SyncMiniGameOnlineStatusByAppRequest(this);
        } 

    } 

}

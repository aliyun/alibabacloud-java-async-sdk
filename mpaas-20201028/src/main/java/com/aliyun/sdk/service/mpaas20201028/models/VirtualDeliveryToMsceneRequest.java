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
 * {@link VirtualDeliveryToMsceneRequest} extends {@link RequestModel}
 *
 * <p>VirtualDeliveryToMsceneRequest</p>
 */
public class VirtualDeliveryToMsceneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MiniProgramId")
    private String miniProgramId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlatformId")
    private String platformId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private VirtualDeliveryToMsceneRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.customId = builder.customId;
        this.miniProgramId = builder.miniProgramId;
        this.platformId = builder.platformId;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VirtualDeliveryToMsceneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return miniProgramId
     */
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    /**
     * @return platformId
     */
    public String getPlatformId() {
        return this.platformId;
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

    public static final class Builder extends Request.Builder<VirtualDeliveryToMsceneRequest, Builder> {
        private String appId; 
        private String customId; 
        private String miniProgramId; 
        private String platformId; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(VirtualDeliveryToMsceneRequest request) {
            super(request);
            this.appId = request.appId;
            this.customId = request.customId;
            this.miniProgramId = request.miniProgramId;
            this.platformId = request.platformId;
            this.tenantId = request.tenantId;
            this.workspaceId = request.workspaceId;
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
         * CustomId.
         */
        public Builder customId(String customId) {
            this.putBodyParameter("CustomId", customId);
            this.customId = customId;
            return this;
        }

        /**
         * MiniProgramId.
         */
        public Builder miniProgramId(String miniProgramId) {
            this.putBodyParameter("MiniProgramId", miniProgramId);
            this.miniProgramId = miniProgramId;
            return this;
        }

        /**
         * PlatformId.
         */
        public Builder platformId(String platformId) {
            this.putBodyParameter("PlatformId", platformId);
            this.platformId = platformId;
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
        public VirtualDeliveryToMsceneRequest build() {
            return new VirtualDeliveryToMsceneRequest(this);
        } 

    } 

}

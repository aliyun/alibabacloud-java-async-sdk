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
 * {@link SaveOrderRelationInfoToMsenceRequest} extends {@link RequestModel}
 *
 * <p>SaveOrderRelationInfoToMsenceRequest</p>
 */
public class SaveOrderRelationInfoToMsenceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizOrderId")
    private String bizOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizOrderStatus")
    private Integer bizOrderStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CpExtra")
    private String cpExtra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MiniProgramId")
    private String miniProgramId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenUid")
    private String openUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlatformId")
    private String platformId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SaveOrderRelationInfoToMsenceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.appId = builder.appId;
        this.bizOrderId = builder.bizOrderId;
        this.bizOrderStatus = builder.bizOrderStatus;
        this.clientType = builder.clientType;
        this.cpExtra = builder.cpExtra;
        this.customId = builder.customId;
        this.miniProgramId = builder.miniProgramId;
        this.openUid = builder.openUid;
        this.platformId = builder.platformId;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveOrderRelationInfoToMsenceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return bizOrderId
     */
    public String getBizOrderId() {
        return this.bizOrderId;
    }

    /**
     * @return bizOrderStatus
     */
    public Integer getBizOrderStatus() {
        return this.bizOrderStatus;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return cpExtra
     */
    public String getCpExtra() {
        return this.cpExtra;
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
     * @return openUid
     */
    public String getOpenUid() {
        return this.openUid;
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

    public static final class Builder extends Request.Builder<SaveOrderRelationInfoToMsenceRequest, Builder> {
        private Integer amount; 
        private String appId; 
        private String bizOrderId; 
        private Integer bizOrderStatus; 
        private String clientType; 
        private String cpExtra; 
        private String customId; 
        private String miniProgramId; 
        private String openUid; 
        private String platformId; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveOrderRelationInfoToMsenceRequest request) {
            super(request);
            this.amount = request.amount;
            this.appId = request.appId;
            this.bizOrderId = request.bizOrderId;
            this.bizOrderStatus = request.bizOrderStatus;
            this.clientType = request.clientType;
            this.cpExtra = request.cpExtra;
            this.customId = request.customId;
            this.miniProgramId = request.miniProgramId;
            this.openUid = request.openUid;
            this.platformId = request.platformId;
            this.tenantId = request.tenantId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putBodyParameter("Amount", amount);
            this.amount = amount;
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
         * BizOrderId.
         */
        public Builder bizOrderId(String bizOrderId) {
            this.putBodyParameter("BizOrderId", bizOrderId);
            this.bizOrderId = bizOrderId;
            return this;
        }

        /**
         * BizOrderStatus.
         */
        public Builder bizOrderStatus(Integer bizOrderStatus) {
            this.putBodyParameter("BizOrderStatus", bizOrderStatus);
            this.bizOrderStatus = bizOrderStatus;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * CpExtra.
         */
        public Builder cpExtra(String cpExtra) {
            this.putBodyParameter("CpExtra", cpExtra);
            this.cpExtra = cpExtra;
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
         * OpenUid.
         */
        public Builder openUid(String openUid) {
            this.putBodyParameter("OpenUid", openUid);
            this.openUid = openUid;
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
        public SaveOrderRelationInfoToMsenceRequest build() {
            return new SaveOrderRelationInfoToMsenceRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateDataAssetsGovernObjectStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataAssetsGovernObjectStatusRequest</p>
 */
public class UpdateDataAssetsGovernObjectStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateDataAssetsGovernObjectStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAssetsGovernObjectStatusRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateDataAssetsGovernObjectStatusRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataAssetsGovernObjectStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.updateCommand = request.updateCommand;
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
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateDataAssetsGovernObjectStatusRequest build() {
            return new UpdateDataAssetsGovernObjectStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataAssetsGovernObjectStatusRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataAssetsGovernObjectStatusRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertOwners")
        private Boolean alertOwners;

        @com.aliyun.core.annotation.NameInMap("GovernObjectIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> governObjectIds;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("TargetStatus")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetStatus;

        private UpdateCommand(Builder builder) {
            this.alertOwners = builder.alertOwners;
            this.governObjectIds = builder.governObjectIds;
            this.remark = builder.remark;
            this.targetStatus = builder.targetStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return alertOwners
         */
        public Boolean getAlertOwners() {
            return this.alertOwners;
        }

        /**
         * @return governObjectIds
         */
        public java.util.List<Long> getGovernObjectIds() {
            return this.governObjectIds;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return targetStatus
         */
        public String getTargetStatus() {
            return this.targetStatus;
        }

        public static final class Builder {
            private Boolean alertOwners; 
            private java.util.List<Long> governObjectIds; 
            private String remark; 
            private String targetStatus; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.alertOwners = model.alertOwners;
                this.governObjectIds = model.governObjectIds;
                this.remark = model.remark;
                this.targetStatus = model.targetStatus;
            } 

            /**
             * AlertOwners.
             */
            public Builder alertOwners(Boolean alertOwners) {
                this.alertOwners = alertOwners;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder governObjectIds(java.util.List<Long> governObjectIds) {
                this.governObjectIds = governObjectIds;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder targetStatus(String targetStatus) {
                this.targetStatus = targetStatus;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}

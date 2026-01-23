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
 * {@link UpdateSecurityIdentifyResultStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecurityIdentifyResultStatusRequest</p>
 */
public class UpdateSecurityIdentifyResultStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateSecurityIdentifyResultStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecurityIdentifyResultStatusRequest create() {
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
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateSecurityIdentifyResultStatusRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecurityIdentifyResultStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateSecurityIdentifyResultStatusRequest build() {
            return new UpdateSecurityIdentifyResultStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSecurityIdentifyResultStatusRequest} extends {@link TeaModel}
     *
     * <p>UpdateSecurityIdentifyResultStatusRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("IdentifyResultIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> identifyResultIdList;

        private UpdateCommand(Builder builder) {
            this.enable = builder.enable;
            this.identifyResultIdList = builder.identifyResultIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return identifyResultIdList
         */
        public java.util.List<Long> getIdentifyResultIdList() {
            return this.identifyResultIdList;
        }

        public static final class Builder {
            private Boolean enable; 
            private java.util.List<Long> identifyResultIdList; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.enable = model.enable;
                this.identifyResultIdList = model.identifyResultIdList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder identifyResultIdList(java.util.List<Long> identifyResultIdList) {
                this.identifyResultIdList = identifyResultIdList;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}

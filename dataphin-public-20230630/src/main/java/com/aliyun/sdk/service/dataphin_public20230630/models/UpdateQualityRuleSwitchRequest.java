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
 * {@link UpdateQualityRuleSwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdateQualityRuleSwitchRequest</p>
 */
public class UpdateQualityRuleSwitchRequest extends Request {
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

    private UpdateQualityRuleSwitchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQualityRuleSwitchRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateQualityRuleSwitchRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQualityRuleSwitchRequest request) {
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
        public UpdateQualityRuleSwitchRequest build() {
            return new UpdateQualityRuleSwitchRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateQualityRuleSwitchRequest} extends {@link TeaModel}
     *
     * <p>UpdateQualityRuleSwitchRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Open")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean open;

        @com.aliyun.core.annotation.NameInMap("RuleIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> ruleIdList;

        private UpdateCommand(Builder builder) {
            this.open = builder.open;
            this.ruleIdList = builder.ruleIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return open
         */
        public Boolean getOpen() {
            return this.open;
        }

        /**
         * @return ruleIdList
         */
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
        }

        public static final class Builder {
            private Boolean open; 
            private java.util.List<Long> ruleIdList; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.open = model.open;
                this.ruleIdList = model.ruleIdList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder open(Boolean open) {
                this.open = open;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder ruleIdList(java.util.List<Long> ruleIdList) {
                this.ruleIdList = ruleIdList;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}

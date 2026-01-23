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
 * {@link RemoveQualityRuleSchedulesRequest} extends {@link RequestModel}
 *
 * <p>RemoveQualityRuleSchedulesRequest</p>
 */
public class RemoveQualityRuleSchedulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private RemoveCommand removeCommand;

    private RemoveQualityRuleSchedulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.removeCommand = builder.removeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveQualityRuleSchedulesRequest create() {
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
     * @return removeCommand
     */
    public RemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static final class Builder extends Request.Builder<RemoveQualityRuleSchedulesRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private RemoveCommand removeCommand; 

        private Builder() {
            super();
        } 

        private Builder(RemoveQualityRuleSchedulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.removeCommand = request.removeCommand;
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
        public Builder removeCommand(RemoveCommand removeCommand) {
            String removeCommandShrink = shrink(removeCommand, "RemoveCommand", "json");
            this.putBodyParameter("RemoveCommand", removeCommandShrink);
            this.removeCommand = removeCommand;
            return this;
        }

        @Override
        public RemoveQualityRuleSchedulesRequest build() {
            return new RemoveQualityRuleSchedulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveQualityRuleSchedulesRequest} extends {@link TeaModel}
     *
     * <p>RemoveQualityRuleSchedulesRequest</p>
     */
    public static class RemoveCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("ScheduleIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> scheduleIdList;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long watchId;

        private RemoveCommand(Builder builder) {
            this.ruleId = builder.ruleId;
            this.scheduleIdList = builder.scheduleIdList;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveCommand create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return scheduleIdList
         */
        public java.util.List<Long> getScheduleIdList() {
            return this.scheduleIdList;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private Long ruleId; 
            private java.util.List<Long> scheduleIdList; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(RemoveCommand model) {
                this.ruleId = model.ruleId;
                this.scheduleIdList = model.scheduleIdList;
                this.watchId = model.watchId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder scheduleIdList(java.util.List<Long> scheduleIdList) {
                this.scheduleIdList = scheduleIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>平均值</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public RemoveCommand build() {
                return new RemoveCommand(this);
            } 

        } 

    }
}

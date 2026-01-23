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
 * {@link AssignQualityRuleOfAllRuleScopeSchedulesRequest} extends {@link RequestModel}
 *
 * <p>AssignQualityRuleOfAllRuleScopeSchedulesRequest</p>
 */
public class AssignQualityRuleOfAllRuleScopeSchedulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssignCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private AssignCommand assignCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private AssignQualityRuleOfAllRuleScopeSchedulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.assignCommand = builder.assignCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignQualityRuleOfAllRuleScopeSchedulesRequest create() {
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
     * @return assignCommand
     */
    public AssignCommand getAssignCommand() {
        return this.assignCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<AssignQualityRuleOfAllRuleScopeSchedulesRequest, Builder> {
        private String regionId; 
        private AssignCommand assignCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(AssignQualityRuleOfAllRuleScopeSchedulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.assignCommand = request.assignCommand;
            this.opTenantId = request.opTenantId;
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
        public Builder assignCommand(AssignCommand assignCommand) {
            String assignCommandShrink = shrink(assignCommand, "AssignCommand", "json");
            this.putBodyParameter("AssignCommand", assignCommandShrink);
            this.assignCommand = assignCommand;
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

        @Override
        public AssignQualityRuleOfAllRuleScopeSchedulesRequest build() {
            return new AssignQualityRuleOfAllRuleScopeSchedulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AssignQualityRuleOfAllRuleScopeSchedulesRequest} extends {@link TeaModel}
     *
     * <p>AssignQualityRuleOfAllRuleScopeSchedulesRequest</p>
     */
    public static class AssignCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> ruleIdList;

        @com.aliyun.core.annotation.NameInMap("ScheduleIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> scheduleIdList;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long watchId;

        private AssignCommand(Builder builder) {
            this.ruleIdList = builder.ruleIdList;
            this.scheduleIdList = builder.scheduleIdList;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignCommand create() {
            return builder().build();
        }

        /**
         * @return ruleIdList
         */
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
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
            private java.util.List<Long> ruleIdList; 
            private java.util.List<Long> scheduleIdList; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(AssignCommand model) {
                this.ruleIdList = model.ruleIdList;
                this.scheduleIdList = model.scheduleIdList;
                this.watchId = model.watchId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder ruleIdList(java.util.List<Long> ruleIdList) {
                this.ruleIdList = ruleIdList;
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

            public AssignCommand build() {
                return new AssignCommand(this);
            } 

        } 

    }
}

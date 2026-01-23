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
 * {@link SubmitQualityRuleTasksRequest} extends {@link RequestModel}
 *
 * <p>SubmitQualityRuleTasksRequest</p>
 */
public class SubmitQualityRuleTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubmitCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubmitCommand submitCommand;

    private SubmitQualityRuleTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.submitCommand = builder.submitCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitQualityRuleTasksRequest create() {
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
     * @return submitCommand
     */
    public SubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static final class Builder extends Request.Builder<SubmitQualityRuleTasksRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private SubmitCommand submitCommand; 

        private Builder() {
            super();
        } 

        private Builder(SubmitQualityRuleTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.submitCommand = request.submitCommand;
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
        public Builder submitCommand(SubmitCommand submitCommand) {
            String submitCommandShrink = shrink(submitCommand, "SubmitCommand", "json");
            this.putBodyParameter("SubmitCommand", submitCommandShrink);
            this.submitCommand = submitCommand;
            return this;
        }

        @Override
        public SubmitQualityRuleTasksRequest build() {
            return new SubmitQualityRuleTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitQualityRuleTasksRequest} extends {@link TeaModel}
     *
     * <p>SubmitQualityRuleTasksRequest</p>
     */
    public static class WatchRuleIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long watchId;

        private WatchRuleIdList(Builder builder) {
            this.ruleId = builder.ruleId;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatchRuleIdList create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private Long ruleId; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(WatchRuleIdList model) {
                this.ruleId = model.ruleId;
                this.watchId = model.watchId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public WatchRuleIdList build() {
                return new WatchRuleIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitQualityRuleTasksRequest} extends {@link TeaModel}
     *
     * <p>SubmitQualityRuleTasksRequest</p>
     */
    public static class SubmitCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("IsTestRun")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isTestRun;

        @com.aliyun.core.annotation.NameInMap("PartitionExpression")
        private String partitionExpression;

        @com.aliyun.core.annotation.NameInMap("PartitionExpressionFrom")
        private String partitionExpressionFrom;

        @com.aliyun.core.annotation.NameInMap("ScheduleId")
        private Long scheduleId;

        @com.aliyun.core.annotation.NameInMap("WatchRuleIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<WatchRuleIdList> watchRuleIdList;

        private SubmitCommand(Builder builder) {
            this.bizDate = builder.bizDate;
            this.isTestRun = builder.isTestRun;
            this.partitionExpression = builder.partitionExpression;
            this.partitionExpressionFrom = builder.partitionExpressionFrom;
            this.scheduleId = builder.scheduleId;
            this.watchRuleIdList = builder.watchRuleIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitCommand create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return isTestRun
         */
        public Boolean getIsTestRun() {
            return this.isTestRun;
        }

        /**
         * @return partitionExpression
         */
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        /**
         * @return partitionExpressionFrom
         */
        public String getPartitionExpressionFrom() {
            return this.partitionExpressionFrom;
        }

        /**
         * @return scheduleId
         */
        public Long getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return watchRuleIdList
         */
        public java.util.List<WatchRuleIdList> getWatchRuleIdList() {
            return this.watchRuleIdList;
        }

        public static final class Builder {
            private String bizDate; 
            private Boolean isTestRun; 
            private String partitionExpression; 
            private String partitionExpressionFrom; 
            private Long scheduleId; 
            private java.util.List<WatchRuleIdList> watchRuleIdList; 

            private Builder() {
            } 

            private Builder(SubmitCommand model) {
                this.bizDate = model.bizDate;
                this.isTestRun = model.isTestRun;
                this.partitionExpression = model.partitionExpression;
                this.partitionExpressionFrom = model.partitionExpressionFrom;
                this.scheduleId = model.scheduleId;
                this.watchRuleIdList = model.watchRuleIdList;
            } 

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder isTestRun(Boolean isTestRun) {
                this.isTestRun = isTestRun;
                return this;
            }

            /**
             * PartitionExpression.
             */
            public Builder partitionExpression(String partitionExpression) {
                this.partitionExpression = partitionExpression;
                return this;
            }

            /**
             * PartitionExpressionFrom.
             */
            public Builder partitionExpressionFrom(String partitionExpressionFrom) {
                this.partitionExpressionFrom = partitionExpressionFrom;
                return this;
            }

            /**
             * ScheduleId.
             */
            public Builder scheduleId(Long scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder watchRuleIdList(java.util.List<WatchRuleIdList> watchRuleIdList) {
                this.watchRuleIdList = watchRuleIdList;
                return this;
            }

            public SubmitCommand build() {
                return new SubmitCommand(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSoarStrategyTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSoarStrategyTaskRequest</p>
 */
public class CreateSoarStrategyTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyTaskParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskPlanExeTime")
    private Long strategyTaskPlanExeTime;

    private CreateSoarStrategyTaskRequest(Builder builder) {
        super(builder);
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
        this.strategyTaskName = builder.strategyTaskName;
        this.strategyTaskParams = builder.strategyTaskParams;
        this.strategyTaskPlanExeTime = builder.strategyTaskPlanExeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoarStrategyTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return strategyTaskName
     */
    public String getStrategyTaskName() {
        return this.strategyTaskName;
    }

    /**
     * @return strategyTaskParams
     */
    public String getStrategyTaskParams() {
        return this.strategyTaskParams;
    }

    /**
     * @return strategyTaskPlanExeTime
     */
    public Long getStrategyTaskPlanExeTime() {
        return this.strategyTaskPlanExeTime;
    }

    public static final class Builder extends Request.Builder<CreateSoarStrategyTaskRequest, Builder> {
        private Long strategyId; 
        private String strategyName; 
        private String strategyTaskName; 
        private String strategyTaskParams; 
        private Long strategyTaskPlanExeTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateSoarStrategyTaskRequest request) {
            super(request);
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
            this.strategyTaskName = request.strategyTaskName;
            this.strategyTaskParams = request.strategyTaskParams;
            this.strategyTaskPlanExeTime = request.strategyTaskPlanExeTime;
        } 

        /**
         * The ID of the policy.
         * <p>
         * 
         * >  You can call the [DescribeSoarSubscribedStrategy](~~DescribeSoarSubscribedStrategy~~) operation to obtain the ID.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The name of the policy. Set the value to Automated Batch Vulnerability Fixing Policy for Multiple Servers.
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * The name of.the policy task.
         */
        public Builder strategyTaskName(String strategyTaskName) {
            this.putQueryParameter("StrategyTaskName", strategyTaskName);
            this.strategyTaskName = strategyTaskName;
            return this;
        }

        /**
         * The parameters of the policy task. The value is a JSON array.
         * <p>
         * 
         * Vulnerability-related parameters:
         * 
         * *   name: vluList
         * *   associationProperty: sasAllVul
         * *   value: basic vulnerability information
         * 
         * Snapshot-related parameters:
         * 
         * *   name: snapshotConfig
         * *   associationProperty: snapshotConfig
         * *   value: retention period
         * 
         * Notification-related parameters:
         * 
         * *   name: notifyConfig
         * *   associationProperty: notifyConfig
         * *   value: email or DingTalk configuration information
         */
        public Builder strategyTaskParams(String strategyTaskParams) {
            this.putQueryParameter("StrategyTaskParams", strategyTaskParams);
            this.strategyTaskParams = strategyTaskParams;
            return this;
        }

        /**
         * The timestamp when the task is scheduled to start. Unit: milliseconds.
         */
        public Builder strategyTaskPlanExeTime(Long strategyTaskPlanExeTime) {
            this.putQueryParameter("StrategyTaskPlanExeTime", strategyTaskPlanExeTime);
            this.strategyTaskPlanExeTime = strategyTaskPlanExeTime;
            return this;
        }

        @Override
        public CreateSoarStrategyTaskRequest build() {
            return new CreateSoarStrategyTaskRequest(this);
        } 

    } 

}

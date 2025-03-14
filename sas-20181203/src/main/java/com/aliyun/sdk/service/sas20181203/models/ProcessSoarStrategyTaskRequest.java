// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ProcessSoarStrategyTaskRequest} extends {@link RequestModel}
 *
 * <p>ProcessSoarStrategyTaskRequest</p>
 */
public class ProcessSoarStrategyTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskAction;

    private ProcessSoarStrategyTaskRequest(Builder builder) {
        super(builder);
        this.strategyTaskId = builder.strategyTaskId;
        this.taskAction = builder.taskAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessSoarStrategyTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyTaskId
     */
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    /**
     * @return taskAction
     */
    public String getTaskAction() {
        return this.taskAction;
    }

    public static final class Builder extends Request.Builder<ProcessSoarStrategyTaskRequest, Builder> {
        private Long strategyTaskId; 
        private String taskAction; 

        private Builder() {
            super();
        } 

        private Builder(ProcessSoarStrategyTaskRequest request) {
            super(request);
            this.strategyTaskId = request.strategyTaskId;
            this.taskAction = request.taskAction;
        } 

        /**
         * <p>ID of the strategy task.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder strategyTaskId(Long strategyTaskId) {
            this.putQueryParameter("StrategyTaskId", strategyTaskId);
            this.strategyTaskId = strategyTaskId;
            return this;
        }

        /**
         * <p>Task action status. Values:</p>
         * <ul>
         * <li>SCHEDULE: Schedule</li>
         * <li>PAUSE: Pause</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE</p>
         */
        public Builder taskAction(String taskAction) {
            this.putQueryParameter("TaskAction", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        @Override
        public ProcessSoarStrategyTaskRequest build() {
            return new ProcessSoarStrategyTaskRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link SwitchSyntheticTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>SwitchSyntheticTaskStatusRequest</p>
 */
public class SwitchSyntheticTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchStatus")
    private Long switchStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<Long> taskIds;

    private SwitchSyntheticTaskStatusRequest(Builder builder) {
        super(builder);
        this.switchStatus = builder.switchStatus;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchSyntheticTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return switchStatus
     */
    public Long getSwitchStatus() {
        return this.switchStatus;
    }

    /**
     * @return taskIds
     */
    public java.util.List<Long> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<SwitchSyntheticTaskStatusRequest, Builder> {
        private Long switchStatus; 
        private java.util.List<Long> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(SwitchSyntheticTaskStatusRequest request) {
            super(request);
            this.switchStatus = request.switchStatus;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>Specifies whether to start or stop the task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: stops the task</li>
         * <li><strong>1</strong>: starts the task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder switchStatus(Long switchStatus) {
            this.putQueryParameter("SwitchStatus", switchStatus);
            this.switchStatus = switchStatus;
            return this;
        }

        /**
         * <p>The task IDs. You can specify up to 30 task IDs at a time.</p>
         */
        public Builder taskIds(java.util.List<Long> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public SwitchSyntheticTaskStatusRequest build() {
            return new SwitchSyntheticTaskStatusRequest(this);
        } 

    } 

}

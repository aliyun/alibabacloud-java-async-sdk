// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUnfinishedOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>ListUnfinishedOnceTaskRequest</p>
 */
public class ListUnfinishedOnceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private ListUnfinishedOnceTaskRequest(Builder builder) {
        super(builder);
        this.target = builder.target;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnfinishedOnceTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ListUnfinishedOnceTaskRequest, Builder> {
        private String target; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ListUnfinishedOnceTaskRequest request) {
            super(request);
            this.target = request.target;
            this.taskType = request.taskType;
        } 

        /**
         * The value of the object on which the task runs. If you set TaskType to IMAGE_SCAN, set this parameter to the UUID of the image that you want to scan. If you set TaskType to ASSETS_COLLECTION, set this parameter to the UUID of the server whose information you want to collect.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The type of the task. Valid values:
         * <p>
         * 
         * *   **ASSETS_COLLECTION**: asset information collection task
         * *   **IMAGE_SCAN**: image scan task
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ListUnfinishedOnceTaskRequest build() {
            return new ListUnfinishedOnceTaskRequest(this);
        } 

    } 

}

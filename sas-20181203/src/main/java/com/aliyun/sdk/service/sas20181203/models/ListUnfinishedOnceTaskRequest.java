// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUnfinishedOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>ListUnfinishedOnceTaskRequest</p>
 */
public class ListUnfinishedOnceTaskRequest extends Request {
    @Query
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
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
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TaskType.
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

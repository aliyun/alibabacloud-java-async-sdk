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
         * <p>The target object value.</p>
         * <ul>
         * <li>If TaskType is set to IMAGE_SCAN, you must provide the image digest.</li>
         * <li>If TaskType is set to ASSETS_COLLECTION, you must provide the machine UUID.</li>
         * </ul>
         * <p>If this parameter is not provided in the preceding scenarios, the service returns HTTP 400 with error code -101.</p>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>ASSETS_COLLECTION</strong>: asset information collection task</li>
         * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
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

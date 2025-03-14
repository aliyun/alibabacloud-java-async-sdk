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
         * <p>The value of the object on which the task runs. If you set TaskType to IMAGE_SCAN, set this parameter to the UUID of the image that you want to scan. If you set TaskType to ASSETS_COLLECTION, set this parameter to the UUID of the server whose information you want to collect.</p>
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
         * <p>The type of the task. Valid values:</p>
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

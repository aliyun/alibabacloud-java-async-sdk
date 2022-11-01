// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOtaTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelOtaTaskRequest</p>
 */
public class CancelOtaTaskRequest extends Request {
    @Body
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private CancelOtaTaskRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOtaTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CancelOtaTaskRequest, Builder> {
        private String appInstanceGroupId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOtaTaskRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.taskId = request.taskId;
        } 

        /**
         * 实例组id
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * 任务id
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CancelOtaTaskRequest build() {
            return new CancelOtaTaskRequest(this);
        } 

    } 

}

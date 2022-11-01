// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveOtaTaskRequest} extends {@link RequestModel}
 *
 * <p>ApproveOtaTaskRequest</p>
 */
public class ApproveOtaTaskRequest extends Request {
    @Body
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Body
    @NameInMap("BizRegionId")
    @Validation(required = true)
    private String bizRegionId;

    @Body
    @NameInMap("OtaType")
    @Validation(required = true)
    private String otaType;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private ApproveOtaTaskRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.bizRegionId = builder.bizRegionId;
        this.otaType = builder.otaType;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveOtaTaskRequest create() {
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return otaType
     */
    public String getOtaType() {
        return this.otaType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ApproveOtaTaskRequest, Builder> {
        private String appInstanceGroupId; 
        private String bizRegionId; 
        private String otaType; 
        private String startTime; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveOtaTaskRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.bizRegionId = request.bizRegionId;
            this.otaType = request.otaType;
            this.startTime = request.startTime;
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
         * 请求发起者所在地域
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ota类型,取值：
         * <p>
         * Fota ： agent组件更新
         * ImageUpdate ： 镜像更新
         * AppUpdate ： 应用更新
         */
        public Builder otaType(String otaType) {
            this.putBodyParameter("OtaType", otaType);
            this.otaType = otaType;
            return this;
        }

        /**
         * 开始时间，iso8601格式
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * ota任务id
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ApproveOtaTaskRequest build() {
            return new ApproveOtaTaskRequest(this);
        } 

    } 

}

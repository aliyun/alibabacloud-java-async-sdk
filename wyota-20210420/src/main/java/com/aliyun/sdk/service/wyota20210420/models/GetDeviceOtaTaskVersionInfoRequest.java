// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceOtaTaskVersionInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceOtaTaskVersionInfoRequest</p>
 */
public class GetDeviceOtaTaskVersionInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetDeviceOtaTaskVersionInfoRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOtaTaskVersionInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetDeviceOtaTaskVersionInfoRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceOtaTaskVersionInfoRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetDeviceOtaTaskVersionInfoRequest build() {
            return new GetDeviceOtaTaskVersionInfoRequest(this);
        } 

    } 

}

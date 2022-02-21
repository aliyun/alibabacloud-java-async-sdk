// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMPUTaskRequest} extends {@link RequestModel}
 *
 * <p>StopMPUTaskRequest</p>
 */
public class StopMPUTaskRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private StopMPUTaskRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopMPUTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<StopMPUTaskRequest, Builder> {
        private String appId; 
        private Long ownerId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(StopMPUTaskRequest response) {
            super(response);
            this.appId = response.appId;
            this.ownerId = response.ownerId;
            this.taskId = response.taskId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public StopMPUTaskRequest build() {
            return new StopMPUTaskRequest(this);
        } 

    } 

}

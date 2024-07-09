// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFotaTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateFotaTaskRequest</p>
 */
public class UpdateFotaTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private String userStatus;

    private UpdateFotaTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskUid = builder.taskUid;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFotaTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskUid
     */
    public String getTaskUid() {
        return this.taskUid;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder extends Request.Builder<UpdateFotaTaskRequest, Builder> {
        private String regionId; 
        private String taskUid; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFotaTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskUid = request.taskUid;
            this.userStatus = request.userStatus;
        } 

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by Elastic Desktop Service.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the image update task. You can call the [DescribeFotaTasks](~~437001~~) operation to obtain the value of this parameter.
         */
        public Builder taskUid(String taskUid) {
            this.putQueryParameter("TaskUid", taskUid);
            this.taskUid = taskUid;
            return this;
        }

        /**
         * Specifies whether to automatically push the image update task.
         * <p>
         * 
         * Valid values:
         * 
         * *   Running: automatically pushes the image update task.
         * *   Pending: does not automatically push the image update task.
         */
        public Builder userStatus(String userStatus) {
            this.putQueryParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public UpdateFotaTaskRequest build() {
            return new UpdateFotaTaskRequest(this);
        } 

    } 

}

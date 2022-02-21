// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLibraryInstallTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateLibraryInstallTaskStatusRequest</p>
 */
public class UpdateLibraryInstallTaskStatusRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TaskBizId")
    private String taskBizId;

    private UpdateLibraryInstallTaskStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.taskBizId = builder.taskBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLibraryInstallTaskStatusRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskBizId
     */
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public static final class Builder extends Request.Builder<UpdateLibraryInstallTaskStatusRequest, Builder> {
        private String regionId; 
        private Long resourceOwnerId; 
        private String status; 
        private String taskBizId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLibraryInstallTaskStatusRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.status = response.status;
            this.taskBizId = response.taskBizId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskBizId.
         */
        public Builder taskBizId(String taskBizId) {
            this.putQueryParameter("TaskBizId", taskBizId);
            this.taskBizId = taskBizId;
            return this;
        }

        @Override
        public UpdateLibraryInstallTaskStatusRequest build() {
            return new UpdateLibraryInstallTaskStatusRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLibraryInstallTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeLibraryInstallTaskDetailRequest</p>
 */
public class DescribeLibraryInstallTaskDetailRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TaskBizId")
    private String taskBizId;

    private DescribeLibraryInstallTaskDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskBizId = builder.taskBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLibraryInstallTaskDetailRequest create() {
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
     * @return taskBizId
     */
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public static final class Builder extends Request.Builder<DescribeLibraryInstallTaskDetailRequest, Builder> {
        private String regionId; 
        private Long resourceOwnerId; 
        private String taskBizId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLibraryInstallTaskDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskBizId = request.taskBizId;
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
         * TaskBizId.
         */
        public Builder taskBizId(String taskBizId) {
            this.putQueryParameter("TaskBizId", taskBizId);
            this.taskBizId = taskBizId;
            return this;
        }

        @Override
        public DescribeLibraryInstallTaskDetailRequest build() {
            return new DescribeLibraryInstallTaskDetailRequest(this);
        } 

    } 

}

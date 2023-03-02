// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDDLJobStatusRequest} extends {@link RequestModel}
 *
 * <p>GetDDLJobStatusRequest</p>
 */
public class GetDDLJobStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private GetDDLJobStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDDLJobStatusRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetDDLJobStatusRequest, Builder> {
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetDDLJobStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskId = request.taskId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the DDL task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetDDLJobStatusRequest build() {
            return new GetDDLJobStatusRequest(this);
        } 

    } 

}

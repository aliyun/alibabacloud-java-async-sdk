// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunTaskRequest} extends {@link RequestModel}
 *
 * <p>RunTaskRequest</p>
 */
public class RunTaskRequest extends Request {
    @Path
    @NameInMap("taskId")
    private String taskId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private RunTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunTaskRequest create() {
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RunTaskRequest, Builder> {
        private String taskId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RunTaskRequest response) {
            super(response);
            this.taskId = response.taskId;
            this.regionId = response.regionId;
        } 

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RunTaskRequest build() {
            return new RunTaskRequest(this);
        } 

    } 

}

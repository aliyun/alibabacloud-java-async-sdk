// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StopTimingSyntheticTaskRequest} extends {@link RequestModel}
 *
 * <p>StopTimingSyntheticTaskRequest</p>
 */
public class StopTimingSyntheticTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > taskIds;

    private StopTimingSyntheticTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTimingSyntheticTaskRequest create() {
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
     * @return taskIds
     */
    public java.util.List < String > getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<StopTimingSyntheticTaskRequest, Builder> {
        private String regionId; 
        private java.util.List < String > taskIds; 

        private Builder() {
            super();
        } 

        private Builder(StopTimingSyntheticTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The task IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List < String > taskIds) {
            String taskIdsShrink = shrink(taskIds, "TaskIds", "json");
            this.putQueryParameter("TaskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public StopTimingSyntheticTaskRequest build() {
            return new StopTimingSyntheticTaskRequest(this);
        } 

    } 

}

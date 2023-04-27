// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScanTaskProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeScanTaskProgressRequest</p>
 */
public class DescribeScanTaskProgressRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskId")
    private Long taskId;

    private DescribeScanTaskProgressRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanTaskProgressRequest create() {
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
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeScanTaskProgressRequest, Builder> {
        private String regionId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScanTaskProgressRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the virus scan task. If this parameter is not specified, the status of the latest scan task is queried by default.
         * <p>
         * 
         * You can call the [StartVirusScanTask](~~217908~~) operation to query the ID of a virus scan task.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeScanTaskProgressRequest build() {
            return new DescribeScanTaskProgressRequest(this);
        } 

    } 

}

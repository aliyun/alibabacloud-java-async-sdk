// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelStockOssCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelStockOssCheckTaskRequest</p>
 */
public class CancelStockOssCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CancelStockOssCheckTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelStockOssCheckTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CancelStockOssCheckTaskRequest, Builder> {
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelStockOssCheckTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskId = request.taskId;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CancelStockOssCheckTaskRequest build() {
            return new CancelStockOssCheckTaskRequest(this);
        } 

    } 

}

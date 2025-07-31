// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateOssCheckResultsUnfreezeRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssCheckResultsUnfreezeRequest</p>
 */
public class UpdateOssCheckResultsUnfreezeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeItems")
    private String freezeItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private UpdateOssCheckResultsUnfreezeRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.freezeItems = builder.freezeItems;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssCheckResultsUnfreezeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return freezeItems
     */
    public String getFreezeItems() {
        return this.freezeItems;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateOssCheckResultsUnfreezeRequest, Builder> {
        private String endDate; 
        private String freezeItems; 
        private String regionId; 
        private String startDate; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssCheckResultsUnfreezeRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.freezeItems = request.freezeItems;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
            this.taskId = request.taskId;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * FreezeItems.
         */
        public Builder freezeItems(String freezeItems) {
            this.putQueryParameter("FreezeItems", freezeItems);
            this.freezeItems = freezeItems;
            return this;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
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
        public UpdateOssCheckResultsUnfreezeRequest build() {
            return new UpdateOssCheckResultsUnfreezeRequest(this);
        } 

    } 

}

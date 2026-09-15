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
 * {@link UpdateOssCheckResultsFreezeRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssCheckResultsFreezeRequest</p>
 */
public class UpdateOssCheckResultsFreezeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeItems")
    private String freezeItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeRestorePath")
    private String freezeRestorePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeType")
    private String freezeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private UpdateOssCheckResultsFreezeRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.freezeItems = builder.freezeItems;
        this.freezeRestorePath = builder.freezeRestorePath;
        this.freezeType = builder.freezeType;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssCheckResultsFreezeRequest create() {
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
     * @return freezeRestorePath
     */
    public String getFreezeRestorePath() {
        return this.freezeRestorePath;
    }

    /**
     * @return freezeType
     */
    public String getFreezeType() {
        return this.freezeType;
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

    public static final class Builder extends Request.Builder<UpdateOssCheckResultsFreezeRequest, Builder> {
        private String endDate; 
        private String freezeItems; 
        private String freezeRestorePath; 
        private String freezeType; 
        private String regionId; 
        private String startDate; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssCheckResultsFreezeRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.freezeItems = request.freezeItems;
            this.freezeRestorePath = request.freezeRestorePath;
            this.freezeType = request.freezeType;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The end time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-21 16:08:38</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The items to freeze.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder freezeItems(String freezeItems) {
            this.putQueryParameter("FreezeItems", freezeItems);
            this.freezeItems = freezeItems;
            return this;
        }

        /**
         * <p>The directory to which the frozen files are moved.</p>
         * 
         * <strong>example:</strong>
         * <p>uploadTest/</p>
         */
        public Builder freezeRestorePath(String freezeRestorePath) {
            this.putQueryParameter("FreezeRestorePath", freezeRestorePath);
            this.freezeRestorePath = freezeRestorePath;
            return this;
        }

        /**
         * <p>The freeze type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        public Builder freezeType(String freezeType) {
            this.putQueryParameter("FreezeType", freezeType);
            this.freezeType = freezeType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-21 16:08:38</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>P_15BU42</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateOssCheckResultsFreezeRequest build() {
            return new UpdateOssCheckResultsFreezeRequest(this);
        } 

    } 

}

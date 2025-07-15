// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link QueryRtcAsrTasksRequest} extends {@link RequestModel}
 *
 * <p>QueryRtcAsrTasksRequest</p>
 */
public class QueryRtcAsrTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private QueryRtcAsrTasksRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRtcAsrTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<QueryRtcAsrTasksRequest, Builder> {
        private Long ownerId; 
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRtcAsrTasksRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.taskId = request.taskId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * <p>The ID of the task that you want to query. If you do not specify this parameter, all running tasks under your UID are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>asr-a6ac15e0-9118-4b4c-9e64-306163a0****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryRtcAsrTasksRequest build() {
            return new QueryRtcAsrTasksRequest(this);
        } 

    } 

}

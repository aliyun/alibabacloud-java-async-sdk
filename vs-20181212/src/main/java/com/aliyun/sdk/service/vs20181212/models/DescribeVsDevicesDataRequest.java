// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsDevicesDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVsDevicesDataRequest</p>
 */
public class DescribeVsDevicesDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVsDevicesDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDevicesDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeVsDevicesDataRequest, Builder> {
        private String endTime; 
        private String groupId; 
        private Long ownerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVsDevicesDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. The end time must be later than the start time.</p>
         * <blockquote>
         * <ul>
         * <li><p>The date must follow the ISO 8601 standard and be in UTC. The format is YYYY-MM-DDThh:mm:ssZ.</p>
         * </li>
         * <li><p>The minimum data granularity is 5 minutes.</p>
         * </li>
         * <li><p>If you do not specify this parameter, data from the last 24 hours is retrieved by default.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-30T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>You can query by space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****174-cn-qingdao</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
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
         * <p>The start of the time range to query.</p>
         * <blockquote>
         * <ul>
         * <li><p>The date must follow the ISO 8601 standard and be in UTC. The format is YYYY-MM-DDThh:mm:ssZ.</p>
         * </li>
         * <li><p>The minimum data granularity is 5 minutes.</p>
         * </li>
         * <li><p>If you do not specify this parameter, data from the last 24 hours is retrieved by default.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-04T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeVsDevicesDataRequest build() {
            return new DescribeVsDevicesDataRequest(this);
        } 

    } 

}

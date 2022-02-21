// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordFilesRequest</p>
 */
public class DescribeRecordFilesRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("TaskIds")
    private java.util.List < String > taskIds;

    private DescribeRecordFilesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskIds
     */
    public java.util.List < String > getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DescribeRecordFilesRequest, Builder> {
        private String appId; 
        private String channelId; 
        private String endTime; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String startTime; 
        private java.util.List < String > taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordFilesRequest response) {
            super(response);
            this.appId = response.appId;
            this.channelId = response.channelId;
            this.endTime = response.endTime;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.taskIds = response.taskIds;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskIds.
         */
        public Builder taskIds(java.util.List < String > taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DescribeRecordFilesRequest build() {
            return new DescribeRecordFilesRequest(this);
        } 

    } 

}

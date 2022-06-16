// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventMonitorListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventMonitorListRequest</p>
 */
public class DescribeEventMonitorListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true, minimum = 1)
    private Long appId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 4783160922000D, minimum = 1)
    private Long endTime;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true, minimum = 1)
    private Long envId;

    @Query
    @NameInMap("EventLevel")
    private String eventLevel;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PodName")
    private String podName;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true, maximum = 4783160922000D, minimum = 1)
    private Long startTime;

    private DescribeEventMonitorListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.envId = builder.envId;
        this.eventLevel = builder.eventLevel;
        this.eventType = builder.eventType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.podName = builder.podName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventMonitorListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return eventLevel
     */
    public String getEventLevel() {
        return this.eventLevel;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
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
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEventMonitorListRequest, Builder> {
        private Long appId; 
        private Long endTime; 
        private Long envId; 
        private String eventLevel; 
        private String eventType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String podName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventMonitorListRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.envId = request.envId;
            this.eventLevel = request.eventLevel;
            this.eventType = request.eventType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.podName = request.podName;
            this.startTime = request.startTime;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * EventLevel.
         */
        public Builder eventLevel(String eventLevel) {
            this.putQueryParameter("EventLevel", eventLevel);
            this.eventLevel = eventLevel;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
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
         * PodName.
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeEventMonitorListRequest build() {
            return new DescribeEventMonitorListRequest(this);
        } 

    } 

}

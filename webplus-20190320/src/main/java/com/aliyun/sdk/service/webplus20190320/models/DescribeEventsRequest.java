// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsRequest</p>
 */
public class DescribeEventsRequest extends Request {
    @Query
    @NameInMap("ChangeId")
    private String changeId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("LastChangeEvents")
    private Boolean lastChangeEvents;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReverseByTimestamp")
    private Boolean reverseByTimestamp;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private DescribeEventsRequest(Builder builder) {
        super(builder);
        this.changeId = builder.changeId;
        this.endTime = builder.endTime;
        this.envId = builder.envId;
        this.lastChangeEvents = builder.lastChangeEvents;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.reverseByTimestamp = builder.reverseByTimestamp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeId
     */
    public String getChangeId() {
        return this.changeId;
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
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return lastChangeEvents
     */
    public Boolean getLastChangeEvents() {
        return this.lastChangeEvents;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reverseByTimestamp
     */
    public Boolean getReverseByTimestamp() {
        return this.reverseByTimestamp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEventsRequest, Builder> {
        private String changeId; 
        private Long endTime; 
        private String envId; 
        private Boolean lastChangeEvents; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean reverseByTimestamp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventsRequest response) {
            super(response);
            this.changeId = response.changeId;
            this.endTime = response.endTime;
            this.envId = response.envId;
            this.lastChangeEvents = response.lastChangeEvents;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.reverseByTimestamp = response.reverseByTimestamp;
            this.startTime = response.startTime;
        } 

        /**
         * ChangeId.
         */
        public Builder changeId(String changeId) {
            this.putQueryParameter("ChangeId", changeId);
            this.changeId = changeId;
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
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * LastChangeEvents.
         */
        public Builder lastChangeEvents(Boolean lastChangeEvents) {
            this.putQueryParameter("LastChangeEvents", lastChangeEvents);
            this.lastChangeEvents = lastChangeEvents;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReverseByTimestamp.
         */
        public Builder reverseByTimestamp(Boolean reverseByTimestamp) {
            this.putQueryParameter("ReverseByTimestamp", reverseByTimestamp);
            this.reverseByTimestamp = reverseByTimestamp;
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
        public DescribeEventsRequest build() {
            return new DescribeEventsRequest(this);
        } 

    } 

}

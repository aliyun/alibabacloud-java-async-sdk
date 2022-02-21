// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordsRequest</p>
 */
public class DescribeRecordsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("PrivateBucket")
    private Boolean privateBucket;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SortDirection")
    private String sortDirection;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("StreamId")
    @Validation(required = true)
    private String streamId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeRecordsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.privateBucket = builder.privateBucket;
        this.sortBy = builder.sortBy;
        this.sortDirection = builder.sortDirection;
        this.startTime = builder.startTime;
        this.streamId = builder.streamId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordsRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return privateBucket
     */
    public Boolean getPrivateBucket() {
        return this.privateBucket;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortDirection
     */
    public String getSortDirection() {
        return this.sortDirection;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamId
     */
    public String getStreamId() {
        return this.streamId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeRecordsRequest, Builder> {
        private String endTime; 
        private Long ownerId; 
        private Long pageNum; 
        private Long pageSize; 
        private Boolean privateBucket; 
        private String sortBy; 
        private String sortDirection; 
        private String startTime; 
        private String streamId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordsRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.privateBucket = response.privateBucket;
            this.sortBy = response.sortBy;
            this.sortDirection = response.sortDirection;
            this.startTime = response.startTime;
            this.streamId = response.streamId;
            this.type = response.type;
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
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrivateBucket.
         */
        public Builder privateBucket(Boolean privateBucket) {
            this.putQueryParameter("PrivateBucket", privateBucket);
            this.privateBucket = privateBucket;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SortDirection.
         */
        public Builder sortDirection(String sortDirection) {
            this.putQueryParameter("SortDirection", sortDirection);
            this.sortDirection = sortDirection;
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
         * StreamId.
         */
        public Builder streamId(String streamId) {
            this.putQueryParameter("StreamId", streamId);
            this.streamId = streamId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeRecordsRequest build() {
            return new DescribeRecordsRequest(this);
        } 

    } 

}

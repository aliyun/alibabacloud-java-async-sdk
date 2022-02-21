// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoomListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoomListRequest</p>
 */
public class DescribeRoomListRequest extends Request {
    @Query
    @NameInMap("AnchorId")
    private String anchorId;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RoomId")
    private String roomId;

    @Query
    @NameInMap("RoomStatus")
    private Integer roomStatus;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeRoomListRequest(Builder builder) {
        super(builder);
        this.anchorId = builder.anchorId;
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.order = builder.order;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.roomStatus = builder.roomStatus;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoomListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return roomStatus
     */
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRoomListRequest, Builder> {
        private String anchorId; 
        private String appId; 
        private String endTime; 
        private String order; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String regionId; 
        private String roomId; 
        private Integer roomStatus; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRoomListRequest response) {
            super(response);
            this.anchorId = response.anchorId;
            this.appId = response.appId;
            this.endTime = response.endTime;
            this.order = response.order;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.roomId = response.roomId;
            this.roomStatus = response.roomStatus;
            this.startTime = response.startTime;
        } 

        /**
         * AnchorId.
         */
        public Builder anchorId(String anchorId) {
            this.putQueryParameter("AnchorId", anchorId);
            this.anchorId = anchorId;
            return this;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoomId.
         */
        public Builder roomId(String roomId) {
            this.putQueryParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * RoomStatus.
         */
        public Builder roomStatus(Integer roomStatus) {
            this.putQueryParameter("RoomStatus", roomStatus);
            this.roomStatus = roomStatus;
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

        @Override
        public DescribeRoomListRequest build() {
            return new DescribeRoomListRequest(this);
        } 

    } 

}

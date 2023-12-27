// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRtcChannelListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRtcChannelListRequest</p>
 */
public class DescribeRtcChannelListRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("ServiceArea")
    private String serviceArea;

    @Query
    @NameInMap("SortType")
    private String sortType;

    @Query
    @NameInMap("TimePoint")
    @Validation(required = true)
    private String timePoint;

    @Query
    @NameInMap("UserId")
    private String userId;

    private DescribeRtcChannelListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.serviceArea = builder.serviceArea;
        this.sortType = builder.sortType;
        this.timePoint = builder.timePoint;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcChannelListRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return serviceArea
     */
    public String getServiceArea() {
        return this.serviceArea;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return timePoint
     */
    public String getTimePoint() {
        return this.timePoint;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeRtcChannelListRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String serviceArea; 
        private String sortType; 
        private String timePoint; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRtcChannelListRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.serviceArea = request.serviceArea;
            this.sortType = request.sortType;
            this.timePoint = request.timePoint;
            this.userId = request.userId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * ServiceArea.
         */
        public Builder serviceArea(String serviceArea) {
            this.putQueryParameter("ServiceArea", serviceArea);
            this.serviceArea = serviceArea;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * TimePoint.
         */
        public Builder timePoint(String timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeRtcChannelListRequest build() {
            return new DescribeRtcChannelListRequest(this);
        } 

    } 

}
